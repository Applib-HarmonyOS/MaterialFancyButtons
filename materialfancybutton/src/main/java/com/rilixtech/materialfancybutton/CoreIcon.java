package com.rilixtech.materialfancybutton;

import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.GenericsUtil;
import com.rilixtech.materialfancybutton.utils.LogHelper;
import java.util.Collection;
import java.util.HashMap;

/**
 * Utility class that encapsulates helper methods used by {@link MaterialFancyButton} class.
 */
public final class CoreIcon {

    private static final String TAG = MaterialFancyButton.class.getSimpleName();
    private static final int DOMAIN = 0xD000100;
    private static final LogHelper logHelper = new LogHelper(DOMAIN, TAG);
    private static boolean loggingEnabled = false;

    private static boolean initDone = false;
    private static final HashMap<String, MfbTypeface> FONTS = new HashMap<>();



    public static final int FONT_MAPPING_PREFIX = 4;


    private CoreIcon() {
        // Prevent instantiation
    }

    /**
     * Loads the FONTS into cache for quick lookup. This also tries to find all fonts automatically via their font file
     */
    public static void init() {
        if (!initDone) {
            String[] fonts = GenericsUtil.getFields();
            for (String fontsClassPath : fonts) {
                try {
                    MfbTypeface typeface =
                            (MfbTypeface) Class.forName(fontsClassPath).getDeclaredConstructor().newInstance();
                    validateFont(typeface);
                    FONTS.put(typeface.getMappingPrefix(), typeface);
                    logHelper.logDebug("Typeface = %{public}s", typeface.getAuthor());
                } catch (ClassNotFoundException e) {
                    logHelper.logDebug("%{public}s not found.", fontsClassPath);
                } catch (Exception e) {
                    logHelper.logDebug("Can't init: %{public}s", fontsClassPath);
                }
            }
            logHelper.logDebug("Total font = %{public}d", FONTS.size());
            initDone = true;
        }
    }

    /**
     * Test if the icon exists in the currently loaded fonts.
     *
     * @param icon The icon to verify
     * @return true if the icon is available
     */
    public static boolean iconExists(String icon) {
        try {
            MfbTypeface font = findFont(icon.substring(0, FONT_MAPPING_PREFIX));
            icon = icon.replace("-", "_");
            font.getIcon(icon);
            return true;
        } catch (Exception ignore) {
            // Either icon does not exist, or font couldn't be loaded. Return false in this case
        }
        return false;
    }

    /**
     * Registers a font into the FONTS array for performance.
     *
     * @param font The font to be registered.
     */
    public static boolean registerFont(MfbTypeface font) {
        try {
            validateFont(font);
            FONTS.put(font.getMappingPrefix(), font);
            return true;
        } catch (IllegalArgumentException ex) {
            logHelper.logError("registerFont : Font named %{public}s could not be registered. Exception: %{public}s",
                    font.getFontName(), ex.getMessage());
        }
        return false;
    }

    /**
     * Perform a basic sanity check for a font.
     */
    private static void validateFont(MfbTypeface font) throws IllegalArgumentException {
        final String mappingPrefix = font.getMappingPrefix();
        if (mappingPrefix == null) {
            throw new IllegalArgumentException("The mapping prefix of a font cannot be null.");
        }
        if (mappingPrefix.length() != FONT_MAPPING_PREFIX) {
            throw new IllegalArgumentException("The mapping prefix of a font must be four characters long.");
        }
    }

    /**
     * return all registered FONTS.
     */
    public static Collection<MfbTypeface> getRegisteredFonts() {
        init();
        return FONTS.values();
    }

    /**
     * tries to find a font by its key in all registered FONTS.
     *
     * @param key The key of the font to be found.
     */
    public static MfbTypeface findFont(String key) {
        init();
        return FONTS.get(key);
    }

    /**
     * fetches the {@link MfbTypeface} of an {@link MfbIcon}.
     *
     * @param icon The {@link MfbIcon} from which the {@link MfbTypeface} is to be retrieved.
     */
    public static MfbTypeface findFont(MfbIcon icon) {
        return icon.getTypeface();
    }

    public static boolean isLoggingEnabled() {
        return loggingEnabled;
    }

    public static void setLoggingEnabled(boolean loggingEnabled) {
        CoreIcon.loggingEnabled = loggingEnabled;
        logHelper.setEnabled(loggingEnabled);
    }

    public static boolean isInitDone() {
        return initDone;
    }
}
