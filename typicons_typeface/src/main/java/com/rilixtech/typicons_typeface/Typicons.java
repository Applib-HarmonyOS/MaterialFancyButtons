package com.rilixtech.typicons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Typicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Typicons implements ITypeface {
    private static final String TTF_FILE = "typicons-font-v2.0.7.1.ttf";
    private static final String TYPICONS_PREFIX = "TYPI";
    public static final String TYPICONS_NAME = "Typicons";
    public static final String TYPICONS_VERSION = "2" + ".0.7.1";
    public static final String TYPICONS_AUTHOR = "Stephen Hutchings";
    public static final String TYPICONS_URL = "http://typicons.com/";
    public static final String TYPICONS_DESC = "336 pixel perfect, all-purpose vector icons";
    public static final String TYPICONS_LICENSE = "SIL OPEN FONT LICENSE";
    public static final String TYPICONS_LICENSE_URL = "http://scripts.sil.org/cms/scripts/page.php?item_id=OFL_web";

    private static Font typiconsTypeface = null;
    private static HashMap<String, Character> typiconsCharMap;

    /**
     * Typicons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Typicons IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Typicons icon characters in a HashMap.
     *
     * @return HashMap of all Typicons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (typiconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.typiconsCharacter);
            }
            setChars(characterHashMap);
        }
        return typiconsCharMap;
    }

    /**
     * Set the Typicons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        typiconsCharMap = characterHashMap;
    }

    /**
     * Return the Typicons Mapping Prefix.
     *
     * @return Typicons Mapping Prefix, used by all Typicons icons.
     */
    @Override
    public String getMappingPrefix() {
        return TYPICONS_PREFIX;
    }

    @Override
    public String getFontName() {
        return TYPICONS_NAME;
    }

    @Override
    public String getVersion() {
        return TYPICONS_VERSION;
    }

    @Override
    public int getIconCount() {
        return typiconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> typiconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            typiconsKeyList.add(value.name());
        }
        return typiconsKeyList;
    }

    @Override
    public String getAuthor() {
        return TYPICONS_AUTHOR;
    }

    @Override
    public String getUrl() {
        return TYPICONS_URL;
    }

    @Override
    public String getDescription() {
        return TYPICONS_DESC;
    }

    @Override
    public String getLicense() {
        return TYPICONS_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return TYPICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (typiconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return typiconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        typiconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Typicons ITypeface.
     */
    public enum Icon implements IIcon {
        TYPI_ADJUST_BRIGHTNESS('\ue000'),
        TYPI_ADJUST_CONTRAST('\ue001'),
        TYPI_ANCHOR_OUTLINE('\ue002'),
        TYPI_ANCHOR('\ue003'),
        TYPI_ARCHIVE('\ue004'),
        TYPI_ARROW_BACK_OUTLINE('\ue005'),
        TYPI_ARROW_BACK('\ue006'),
        TYPI_ARROW_DOWN_OUTLINE('\ue007'),
        TYPI_ARROW_DOWN_THICK('\ue008'),
        TYPI_ARROW_DOWN('\ue009'),
        TYPI_ARROW_FORWARD_OUTLINE('\ue00a'),
        TYPI_ARROW_FORWARD('\ue00b'),
        TYPI_ARROW_LEFT_OUTLINE('\ue00c'),
        TYPI_ARROW_LEFT_THICK('\ue00d'),
        TYPI_ARROW_LEFT('\ue00e'),
        TYPI_ARROW_LOOP_OUTLINE('\ue00f'),
        TYPI_ARROW_LOOP('\ue010'),
        TYPI_ARROW_MAXIMISE_OUTLINE('\ue011'),
        TYPI_ARROW_MAXIMISE('\ue012'),
        TYPI_ARROW_MINIMISE_OUTLINE('\ue013'),
        TYPI_ARROW_MINIMISE('\ue014'),
        TYPI_ARROW_MOVE_OUTLINE('\ue015'),
        TYPI_ARROW_MOVE('\ue016'),
        TYPI_ARROW_REPEAT_OUTLINE('\ue017'),
        TYPI_ARROW_REPEAT('\ue018'),
        TYPI_ARROW_RIGHT_OUTLINE('\ue019'),
        TYPI_ARROW_RIGHT_THICK('\ue01a'),
        TYPI_ARROW_RIGHT('\ue01b'),
        TYPI_ARROW_SHUFFLE('\ue01c'),
        TYPI_ARROW_SORTED_DOWN('\ue01d'),
        TYPI_ARROW_SORTED_UP('\ue01e'),
        TYPI_ARROW_SYNC_OUTLINE('\ue01f'),
        TYPI_ARROW_SYNC('\ue020'),
        TYPI_ARROW_UNSORTED('\ue021'),
        TYPI_ARROW_UP_OUTLINE('\ue022'),
        TYPI_ARROW_UP_THICK('\ue023'),
        TYPI_ARROW_UP('\ue024'),
        TYPI_AT('\ue025'),
        TYPI_ATTACHMENTI_OUTLINE('\ue026'),
        TYPI_ATTACHMENT('\ue027'),
        TYPI_BACKSPACE_OUTLINE('\ue028'),
        TYPI_BACKSPACE('\ue029'),
        TYPI_BATTERY_CHARGE('\ue02a'),
        TYPI_BATTERY_FULL('\ue02b'),
        TYPI_BATTERY_HIGH('\ue02c'),
        TYPI_BATTERY_LOW('\ue02d'),
        TYPI_BATTERY_MID('\ue02e'),
        TYPI_BEAKER('\ue02f'),
        TYPI_BEER('\ue030'),
        TYPI_BELL('\ue031'),
        TYPI_BOOK('\ue032'),
        TYPI_BOOKMARK('\ue033'),
        TYPI_BRIEFCASE('\ue034'),
        TYPI_BRUSH('\ue035'),
        TYPI_BUSINESS_CARD('\ue036'),
        TYPI_CALCULATOR('\ue037'),
        TYPI_CALENDAR_OUTLINE('\ue038'),
        TYPI_CALENDAR('\ue039'),
        TYPI_CAMERA_OUTLINE('\ue03a'),
        TYPI_CAMERA('\ue03b'),
        TYPI_CANCEL_OUTLINE('\ue03c'),
        TYPI_CANCEL('\ue03d'),
        TYPI_CHART_AREA_OUTLINE('\ue03e'),
        TYPI_CHART_AREA('\ue03f'),
        TYPI_CHART_BAR_OUTLINE('\ue040'),
        TYPI_CHART_BAR('\ue041'),
        TYPI_CHART_LINE_OUTLINE('\ue042'),
        TYPI_CHART_LINE('\ue043'),
        TYPI_CHART_PIE_OUTLINE('\ue044'),
        TYPI_CHART_PIE('\ue045'),
        TYPI_CHEVRON_LEFT_OUTLINE('\ue046'),
        TYPI_CHEVRON_LEFT('\ue047'),
        TYPI_CHEVRON_RIGHT_OUTLINE('\ue048'),
        TYPI_CHEVRON_RIGHT('\ue049'),
        TYPI_CLIPBOARD('\ue04a'),
        TYPI_CLOUD_STORAGE('\ue04b'),
        TYPI_CLOUD_STORAGE_OUTLINE('\ue054'),
        TYPI_CODE_OUTLINE('\ue04c'),
        TYPI_CODE('\ue04d'),
        TYPI_COFFEE('\ue04e'),
        TYPI_COG_OUTLINE('\ue04f'),
        TYPI_COG('\ue050'),
        TYPI_COMPASS('\ue051'),
        TYPI_CONTACTS('\ue052'),
        TYPI_CREDIT_CARD('\ue053'),
        TYPI_CSS3('\ue055'),
        TYPI_DATABASE('\ue056'),
        TYPI_DELETE_OUTLINE('\ue057'),
        TYPI_DELETE('\ue058'),
        TYPI_DEVICE_DESKTOP('\ue059'),
        TYPI_DEVICE_LAPTOP('\ue05a'),
        TYPI_DEVICE_PHONE('\ue05b'),
        TYPI_DEVICE_TABLET('\ue05c'),
        TYPI_DIRECTIONS('\ue05d'),
        TYPI_DIVIDE_OUTLINE('\ue05e'),
        TYPI_DIVIDE('\ue05f'),
        TYPI_DOCUMENTI_ADD('\ue060'),
        TYPI_DOCUMENTI_DELETE('\ue061'),
        TYPI_DOCUMENTI_TEXT('\ue062'),
        TYPI_DOCUMENT('\ue063'),
        TYPI_DOWNLOAD_OUTLINE('\ue064'),
        TYPI_DOWNLOAD('\ue065'),
        TYPI_DROPBOX('\ue066'),
        TYPI_EDIT('\ue067'),
        TYPI_EJECT_OUTLINE('\ue068'),
        TYPI_EJECT('\ue069'),
        TYPI_EQUALS_OUTLINE('\ue06a'),
        TYPI_EQUALS('\ue06b'),
        TYPI_EXPORT_OUTLINE('\ue06c'),
        TYPI_EXPORT('\ue06d'),
        TYPI_EYE_OUTLINE('\ue06e'),
        TYPI_EYE('\ue06f'),
        TYPI_FEATHER('\ue070'),
        TYPI_FILM('\ue071'),
        TYPI_FILTER('\ue072'),
        TYPI_FLAG_OUTLINE('\ue073'),
        TYPI_FLAG('\ue074'),
        TYPI_FLASH_OUTLINE('\ue075'),
        TYPI_FLASH('\ue076'),
        TYPI_FLOW_CHILDREN('\ue077'),
        TYPI_FLOW_MERGE('\ue078'),
        TYPI_FLOW_PARALLEL('\ue079'),
        TYPI_FLOW_SWITCH('\ue07a'),
        TYPI_FOLDER_ADD('\ue07b'),
        TYPI_FOLDER_DELETE('\ue07c'),
        TYPI_FOLDER_OPEN('\ue07d'),
        TYPI_FOLDER('\ue07e'),
        TYPI_GIFT('\ue07f'),
        TYPI_GLOBE_OUTLINE('\ue080'),
        TYPI_GLOBE('\ue081'),
        TYPI_GROUP_OUTLINE('\ue082'),
        TYPI_GROUP('\ue083'),
        TYPI_HEADPHONES('\ue084'),
        TYPI_HEART_FULL_OUTLINE('\ue085'),
        TYPI_HEART_HALF_OUTLINE('\ue086'),
        TYPI_HEART_OUTLINE('\ue087'),
        TYPI_HEART('\ue088'),
        TYPI_HOME_OUTLINE('\ue089'),
        TYPI_HOME('\ue08a'),
        TYPI_HTML5('\ue08b'),
        TYPI_IMAGE_OUTLINE('\ue08c'),
        TYPI_IMAGE('\ue08d'),
        TYPI_INFINITY_OUTLINE('\ue08e'),
        TYPI_INFINITY('\ue08f'),
        TYPI_INFO_LARGE_OUTLINE('\ue090'),
        TYPI_INFO_LARGE('\ue091'),
        TYPI_INFO_OUTLINE('\ue092'),
        TYPI_INFO('\ue093'),
        TYPI_INPUT_CHECKED_OUTLINE('\ue094'),
        TYPI_INPUT_CHECKED('\ue095'),
        TYPI_KEY_OUTLINE('\ue096'),
        TYPI_KEY('\ue097'),
        TYPI_KEYBOARD('\ue098'),
        TYPI_LEAF('\ue099'),
        TYPI_LIGHTBULB('\ue09a'),
        TYPI_LINK_OUTLINE('\ue09b'),
        TYPI_LINK('\ue09c'),
        TYPI_LOCATION_ARROW_OUTLINE('\ue09d'),
        TYPI_LOCATION_ARROW('\ue09e'),
        TYPI_LOCATION_OUTLINE('\ue09f'),
        TYPI_LOCATION('\ue0a0'),
        TYPI_LOCK_CLOSED_OUTLINE('\ue0a1'),
        TYPI_LOCK_CLOSED('\ue0a2'),
        TYPI_LOCK_OPEN_OUTLINE('\ue0a3'),
        TYPI_LOCK_OPEN('\ue0a4'),
        TYPI_MAIL('\ue0a5'),
        TYPI_MAP('\ue0a6'),
        TYPI_MEDIA_EJECT_OUTLINE('\ue0a7'),
        TYPI_MEDIA_EJECT('\ue0a8'),
        TYPI_MEDIA_FAST_FORWARD_OUTLINE('\ue0a9'),
        TYPI_MEDIA_FAST_FORWARD('\ue0aa'),
        TYPI_MEDIA_PAUSE_OUTLINE('\ue0ab'),
        TYPI_MEDIA_PAUSE('\ue0ac'),
        TYPI_MEDIA_PLAY_OUTLINE('\ue0ad'),
        TYPI_MEDIA_PLAY_REVERSE_OUTLINE('\ue0ae'),
        TYPI_MEDIA_PLAY_REVERSE('\ue0af'),
        TYPI_MEDIA_PLAY('\ue0b0'),
        TYPI_MEDIA_RECORD_OUTLINE('\ue0b1'),
        TYPI_MEDIA_RECORD('\ue0b2'),
        TYPI_MEDIA_REWIND_OUTLINE('\ue0b3'),
        TYPI_MEDIA_REWIND('\ue0b4'),
        TYPI_MEDIA_STOP_OUTLINE('\ue0b5'),
        TYPI_MEDIA_STOP('\ue0b6'),
        TYPI_MESSAGE_TYPING('\ue0b7'),
        TYPI_MESSAGE('\ue0b8'),
        TYPI_MESSAGES('\ue0b9'),
        TYPI_MICROPHONE_OUTLINE('\ue0ba'),
        TYPI_MICROPHONE('\ue0bb'),
        TYPI_MINUS_OUTLINE('\ue0bc'),
        TYPI_MINUS('\ue0bd'),
        TYPI_MORTAR_BOARD('\ue0be'),
        TYPI_NEWS('\ue0bf'),
        TYPI_NOTES_OUTLINE('\ue0c0'),
        TYPI_NOTES('\ue0c1'),
        TYPI_PEN('\ue0c2'),
        TYPI_PENCIL('\ue0c3'),
        TYPI_PHONE_OUTLINE('\ue0c4'),
        TYPI_PHONE('\ue0c5'),
        TYPI_PI_OUTLINE('\ue0c6'),
        TYPI_PI('\ue0c7'),
        TYPI_PIN_OUTLINE('\ue0c8'),
        TYPI_PIN('\ue0c9'),
        TYPI_PIPETTE('\ue0ca'),
        TYPI_PLANE_OUTLINE('\ue0cb'),
        TYPI_PLANE('\ue0cc'),
        TYPI_PLUG('\ue0cd'),
        TYPI_PLUS_OUTLINE('\ue0ce'),
        TYPI_PLUS('\ue0cf'),
        TYPI_POINT_OF_INTEREST_OUTLINE('\ue0d0'),
        TYPI_POINT_OF_INTEREST('\ue0d1'),
        TYPI_POWER_OUTLINE('\ue0d2'),
        TYPI_POWER('\ue0d3'),
        TYPI_PRINTER('\ue0d4'),
        TYPI_PUZZLE_OUTLINE('\ue0d5'),
        TYPI_PUZZLE('\ue0d6'),
        TYPI_RADAR_OUTLINE('\ue0d7'),
        TYPI_RADAR('\ue0d8'),
        TYPI_REFRESH_OUTLINE('\ue0d9'),
        TYPI_REFRESH('\ue0da'),
        TYPI_RSS_OUTLINE('\ue0db'),
        TYPI_RSS('\ue0dc'),
        TYPI_SCISSORS_OUTLINE('\ue0dd'),
        TYPI_SCISSORS('\ue0de'),
        TYPI_SHOPPING_BAG('\ue0df'),
        TYPI_SHOPPING_CART('\ue0e0'),
        TYPI_SOCIAL_AT_CIRCULAR('\ue0e1'),
        TYPI_SOCIAL_DRIBBBLE_CIRCULAR('\ue0e2'),
        TYPI_SOCIAL_DRIBBBLE('\ue0e3'),
        TYPI_SOCIAL_FACEBOOK_CIRCULAR('\ue0e4'),
        TYPI_SOCIAL_FACEBOOK('\ue0e5'),
        TYPI_SOCIAL_FLICKR_CIRCULAR('\ue0e6'),
        TYPI_SOCIAL_FLICKR('\ue0e7'),
        TYPI_SOCIAL_GITHUB_CIRCULAR('\ue0e8'),
        TYPI_SOCIAL_GITHUB('\ue0e9'),
        TYPI_SOCIAL_GOOGLE_PLUS_CIRCULAR('\ue0ea'),
        TYPI_SOCIAL_GOOGLE_PLUS('\ue0eb'),
        TYPI_SOCIAL_INSTAGRAM_CIRCULAR('\ue0ec'),
        TYPI_SOCIAL_INSTAGRAM('\ue0ed'),
        TYPI_SOCIAL_LAST_FM_CIRCULAR('\ue0ee'),
        TYPI_SOCIAL_LAST_FM('\ue0ef'),
        TYPI_SOCIAL_LINKEDIN_CIRCULAR('\ue0f0'),
        TYPI_SOCIAL_LINKEDIN('\ue0f1'),
        TYPI_SOCIAL_PINTEREST_CIRCULAR('\ue0f2'),
        TYPI_SOCIAL_PINTEREST('\ue0f3'),
        TYPI_SOCIAL_SKYPE_OUTLINE('\ue0f4'),
        TYPI_SOCIAL_SKYPE('\ue0f5'),
        TYPI_SOCIAL_TUMBLER_CIRCULAR('\ue0f6'),
        TYPI_SOCIAL_TUMBLER('\ue0f7'),
        TYPI_SOCIAL_TWITTER_CIRCULAR('\ue0f8'),
        TYPI_SOCIAL_TWITTER('\ue0f9'),
        TYPI_SOCIAL_VIMEO_CIRCULAR('\ue0fa'),
        TYPI_SOCIAL_VIMEO('\ue0fb'),
        TYPI_SOCIAL_YOUTUBE_CIRCULAR('\ue0fc'),
        TYPI_SOCIAL_YOUTUBE('\ue0fd'),
        TYPI_SORT_ALPHABETICALLY_OUTLINE('\ue0fe'),
        TYPI_SORT_ALPHABETICALLY('\ue0ff'),
        TYPI_SORT_NUMERICALLY_OUTLINE('\ue100'),
        TYPI_SORT_NUMERICALLY('\ue101'),
        TYPI_SPANNER_OUTLINE('\ue102'),
        TYPI_SPANNER('\ue103'),
        TYPI_SPIRAL('\ue104'),
        TYPI_STAR_FULL_OUTLINE('\ue105'),
        TYPI_STAR_HALF_OUTLINE('\ue106'),
        TYPI_STAR_HALF('\ue107'),
        TYPI_STAR_OUTLINE('\ue108'),
        TYPI_STAR('\ue109'),
        TYPI_STARBURST_OUTLINE('\ue10a'),
        TYPI_STARBURST('\ue10b'),
        TYPI_STOPWATCH('\ue10c'),
        TYPI_SUPPORT('\ue10d'),
        TYPI_TABS_OUTLINE('\ue10e'),
        TYPI_TAG('\ue10f'),
        TYPI_TAGS('\ue110'),
        TYPI_TH_LARGE_OUTLINE('\ue111'),
        TYPI_TH_LARGE('\ue112'),
        TYPI_TH_LIST_OUTLINE('\ue113'),
        TYPI_TH_LIST('\ue114'),
        TYPI_TH_MENU_OUTLINE('\ue115'),
        TYPI_TH_MENU('\ue116'),
        TYPI_TH_SMALL_OUTLINE('\ue117'),
        TYPI_TH_SMALL('\ue118'),
        TYPI_THERMOMETER('\ue119'),
        TYPI_THUMBS_DOWN('\ue11a'),
        TYPI_THUMBS_OK('\ue11b'),
        TYPI_THUMBS_UP('\ue11c'),
        TYPI_TICK_OUTLINE('\ue11d'),
        TYPI_TICK('\ue11e'),
        TYPI_TICKET('\ue11f'),
        TYPI_TIME('\ue120'),
        TYPI_TIMES_OUTLINE('\ue121'),
        TYPI_TIMES('\ue122'),
        TYPI_TRASH('\ue123'),
        TYPI_TREE('\ue124'),
        TYPI_UPLOAD_OUTLINE('\ue125'),
        TYPI_UPLOAD('\ue126'),
        TYPI_USER_ADD_OUTLINE('\ue127'),
        TYPI_USER_ADD('\ue128'),
        TYPI_USER_DELETE_OUTLINE('\ue129'),
        TYPI_USER_DELETE('\ue12a'),
        TYPI_USER_OUTLINE('\ue12b'),
        TYPI_USER('\ue12c'),
        TYPI_VENDOR_APPLE('\ue12e'),
        TYPI_VENDOR_MICROSOFT('\ue12f'),
        TYPI_VIDEO_OUTLINE('\ue130'),
        TYPI_VIDEO('\ue131'),
        TYPI_VOLUME_DOWN('\ue132'),
        TYPI_VOLUME_MUTE('\ue133'),
        TYPI_VOLUME_UP('\ue134'),
        TYPI_VOLUME('\ue135'),
        TYPI_WARNING_OUTLINE('\ue136'),
        TYPI_WARNING('\ue137'),
        TYPI_WATCH('\ue138'),
        TYPI_WAVES_OUTLINE('\ue139'),
        TYPI_WAVES('\ue13a'),
        TYPI_WEATHER_CLOUDY('\ue13b'),
        TYPI_WEATHER_DOWNPOUR('\ue13c'),
        TYPI_WEATHER_NIGHT('\ue13d'),
        TYPI_WEATHER_PARTLY_SUNNY('\ue13e'),
        TYPI_WEATHER_SHOWER('\ue13f'),
        TYPI_WEATHER_SNOW('\ue140'),
        TYPI_WEATHER_STORMY('\ue141'),
        TYPI_WEATHER_SUNNY('\ue142'),
        TYPI_WEATHER_WINDY_CLOUDY('\ue143'),
        TYPI_WEATHER_WINDY('\ue144'),
        TYPI_WI_FI_OUTLINE('\ue145'),
        TYPI_WI_FI('\ue146'),
        TYPI_WINE('\ue147'),
        TYPI_WORLD_OUTLINE('\ue148'),
        TYPI_WORLD('\ue149'),
        TYPI_ZOOM_IN_OUTLINE('\ue14a'),
        TYPI_ZOOM_IN('\ue14b'),
        TYPI_ZOOM_OUT_OUTLINE('\ue14c'),
        TYPI_ZOOM_OUT('\ue14d'),
        TYPI_ZOOM_OUTLINE('\ue14e'),
        TYPI_ZOOM('\ue14f');

        char typiconsCharacter;

        Icon(char character) {
            this.typiconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return typiconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typiconsTypeface;

        @Override
        public ITypeface getTypeface() {
            if (typiconsTypeface == null) {
                setTypeface(new Typicons());
            }
            return typiconsTypeface;
        }

        private static void setTypeface(Typicons typiconsTypeface) {
            Icon.typiconsTypeface = typiconsTypeface;
        }
    }
}