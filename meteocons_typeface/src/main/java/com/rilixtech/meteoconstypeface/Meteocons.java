package com.rilixtech.meteoconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Meteocons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Meteocons implements MfbTypeface {
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
     * Meteocons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Meteocons MfbIcon is to be retrieved.
     */
    @Override
    public MfbIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Meteocons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        METI_WINDY_RAIN_INV((char) 0xe800),
        METI_SNOW_INV((char) 0xe801),
        METI_SNOW_HEAVY_INV((char) 0xe802),
        METI_HAIL_INV((char) 0xe803),
        METI_CLOUDS_INV((char) 0xe804),
        METI_CLOUDS_FLASH_INV((char) 0xe805),
        METI_TEMPERATURE((char) 0xe806),
        METI_COMPASS((char) 0xe807),
        METI_NA((char) 0xe808),
        METI_CELCIUS((char) 0xe809),
        METI_FAHRENHEIT((char) 0xe80a),
        METI_CLOUDS_FLASH_ALT((char) 0xe80b),
        METI_SUN_INV((char) 0xe80c),
        METI_MOON_INV((char) 0xe80d),
        METI_CLOUD_SUN_INV((char) 0xe80e),
        METI_CLOUD_MOON_INV((char) 0xe80f),
        METI_CLOUD_INV((char) 0xe810),
        METI_CLOUD_FLASH_INV((char) 0xe811),
        METI_DRIZZLE_INV((char) 0xe812),
        METI_RAIN_INV((char) 0xe813),
        METI_WINDY_INV((char) 0xe814),
        METI_SUNRISE((char) 0xe815),
        METI_SUN((char) 0xe816),
        METI_MOON((char) 0xe817),
        METI_ECLIPSE((char) 0xe818),
        METI_MIST((char) 0xe819),
        METI_WIND((char) 0xe81a),
        METI_SNOWFLAKE((char) 0xe81b),
        METI_CLOUD_SUN((char) 0xe81c),
        METI_CLOUD_MOON((char) 0xe81d),
        METI_FOG_SUN((char) 0xe81e),
        METI_FOG_MOON((char) 0xe81f),
        METI_FOG_CLOUD((char) 0xe820),
        METI_FOG((char) 0xe821),
        METI_CLOUD((char) 0xe822),
        METI_CLOUD_FLASH((char) 0xe823),
        METI_CLOUD_FLASH_ALT((char) 0xe824),
        METI_DRIZZLE((char) 0xe825),
        METI_RAIN((char) 0xe826),
        METI_WINDY((char) 0xe827),
        METI_WINDY_RAIN((char) 0xe828),
        METI_SNOW((char) 0xe829),
        METI_SNOW_ALT((char) 0xe82a),
        METI_SNOW_HEAVY((char) 0xe82b),
        METI_HAIL((char) 0xe82c),
        METI_CLOUDS((char) 0xe82d),
        METI_CLOUDS_FLASH((char) 0xe82e);

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
        private static MfbTypeface meteoconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
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
