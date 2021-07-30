package com.rilixtech.weather_icons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the WeatherIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class WeatherIcons implements ITypeface {
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
     * WeatherIcons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which WeatherIcons IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by WeatherIcons ITypeface.
     */
    public enum Icon implements IIcon {
        WICI_DAY_SUNNY('\uf00d'),
        WICI_DAY_CLOUDY('\uf002'),
        WICI_DAY_CLOUDY_GUSTS('\uf000'),
        WICI_DAY_CLOUDY_WINDY('\uf001'),
        WICI_DAY_FOG('\uf003'),
        WICI_DAY_HAIL('\uf004'),
        WICI_DAY_HAZE('\uf0b6'),
        WICI_DAY_LIGHTNING('\uf005'),
        WICI_DAY_RAIN('\uf008'),
        WICI_DAY_RAIN_MIX('\uf006'),
        WICI_DAY_RAIN_WIND('\uf007'),
        WICI_DAY_SHOWERS('\uf009'),
        WICI_DAY_SLEET('\uf0b2'),
        WICI_DAY_SLEET_STORM('\uf068'),
        WICI_DAY_SNOW('\uf00a'),
        WICI_DAY_SNOW_THUNDERSTORM('\uf06b'),
        WICI_DAY_SNOW_WIND('\uf065'),
        WICI_DAY_SPRINKLE('\uf00b'),
        WICI_DAY_STORM_SHOWERS('\uf00e'),
        WICI_DAY_SUNNY_OVERCAST('\uf00c'),
        WICI_DAY_THUNDERSTORM('\uf010'),
        WICI_DAY_WINDY('\uf085'),
        WICI_SOLAR_ECLIPSE('\uf06e'),
        WICI_HOT('\uf072'),
        WICI_DAY_CLOUDY_HIGH('\uf07d'),
        WICI_DAY_LIGHT_WIND('\uf0c4'),
        WICI_NIGHT_CLEAR('\uf02e'),
        WICI_NIGHT_ALT_CLOUDY('\uf086'),
        WICI_NIGHT_ALT_CLOUDY_GUSTS('\uf022'),
        WICI_NIGHT_ALT_CLOUDY_WINDY('\uf023'),
        WICI_NIGHT_ALT_HAIL('\uf024'),
        WICI_NIGHT_ALT_LIGHTNING('\uf025'),
        WICI_NIGHT_ALT_RAIN('\uf028'),
        WICI_NIGHT_ALT_RAIN_MIX('\uf026'),
        WICI_NIGHT_ALT_RAIN_WIND('\uf027'),
        WICI_NIGHT_ALT_SHOWERS('\uf029'),
        WICI_NIGHT_ALT_SLEET('\uf0b4'),
        WICI_NIGHT_ALT_SLEET_STORM('\uf06a'),
        WICI_NIGHT_ALT_SNOW('\uf02a'),
        WICI_NIGHT_ALT_SNOW_THUNDERSTORM('\uf06d'),
        WICI_NIGHT_ALT_SNOW_WIND('\uf067'),
        WICI_NIGHT_ALT_SPRINKLE('\uf02b'),
        WICI_NIGHT_ALT_STORM_SHOWERS('\uf02c'),
        WICI_NIGHT_ALT_THUNDERSTORM('\uf02d'),
        WICI_NIGHT_CLOUDY('\uf031'),
        WICI_NIGHT_CLOUDY_GUSTS('\uf02f'),
        WICI_NIGHT_CLOUDY_WINDY('\uf030'),
        WICI_NIGHT_FOG('\uf04a'),
        WICI_NIGHT_HAIL('\uf032'),
        WICI_NIGHT_LIGHTNING('\uf033'),
        WICI_NIGHT_PARTLY_CLOUDY('\uf083'),
        WICI_NIGHT_RAIN('\uf036'),
        WICI_NIGHT_RAIN_MIX('\uf034'),
        WICI_NIGHT_RAIN_WIND('\uf035'),
        WICI_NIGHT_SHOWERS('\uf037'),
        WICI_NIGHT_SLEET('\uf0b3'),
        WICI_NIGHT_SLEET_STORM('\uf069'),
        WICI_NIGHT_SNOW('\uf038'),
        WICI_NIGHT_SNOW_THUNDERSTORM('\uf06c'),
        WICI_NIGHT_SNOW_WIND('\uf066'),
        WICI_NIGHT_SPRINKLE('\uf039'),
        WICI_NIGHT_STORM_SHOWERS('\uf03a'),
        WICI_NIGHT_THUNDERSTORM('\uf03b'),
        WICI_LUNAR_ECLIPSE('\uf070'),
        WICI_STARS('\uf077'),
        WICI_NIGHT_ALT_CLOUDY_HIGH('\uf07e'),
        WICI_NIGHT_CLOUDY_HIGH('\uf080'),
        WICI_NIGHT_ALT_PARTLY_CLOUDY('\uf081'),
        WICI_CLOUD('\uf041'),
        WICI_CLOUDY('\uf013'),
        WICI_CLOUDY_GUSTS('\uf011'),
        WICI_CLOUDY_WINDY('\uf012'),
        WICI_FOG('\uf014'),
        WICI_HAIL('\uf015'),
        WICI_RAIN('\uf019'),
        WICI_RAIN_MIX('\uf017'),
        WICI_RAIN_WIND('\uf018'),
        WICI_SHOWERS('\uf01a'),
        WICI_SLEET('\uf0b5'),
        WICI_SPRINKLE('\uf01c'),
        WICI_STORM_SHOWERS('\uf01d'),
        WICI_THUNDERSTORM('\uf01e'),
        WICI_SNOW_WIND('\uf064'),
        WICI_SNOW('\uf01b'),
        WICI_SMOG('\uf074'),
        WICI_SMOKE('\uf062'),
        WICI_LIGHTNING('\uf016'),
        WICI_RAINDROPS('\uf04e'),
        WICI_RAINDROP('\uf078'),
        WICI_DUST('\uf063'),
        WICI_SNOWFLAKE_COLD('\uf076'),
        WICI_WINDY('\uf021'),
        WICI_STRONG_WIND('\uf050'),
        WICI_SANDSTORM('\uf082'),
        WICI_EARTHQUAKE('\uf0c6'),
        WICI_FIRE('\uf0c7'),
        WICI_FLOOD('\uf07c'),
        WICI_METEOR('\uf071'),
        WICI_TSUNAMI('\uf0c5'),
        WICI_VOLCANO('\uf0c8'),
        WICI_HURRICANE('\uf073'),
        WICI_TORNADO('\uf056'),
        WICI_SMALL_CRAFT_ADVISORY('\uf0cc'),
        WICI_GALE_WARNING('\uf0cd'),
        WICI_STORM_WARNING('\uf0ce'),
        WICI_HURRICANE_WARNING('\uf0cf'),
        WICI_WIND_DIRECTION('\uf0b1'),
        WICI_ALIEN('\uf075'),
        WICI_CELSIUS('\uf03c'),
        WICI_FAHRENHEIT('\uf045'),
        WICI_DEGREES('\uf042'),
        WICI_THERMOMETER('\uf055'),
        WICI_THERMOMETER_EXTERIOR('\uf053'),
        WICI_THERMOMETER_INTERNAL('\uf054'),
        WICI_CLOUD_DOWN('\uf03d'),
        WICI_CLOUD_UP('\uf040'),
        WICI_CLOUD_REFRESH('\uf03e'),
        WICI_HORIZON('\uf047'),
        WICI_HORIZON_ALT('\uf046'),
        WICI_SUNRISE('\uf051'),
        WICI_SUNSET('\uf052'),
        WICI_MOONRISE('\uf0c9'),
        WICI_MOONSET('\uf0ca'),
        WICI_REFRESH('\uf04c'),
        WICI_REFRESH_ALT('\uf04b'),
        WICI_UMBRELLA('\uf084'),
        WICI_BAROMETER('\uf079'),
        WICI_HUMIDITY('\uf07a'),
        WICI_NA('\uf07b'),
        WICI_TRAIN('\uf0cb'),
        WICI_MOON_NEW('\uf095'),
        WICI_MOON_WAXING_CRESCENTI_1('\uf096'),
        WICI_MOON_WAXING_CRESCENTI_2('\uf097'),
        WICI_MOON_WAXING_CRESCENTI_3('\uf098'),
        WICI_MOON_WAXING_CRESCENTI_4('\uf099'),
        WICI_MOON_WAXING_CRESCENTI_5('\uf09a'),
        WICI_MOON_WAXING_CRESCENTI_6('\uf09b'),
        WICI_MOON_FIRST_QUARTER('\uf09c'),
        WICI_MOON_WAXING_GIBBOUS_1('\uf09d'),
        WICI_MOON_WAXING_GIBBOUS_2('\uf09e'),
        WICI_MOON_WAXING_GIBBOUS_3('\uf09f'),
        WICI_MOON_WAXING_GIBBOUS_4('\uf0a0'),
        WICI_MOON_WAXING_GIBBOUS_5('\uf0a1'),
        WICI_MOON_WAXING_GIBBOUS_6('\uf0a2'),
        WICI_MOON_FULL('\uf0a3'),
        WICI_MOON_WANING_GIBBOUS_1('\uf0a4'),
        WICI_MOON_WANING_GIBBOUS_2('\uf0a5'),
        WICI_MOON_WANING_GIBBOUS_3('\uf0a6'),
        WICI_MOON_WANING_GIBBOUS_4('\uf0a7'),
        WICI_MOON_WANING_GIBBOUS_5('\uf0a8'),
        WICI_MOON_WANING_GIBBOUS_6('\uf0a9'),
        WICI_MOON_THIRD_QUARTER('\uf0aa'),
        WICI_MOON_WANING_CRESCENTI_1('\uf0ab'),
        WICI_MOON_WANING_CRESCENTI_2('\uf0ac'),
        WICI_MOON_WANING_CRESCENTI_3('\uf0ad'),
        WICI_MOON_WANING_CRESCENTI_4('\uf0ae'),
        WICI_MOON_WANING_CRESCENTI_5('\uf0af'),
        WICI_MOON_WANING_CRESCENTI_6('\uf0b0'),
        WICI_MOON_ALT_NEW('\uf0eb'),
        WICI_MOON_ALT_WAXING_CRESCENTI_1('\uf0d0'),
        WICI_MOON_ALT_WAXING_CRESCENTI_2('\uf0d1'),
        WICI_MOON_ALT_WAXING_CRESCENTI_3('\uf0d2'),
        WICI_MOON_ALT_WAXING_CRESCENTI_4('\uf0d3'),
        WICI_MOON_ALT_WAXING_CRESCENTI_5('\uf0d4'),
        WICI_MOON_ALT_WAXING_CRESCENTI_6('\uf0d5'),
        WICI_MOON_ALT_FIRST_QUARTER('\uf0d6'),
        WICI_MOON_ALT_WAXING_GIBBOUS_1('\uf0d7'),
        WICI_MOON_ALT_WAXING_GIBBOUS_2('\uf0d8'),
        WICI_MOON_ALT_WAXING_GIBBOUS_3('\uf0d9'),
        WICI_MOON_ALT_WAXING_GIBBOUS_4('\uf0da'),
        WICI_MOON_ALT_WAXING_GIBBOUS_5('\uf0db'),
        WICI_MOON_ALT_WAXING_GIBBOUS_6('\uf0dc'),
        WICI_MOON_ALT_FULL('\uf0dd'),
        WICI_MOON_ALT_WANING_GIBBOUS_1('\uf0de'),
        WICI_MOON_ALT_WANING_GIBBOUS_2('\uf0df'),
        WICI_MOON_ALT_WANING_GIBBOUS_3('\uf0e0'),
        WICI_MOON_ALT_WANING_GIBBOUS_4('\uf0e1'),
        WICI_MOON_ALT_WANING_GIBBOUS_5('\uf0e2'),
        WICI_MOON_ALT_WANING_GIBBOUS_6('\uf0e3'),
        WICI_MOON_ALT_THIRD_QUARTER('\uf0e4'),
        WICI_MOON_ALT_WANING_CRESCENTI_1('\uf0e5'),
        WICI_MOON_ALT_WANING_CRESCENTI_2('\uf0e6'),
        WICI_MOON_ALT_WANING_CRESCENTI_3('\uf0e7'),
        WICI_MOON_ALT_WANING_CRESCENTI_4('\uf0e8'),
        WICI_MOON_ALT_WANING_CRESCENTI_5('\uf0e9'),
        WICI_MOON_ALT_WANING_CRESCENTI_6('\uf0ea'),
        WICI_MOON_0('\uf095'),
        WICI_MOON_1('\uf096'),
        WICI_MOON_2('\uf097'),
        WICI_MOON_3('\uf098'),
        WICI_MOON_4('\uf099'),
        WICI_MOON_5('\uf09a'),
        WICI_MOON_6('\uf09b'),
        WICI_MOON_7('\uf09c'),
        WICI_MOON_8('\uf09d'),
        WICI_MOON_9('\uf09e'),
        WICI_MOON_10('\uf09f'),
        WICI_MOON_11('\uf0a0'),
        WICI_MOON_12('\uf0a1'),
        WICI_MOON_13('\uf0a2'),
        WICI_MOON_14('\uf0a3'),
        WICI_MOON_15('\uf0a4'),
        WICI_MOON_16('\uf0a5'),
        WICI_MOON_17('\uf0a6'),
        WICI_MOON_18('\uf0a7'),
        WICI_MOON_19('\uf0a8'),
        WICI_MOON_20('\uf0a9'),
        WICI_MOON_21('\uf0aa'),
        WICI_MOON_22('\uf0ab'),
        WICI_MOON_23('\uf0ac'),
        WICI_MOON_24('\uf0ad'),
        WICI_MOON_25('\uf0ae'),
        WICI_MOON_26('\uf0af'),
        WICI_MOON_27('\uf0b0'),
        WICI_TIME_1('\uf08a'),
        WICI_TIME_2('\uf08b'),
        WICI_TIME_3('\uf08c'),
        WICI_TIME_4('\uf08d'),
        WICI_TIME_5('\uf08e'),
        WICI_TIME_6('\uf08f'),
        WICI_TIME_7('\uf090'),
        WICI_TIME_8('\uf091'),
        WICI_TIME_9('\uf092'),
        WICI_TIME_10('\uf093'),
        WICI_TIME_11('\uf094'),
        WICI_TIME_12('\uf089'),
        WICI_DIRECTION_UP('\uf058'),
        WICI_DIRECTION_UP_RIGHT('\uf057'),
        WICI_DIRECTION_RIGHT('\uf04d'),
        WICI_DIRECTION_DOWN_RIGHT('\uf088'),
        WICI_DIRECTION_DOWN('\uf044'),
        WICI_DIRECTION_DOWN_LEFT('\uf043'),
        WICI_DIRECTION_LEFT('\uf048'),
        WICI_DIRECTION_UP_LEFT('\uf087'),
        WICI_WIND_BEAUFORT_0('\uf0b7'),
        WICI_WIND_BEAUFORT_1('\uf0b8'),
        WICI_WIND_BEAUFORT_2('\uf0b9'),
        WICI_WIND_BEAUFORT_3('\uf0ba'),
        WICI_WIND_BEAUFORT_4('\uf0bb'),
        WICI_WIND_BEAUFORT_5('\uf0bc'),
        WICI_WIND_BEAUFORT_6('\uf0bd'),
        WICI_WIND_BEAUFORT_7('\uf0be'),
        WICI_WIND_BEAUFORT_8('\uf0bf'),
        WICI_WIND_BEAUFORT_9('\uf0c0'),
        WICI_WIND_BEAUFORT_10('\uf0c1'),
        WICI_WIND_BEAUFORT_11('\uf0c2'),
        WICI_WIND_BEAUFORT_12('\uf0c3'),
        WICI_YAHOO_0('\uf056'),
        WICI_YAHOO_1('\uf00e'),
        WICI_YAHOO_2('\uf073'),
        WICI_YAHOO_3('\uf01e'),
        WICI_YAHOO_4('\uf01e'),
        WICI_YAHOO_5('\uf017'),
        WICI_YAHOO_6('\uf017'),
        WICI_YAHOO_7('\uf017'),
        WICI_YAHOO_8('\uf015'),
        WICI_YAHOO_9('\uf01a'),
        WICI_YAHOO_10('\uf015'),
        WICI_YAHOO_11('\uf01a'),
        WICI_YAHOO_12('\uf01a'),
        WICI_YAHOO_13('\uf01b'),
        WICI_YAHOO_14('\uf00a'),
        WICI_YAHOO_15('\uf064'),
        WICI_YAHOO_16('\uf01b'),
        WICI_YAHOO_17('\uf015'),
        WICI_YAHOO_18('\uf017'),
        WICI_YAHOO_19('\uf063'),
        WICI_YAHOO_20('\uf014'),
        WICI_YAHOO_21('\uf021'),
        WICI_YAHOO_22('\uf062'),
        WICI_YAHOO_23('\uf050'),
        WICI_YAHOO_24('\uf050'),
        WICI_YAHOO_25('\uf076'),
        WICI_YAHOO_26('\uf013'),
        WICI_YAHOO_27('\uf031'),
        WICI_YAHOO_28('\uf002'),
        WICI_YAHOO_29('\uf031'),
        WICI_YAHOO_30('\uf002'),
        WICI_YAHOO_31('\uf02e'),
        WICI_YAHOO_32('\uf00d'),
        WICI_YAHOO_33('\uf083'),
        WICI_YAHOO_34('\uf00c'),
        WICI_YAHOO_35('\uf017'),
        WICI_YAHOO_36('\uf072'),
        WICI_YAHOO_37('\uf00e'),
        WICI_YAHOO_38('\uf00e'),
        WICI_YAHOO_39('\uf00e'),
        WICI_YAHOO_40('\uf01a'),
        WICI_YAHOO_41('\uf064'),
        WICI_YAHOO_42('\uf01b'),
        WICI_YAHOO_43('\uf064'),
        WICI_YAHOO_44('\uf00c'),
        WICI_YAHOO_45('\uf00e'),
        WICI_YAHOO_46('\uf01b'),
        WICI_YAHOO_47('\uf00e'),
        WICI_YAHOO_3200('\uf077'),
        WICI_FORECAST_IO_CLEAR_DAY('\uf00d'),
        WICI_FORECAST_IO_CLEAR_NIGHT('\uf02e'),
        WICI_FORECAST_IO_RAIN('\uf019'),
        WICI_FORECAST_IO_SNOW('\uf01b'),
        WICI_FORECAST_IO_SLEET('\uf0b5'),
        WICI_FORECAST_IO_WIND('\uf050'),
        WICI_FORECAST_IO_FOG('\uf014'),
        WICI_FORECAST_IO_CLOUDY('\uf013'),
        WICI_FORECAST_IO_PARTLY_CLOUDY_DAY('\uf002'),
        WICI_FORECAST_IO_PARTLY_CLOUDY_NIGHT('\uf031'),
        WICI_FORECAST_IO_HAIL('\uf015'),
        WICI_FORECAST_IO_THUNDERSTORM('\uf01e'),
        WICI_FORECAST_IO_TORNADO('\uf056'),
        WICI_WMO4680_0('\uf055'),
        WICI_WMO4680_00('\uf055'),
        WICI_WMO4680_1('\uf013'),
        WICI_WMO4680_01('\uf013'),
        WICI_WMO4680_2('\uf055'),
        WICI_WMO4680_02('\uf055'),
        WICI_WMO4680_3('\uf013'),
        WICI_WMO4680_03('\uf013'),
        WICI_WMO4680_4('\uf014'),
        WICI_WMO4680_04('\uf014'),
        WICI_WMO4680_5('\uf014'),
        WICI_WMO4680_05('\uf014'),
        WICI_WMO4680_10('\uf014'),
        WICI_WMO4680_11('\uf014'),
        WICI_WMO4680_12('\uf016'),
        WICI_WMO4680_18('\uf050'),
        WICI_WMO4680_20('\uf014'),
        WICI_WMO4680_21('\uf017'),
        WICI_WMO4680_22('\uf017'),
        WICI_WMO4680_23('\uf019'),
        WICI_WMO4680_24('\uf01b'),
        WICI_WMO4680_25('\uf015'),
        WICI_WMO4680_26('\uf01e'),
        WICI_WMO4680_27('\uf063'),
        WICI_WMO4680_28('\uf063'),
        WICI_WMO4680_29('\uf063'),
        WICI_WMO4680_30('\uf014'),
        WICI_WMO4680_31('\uf014'),
        WICI_WMO4680_32('\uf014'),
        WICI_WMO4680_33('\uf014'),
        WICI_WMO4680_34('\uf014'),
        WICI_WMO4680_35('\uf014'),
        WICI_WMO4680_40('\uf017'),
        WICI_WMO4680_41('\uf01c'),
        WICI_WMO4680_42('\uf019'),
        WICI_WMO4680_43('\uf01c'),
        WICI_WMO4680_44('\uf019'),
        WICI_WMO4680_45('\uf015'),
        WICI_WMO4680_46('\uf015'),
        WICI_WMO4680_47('\uf01b'),
        WICI_WMO4680_48('\uf01b'),
        WICI_WMO4680_50('\uf01c'),
        WICI_WMO4680_51('\uf01c'),
        WICI_WMO4680_52('\uf019'),
        WICI_WMO4680_53('\uf019'),
        WICI_WMO4680_54('\uf076'),
        WICI_WMO4680_55('\uf076'),
        WICI_WMO4680_56('\uf076'),
        WICI_WMO4680_57('\uf01c'),
        WICI_WMO4680_58('\uf019'),
        WICI_WMO4680_60('\uf01c'),
        WICI_WMO4680_61('\uf01c'),
        WICI_WMO4680_62('\uf019'),
        WICI_WMO4680_63('\uf019'),
        WICI_WMO4680_64('\uf015'),
        WICI_WMO4680_65('\uf015'),
        WICI_WMO4680_66('\uf015'),
        WICI_WMO4680_67('\uf017'),
        WICI_WMO4680_68('\uf017'),
        WICI_WMO4680_70('\uf01b'),
        WICI_WMO4680_71('\uf01b'),
        WICI_WMO4680_72('\uf01b'),
        WICI_WMO4680_73('\uf01b'),
        WICI_WMO4680_74('\uf076'),
        WICI_WMO4680_75('\uf076'),
        WICI_WMO4680_76('\uf076'),
        WICI_WMO4680_77('\uf01b'),
        WICI_WMO4680_78('\uf076'),
        WICI_WMO4680_80('\uf019'),
        WICI_WMO4680_81('\uf01c'),
        WICI_WMO4680_82('\uf019'),
        WICI_WMO4680_83('\uf019'),
        WICI_WMO4680_84('\uf01d'),
        WICI_WMO4680_85('\uf017'),
        WICI_WMO4680_86('\uf017'),
        WICI_WMO4680_87('\uf017'),
        WICI_WMO4680_89('\uf015'),
        WICI_WMO4680_90('\uf016'),
        WICI_WMO4680_91('\uf01d'),
        WICI_WMO4680_92('\uf01e'),
        WICI_WMO4680_93('\uf01e'),
        WICI_WMO4680_94('\uf016'),
        WICI_WMO4680_95('\uf01e'),
        WICI_WMO4680_96('\uf01e'),
        WICI_WMO4680_99('\uf056'),
        WICI_OWM_200('\uf01e'),
        WICI_OWM_201('\uf01e'),
        WICI_OWM_202('\uf01e'),
        WICI_OWM_210('\uf016'),
        WICI_OWM_211('\uf016'),
        WICI_OWM_212('\uf016'),
        WICI_OWM_221('\uf016'),
        WICI_OWM_230('\uf01e'),
        WICI_OWM_231('\uf01e'),
        WICI_OWM_232('\uf01e'),
        WICI_OWM_300('\uf01c'),
        WICI_OWM_301('\uf01c'),
        WICI_OWM_302('\uf019'),
        WICI_OWM_310('\uf017'),
        WICI_OWM_311('\uf019'),
        WICI_OWM_312('\uf019'),
        WICI_OWM_313('\uf01a'),
        WICI_OWM_314('\uf019'),
        WICI_OWM_321('\uf01c'),
        WICI_OWM_500('\uf01c'),
        WICI_OWM_501('\uf019'),
        WICI_OWM_502('\uf019'),
        WICI_OWM_503('\uf019'),
        WICI_OWM_504('\uf019'),
        WICI_OWM_511('\uf017'),
        WICI_OWM_520('\uf01a'),
        WICI_OWM_521('\uf01a'),
        WICI_OWM_522('\uf01a'),
        WICI_OWM_531('\uf01d'),
        WICI_OWM_600('\uf01b'),
        WICI_OWM_601('\uf01b'),
        WICI_OWM_602('\uf0b5'),
        WICI_OWM_611('\uf017'),
        WICI_OWM_612('\uf017'),
        WICI_OWM_615('\uf017'),
        WICI_OWM_616('\uf017'),
        WICI_OWM_620('\uf017'),
        WICI_OWM_621('\uf01b'),
        WICI_OWM_622('\uf01b'),
        WICI_OWM_701('\uf01a'),
        WICI_OWM_711('\uf062'),
        WICI_OWM_721('\uf0b6'),
        WICI_OWM_731('\uf063'),
        WICI_OWM_741('\uf014'),
        WICI_OWM_761('\uf063'),
        WICI_OWM_762('\uf063'),
        WICI_OWM_771('\uf011'),
        WICI_OWM_781('\uf056'),
        WICI_OWM_800('\uf00d'),
        WICI_OWM_801('\uf011'),
        WICI_OWM_802('\uf011'),
        WICI_OWM_803('\uf012'),
        WICI_OWM_804('\uf013'),
        WICI_OWM_900('\uf056'),
        WICI_OWM_901('\uf01d'),
        WICI_OWM_902('\uf073'),
        WICI_OWM_903('\uf076'),
        WICI_OWM_904('\uf072'),
        WICI_OWM_905('\uf021'),
        WICI_OWM_906('\uf015'),
        WICI_OWM_957('\uf050'),
        WICI_OWM_DAY_200('\uf010'),
        WICI_OWM_DAY_201('\uf010'),
        WICI_OWM_DAY_202('\uf010'),
        WICI_OWM_DAY_210('\uf005'),
        WICI_OWM_DAY_211('\uf005'),
        WICI_OWM_DAY_212('\uf005'),
        WICI_OWM_DAY_221('\uf005'),
        WICI_OWM_DAY_230('\uf010'),
        WICI_OWM_DAY_231('\uf010'),
        WICI_OWM_DAY_232('\uf010'),
        WICI_OWM_DAY_300('\uf00b'),
        WICI_OWM_DAY_301('\uf00b'),
        WICI_OWM_DAY_302('\uf008'),
        WICI_OWM_DAY_310('\uf008'),
        WICI_OWM_DAY_311('\uf008'),
        WICI_OWM_DAY_312('\uf008'),
        WICI_OWM_DAY_313('\uf008'),
        WICI_OWM_DAY_314('\uf008'),
        WICI_OWM_DAY_321('\uf00b'),
        WICI_OWM_DAY_500('\uf00b'),
        WICI_OWM_DAY_501('\uf008'),
        WICI_OWM_DAY_502('\uf008'),
        WICI_OWM_DAY_503('\uf008'),
        WICI_OWM_DAY_504('\uf008'),
        WICI_OWM_DAY_511('\uf006'),
        WICI_OWM_DAY_520('\uf009'),
        WICI_OWM_DAY_521('\uf009'),
        WICI_OWM_DAY_522('\uf009'),
        WICI_OWM_DAY_531('\uf00e'),
        WICI_OWM_DAY_600('\uf00a'),
        WICI_OWM_DAY_601('\uf0b2'),
        WICI_OWM_DAY_602('\uf00a'),
        WICI_OWM_DAY_611('\uf006'),
        WICI_OWM_DAY_612('\uf006'),
        WICI_OWM_DAY_615('\uf006'),
        WICI_OWM_DAY_616('\uf006'),
        WICI_OWM_DAY_620('\uf006'),
        WICI_OWM_DAY_621('\uf00a'),
        WICI_OWM_DAY_622('\uf00a'),
        WICI_OWM_DAY_701('\uf009'),
        WICI_OWM_DAY_711('\uf062'),
        WICI_OWM_DAY_721('\uf0b6'),
        WICI_OWM_DAY_731('\uf063'),
        WICI_OWM_DAY_741('\uf003'),
        WICI_OWM_DAY_761('\uf063'),
        WICI_OWM_DAY_762('\uf063'),
        WICI_OWM_DAY_781('\uf056'),
        WICI_OWM_DAY_800('\uf00d'),
        WICI_OWM_DAY_801('\uf000'),
        WICI_OWM_DAY_802('\uf000'),
        WICI_OWM_DAY_803('\uf000'),
        WICI_OWM_DAY_804('\uf00c'),
        WICI_OWM_DAY_900('\uf056'),
        WICI_OWM_DAY_902('\uf073'),
        WICI_OWM_DAY_903('\uf076'),
        WICI_OWM_DAY_904('\uf072'),
        WICI_OWM_DAY_906('\uf004'),
        WICI_OWM_DAY_957('\uf050'),
        WICI_OWM_NIGHT_200('\uf02d'),
        WICI_OWM_NIGHT_201('\uf02d'),
        WICI_OWM_NIGHT_202('\uf02d'),
        WICI_OWM_NIGHT_210('\uf025'),
        WICI_OWM_NIGHT_211('\uf025'),
        WICI_OWM_NIGHT_212('\uf025'),
        WICI_OWM_NIGHT_221('\uf025'),
        WICI_OWM_NIGHT_230('\uf02d'),
        WICI_OWM_NIGHT_231('\uf02d'),
        WICI_OWM_NIGHT_232('\uf02d'),
        WICI_OWM_NIGHT_300('\uf02b'),
        WICI_OWM_NIGHT_301('\uf02b'),
        WICI_OWM_NIGHT_302('\uf028'),
        WICI_OWM_NIGHT_310('\uf028'),
        WICI_OWM_NIGHT_311('\uf028'),
        WICI_OWM_NIGHT_312('\uf028'),
        WICI_OWM_NIGHT_313('\uf028'),
        WICI_OWM_NIGHT_314('\uf028'),
        WICI_OWM_NIGHT_321('\uf02b'),
        WICI_OWM_NIGHT_500('\uf02b'),
        WICI_OWM_NIGHT_501('\uf028'),
        WICI_OWM_NIGHT_502('\uf028'),
        WICI_OWM_NIGHT_503('\uf028'),
        WICI_OWM_NIGHT_504('\uf028'),
        WICI_OWM_NIGHT_511('\uf026'),
        WICI_OWM_NIGHT_520('\uf029'),
        WICI_OWM_NIGHT_521('\uf029'),
        WICI_OWM_NIGHT_522('\uf029'),
        WICI_OWM_NIGHT_531('\uf02c'),
        WICI_OWM_NIGHT_600('\uf02a'),
        WICI_OWM_NIGHT_601('\uf0b4'),
        WICI_OWM_NIGHT_602('\uf02a'),
        WICI_OWM_NIGHT_611('\uf026'),
        WICI_OWM_NIGHT_612('\uf026'),
        WICI_OWM_NIGHT_615('\uf026'),
        WICI_OWM_NIGHT_616('\uf026'),
        WICI_OWM_NIGHT_620('\uf026'),
        WICI_OWM_NIGHT_621('\uf02a'),
        WICI_OWM_NIGHT_622('\uf02a'),
        WICI_OWM_NIGHT_701('\uf029'),
        WICI_OWM_NIGHT_711('\uf062'),
        WICI_OWM_NIGHT_721('\uf0b6'),
        WICI_OWM_NIGHT_731('\uf063'),
        WICI_OWM_NIGHT_741('\uf04a'),
        WICI_OWM_NIGHT_761('\uf063'),
        WICI_OWM_NIGHT_762('\uf063'),
        WICI_OWM_NIGHT_781('\uf056'),
        WICI_OWM_NIGHT_800('\uf02e'),
        WICI_OWM_NIGHT_801('\uf022'),
        WICI_OWM_NIGHT_802('\uf022'),
        WICI_OWM_NIGHT_803('\uf022'),
        WICI_OWM_NIGHT_804('\uf086'),
        WICI_OWM_NIGHT_900('\uf056'),
        WICI_OWM_NIGHT_902('\uf073'),
        WICI_OWM_NIGHT_903('\uf076'),
        WICI_OWM_NIGHT_904('\uf072'),
        WICI_OWM_NIGHT_906('\uf024'),
        WICI_OWM_NIGHT_957('\uf050'),
        WICI_WU_CHANCEFLURRIES('\uf064'),
        WICI_WU_CHANCERAIN('\uf019'),
        WICI_WU_CHANCESLEAT('\uf0b5'),
        WICI_WU_CHANCESNOW('\uf01b'),
        WICI_WU_CHANCETSTORMS('\uf01e'),
        WICI_WU_CLEAR('\uf00d'),
        WICI_WU_CLOUDY('\uf002'),
        WICI_WU_FLURRIES('\uf064'),
        WICI_WU_HAZY('\uf0b6'),
        WICI_WU_MOSTLYCLOUDY('\uf002'),
        WICI_WU_MOSTLYSUNNY('\uf00d'),
        WICI_WU_PARTLYCLOUDY('\uf002'),
        WICI_WU_PARTLYSUNNY('\uf00d'),
        WICI_WU_RAIN('\uf01a'),
        WICI_WU_SLEAT('\uf0b5'),
        WICI_WU_SNOW('\uf01b'),
        WICI_WU_SUNNY('\uf00d'),
        WICI_WU_TSTORMS('\uf01e'),
        WICI_WU_UNKNOWN('\uf00d');

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
        private static ITypeface weatherIconsTypeface;

        @Override
        public ITypeface getTypeface() {
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