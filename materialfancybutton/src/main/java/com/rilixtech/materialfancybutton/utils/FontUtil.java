package com.rilixtech.materialfancybutton.utils;

import ohos.agp.components.AttrHelper;
import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import ohos.app.Context;
import ohos.global.resource.RawFileDescriptor;
import ohos.global.resource.RawFileEntry;
import ohos.global.resource.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for Font related functionality.
 */
public class FontUtil {
    private FontUtil() {}

    private static final Map<String, Font> cachedFontMap = new HashMap<>();

    /**
     * Converts a pixel value to the corresponding fp equivalent.
     *
     * @param context The context in which the conversion is required.
     * @param px The pixel value.
     * @return The converted value in fp.
     */
    public static int pxToFp(final Context context, final float px) {
        float fpToPxRatio = fpToPx(context, 1.0F);
        return Math.round(px / fpToPxRatio);
    }

    /**
     * Converts a fp value to the corresponding px equivalent.
     *
     * @param context The context in which the conversion is required.
     * @param fp The fp value.
     * @return The converted value in px.
     */
    public static int fpToPx(final Context context, final float fp) {
        return AttrHelper.fp2px(fp, context);
    }

    /**
     * Tries to load the specified font name from the rawfile directory of the current HAP.
     * In the case the font name wasn't found, the default font is loaded instead.
     *
     * @param context The {@link AbilityContext} of the Ability from which the font is to be loaded.
     * @param fontName The name of the font file to be loaded. Can be {@code null}.
     * @param defaultFontName The name of the default font file to be used in case the font couldn't be loaded.
     *                         Can be {@code null}.
     * @return {@link Font} object of the loaded font, or loaded default font if the font coulnd't be loaded.
     *         Returns {@code null} in case both the font and default font couoldn't be loaded.
     */
    public static Font findFont(AbilityContext context, String fontName, String defaultFontName) {

        Font typeface = null;
        if (!TextUtils.isEmpty(fontName)) {
            // Try to load the font from the rawfile directory
            typeface = loadFontIfExists(context, fontName);
        }
        // If Font couldn't be loaded or wasn't specified, fallback to using the default font specified
        if (typeface == null) {
            if (!TextUtils.isEmpty(defaultFontName)) {
                // Try to load the default font form the rawfile directory
                typeface = loadFontIfExists(context, defaultFontName);
                if (typeface == null) {
                    // If both font and default font are not able to be loaded, load the system Default font
                    typeface = Font.DEFAULT;
                    // Cache the default font as well
                    updateCacheIfNotEmpty(defaultFontName, typeface);
                }
            } else {
                // If Font couldn't be loaded, and default font wasn't specified, load the system Default font
                typeface = Font.DEFAULT;
            }
            updateCacheIfNotEmpty(fontName, typeface);
        }
        return  typeface;
    }

    /**
     * Update the fonts cache map with the loaded font for the given key, if the key is not empty or null.
     *
     * @param key Key to access the font
     * @param font Loaded font to store for quick future access
     */
    private static void updateCacheIfNotEmpty(String key, Font font) {
        if (!TextUtils.isEmpty(key)) {
            cachedFontMap.put(key, font);
        }
    }

    private static Font loadFontIfExists(AbilityContext context, String fontName) {
        Font typeface;
        if (!cachedFontMap.containsKey(fontName)) {
            try {
                typeface = getFontFromRawFile(context, fontName);
                cachedFontMap.put(fontName, typeface);
            } catch (IllegalStateException e) {
                // File read failed. Return null
                typeface = null;
            }
        } else {
            typeface = cachedFontMap.get(fontName);
        }
        return typeface;
    }

    /**
     * Reads a font file from the rawfile directory of the current HAP with the given font name, builds a Font and
     * returns the built Font. The rawfile directory is located at resources/rawfile, in the module of the currently
     * active AbilityContext.
     *
     * @param context The AbilityContext from which this Font is being loaded. Note that non-ability Contexts may not
     *                load font from rawfile.
     * @param fontName The name of the font file as stored in the rawfile directory.  The name should include the
     *                extension of the file name.
     * @return Font object built from the provided font file.
     * @throws IllegalStateException In case the file does not exist, could not be read, or is not a readable font file.
     */
    public static Font getFontFromRawFile(AbilityContext context, String fontName) throws IllegalStateException  {
        Font typeface;
        RawFileEntry rawFileEntry = context.getResourceManager()
                .getRawFileEntry("resources/rawfile/" + fontName);
        File file = getFileFromRawFile(context, rawFileEntry, "file_" + fontName);
        Font.Builder newTypeface = new Font.Builder(file);
        typeface = newTypeface.build();
        return typeface;
    }

    private static File getFileFromRawFile(AbilityContext ctx, RawFileEntry rawFileEntry, String filename)
            throws IllegalStateException {
        byte[] buf;
        try (Resource resource = rawFileEntry.openRawFile();
             RawFileDescriptor rawFileDescriptor = rawFileEntry.openRawFileDescriptor()) {
            File file = new File(ctx.getCacheDir(), filename);

            buf = new byte[(int) rawFileDescriptor.getFileSize()];
            int bytesRead = resource.read(buf);
            if (bytesRead != buf.length) {
                throw new IOException("Asset read failed");
            }
            FileOutputStream output = new FileOutputStream(file);
            output.write(buf, 0, bytesRead);
            output.close();
            return file;
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}