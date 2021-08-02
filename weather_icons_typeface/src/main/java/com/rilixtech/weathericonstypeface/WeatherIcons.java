package com.rilixtech.weathericonstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the WeatherIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class WeatherIcons implements MfbTypeface {
    private static final String TTF_FILE = "weather-icons-v2.0.10.ttf";
    private static final String WEATHER_ICONS_PREFIX = "WICI";
    public static final String WEATHER_ICONS_NAME = "Weather Icons";
    public static final String WEATHER_ICONS_VERSION = "2" + ".0.10";
    public static final String WEATHER_ICONS_AUTHOR = "Erik Flowers";
    public static final String WEATHER_ICONS_URL = "http://weathericons.io/";
    public static final String WEATHER_ICONS_DESC = "Weather Icons is the only icon font and CSS with 222 weather"
            + " themed icons, ready to be dropped right into Bootstrap, or any project that needs high quality weather,"
            + " maritime, and meteorological based icons!";
    public static final String WEATHER_ICONS_LICENSE = "SIL OFL 1.1";
    public static final String WEATHER_ICONS_LICENSE_URL = "http://scripts.sil.org/cms/scripts/page.php?site_id=nrsi&id=OFL";

    private static Font weatherIconsTypeface = null;
    private static HashMap<String, Character> weatherIconsCharMap;

    /**
     * WeatherIcons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which WeatherIcons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the WeatherIcons icon characters in a HashMap.
     *
     * @return HashMap of all WeatherIcons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (weatherIconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.weatherIconsCharacter);
            }
            setChars(characterHashMap);
        }
        return weatherIconsCharMap;
    }

    /**
     * Set the WeatherIcons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        weatherIconsCharMap = characterHashMap;
    }

    /**
     * Return the WeatherIcons Mapping Prefix.
     *
     * @return WeatherIcons Mapping Prefix, used by all WeatherIcons icons.
     */
    @Override public String getMappingPrefix() {
        return WEATHER_ICONS_PREFIX;
    }

    @Override public String getFontName() {
        return WEATHER_ICONS_NAME;
    }

    @Override public String getVersion() {
        return WEATHER_ICONS_VERSION;
    }

    @Override public int getIconCount() {
        return weatherIconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> weatherIconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            weatherIconsKeyList.add(value.name());
        }
        return weatherIconsKeyList;
    }

    @Override public String getAuthor() {
        return WEATHER_ICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return WEATHER_ICONS_URL;
    }

    @Override public String getDescription() {
        return WEATHER_ICONS_DESC;
    }

    @Override public String getLicense() {
        return WEATHER_ICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return WEATHER_ICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (weatherIconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return weatherIconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        weatherIconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by WeatherIcons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        WICI_DAY_SUNNY((char) 0xf00d),
        WICI_DAY_CLOUDY((char) 0xf002),
        WICI_DAY_CLOUDY_GUSTS((char) 0xf000),
        WICI_DAY_CLOUDY_WINDY((char) 0xf001),
        WICI_DAY_FOG((char) 0xf003),
        WICI_DAY_HAIL((char) 0xf004),
        WICI_DAY_HAZE((char) 0xf0b6),
        WICI_DAY_LIGHTNING((char) 0xf005),
        WICI_DAY_RAIN((char) 0xf008),
        WICI_DAY_RAIN_MIX((char) 0xf006),
        WICI_DAY_RAIN_WIND((char) 0xf007),
        WICI_DAY_SHOWERS((char) 0xf009),
        WICI_DAY_SLEET((char) 0xf0b2),
        WICI_DAY_SLEET_STORM((char) 0xf068),
        WICI_DAY_SNOW((char) 0xf00a),
        WICI_DAY_SNOW_THUNDERSTORM((char) 0xf06b),
        WICI_DAY_SNOW_WIND((char) 0xf065),
        WICI_DAY_SPRINKLE((char) 0xf00b),
        WICI_DAY_STORM_SHOWERS((char) 0xf00e),
        WICI_DAY_SUNNY_OVERCAST((char) 0xf00c),
        WICI_DAY_THUNDERSTORM((char) 0xf010),
        WICI_DAY_WINDY((char) 0xf085),
        WICI_SOLAR_ECLIPSE((char) 0xf06e),
        WICI_HOT((char) 0xf072),
        WICI_DAY_CLOUDY_HIGH((char) 0xf07d),
        WICI_DAY_LIGHT_WIND((char) 0xf0c4),
        WICI_NIGHT_CLEAR((char) 0xf02e),
        WICI_NIGHT_ALT_CLOUDY((char) 0xf086),
        WICI_NIGHT_ALT_CLOUDY_GUSTS((char) 0xf022),
        WICI_NIGHT_ALT_CLOUDY_WINDY((char) 0xf023),
        WICI_NIGHT_ALT_HAIL((char) 0xf024),
        WICI_NIGHT_ALT_LIGHTNING((char) 0xf025),
        WICI_NIGHT_ALT_RAIN((char) 0xf028),
        WICI_NIGHT_ALT_RAIN_MIX((char) 0xf026),
        WICI_NIGHT_ALT_RAIN_WIND((char) 0xf027),
        WICI_NIGHT_ALT_SHOWERS((char) 0xf029),
        WICI_NIGHT_ALT_SLEET((char) 0xf0b4),
        WICI_NIGHT_ALT_SLEET_STORM((char) 0xf06a),
        WICI_NIGHT_ALT_SNOW((char) 0xf02a),
        WICI_NIGHT_ALT_SNOW_THUNDERSTORM((char) 0xf06d),
        WICI_NIGHT_ALT_SNOW_WIND((char) 0xf067),
        WICI_NIGHT_ALT_SPRINKLE((char) 0xf02b),
        WICI_NIGHT_ALT_STORM_SHOWERS((char) 0xf02c),
        WICI_NIGHT_ALT_THUNDERSTORM((char) 0xf02d),
        WICI_NIGHT_CLOUDY((char) 0xf031),
        WICI_NIGHT_CLOUDY_GUSTS((char) 0xf02f),
        WICI_NIGHT_CLOUDY_WINDY((char) 0xf030),
        WICI_NIGHT_FOG((char) 0xf04a),
        WICI_NIGHT_HAIL((char) 0xf032),
        WICI_NIGHT_LIGHTNING((char) 0xf033),
        WICI_NIGHT_PARTLY_CLOUDY((char) 0xf083),
        WICI_NIGHT_RAIN((char) 0xf036),
        WICI_NIGHT_RAIN_MIX((char) 0xf034),
        WICI_NIGHT_RAIN_WIND((char) 0xf035),
        WICI_NIGHT_SHOWERS((char) 0xf037),
        WICI_NIGHT_SLEET((char) 0xf0b3),
        WICI_NIGHT_SLEET_STORM((char) 0xf069),
        WICI_NIGHT_SNOW((char) 0xf038),
        WICI_NIGHT_SNOW_THUNDERSTORM((char) 0xf06c),
        WICI_NIGHT_SNOW_WIND((char) 0xf066),
        WICI_NIGHT_SPRINKLE((char) 0xf039),
        WICI_NIGHT_STORM_SHOWERS((char) 0xf03a),
        WICI_NIGHT_THUNDERSTORM((char) 0xf03b),
        WICI_LUNAR_ECLIPSE((char) 0xf070),
        WICI_STARS((char) 0xf077),
        WICI_NIGHT_ALT_CLOUDY_HIGH((char) 0xf07e),
        WICI_NIGHT_CLOUDY_HIGH((char) 0xf080),
        WICI_NIGHT_ALT_PARTLY_CLOUDY((char) 0xf081),
        WICI_CLOUD((char) 0xf041),
        WICI_CLOUDY((char) 0xf013),
        WICI_CLOUDY_GUSTS((char) 0xf011),
        WICI_CLOUDY_WINDY((char) 0xf012),
        WICI_FOG((char) 0xf014),
        WICI_HAIL((char) 0xf015),
        WICI_RAIN((char) 0xf019),
        WICI_RAIN_MIX((char) 0xf017),
        WICI_RAIN_WIND((char) 0xf018),
        WICI_SHOWERS((char) 0xf01a),
        WICI_SLEET((char) 0xf0b5),
        WICI_SPRINKLE((char) 0xf01c),
        WICI_STORM_SHOWERS((char) 0xf01d),
        WICI_THUNDERSTORM((char) 0xf01e),
        WICI_SNOW_WIND((char) 0xf064),
        WICI_SNOW((char) 0xf01b),
        WICI_SMOG((char) 0xf074),
        WICI_SMOKE((char) 0xf062),
        WICI_LIGHTNING((char) 0xf016),
        WICI_RAINDROPS((char) 0xf04e),
        WICI_RAINDROP((char) 0xf078),
        WICI_DUST((char) 0xf063),
        WICI_SNOWFLAKE_COLD((char) 0xf076),
        WICI_WINDY((char) 0xf021),
        WICI_STRONG_WIND((char) 0xf050),
        WICI_SANDSTORM((char) 0xf082),
        WICI_EARTHQUAKE((char) 0xf0c6),
        WICI_FIRE((char) 0xf0c7),
        WICI_FLOOD((char) 0xf07c),
        WICI_METEOR((char) 0xf071),
        WICI_TSUNAMI((char) 0xf0c5),
        WICI_VOLCANO((char) 0xf0c8),
        WICI_HURRICANE((char) 0xf073),
        WICI_TORNADO((char) 0xf056),
        WICI_SMALL_CRAFT_ADVISORY((char) 0xf0cc),
        WICI_GALE_WARNING((char) 0xf0cd),
        WICI_STORM_WARNING((char) 0xf0ce),
        WICI_HURRICANE_WARNING((char) 0xf0cf),
        WICI_WIND_DIRECTION((char) 0xf0b1),
        WICI_ALIEN((char) 0xf075),
        WICI_CELSIUS((char) 0xf03c),
        WICI_FAHRENHEIT((char) 0xf045),
        WICI_DEGREES((char) 0xf042),
        WICI_THERMOMETER((char) 0xf055),
        WICI_THERMOMETER_EXTERIOR((char) 0xf053),
        WICI_THERMOMETER_INTERNAL((char) 0xf054),
        WICI_CLOUD_DOWN((char) 0xf03d),
        WICI_CLOUD_UP((char) 0xf040),
        WICI_CLOUD_REFRESH((char) 0xf03e),
        WICI_HORIZON((char) 0xf047),
        WICI_HORIZON_ALT((char) 0xf046),
        WICI_SUNRISE((char) 0xf051),
        WICI_SUNSET((char) 0xf052),
        WICI_MOONRISE((char) 0xf0c9),
        WICI_MOONSET((char) 0xf0ca),
        WICI_REFRESH((char) 0xf04c),
        WICI_REFRESH_ALT((char) 0xf04b),
        WICI_UMBRELLA((char) 0xf084),
        WICI_BAROMETER((char) 0xf079),
        WICI_HUMIDITY((char) 0xf07a),
        WICI_NA((char) 0xf07b),
        WICI_TRAIN((char) 0xf0cb),
        WICI_MOON_NEW((char) 0xf095),
        WICI_MOON_WAXING_CRESCENTI_1((char) 0xf096),
        WICI_MOON_WAXING_CRESCENTI_2((char) 0xf097),
        WICI_MOON_WAXING_CRESCENTI_3((char) 0xf098),
        WICI_MOON_WAXING_CRESCENTI_4((char) 0xf099),
        WICI_MOON_WAXING_CRESCENTI_5((char) 0xf09a),
        WICI_MOON_WAXING_CRESCENTI_6((char) 0xf09b),
        WICI_MOON_FIRST_QUARTER((char) 0xf09c),
        WICI_MOON_WAXING_GIBBOUS_1((char) 0xf09d),
        WICI_MOON_WAXING_GIBBOUS_2((char) 0xf09e),
        WICI_MOON_WAXING_GIBBOUS_3((char) 0xf09f),
        WICI_MOON_WAXING_GIBBOUS_4((char) 0xf0a0),
        WICI_MOON_WAXING_GIBBOUS_5((char) 0xf0a1),
        WICI_MOON_WAXING_GIBBOUS_6((char) 0xf0a2),
        WICI_MOON_FULL((char) 0xf0a3),
        WICI_MOON_WANING_GIBBOUS_1((char) 0xf0a4),
        WICI_MOON_WANING_GIBBOUS_2((char) 0xf0a5),
        WICI_MOON_WANING_GIBBOUS_3((char) 0xf0a6),
        WICI_MOON_WANING_GIBBOUS_4((char) 0xf0a7),
        WICI_MOON_WANING_GIBBOUS_5((char) 0xf0a8),
        WICI_MOON_WANING_GIBBOUS_6((char) 0xf0a9),
        WICI_MOON_THIRD_QUARTER((char) 0xf0aa),
        WICI_MOON_WANING_CRESCENTI_1((char) 0xf0ab),
        WICI_MOON_WANING_CRESCENTI_2((char) 0xf0ac),
        WICI_MOON_WANING_CRESCENTI_3((char) 0xf0ad),
        WICI_MOON_WANING_CRESCENTI_4((char) 0xf0ae),
        WICI_MOON_WANING_CRESCENTI_5((char) 0xf0af),
        WICI_MOON_WANING_CRESCENTI_6((char) 0xf0b0),
        WICI_MOON_ALT_NEW((char) 0xf0eb),
        WICI_MOON_ALT_WAXING_CRESCENTI_1((char) 0xf0d0),
        WICI_MOON_ALT_WAXING_CRESCENTI_2((char) 0xf0d1),
        WICI_MOON_ALT_WAXING_CRESCENTI_3((char) 0xf0d2),
        WICI_MOON_ALT_WAXING_CRESCENTI_4((char) 0xf0d3),
        WICI_MOON_ALT_WAXING_CRESCENTI_5((char) 0xf0d4),
        WICI_MOON_ALT_WAXING_CRESCENTI_6((char) 0xf0d5),
        WICI_MOON_ALT_FIRST_QUARTER((char) 0xf0d6),
        WICI_MOON_ALT_WAXING_GIBBOUS_1((char) 0xf0d7),
        WICI_MOON_ALT_WAXING_GIBBOUS_2((char) 0xf0d8),
        WICI_MOON_ALT_WAXING_GIBBOUS_3((char) 0xf0d9),
        WICI_MOON_ALT_WAXING_GIBBOUS_4((char) 0xf0da),
        WICI_MOON_ALT_WAXING_GIBBOUS_5((char) 0xf0db),
        WICI_MOON_ALT_WAXING_GIBBOUS_6((char) 0xf0dc),
        WICI_MOON_ALT_FULL((char) 0xf0dd),
        WICI_MOON_ALT_WANING_GIBBOUS_1((char) 0xf0de),
        WICI_MOON_ALT_WANING_GIBBOUS_2((char) 0xf0df),
        WICI_MOON_ALT_WANING_GIBBOUS_3((char) 0xf0e0),
        WICI_MOON_ALT_WANING_GIBBOUS_4((char) 0xf0e1),
        WICI_MOON_ALT_WANING_GIBBOUS_5((char) 0xf0e2),
        WICI_MOON_ALT_WANING_GIBBOUS_6((char) 0xf0e3),
        WICI_MOON_ALT_THIRD_QUARTER((char) 0xf0e4),
        WICI_MOON_ALT_WANING_CRESCENTI_1((char) 0xf0e5),
        WICI_MOON_ALT_WANING_CRESCENTI_2((char) 0xf0e6),
        WICI_MOON_ALT_WANING_CRESCENTI_3((char) 0xf0e7),
        WICI_MOON_ALT_WANING_CRESCENTI_4((char) 0xf0e8),
        WICI_MOON_ALT_WANING_CRESCENTI_5((char) 0xf0e9),
        WICI_MOON_ALT_WANING_CRESCENTI_6((char) 0xf0ea),
        WICI_MOON_0((char) 0xf095),
        WICI_MOON_1((char) 0xf096),
        WICI_MOON_2((char) 0xf097),
        WICI_MOON_3((char) 0xf098),
        WICI_MOON_4((char) 0xf099),
        WICI_MOON_5((char) 0xf09a),
        WICI_MOON_6((char) 0xf09b),
        WICI_MOON_7((char) 0xf09c),
        WICI_MOON_8((char) 0xf09d),
        WICI_MOON_9((char) 0xf09e),
        WICI_MOON_10((char) 0xf09f),
        WICI_MOON_11((char) 0xf0a0),
        WICI_MOON_12((char) 0xf0a1),
        WICI_MOON_13((char) 0xf0a2),
        WICI_MOON_14((char) 0xf0a3),
        WICI_MOON_15((char) 0xf0a4),
        WICI_MOON_16((char) 0xf0a5),
        WICI_MOON_17((char) 0xf0a6),
        WICI_MOON_18((char) 0xf0a7),
        WICI_MOON_19((char) 0xf0a8),
        WICI_MOON_20((char) 0xf0a9),
        WICI_MOON_21((char) 0xf0aa),
        WICI_MOON_22((char) 0xf0ab),
        WICI_MOON_23((char) 0xf0ac),
        WICI_MOON_24((char) 0xf0ad),
        WICI_MOON_25((char) 0xf0ae),
        WICI_MOON_26((char) 0xf0af),
        WICI_MOON_27((char) 0xf0b0),
        WICI_TIME_1((char) 0xf08a),
        WICI_TIME_2((char) 0xf08b),
        WICI_TIME_3((char) 0xf08c),
        WICI_TIME_4((char) 0xf08d),
        WICI_TIME_5((char) 0xf08e),
        WICI_TIME_6((char) 0xf08f),
        WICI_TIME_7((char) 0xf090),
        WICI_TIME_8((char) 0xf091),
        WICI_TIME_9((char) 0xf092),
        WICI_TIME_10((char) 0xf093),
        WICI_TIME_11((char) 0xf094),
        WICI_TIME_12((char) 0xf089),
        WICI_DIRECTION_UP((char) 0xf058),
        WICI_DIRECTION_UP_RIGHT((char) 0xf057),
        WICI_DIRECTION_RIGHT((char) 0xf04d),
        WICI_DIRECTION_DOWN_RIGHT((char) 0xf088),
        WICI_DIRECTION_DOWN((char) 0xf044),
        WICI_DIRECTION_DOWN_LEFT((char) 0xf043),
        WICI_DIRECTION_LEFT((char) 0xf048),
        WICI_DIRECTION_UP_LEFT((char) 0xf087),
        WICI_WIND_BEAUFORT_0((char) 0xf0b7),
        WICI_WIND_BEAUFORT_1((char) 0xf0b8),
        WICI_WIND_BEAUFORT_2((char) 0xf0b9),
        WICI_WIND_BEAUFORT_3((char) 0xf0ba),
        WICI_WIND_BEAUFORT_4((char) 0xf0bb),
        WICI_WIND_BEAUFORT_5((char) 0xf0bc),
        WICI_WIND_BEAUFORT_6((char) 0xf0bd),
        WICI_WIND_BEAUFORT_7((char) 0xf0be),
        WICI_WIND_BEAUFORT_8((char) 0xf0bf),
        WICI_WIND_BEAUFORT_9((char) 0xf0c0),
        WICI_WIND_BEAUFORT_10((char) 0xf0c1),
        WICI_WIND_BEAUFORT_11((char) 0xf0c2),
        WICI_WIND_BEAUFORT_12((char) 0xf0c3),
        WICI_YAHOO_0((char) 0xf056),
        WICI_YAHOO_1((char) 0xf00e),
        WICI_YAHOO_2((char) 0xf073),
        WICI_YAHOO_3((char) 0xf01e),
        WICI_YAHOO_4((char) 0xf01e),
        WICI_YAHOO_5((char) 0xf017),
        WICI_YAHOO_6((char) 0xf017),
        WICI_YAHOO_7((char) 0xf017),
        WICI_YAHOO_8((char) 0xf015),
        WICI_YAHOO_9((char) 0xf01a),
        WICI_YAHOO_10((char) 0xf015),
        WICI_YAHOO_11((char) 0xf01a),
        WICI_YAHOO_12((char) 0xf01a),
        WICI_YAHOO_13((char) 0xf01b),
        WICI_YAHOO_14((char) 0xf00a),
        WICI_YAHOO_15((char) 0xf064),
        WICI_YAHOO_16((char) 0xf01b),
        WICI_YAHOO_17((char) 0xf015),
        WICI_YAHOO_18((char) 0xf017),
        WICI_YAHOO_19((char) 0xf063),
        WICI_YAHOO_20((char) 0xf014),
        WICI_YAHOO_21((char) 0xf021),
        WICI_YAHOO_22((char) 0xf062),
        WICI_YAHOO_23((char) 0xf050),
        WICI_YAHOO_24((char) 0xf050),
        WICI_YAHOO_25((char) 0xf076),
        WICI_YAHOO_26((char) 0xf013),
        WICI_YAHOO_27((char) 0xf031),
        WICI_YAHOO_28((char) 0xf002),
        WICI_YAHOO_29((char) 0xf031),
        WICI_YAHOO_30((char) 0xf002),
        WICI_YAHOO_31((char) 0xf02e),
        WICI_YAHOO_32((char) 0xf00d),
        WICI_YAHOO_33((char) 0xf083),
        WICI_YAHOO_34((char) 0xf00c),
        WICI_YAHOO_35((char) 0xf017),
        WICI_YAHOO_36((char) 0xf072),
        WICI_YAHOO_37((char) 0xf00e),
        WICI_YAHOO_38((char) 0xf00e),
        WICI_YAHOO_39((char) 0xf00e),
        WICI_YAHOO_40((char) 0xf01a),
        WICI_YAHOO_41((char) 0xf064),
        WICI_YAHOO_42((char) 0xf01b),
        WICI_YAHOO_43((char) 0xf064),
        WICI_YAHOO_44((char) 0xf00c),
        WICI_YAHOO_45((char) 0xf00e),
        WICI_YAHOO_46((char) 0xf01b),
        WICI_YAHOO_47((char) 0xf00e),
        WICI_YAHOO_3200((char) 0xf077),
        WICI_FORECAST_IO_CLEAR_DAY((char) 0xf00d),
        WICI_FORECAST_IO_CLEAR_NIGHT((char) 0xf02e),
        WICI_FORECAST_IO_RAIN((char) 0xf019),
        WICI_FORECAST_IO_SNOW((char) 0xf01b),
        WICI_FORECAST_IO_SLEET((char) 0xf0b5),
        WICI_FORECAST_IO_WIND((char) 0xf050),
        WICI_FORECAST_IO_FOG((char) 0xf014),
        WICI_FORECAST_IO_CLOUDY((char) 0xf013),
        WICI_FORECAST_IO_PARTLY_CLOUDY_DAY((char) 0xf002),
        WICI_FORECAST_IO_PARTLY_CLOUDY_NIGHT((char) 0xf031),
        WICI_FORECAST_IO_HAIL((char) 0xf015),
        WICI_FORECAST_IO_THUNDERSTORM((char) 0xf01e),
        WICI_FORECAST_IO_TORNADO((char) 0xf056),
        WICI_WMO4680_0((char) 0xf055),
        WICI_WMO4680_00((char) 0xf055),
        WICI_WMO4680_1((char) 0xf013),
        WICI_WMO4680_01((char) 0xf013),
        WICI_WMO4680_2((char) 0xf055),
        WICI_WMO4680_02((char) 0xf055),
        WICI_WMO4680_3((char) 0xf013),
        WICI_WMO4680_03((char) 0xf013),
        WICI_WMO4680_4((char) 0xf014),
        WICI_WMO4680_04((char) 0xf014),
        WICI_WMO4680_5((char) 0xf014),
        WICI_WMO4680_05((char) 0xf014),
        WICI_WMO4680_10((char) 0xf014),
        WICI_WMO4680_11((char) 0xf014),
        WICI_WMO4680_12((char) 0xf016),
        WICI_WMO4680_18((char) 0xf050),
        WICI_WMO4680_20((char) 0xf014),
        WICI_WMO4680_21((char) 0xf017),
        WICI_WMO4680_22((char) 0xf017),
        WICI_WMO4680_23((char) 0xf019),
        WICI_WMO4680_24((char) 0xf01b),
        WICI_WMO4680_25((char) 0xf015),
        WICI_WMO4680_26((char) 0xf01e),
        WICI_WMO4680_27((char) 0xf063),
        WICI_WMO4680_28((char) 0xf063),
        WICI_WMO4680_29((char) 0xf063),
        WICI_WMO4680_30((char) 0xf014),
        WICI_WMO4680_31((char) 0xf014),
        WICI_WMO4680_32((char) 0xf014),
        WICI_WMO4680_33((char) 0xf014),
        WICI_WMO4680_34((char) 0xf014),
        WICI_WMO4680_35((char) 0xf014),
        WICI_WMO4680_40((char) 0xf017),
        WICI_WMO4680_41((char) 0xf01c),
        WICI_WMO4680_42((char) 0xf019),
        WICI_WMO4680_43((char) 0xf01c),
        WICI_WMO4680_44((char) 0xf019),
        WICI_WMO4680_45((char) 0xf015),
        WICI_WMO4680_46((char) 0xf015),
        WICI_WMO4680_47((char) 0xf01b),
        WICI_WMO4680_48((char) 0xf01b),
        WICI_WMO4680_50((char) 0xf01c),
        WICI_WMO4680_51((char) 0xf01c),
        WICI_WMO4680_52((char) 0xf019),
        WICI_WMO4680_53((char) 0xf019),
        WICI_WMO4680_54((char) 0xf076),
        WICI_WMO4680_55((char) 0xf076),
        WICI_WMO4680_56((char) 0xf076),
        WICI_WMO4680_57((char) 0xf01c),
        WICI_WMO4680_58((char) 0xf019),
        WICI_WMO4680_60((char) 0xf01c),
        WICI_WMO4680_61((char) 0xf01c),
        WICI_WMO4680_62((char) 0xf019),
        WICI_WMO4680_63((char) 0xf019),
        WICI_WMO4680_64((char) 0xf015),
        WICI_WMO4680_65((char) 0xf015),
        WICI_WMO4680_66((char) 0xf015),
        WICI_WMO4680_67((char) 0xf017),
        WICI_WMO4680_68((char) 0xf017),
        WICI_WMO4680_70((char) 0xf01b),
        WICI_WMO4680_71((char) 0xf01b),
        WICI_WMO4680_72((char) 0xf01b),
        WICI_WMO4680_73((char) 0xf01b),
        WICI_WMO4680_74((char) 0xf076),
        WICI_WMO4680_75((char) 0xf076),
        WICI_WMO4680_76((char) 0xf076),
        WICI_WMO4680_77((char) 0xf01b),
        WICI_WMO4680_78((char) 0xf076),
        WICI_WMO4680_80((char) 0xf019),
        WICI_WMO4680_81((char) 0xf01c),
        WICI_WMO4680_82((char) 0xf019),
        WICI_WMO4680_83((char) 0xf019),
        WICI_WMO4680_84((char) 0xf01d),
        WICI_WMO4680_85((char) 0xf017),
        WICI_WMO4680_86((char) 0xf017),
        WICI_WMO4680_87((char) 0xf017),
        WICI_WMO4680_89((char) 0xf015),
        WICI_WMO4680_90((char) 0xf016),
        WICI_WMO4680_91((char) 0xf01d),
        WICI_WMO4680_92((char) 0xf01e),
        WICI_WMO4680_93((char) 0xf01e),
        WICI_WMO4680_94((char) 0xf016),
        WICI_WMO4680_95((char) 0xf01e),
        WICI_WMO4680_96((char) 0xf01e),
        WICI_WMO4680_99((char) 0xf056),
        WICI_OWM_200((char) 0xf01e),
        WICI_OWM_201((char) 0xf01e),
        WICI_OWM_202((char) 0xf01e),
        WICI_OWM_210((char) 0xf016),
        WICI_OWM_211((char) 0xf016),
        WICI_OWM_212((char) 0xf016),
        WICI_OWM_221((char) 0xf016),
        WICI_OWM_230((char) 0xf01e),
        WICI_OWM_231((char) 0xf01e),
        WICI_OWM_232((char) 0xf01e),
        WICI_OWM_300((char) 0xf01c),
        WICI_OWM_301((char) 0xf01c),
        WICI_OWM_302((char) 0xf019),
        WICI_OWM_310((char) 0xf017),
        WICI_OWM_311((char) 0xf019),
        WICI_OWM_312((char) 0xf019),
        WICI_OWM_313((char) 0xf01a),
        WICI_OWM_314((char) 0xf019),
        WICI_OWM_321((char) 0xf01c),
        WICI_OWM_500((char) 0xf01c),
        WICI_OWM_501((char) 0xf019),
        WICI_OWM_502((char) 0xf019),
        WICI_OWM_503((char) 0xf019),
        WICI_OWM_504((char) 0xf019),
        WICI_OWM_511((char) 0xf017),
        WICI_OWM_520((char) 0xf01a),
        WICI_OWM_521((char) 0xf01a),
        WICI_OWM_522((char) 0xf01a),
        WICI_OWM_531((char) 0xf01d),
        WICI_OWM_600((char) 0xf01b),
        WICI_OWM_601((char) 0xf01b),
        WICI_OWM_602((char) 0xf0b5),
        WICI_OWM_611((char) 0xf017),
        WICI_OWM_612((char) 0xf017),
        WICI_OWM_615((char) 0xf017),
        WICI_OWM_616((char) 0xf017),
        WICI_OWM_620((char) 0xf017),
        WICI_OWM_621((char) 0xf01b),
        WICI_OWM_622((char) 0xf01b),
        WICI_OWM_701((char) 0xf01a),
        WICI_OWM_711((char) 0xf062),
        WICI_OWM_721((char) 0xf0b6),
        WICI_OWM_731((char) 0xf063),
        WICI_OWM_741((char) 0xf014),
        WICI_OWM_761((char) 0xf063),
        WICI_OWM_762((char) 0xf063),
        WICI_OWM_771((char) 0xf011),
        WICI_OWM_781((char) 0xf056),
        WICI_OWM_800((char) 0xf00d),
        WICI_OWM_801((char) 0xf011),
        WICI_OWM_802((char) 0xf011),
        WICI_OWM_803((char) 0xf012),
        WICI_OWM_804((char) 0xf013),
        WICI_OWM_900((char) 0xf056),
        WICI_OWM_901((char) 0xf01d),
        WICI_OWM_902((char) 0xf073),
        WICI_OWM_903((char) 0xf076),
        WICI_OWM_904((char) 0xf072),
        WICI_OWM_905((char) 0xf021),
        WICI_OWM_906((char) 0xf015),
        WICI_OWM_957((char) 0xf050),
        WICI_OWM_DAY_200((char) 0xf010),
        WICI_OWM_DAY_201((char) 0xf010),
        WICI_OWM_DAY_202((char) 0xf010),
        WICI_OWM_DAY_210((char) 0xf005),
        WICI_OWM_DAY_211((char) 0xf005),
        WICI_OWM_DAY_212((char) 0xf005),
        WICI_OWM_DAY_221((char) 0xf005),
        WICI_OWM_DAY_230((char) 0xf010),
        WICI_OWM_DAY_231((char) 0xf010),
        WICI_OWM_DAY_232((char) 0xf010),
        WICI_OWM_DAY_300((char) 0xf00b),
        WICI_OWM_DAY_301((char) 0xf00b),
        WICI_OWM_DAY_302((char) 0xf008),
        WICI_OWM_DAY_310((char) 0xf008),
        WICI_OWM_DAY_311((char) 0xf008),
        WICI_OWM_DAY_312((char) 0xf008),
        WICI_OWM_DAY_313((char) 0xf008),
        WICI_OWM_DAY_314((char) 0xf008),
        WICI_OWM_DAY_321((char) 0xf00b),
        WICI_OWM_DAY_500((char) 0xf00b),
        WICI_OWM_DAY_501((char) 0xf008),
        WICI_OWM_DAY_502((char) 0xf008),
        WICI_OWM_DAY_503((char) 0xf008),
        WICI_OWM_DAY_504((char) 0xf008),
        WICI_OWM_DAY_511((char) 0xf006),
        WICI_OWM_DAY_520((char) 0xf009),
        WICI_OWM_DAY_521((char) 0xf009),
        WICI_OWM_DAY_522((char) 0xf009),
        WICI_OWM_DAY_531((char) 0xf00e),
        WICI_OWM_DAY_600((char) 0xf00a),
        WICI_OWM_DAY_601((char) 0xf0b2),
        WICI_OWM_DAY_602((char) 0xf00a),
        WICI_OWM_DAY_611((char) 0xf006),
        WICI_OWM_DAY_612((char) 0xf006),
        WICI_OWM_DAY_615((char) 0xf006),
        WICI_OWM_DAY_616((char) 0xf006),
        WICI_OWM_DAY_620((char) 0xf006),
        WICI_OWM_DAY_621((char) 0xf00a),
        WICI_OWM_DAY_622((char) 0xf00a),
        WICI_OWM_DAY_701((char) 0xf009),
        WICI_OWM_DAY_711((char) 0xf062),
        WICI_OWM_DAY_721((char) 0xf0b6),
        WICI_OWM_DAY_731((char) 0xf063),
        WICI_OWM_DAY_741((char) 0xf003),
        WICI_OWM_DAY_761((char) 0xf063),
        WICI_OWM_DAY_762((char) 0xf063),
        WICI_OWM_DAY_781((char) 0xf056),
        WICI_OWM_DAY_800((char) 0xf00d),
        WICI_OWM_DAY_801((char) 0xf000),
        WICI_OWM_DAY_802((char) 0xf000),
        WICI_OWM_DAY_803((char) 0xf000),
        WICI_OWM_DAY_804((char) 0xf00c),
        WICI_OWM_DAY_900((char) 0xf056),
        WICI_OWM_DAY_902((char) 0xf073),
        WICI_OWM_DAY_903((char) 0xf076),
        WICI_OWM_DAY_904((char) 0xf072),
        WICI_OWM_DAY_906((char) 0xf004),
        WICI_OWM_DAY_957((char) 0xf050),
        WICI_OWM_NIGHT_200((char) 0xf02d),
        WICI_OWM_NIGHT_201((char) 0xf02d),
        WICI_OWM_NIGHT_202((char) 0xf02d),
        WICI_OWM_NIGHT_210((char) 0xf025),
        WICI_OWM_NIGHT_211((char) 0xf025),
        WICI_OWM_NIGHT_212((char) 0xf025),
        WICI_OWM_NIGHT_221((char) 0xf025),
        WICI_OWM_NIGHT_230((char) 0xf02d),
        WICI_OWM_NIGHT_231((char) 0xf02d),
        WICI_OWM_NIGHT_232((char) 0xf02d),
        WICI_OWM_NIGHT_300((char) 0xf02b),
        WICI_OWM_NIGHT_301((char) 0xf02b),
        WICI_OWM_NIGHT_302((char) 0xf028),
        WICI_OWM_NIGHT_310((char) 0xf028),
        WICI_OWM_NIGHT_311((char) 0xf028),
        WICI_OWM_NIGHT_312((char) 0xf028),
        WICI_OWM_NIGHT_313((char) 0xf028),
        WICI_OWM_NIGHT_314((char) 0xf028),
        WICI_OWM_NIGHT_321((char) 0xf02b),
        WICI_OWM_NIGHT_500((char) 0xf02b),
        WICI_OWM_NIGHT_501((char) 0xf028),
        WICI_OWM_NIGHT_502((char) 0xf028),
        WICI_OWM_NIGHT_503((char) 0xf028),
        WICI_OWM_NIGHT_504((char) 0xf028),
        WICI_OWM_NIGHT_511((char) 0xf026),
        WICI_OWM_NIGHT_520((char) 0xf029),
        WICI_OWM_NIGHT_521((char) 0xf029),
        WICI_OWM_NIGHT_522((char) 0xf029),
        WICI_OWM_NIGHT_531((char) 0xf02c),
        WICI_OWM_NIGHT_600((char) 0xf02a),
        WICI_OWM_NIGHT_601((char) 0xf0b4),
        WICI_OWM_NIGHT_602((char) 0xf02a),
        WICI_OWM_NIGHT_611((char) 0xf026),
        WICI_OWM_NIGHT_612((char) 0xf026),
        WICI_OWM_NIGHT_615((char) 0xf026),
        WICI_OWM_NIGHT_616((char) 0xf026),
        WICI_OWM_NIGHT_620((char) 0xf026),
        WICI_OWM_NIGHT_621((char) 0xf02a),
        WICI_OWM_NIGHT_622((char) 0xf02a),
        WICI_OWM_NIGHT_701((char) 0xf029),
        WICI_OWM_NIGHT_711((char) 0xf062),
        WICI_OWM_NIGHT_721((char) 0xf0b6),
        WICI_OWM_NIGHT_731((char) 0xf063),
        WICI_OWM_NIGHT_741((char) 0xf04a),
        WICI_OWM_NIGHT_761((char) 0xf063),
        WICI_OWM_NIGHT_762((char) 0xf063),
        WICI_OWM_NIGHT_781((char) 0xf056),
        WICI_OWM_NIGHT_800((char) 0xf02e),
        WICI_OWM_NIGHT_801((char) 0xf022),
        WICI_OWM_NIGHT_802((char) 0xf022),
        WICI_OWM_NIGHT_803((char) 0xf022),
        WICI_OWM_NIGHT_804((char) 0xf086),
        WICI_OWM_NIGHT_900((char) 0xf056),
        WICI_OWM_NIGHT_902((char) 0xf073),
        WICI_OWM_NIGHT_903((char) 0xf076),
        WICI_OWM_NIGHT_904((char) 0xf072),
        WICI_OWM_NIGHT_906((char) 0xf024),
        WICI_OWM_NIGHT_957((char) 0xf050),
        WICI_WU_CHANCEFLURRIES((char) 0xf064),
        WICI_WU_CHANCERAIN((char) 0xf019),
        WICI_WU_CHANCESLEAT((char) 0xf0b5),
        WICI_WU_CHANCESNOW((char) 0xf01b),
        WICI_WU_CHANCETSTORMS((char) 0xf01e),
        WICI_WU_CLEAR((char) 0xf00d),
        WICI_WU_CLOUDY((char) 0xf002),
        WICI_WU_FLURRIES((char) 0xf064),
        WICI_WU_HAZY((char) 0xf0b6),
        WICI_WU_MOSTLYCLOUDY((char) 0xf002),
        WICI_WU_MOSTLYSUNNY((char) 0xf00d),
        WICI_WU_PARTLYCLOUDY((char) 0xf002),
        WICI_WU_PARTLYSUNNY((char) 0xf00d),
        WICI_WU_RAIN((char) 0xf01a),
        WICI_WU_SLEAT((char) 0xf0b5),
        WICI_WU_SNOW((char) 0xf01b),
        WICI_WU_SUNNY((char) 0xf00d),
        WICI_WU_TSTORMS((char) 0xf01e),
        WICI_WU_UNKNOWN((char) 0xf00d);

        char weatherIconsCharacter;

        Icon(char character) {
            this.weatherIconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return weatherIconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface weatherIconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (weatherIconsTypeface == null) {
                setTypeface(new WeatherIcons());
            }
            return weatherIconsTypeface;
        }

        private static void setTypeface(WeatherIcons weatherIconsTypeface) {
            Icon.weatherIconsTypeface = weatherIconsTypeface;
        }
    }
}
