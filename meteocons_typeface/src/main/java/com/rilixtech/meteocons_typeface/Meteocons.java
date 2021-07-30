package com.rilixtech.meteocons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Meteocons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Meteocons implements ITypeface {
    private static final String TTF_FILE = "meteocons.ttf";
    private static final String METEOCONS_PREFIX = "METI";
    public static final String METEOCONS_NAME = "Meteocons";
    public static final String METEOCONS_VERSION = "1" + ".1.1";
    public static final String METEOCONS_AUTHOR = "Alessio Atzeni";
    public static final String METEOCONS_URL = "http://www.alessioatzeni.com/meteocons/";
    public static final String METEOCONS_DESC = "Meteocons is a set of weather icons, it containing 40+ icons available"
            + " in PSD, CSH, EPS, SVG, Desktop font and Web font. All icon and updates are free and always will be.";
    public static final String METEOCONS_LICENSE =
            "Meteocons are free for use in both personal and commercial projects.\n"
            + "No attribution or backlinks are required, but any form of spreading the word is always appreciated!\n"
            + "You must not resell any icons or distribute them in any other way.\n"
            + "The Icons as such are the property of the author.";
    public static final String METEOCONS_LICENSE_URL = "";

    private static Font meteoconsTypeface = null;

    private static HashMap<String, Character> meteoconsCharMap;

    /**
     * Meteocons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Meteocons IIcon is to be retrieved.
     */
    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Meteocons icon characters in a HashMap.
     *
     * @return HashMap of all Meteocons icon character names mapped to their character values.
     */
    @Override
    public HashMap<String, Character> getCharacters() {
        if (meteoconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.meteoconsCharacter);
            }
            setChars(characterHashMap);
        }

        return meteoconsCharMap;
    }

    /**
     * Set the Meteocons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        meteoconsCharMap = characterHashMap;
    }

    @Override
    public String getMappingPrefix() {
        return METEOCONS_PREFIX;
    }

    @Override
    public String getFontName() {
        return METEOCONS_NAME;
    }

    @Override
    public String getVersion() {
        return METEOCONS_VERSION;
    }

    @Override
    public int getIconCount() {
        return meteoconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> meteoconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            meteoconsKeyList.add(value.name());
        }
        return meteoconsKeyList;
    }

    @Override
    public String getAuthor() {
        return METEOCONS_AUTHOR;
    }

    @Override
    public String getUrl() {
        return METEOCONS_URL;
    }

    @Override
    public String getDescription() {
        return METEOCONS_DESC;
    }

    @Override
    public String getLicense() {
        return METEOCONS_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return METEOCONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (meteoconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return meteoconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        meteoconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Meteocons ITypeface.
     */
    public enum Icon implements IIcon {
        METI_WINDY_RAIN_INV('\ue800'),
        METI_SNOW_INV('\ue801'),
        METI_SNOW_HEAVY_INV('\ue802'),
        METI_HAIL_INV('\ue803'),
        METI_CLOUDS_INV('\ue804'),
        METI_CLOUDS_FLASH_INV('\ue805'),
        METI_TEMPERATURE('\ue806'),
        METI_COMPASS('\ue807'),
        METI_NA('\ue808'),
        METI_CELCIUS('\ue809'),
        METI_FAHRENHEIT('\ue80a'),
        METI_CLOUDS_FLASH_ALT('\ue80b'),
        METI_SUN_INV('\ue80c'),
        METI_MOON_INV('\ue80d'),
        METI_CLOUD_SUN_INV('\ue80e'),
        METI_CLOUD_MOON_INV('\ue80f'),
        METI_CLOUD_INV('\ue810'),
        METI_CLOUD_FLASH_INV('\ue811'),
        METI_DRIZZLE_INV('\ue812'),
        METI_RAIN_INV('\ue813'),
        METI_WINDY_INV('\ue814'),
        METI_SUNRISE('\ue815'),
        METI_SUN('\ue816'),
        METI_MOON('\ue817'),
        METI_ECLIPSE('\ue818'),
        METI_MIST('\ue819'),
        METI_WIND('\ue81a'),
        METI_SNOWFLAKE('\ue81b'),
        METI_CLOUD_SUN('\ue81c'),
        METI_CLOUD_MOON('\ue81d'),
        METI_FOG_SUN('\ue81e'),
        METI_FOG_MOON('\ue81f'),
        METI_FOG_CLOUD('\ue820'),
        METI_FOG('\ue821'),
        METI_CLOUD('\ue822'),
        METI_CLOUD_FLASH('\ue823'),
        METI_CLOUD_FLASH_ALT('\ue824'),
        METI_DRIZZLE('\ue825'),
        METI_RAIN('\ue826'),
        METI_WINDY('\ue827'),
        METI_WINDY_RAIN('\ue828'),
        METI_SNOW('\ue829'),
        METI_SNOW_ALT('\ue82a'),
        METI_SNOW_HEAVY('\ue82b'),
        METI_HAIL('\ue82c'),
        METI_CLOUDS('\ue82d'),
        METI_CLOUDS_FLASH('\ue82e');

        char meteoconsCharacter;

        Icon(char character) {
            this.meteoconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return meteoconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface meteoconsTypeface;

        @Override
        public ITypeface getTypeface() {
            if (meteoconsTypeface == null) {
                setTypeface(new Meteocons());
            }
            return meteoconsTypeface;
        }

        private static void setTypeface(Meteocons meteoconsTypeface) {
            Icon.meteoconsTypeface = meteoconsTypeface;
        }
    }
}