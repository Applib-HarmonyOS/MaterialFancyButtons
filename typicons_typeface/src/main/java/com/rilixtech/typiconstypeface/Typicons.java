package com.rilixtech.typiconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Typicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Typicons implements MfbTypeface {
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
     * Typicons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Typicons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Typicons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        TYPI_ADJUST_BRIGHTNESS((char) 0xe000),
        TYPI_ADJUST_CONTRAST((char) 0xe001),
        TYPI_ANCHOR_OUTLINE((char) 0xe002),
        TYPI_ANCHOR((char) 0xe003),
        TYPI_ARCHIVE((char) 0xe004),
        TYPI_ARROW_BACK_OUTLINE((char) 0xe005),
        TYPI_ARROW_BACK((char) 0xe006),
        TYPI_ARROW_DOWN_OUTLINE((char) 0xe007),
        TYPI_ARROW_DOWN_THICK((char) 0xe008),
        TYPI_ARROW_DOWN((char) 0xe009),
        TYPI_ARROW_FORWARD_OUTLINE((char) 0xe00a),
        TYPI_ARROW_FORWARD((char) 0xe00b),
        TYPI_ARROW_LEFT_OUTLINE((char) 0xe00c),
        TYPI_ARROW_LEFT_THICK((char) 0xe00d),
        TYPI_ARROW_LEFT((char) 0xe00e),
        TYPI_ARROW_LOOP_OUTLINE((char) 0xe00f),
        TYPI_ARROW_LOOP((char) 0xe010),
        TYPI_ARROW_MAXIMISE_OUTLINE((char) 0xe011),
        TYPI_ARROW_MAXIMISE((char) 0xe012),
        TYPI_ARROW_MINIMISE_OUTLINE((char) 0xe013),
        TYPI_ARROW_MINIMISE((char) 0xe014),
        TYPI_ARROW_MOVE_OUTLINE((char) 0xe015),
        TYPI_ARROW_MOVE((char) 0xe016),
        TYPI_ARROW_REPEAT_OUTLINE((char) 0xe017),
        TYPI_ARROW_REPEAT((char) 0xe018),
        TYPI_ARROW_RIGHT_OUTLINE((char) 0xe019),
        TYPI_ARROW_RIGHT_THICK((char) 0xe01a),
        TYPI_ARROW_RIGHT((char) 0xe01b),
        TYPI_ARROW_SHUFFLE((char) 0xe01c),
        TYPI_ARROW_SORTED_DOWN((char) 0xe01d),
        TYPI_ARROW_SORTED_UP((char) 0xe01e),
        TYPI_ARROW_SYNC_OUTLINE((char) 0xe01f),
        TYPI_ARROW_SYNC((char) 0xe020),
        TYPI_ARROW_UNSORTED((char) 0xe021),
        TYPI_ARROW_UP_OUTLINE((char) 0xe022),
        TYPI_ARROW_UP_THICK((char) 0xe023),
        TYPI_ARROW_UP((char) 0xe024),
        TYPI_AT((char) 0xe025),
        TYPI_ATTACHMENTI_OUTLINE((char) 0xe026),
        TYPI_ATTACHMENT((char) 0xe027),
        TYPI_BACKSPACE_OUTLINE((char) 0xe028),
        TYPI_BACKSPACE((char) 0xe029),
        TYPI_BATTERY_CHARGE((char) 0xe02a),
        TYPI_BATTERY_FULL((char) 0xe02b),
        TYPI_BATTERY_HIGH((char) 0xe02c),
        TYPI_BATTERY_LOW((char) 0xe02d),
        TYPI_BATTERY_MID((char) 0xe02e),
        TYPI_BEAKER((char) 0xe02f),
        TYPI_BEER((char) 0xe030),
        TYPI_BELL((char) 0xe031),
        TYPI_BOOK((char) 0xe032),
        TYPI_BOOKMARK((char) 0xe033),
        TYPI_BRIEFCASE((char) 0xe034),
        TYPI_BRUSH((char) 0xe035),
        TYPI_BUSINESS_CARD((char) 0xe036),
        TYPI_CALCULATOR((char) 0xe037),
        TYPI_CALENDAR_OUTLINE((char) 0xe038),
        TYPI_CALENDAR((char) 0xe039),
        TYPI_CAMERA_OUTLINE((char) 0xe03a),
        TYPI_CAMERA((char) 0xe03b),
        TYPI_CANCEL_OUTLINE((char) 0xe03c),
        TYPI_CANCEL((char) 0xe03d),
        TYPI_CHART_AREA_OUTLINE((char) 0xe03e),
        TYPI_CHART_AREA((char) 0xe03f),
        TYPI_CHART_BAR_OUTLINE((char) 0xe040),
        TYPI_CHART_BAR((char) 0xe041),
        TYPI_CHART_LINE_OUTLINE((char) 0xe042),
        TYPI_CHART_LINE((char) 0xe043),
        TYPI_CHART_PIE_OUTLINE((char) 0xe044),
        TYPI_CHART_PIE((char) 0xe045),
        TYPI_CHEVRON_LEFT_OUTLINE((char) 0xe046),
        TYPI_CHEVRON_LEFT((char) 0xe047),
        TYPI_CHEVRON_RIGHT_OUTLINE((char) 0xe048),
        TYPI_CHEVRON_RIGHT((char) 0xe049),
        TYPI_CLIPBOARD((char) 0xe04a),
        TYPI_CLOUD_STORAGE((char) 0xe04b),
        TYPI_CLOUD_STORAGE_OUTLINE((char) 0xe054),
        TYPI_CODE_OUTLINE((char) 0xe04c),
        TYPI_CODE((char) 0xe04d),
        TYPI_COFFEE((char) 0xe04e),
        TYPI_COG_OUTLINE((char) 0xe04f),
        TYPI_COG((char) 0xe050),
        TYPI_COMPASS((char) 0xe051),
        TYPI_CONTACTS((char) 0xe052),
        TYPI_CREDIT_CARD((char) 0xe053),
        TYPI_CSS3((char) 0xe055),
        TYPI_DATABASE((char) 0xe056),
        TYPI_DELETE_OUTLINE((char) 0xe057),
        TYPI_DELETE((char) 0xe058),
        TYPI_DEVICE_DESKTOP((char) 0xe059),
        TYPI_DEVICE_LAPTOP((char) 0xe05a),
        TYPI_DEVICE_PHONE((char) 0xe05b),
        TYPI_DEVICE_TABLET((char) 0xe05c),
        TYPI_DIRECTIONS((char) 0xe05d),
        TYPI_DIVIDE_OUTLINE((char) 0xe05e),
        TYPI_DIVIDE((char) 0xe05f),
        TYPI_DOCUMENTI_ADD((char) 0xe060),
        TYPI_DOCUMENTI_DELETE((char) 0xe061),
        TYPI_DOCUMENTI_TEXT((char) 0xe062),
        TYPI_DOCUMENT((char) 0xe063),
        TYPI_DOWNLOAD_OUTLINE((char) 0xe064),
        TYPI_DOWNLOAD((char) 0xe065),
        TYPI_DROPBOX((char) 0xe066),
        TYPI_EDIT((char) 0xe067),
        TYPI_EJECT_OUTLINE((char) 0xe068),
        TYPI_EJECT((char) 0xe069),
        TYPI_EQUALS_OUTLINE((char) 0xe06a),
        TYPI_EQUALS((char) 0xe06b),
        TYPI_EXPORT_OUTLINE((char) 0xe06c),
        TYPI_EXPORT((char) 0xe06d),
        TYPI_EYE_OUTLINE((char) 0xe06e),
        TYPI_EYE((char) 0xe06f),
        TYPI_FEATHER((char) 0xe070),
        TYPI_FILM((char) 0xe071),
        TYPI_FILTER((char) 0xe072),
        TYPI_FLAG_OUTLINE((char) 0xe073),
        TYPI_FLAG((char) 0xe074),
        TYPI_FLASH_OUTLINE((char) 0xe075),
        TYPI_FLASH((char) 0xe076),
        TYPI_FLOW_CHILDREN((char) 0xe077),
        TYPI_FLOW_MERGE((char) 0xe078),
        TYPI_FLOW_PARALLEL((char) 0xe079),
        TYPI_FLOW_SWITCH((char) 0xe07a),
        TYPI_FOLDER_ADD((char) 0xe07b),
        TYPI_FOLDER_DELETE((char) 0xe07c),
        TYPI_FOLDER_OPEN((char) 0xe07d),
        TYPI_FOLDER((char) 0xe07e),
        TYPI_GIFT((char) 0xe07f),
        TYPI_GLOBE_OUTLINE((char) 0xe080),
        TYPI_GLOBE((char) 0xe081),
        TYPI_GROUP_OUTLINE((char) 0xe082),
        TYPI_GROUP((char) 0xe083),
        TYPI_HEADPHONES((char) 0xe084),
        TYPI_HEART_FULL_OUTLINE((char) 0xe085),
        TYPI_HEART_HALF_OUTLINE((char) 0xe086),
        TYPI_HEART_OUTLINE((char) 0xe087),
        TYPI_HEART((char) 0xe088),
        TYPI_HOME_OUTLINE((char) 0xe089),
        TYPI_HOME((char) 0xe08a),
        TYPI_HTML5((char) 0xe08b),
        TYPI_IMAGE_OUTLINE((char) 0xe08c),
        TYPI_IMAGE((char) 0xe08d),
        TYPI_INFINITY_OUTLINE((char) 0xe08e),
        TYPI_INFINITY((char) 0xe08f),
        TYPI_INFO_LARGE_OUTLINE((char) 0xe090),
        TYPI_INFO_LARGE((char) 0xe091),
        TYPI_INFO_OUTLINE((char) 0xe092),
        TYPI_INFO((char) 0xe093),
        TYPI_INPUT_CHECKED_OUTLINE((char) 0xe094),
        TYPI_INPUT_CHECKED((char) 0xe095),
        TYPI_KEY_OUTLINE((char) 0xe096),
        TYPI_KEY((char) 0xe097),
        TYPI_KEYBOARD((char) 0xe098),
        TYPI_LEAF((char) 0xe099),
        TYPI_LIGHTBULB((char) 0xe09a),
        TYPI_LINK_OUTLINE((char) 0xe09b),
        TYPI_LINK((char) 0xe09c),
        TYPI_LOCATION_ARROW_OUTLINE((char) 0xe09d),
        TYPI_LOCATION_ARROW((char) 0xe09e),
        TYPI_LOCATION_OUTLINE((char) 0xe09f),
        TYPI_LOCATION((char) 0xe0a0),
        TYPI_LOCK_CLOSED_OUTLINE((char) 0xe0a1),
        TYPI_LOCK_CLOSED((char) 0xe0a2),
        TYPI_LOCK_OPEN_OUTLINE((char) 0xe0a3),
        TYPI_LOCK_OPEN((char) 0xe0a4),
        TYPI_MAIL((char) 0xe0a5),
        TYPI_MAP((char) 0xe0a6),
        TYPI_MEDIA_EJECT_OUTLINE((char) 0xe0a7),
        TYPI_MEDIA_EJECT((char) 0xe0a8),
        TYPI_MEDIA_FAST_FORWARD_OUTLINE((char) 0xe0a9),
        TYPI_MEDIA_FAST_FORWARD((char) 0xe0aa),
        TYPI_MEDIA_PAUSE_OUTLINE((char) 0xe0ab),
        TYPI_MEDIA_PAUSE((char) 0xe0ac),
        TYPI_MEDIA_PLAY_OUTLINE((char) 0xe0ad),
        TYPI_MEDIA_PLAY_REVERSE_OUTLINE((char) 0xe0ae),
        TYPI_MEDIA_PLAY_REVERSE((char) 0xe0af),
        TYPI_MEDIA_PLAY((char) 0xe0b0),
        TYPI_MEDIA_RECORD_OUTLINE((char) 0xe0b1),
        TYPI_MEDIA_RECORD((char) 0xe0b2),
        TYPI_MEDIA_REWIND_OUTLINE((char) 0xe0b3),
        TYPI_MEDIA_REWIND((char) 0xe0b4),
        TYPI_MEDIA_STOP_OUTLINE((char) 0xe0b5),
        TYPI_MEDIA_STOP((char) 0xe0b6),
        TYPI_MESSAGE_TYPING((char) 0xe0b7),
        TYPI_MESSAGE((char) 0xe0b8),
        TYPI_MESSAGES((char) 0xe0b9),
        TYPI_MICROPHONE_OUTLINE((char) 0xe0ba),
        TYPI_MICROPHONE((char) 0xe0bb),
        TYPI_MINUS_OUTLINE((char) 0xe0bc),
        TYPI_MINUS((char) 0xe0bd),
        TYPI_MORTAR_BOARD((char) 0xe0be),
        TYPI_NEWS((char) 0xe0bf),
        TYPI_NOTES_OUTLINE((char) 0xe0c0),
        TYPI_NOTES((char) 0xe0c1),
        TYPI_PEN((char) 0xe0c2),
        TYPI_PENCIL((char) 0xe0c3),
        TYPI_PHONE_OUTLINE((char) 0xe0c4),
        TYPI_PHONE((char) 0xe0c5),
        TYPI_PI_OUTLINE((char) 0xe0c6),
        TYPI_PI((char) 0xe0c7),
        TYPI_PIN_OUTLINE((char) 0xe0c8),
        TYPI_PIN((char) 0xe0c9),
        TYPI_PIPETTE((char) 0xe0ca),
        TYPI_PLANE_OUTLINE((char) 0xe0cb),
        TYPI_PLANE((char) 0xe0cc),
        TYPI_PLUG((char) 0xe0cd),
        TYPI_PLUS_OUTLINE((char) 0xe0ce),
        TYPI_PLUS((char) 0xe0cf),
        TYPI_POINT_OF_INTEREST_OUTLINE((char) 0xe0d0),
        TYPI_POINT_OF_INTEREST((char) 0xe0d1),
        TYPI_POWER_OUTLINE((char) 0xe0d2),
        TYPI_POWER((char) 0xe0d3),
        TYPI_PRINTER((char) 0xe0d4),
        TYPI_PUZZLE_OUTLINE((char) 0xe0d5),
        TYPI_PUZZLE((char) 0xe0d6),
        TYPI_RADAR_OUTLINE((char) 0xe0d7),
        TYPI_RADAR((char) 0xe0d8),
        TYPI_REFRESH_OUTLINE((char) 0xe0d9),
        TYPI_REFRESH((char) 0xe0da),
        TYPI_RSS_OUTLINE((char) 0xe0db),
        TYPI_RSS((char) 0xe0dc),
        TYPI_SCISSORS_OUTLINE((char) 0xe0dd),
        TYPI_SCISSORS((char) 0xe0de),
        TYPI_SHOPPING_BAG((char) 0xe0df),
        TYPI_SHOPPING_CART((char) 0xe0e0),
        TYPI_SOCIAL_AT_CIRCULAR((char) 0xe0e1),
        TYPI_SOCIAL_DRIBBBLE_CIRCULAR((char) 0xe0e2),
        TYPI_SOCIAL_DRIBBBLE((char) 0xe0e3),
        TYPI_SOCIAL_FACEBOOK_CIRCULAR((char) 0xe0e4),
        TYPI_SOCIAL_FACEBOOK((char) 0xe0e5),
        TYPI_SOCIAL_FLICKR_CIRCULAR((char) 0xe0e6),
        TYPI_SOCIAL_FLICKR((char) 0xe0e7),
        TYPI_SOCIAL_GITHUB_CIRCULAR((char) 0xe0e8),
        TYPI_SOCIAL_GITHUB((char) 0xe0e9),
        TYPI_SOCIAL_GOOGLE_PLUS_CIRCULAR((char) 0xe0ea),
        TYPI_SOCIAL_GOOGLE_PLUS((char) 0xe0eb),
        TYPI_SOCIAL_INSTAGRAM_CIRCULAR((char) 0xe0ec),
        TYPI_SOCIAL_INSTAGRAM((char) 0xe0ed),
        TYPI_SOCIAL_LAST_FM_CIRCULAR((char) 0xe0ee),
        TYPI_SOCIAL_LAST_FM((char) 0xe0ef),
        TYPI_SOCIAL_LINKEDIN_CIRCULAR((char) 0xe0f0),
        TYPI_SOCIAL_LINKEDIN((char) 0xe0f1),
        TYPI_SOCIAL_PINTEREST_CIRCULAR((char) 0xe0f2),
        TYPI_SOCIAL_PINTEREST((char) 0xe0f3),
        TYPI_SOCIAL_SKYPE_OUTLINE((char) 0xe0f4),
        TYPI_SOCIAL_SKYPE((char) 0xe0f5),
        TYPI_SOCIAL_TUMBLER_CIRCULAR((char) 0xe0f6),
        TYPI_SOCIAL_TUMBLER((char) 0xe0f7),
        TYPI_SOCIAL_TWITTER_CIRCULAR((char) 0xe0f8),
        TYPI_SOCIAL_TWITTER((char) 0xe0f9),
        TYPI_SOCIAL_VIMEO_CIRCULAR((char) 0xe0fa),
        TYPI_SOCIAL_VIMEO((char) 0xe0fb),
        TYPI_SOCIAL_YOUTUBE_CIRCULAR((char) 0xe0fc),
        TYPI_SOCIAL_YOUTUBE((char) 0xe0fd),
        TYPI_SORT_ALPHABETICALLY_OUTLINE((char) 0xe0fe),
        TYPI_SORT_ALPHABETICALLY((char) 0xe0ff),
        TYPI_SORT_NUMERICALLY_OUTLINE((char) 0xe100),
        TYPI_SORT_NUMERICALLY((char) 0xe101),
        TYPI_SPANNER_OUTLINE((char) 0xe102),
        TYPI_SPANNER((char) 0xe103),
        TYPI_SPIRAL((char) 0xe104),
        TYPI_STAR_FULL_OUTLINE((char) 0xe105),
        TYPI_STAR_HALF_OUTLINE((char) 0xe106),
        TYPI_STAR_HALF((char) 0xe107),
        TYPI_STAR_OUTLINE((char) 0xe108),
        TYPI_STAR((char) 0xe109),
        TYPI_STARBURST_OUTLINE((char) 0xe10a),
        TYPI_STARBURST((char) 0xe10b),
        TYPI_STOPWATCH((char) 0xe10c),
        TYPI_SUPPORT((char) 0xe10d),
        TYPI_TABS_OUTLINE((char) 0xe10e),
        TYPI_TAG((char) 0xe10f),
        TYPI_TAGS((char) 0xe110),
        TYPI_TH_LARGE_OUTLINE((char) 0xe111),
        TYPI_TH_LARGE((char) 0xe112),
        TYPI_TH_LIST_OUTLINE((char) 0xe113),
        TYPI_TH_LIST((char) 0xe114),
        TYPI_TH_MENU_OUTLINE((char) 0xe115),
        TYPI_TH_MENU((char) 0xe116),
        TYPI_TH_SMALL_OUTLINE((char) 0xe117),
        TYPI_TH_SMALL((char) 0xe118),
        TYPI_THERMOMETER((char) 0xe119),
        TYPI_THUMBS_DOWN((char) 0xe11a),
        TYPI_THUMBS_OK((char) 0xe11b),
        TYPI_THUMBS_UP((char) 0xe11c),
        TYPI_TICK_OUTLINE((char) 0xe11d),
        TYPI_TICK((char) 0xe11e),
        TYPI_TICKET((char) 0xe11f),
        TYPI_TIME((char) 0xe120),
        TYPI_TIMES_OUTLINE((char) 0xe121),
        TYPI_TIMES((char) 0xe122),
        TYPI_TRASH((char) 0xe123),
        TYPI_TREE((char) 0xe124),
        TYPI_UPLOAD_OUTLINE((char) 0xe125),
        TYPI_UPLOAD((char) 0xe126),
        TYPI_USER_ADD_OUTLINE((char) 0xe127),
        TYPI_USER_ADD((char) 0xe128),
        TYPI_USER_DELETE_OUTLINE((char) 0xe129),
        TYPI_USER_DELETE((char) 0xe12a),
        TYPI_USER_OUTLINE((char) 0xe12b),
        TYPI_USER((char) 0xe12c),
        TYPI_VENDOR_APPLE((char) 0xe12e),
        TYPI_VENDOR_MICROSOFT((char) 0xe12f),
        TYPI_VIDEO_OUTLINE((char) 0xe130),
        TYPI_VIDEO((char) 0xe131),
        TYPI_VOLUME_DOWN((char) 0xe132),
        TYPI_VOLUME_MUTE((char) 0xe133),
        TYPI_VOLUME_UP((char) 0xe134),
        TYPI_VOLUME((char) 0xe135),
        TYPI_WARNING_OUTLINE((char) 0xe136),
        TYPI_WARNING((char) 0xe137),
        TYPI_WATCH((char) 0xe138),
        TYPI_WAVES_OUTLINE((char) 0xe139),
        TYPI_WAVES((char) 0xe13a),
        TYPI_WEATHER_CLOUDY((char) 0xe13b),
        TYPI_WEATHER_DOWNPOUR((char) 0xe13c),
        TYPI_WEATHER_NIGHT((char) 0xe13d),
        TYPI_WEATHER_PARTLY_SUNNY((char) 0xe13e),
        TYPI_WEATHER_SHOWER((char) 0xe13f),
        TYPI_WEATHER_SNOW((char) 0xe140),
        TYPI_WEATHER_STORMY((char) 0xe141),
        TYPI_WEATHER_SUNNY((char) 0xe142),
        TYPI_WEATHER_WINDY_CLOUDY((char) 0xe143),
        TYPI_WEATHER_WINDY((char) 0xe144),
        TYPI_WI_FI_OUTLINE((char) 0xe145),
        TYPI_WI_FI((char) 0xe146),
        TYPI_WINE((char) 0xe147),
        TYPI_WORLD_OUTLINE((char) 0xe148),
        TYPI_WORLD((char) 0xe149),
        TYPI_ZOOM_IN_OUTLINE((char) 0xe14a),
        TYPI_ZOOM_IN((char) 0xe14b),
        TYPI_ZOOM_OUT_OUTLINE((char) 0xe14c),
        TYPI_ZOOM_OUT((char) 0xe14d),
        TYPI_ZOOM_OUTLINE((char) 0xe14e),
        TYPI_ZOOM((char) 0xe14f);

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
        private static MfbTypeface typiconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
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
