package com.rilixtech.ioniconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Ionicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Ionicons implements MfbTypeface {
    private static final String TTF_FILE = "ionicons.ttf";
    private static final String IONICONS_PREFIX = "IONI";
    public static final String IONICONS_NAME = "Ionicons";
    public static final String IONICONS_VERSION = "2" + ".0.1.1";
    public static final String IONICONS_AUTHOR = "Benjsperry";
    public static final String IONICONS_URL = "http://ionicons.com/";
    public static final String IONICONS_DESC = "The premium icon font for Ionic Framework.";
    public static final String IONICONS_LICENSE = "MIT Licensed";
    public static final String IONICONS_LICENSE_URL = "https://github.com/driftyco/ionicons/blob/master/LICENSE";

    private static Font ioniconsTypeface = null;
    private static HashMap<String, Character> ioniconsCharMap;

    /**
     * Ionicons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Ionicons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Ionicons icon characters in a HashMap.
     *
     * @return HashMap of all Ionicons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (ioniconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                setChars(characterHashMap, v);
            }
            setChars(characterHashMap);
        }
        return ioniconsCharMap;
    }

    private static void setChars(HashMap<String, Character> characterHashMap) {
        ioniconsCharMap = characterHashMap;
    }

    /**
     * Set the Ionicons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap, Icon v) {
        characterHashMap.put(v.name(), v.ioniconsCharacter);
    }

    /**
     * Return the Ionicons Mapping Prefix.
     *
     * @return Ionicons Mapping Prefix, used by all Ionicons icons.
     */
    @Override public String getMappingPrefix() {
        return IONICONS_PREFIX;
    }

    @Override public String getFontName() {
        return IONICONS_NAME;
    }

    @Override public String getVersion() {
        return IONICONS_VERSION;
    }

    @Override public int getIconCount() {
        return ioniconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> ioniconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            ioniconsKeyList.add(value.name());
        }
        return ioniconsKeyList;
    }

    @Override public String getAuthor() {
        return IONICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return IONICONS_URL;
    }

    @Override public String getDescription() {
        return IONICONS_DESC;
    }

    @Override public String getLicense() {
        return IONICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return IONICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (ioniconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return ioniconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        ioniconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Ionicons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        IONI_ALERT((char) 0xf101),
        IONI_ALERT_CIRCLED((char) 0xf100),
        IONI_APERTURE((char) 0xf313),
        IONI_ARCHIVE((char) 0xf102),
        IONI_ARROW_DOWN_A((char) 0xf103),
        IONI_ARROW_DOWN_B((char) 0xf104),
        IONI_ARROW_DOWN_C((char) 0xf105),
        IONI_ARROW_EXPAND((char) 0xf25e),
        IONI_ARROW_GRAPH_DOWN_LEFT((char) 0xf25f),
        IONI_ARROW_GRAPH_DOWN_RIGHT((char) 0xf260),
        IONI_ARROW_GRAPH_UP_LEFT((char) 0xf261),
        IONI_ARROW_GRAPH_UP_RIGHT((char) 0xf262),
        IONI_ARROW_LEFT_A((char) 0xf106),
        IONI_ARROW_LEFT_B((char) 0xf107),
        IONI_ARROW_LEFT_C((char) 0xf108),
        IONI_ARROW_MOVE((char) 0xf263),
        IONI_ARROW_RESIZE((char) 0xf264),
        IONI_ARROW_RETURN_LEFT((char) 0xf265),
        IONI_ARROW_RETURN_RIGHT((char) 0xf266),
        IONI_ARROW_RIGHT_A((char) 0xf109),
        IONI_ARROW_RIGHT_B((char) 0xf10a),
        IONI_ARROW_RIGHT_C((char) 0xf10b),
        IONI_ARROW_SHRINK((char) 0xf267),
        IONI_ARROW_SWAP((char) 0xf268),
        IONI_ARROW_UP_A((char) 0xf10c),
        IONI_ARROW_UP_B((char) 0xf10d),
        IONI_ARROW_UP_C((char) 0xf10e),
        IONI_ASTERISK((char) 0xf314),
        IONI_AT((char) 0xf10f),
        IONI_BACKSPACE((char) 0xf3bf),
        IONI_BACKSPACE_OUTLINE((char) 0xf3be),
        IONI_BAG((char) 0xf110),
        IONI_BATTERY_CHARGING((char) 0xf111),
        IONI_BATTERY_EMPTY((char) 0xf112),
        IONI_BATTERY_FULL((char) 0xf113),
        IONI_BATTERY_HALF((char) 0xf114),
        IONI_BATTERY_LOW((char) 0xf115),
        IONI_BEAKER((char) 0xf269),
        IONI_BEER((char) 0xf26a),
        IONI_BLUETOOTH((char) 0xf116),
        IONI_BONFIRE((char) 0xf315),
        IONI_BOOKMARK((char) 0xf26b),
        IONI_BOWTIE((char) 0xf3c0),
        IONI_BRIEFCASE((char) 0xf26c),
        IONI_BUG((char) 0xf2be),
        IONI_CALCULATOR((char) 0xf26d),
        IONI_CALENDAR((char) 0xf117),
        IONI_CAMERA((char) 0xf118),
        IONI_CARD((char) 0xf119),
        IONI_CASH((char) 0xf316),
        IONI_CHATBOX((char) 0xf11b),
        IONI_CHATBOX_WORKING((char) 0xf11a),
        IONI_CHATBOXES((char) 0xf11c),
        IONI_CHATBUBBLE((char) 0xf11e),
        IONI_CHATBUBBLE_WORKING((char) 0xf11d),
        IONI_CHATBUBBLES((char) 0xf11f),
        IONI_CHECKMARK((char) 0xf122),
        IONI_CHECKMARK_CIRCLED((char) 0xf120),
        IONI_CHECKMARK_ROUND((char) 0xf121),
        IONI_CHEVRON_DOWN((char) 0xf123),
        IONI_CHEVRON_LEFT((char) 0xf124),
        IONI_CHEVRON_RIGHT((char) 0xf125),
        IONI_CHEVRON_UP((char) 0xf126),
        IONI_CLIPBOARD((char) 0xf127),
        IONI_CLOCK((char) 0xf26e),
        IONI_CLOSE((char) 0xf12a),
        IONI_CLOSE_CIRCLED((char) 0xf128),
        IONI_CLOSE_ROUND((char) 0xf129),
        IONI_CLOSED_CAPTIONING((char) 0xf317),
        IONI_CLOUD((char) 0xf12b),
        IONI_CODE((char) 0xf271),
        IONI_CODE_DOWNLOAD((char) 0xf26f),
        IONI_CODE_WORKING((char) 0xf270),
        IONI_COFFEE((char) 0xf272),
        IONI_COMPASS((char) 0xf273),
        IONI_COMPOSE((char) 0xf12c),
        IONI_CONNECTIONI_BARS((char) 0xf274),
        IONI_CONTRAST((char) 0xf275),
        IONI_CROP((char) 0xf3c1),
        IONI_CUBE((char) 0xf318),
        IONI_DISC((char) 0xf12d),
        IONI_DOCUMENT((char) 0xf12f),
        IONI_DOCUMENTI_TEXT((char) 0xf12e),
        IONI_DRAG((char) 0xf130),
        IONI_EARTH((char) 0xf276),
        IONI_EASEL((char) 0xf3c2),
        IONI_EDIT((char) 0xf2bf),
        IONI_EGG((char) 0xf277),
        IONI_EJECT((char) 0xf131),
        IONI_EMAIL((char) 0xf132),
        IONI_EMAIL_UNREAD((char) 0xf3c3),
        IONI_ERLENMEYER_FLASK((char) 0xf3c5),
        IONI_ERLENMEYER_FLASK_BUBBLES((char) 0xf3c4),
        IONI_EYE((char) 0xf133),
        IONI_EYE_DISABLED((char) 0xf306),
        IONI_FEMALE((char) 0xf278),
        IONI_FILING((char) 0xf134),
        IONI_FILM_MARKER((char) 0xf135),
        IONI_FIREBALL((char) 0xf319),
        IONI_FLAG((char) 0xf279),
        IONI_FLAME((char) 0xf31a),
        IONI_FLASH((char) 0xf137),
        IONI_FLASH_OFF((char) 0xf136),
        IONI_FOLDER((char) 0xf139),
        IONI_FORK((char) 0xf27a),
        IONI_FORK_REPO((char) 0xf2c0),
        IONI_FORWARD((char) 0xf13a),
        IONI_FUNNEL((char) 0xf31b),
        IONI_GEAR_A((char) 0xf13d),
        IONI_GEAR_B((char) 0xf13e),
        IONI_GRID((char) 0xf13f),
        IONI_HAMMER((char) 0xf27b),
        IONI_HAPPY((char) 0xf31c),
        IONI_HAPPY_OUTLINE((char) 0xf3c6),
        IONI_HEADPHONE((char) 0xf140),
        IONI_HEART((char) 0xf141),
        IONI_HEART_BROKEN((char) 0xf31d),
        IONI_HELP((char) 0xf143),
        IONI_HELP_BUOY((char) 0xf27c),
        IONI_HELP_CIRCLED((char) 0xf142),
        IONI_HOME((char) 0xf144),
        IONI_ICECREAM((char) 0xf27d),
        IONI_IMAGE((char) 0xf147),
        IONI_IMAGES((char) 0xf148),
        IONI_INFORMATION((char) 0xf14a),
        IONI_INFORMATIONI_CIRCLED((char) 0xf149),
        IONI_IONIC((char) 0xf14b),
        IONI_IOS_ALARM((char) 0xf3c8),
        IONI_IOS_ALARM_OUTLINE((char) 0xf3c7),
        IONI_IOS_ALBUMS((char) 0xf3ca),
        IONI_IOS_ALBUMS_OUTLINE((char) 0xf3c9),
        IONI_IOS_AMERICANFOOTBALL((char) 0xf3cc),
        IONI_IOS_AMERICANFOOTBALL_OUTLINE((char) 0xf3cb),
        IONI_IOS_ANALYTICS((char) 0xf3ce),
        IONI_IOS_ANALYTICS_OUTLINE((char) 0xf3cd),
        IONI_IOS_ARROW_BACK((char) 0xf3cf),
        IONI_IOS_ARROW_DOWN((char) 0xf3d0),
        IONI_IOS_ARROW_FORWARD((char) 0xf3d1),
        IONI_IOS_ARROW_LEFT((char) 0xf3d2),
        IONI_IOS_ARROW_RIGHT((char) 0xf3d3),
        IONI_IOS_ARROW_THIN_DOWN((char) 0xf3d4),
        IONI_IOS_ARROW_THIN_LEFT((char) 0xf3d5),
        IONI_IOS_ARROW_THIN_RIGHT((char) 0xf3d6),
        IONI_IOS_ARROW_THIN_UP((char) 0xf3d7),
        IONI_IOS_ARROW_UP((char) 0xf3d8),
        IONI_IOS_AT((char) 0xf3da),
        IONI_IOS_AT_OUTLINE((char) 0xf3d9),
        IONI_IOS_BARCODE((char) 0xf3dc),
        IONI_IOS_BARCODE_OUTLINE((char) 0xf3db),
        IONI_IOS_BASEBALL((char) 0xf3de),
        IONI_IOS_BASEBALL_OUTLINE((char) 0xf3dd),
        IONI_IOS_BASKETBALL((char) 0xf3e0),
        IONI_IOS_BASKETBALL_OUTLINE((char) 0xf3df),
        IONI_IOS_BELL((char) 0xf3e2),
        IONI_IOS_BELL_OUTLINE((char) 0xf3e1),
        IONI_IOS_BODY((char) 0xf3e4),
        IONI_IOS_BODY_OUTLINE((char) 0xf3e3),
        IONI_IOS_BOLT((char) 0xf3e6),
        IONI_IOS_BOLT_OUTLINE((char) 0xf3e5),
        IONI_IOS_BOOK((char) 0xf3e8),
        IONI_IOS_BOOK_OUTLINE((char) 0xf3e7),
        IONI_IOS_BOOKMARKS((char) 0xf3ea),
        IONI_IOS_BOOKMARKS_OUTLINE((char) 0xf3e9),
        IONI_IOS_BOX((char) 0xf3ec),
        IONI_IOS_BOX_OUTLINE((char) 0xf3eb),
        IONI_IOS_BRIEFCASE((char) 0xf3ee),
        IONI_IOS_BRIEFCASE_OUTLINE((char) 0xf3ed),
        IONI_IOS_BROWSERS((char) 0xf3f0),
        IONI_IOS_BROWSERS_OUTLINE((char) 0xf3ef),
        IONI_IOS_CALCULATOR((char) 0xf3f2),
        IONI_IOS_CALCULATOR_OUTLINE((char) 0xf3f1),
        IONI_IOS_CALENDAR((char) 0xf3f4),
        IONI_IOS_CALENDAR_OUTLINE((char) 0xf3f3),
        IONI_IOS_CAMERA((char) 0xf3f6),
        IONI_IOS_CAMERA_OUTLINE((char) 0xf3f5),
        IONI_IOS_CART((char) 0xf3f8),
        IONI_IOS_CART_OUTLINE((char) 0xf3f7),
        IONI_IOS_CHATBOXES((char) 0xf3fa),
        IONI_IOS_CHATBOXES_OUTLINE((char) 0xf3f9),
        IONI_IOS_CHATBUBBLE((char) 0xf3fc),
        IONI_IOS_CHATBUBBLE_OUTLINE((char) 0xf3fb),
        IONI_IOS_CHECKMARK((char) 0xf3ff),
        IONI_IOS_CHECKMARK_EMPTY((char) 0xf3fd),
        IONI_IOS_CHECKMARK_OUTLINE((char) 0xf3fe),
        IONI_IOS_CIRCLE_FILLED((char) 0xf400),
        IONI_IOS_CIRCLE_OUTLINE((char) 0xf401),
        IONI_IOS_CLOCK((char) 0xf403),
        IONI_IOS_CLOCK_OUTLINE((char) 0xf402),
        IONI_IOS_CLOSE((char) 0xf406),
        IONI_IOS_CLOSE_EMPTY((char) 0xf404),
        IONI_IOS_CLOSE_OUTLINE((char) 0xf405),
        IONI_IOS_CLOUD((char) 0xf40c),
        IONI_IOS_CLOUD_DOWNLOAD((char) 0xf408),
        IONI_IOS_CLOUD_DOWNLOAD_OUTLINE((char) 0xf407),
        IONI_IOS_CLOUD_OUTLINE((char) 0xf409),
        IONI_IOS_CLOUD_UPLOAD((char) 0xf40b),
        IONI_IOS_CLOUD_UPLOAD_OUTLINE((char) 0xf40a),
        IONI_IOS_CLOUDY((char) 0xf410),
        IONI_IOS_CLOUDY_NIGHT((char) 0xf40e),
        IONI_IOS_CLOUDY_NIGHT_OUTLINE((char) 0xf40d),
        IONI_IOS_CLOUDY_OUTLINE((char) 0xf40f),
        IONI_IOS_COG((char) 0xf412),
        IONI_IOS_COG_OUTLINE((char) 0xf411),
        IONI_IOS_COLOR_FILTER((char) 0xf414),
        IONI_IOS_COLOR_FILTER_OUTLINE((char) 0xf413),
        IONI_IOS_COLOR_WAND((char) 0xf416),
        IONI_IOS_COLOR_WAND_OUTLINE((char) 0xf415),
        IONI_IOS_COMPOSE((char) 0xf418),
        IONI_IOS_COMPOSE_OUTLINE((char) 0xf417),
        IONI_IOS_CONTACT((char) 0xf41a),
        IONI_IOS_CONTACT_OUTLINE((char) 0xf419),
        IONI_IOS_COPY((char) 0xf41c),
        IONI_IOS_COPY_OUTLINE((char) 0xf41b),
        IONI_IOS_CROP((char) 0xf41e),
        IONI_IOS_CROP_STRONG((char) 0xf41d),
        IONI_IOS_DOWNLOAD((char) 0xf420),
        IONI_IOS_DOWNLOAD_OUTLINE((char) 0xf41f),
        IONI_IOS_DRAG((char) 0xf421),
        IONI_IOS_EMAIL((char) 0xf423),
        IONI_IOS_EMAIL_OUTLINE((char) 0xf422),
        IONI_IOS_EYE((char) 0xf425),
        IONI_IOS_EYE_OUTLINE((char) 0xf424),
        IONI_IOS_FASTFORWARD((char) 0xf427),
        IONI_IOS_FASTFORWARD_OUTLINE((char) 0xf426),
        IONI_IOS_FILING((char) 0xf429),
        IONI_IOS_FILING_OUTLINE((char) 0xf428),
        IONI_IOS_FILM((char) 0xf42b),
        IONI_IOS_FILM_OUTLINE((char) 0xf42a),
        IONI_IOS_FLAG((char) 0xf42d),
        IONI_IOS_FLAG_OUTLINE((char) 0xf42c),
        IONI_IOS_FLAME((char) 0xf42f),
        IONI_IOS_FLAME_OUTLINE((char) 0xf42e),
        IONI_IOS_FLASK((char) 0xf431),
        IONI_IOS_FLASK_OUTLINE((char) 0xf430),
        IONI_IOS_FLOWER((char) 0xf433),
        IONI_IOS_FLOWER_OUTLINE((char) 0xf432),
        IONI_IOS_FOLDER((char) 0xf435),
        IONI_IOS_FOLDER_OUTLINE((char) 0xf434),
        IONI_IOS_FOOTBALL((char) 0xf437),
        IONI_IOS_FOOTBALL_OUTLINE((char) 0xf436),
        IONI_IOS_GAME_CONTROLLER_A((char) 0xf439),
        IONI_IOS_GAME_CONTROLLER_A_OUTLINE((char) 0xf438),
        IONI_IOS_GAME_CONTROLLER_B((char) 0xf43b),
        IONI_IOS_GAME_CONTROLLER_B_OUTLINE((char) 0xf43a),
        IONI_IOS_GEAR((char) 0xf43d),
        IONI_IOS_GEAR_OUTLINE((char) 0xf43c),
        IONI_IOS_GLASSES((char) 0xf43f),
        IONI_IOS_GLASSES_OUTLINE((char) 0xf43e),
        IONI_IOS_GRID_VIEW((char) 0xf441),
        IONI_IOS_GRID_VIEW_OUTLINE((char) 0xf440),
        IONI_IOS_HEART((char) 0xf443),
        IONI_IOS_HEART_OUTLINE((char) 0xf442),
        IONI_IOS_HELP((char) 0xf446),
        IONI_IOS_HELP_EMPTY((char) 0xf444),
        IONI_IOS_HELP_OUTLINE((char) 0xf445),
        IONI_IOS_HOME((char) 0xf448),
        IONI_IOS_HOME_OUTLINE((char) 0xf447),
        IONI_IOS_INFINITE((char) 0xf44a),
        IONI_IOS_INFINITE_OUTLINE((char) 0xf449),
        IONI_IOS_INFORMATION((char) 0xf44d),
        IONI_IOS_INFORMATIONI_EMPTY((char) 0xf44b),
        IONI_IOS_INFORMATIONI_OUTLINE((char) 0xf44c),
        IONI_IOS_IONIC_OUTLINE((char) 0xf44e),
        IONI_IOS_KEYPAD((char) 0xf450),
        IONI_IOS_KEYPAD_OUTLINE((char) 0xf44f),
        IONI_IOS_LIGHTBULB((char) 0xf452),
        IONI_IOS_LIGHTBULB_OUTLINE((char) 0xf451),
        IONI_IOS_LIST((char) 0xf454),
        IONI_IOS_LIST_OUTLINE((char) 0xf453),
        IONI_IOS_LOCATION((char) 0xf456),
        IONI_IOS_LOCATIONI_OUTLINE((char) 0xf455),
        IONI_IOS_LOCKED((char) 0xf458),
        IONI_IOS_LOCKED_OUTLINE((char) 0xf457),
        IONI_IOS_LOOP((char) 0xf45a),
        IONI_IOS_LOOP_STRONG((char) 0xf459),
        IONI_IOS_MEDICAL((char) 0xf45c),
        IONI_IOS_MEDICAL_OUTLINE((char) 0xf45b),
        IONI_IOS_MEDKIT((char) 0xf45e),
        IONI_IOS_MEDKIT_OUTLINE((char) 0xf45d),
        IONI_IOS_MIC((char) 0xf461),
        IONI_IOS_MIC_OFF((char) 0xf45f),
        IONI_IOS_MIC_OUTLINE((char) 0xf460),
        IONI_IOS_MINUS((char) 0xf464),
        IONI_IOS_MINUS_EMPTY((char) 0xf462),
        IONI_IOS_MINUS_OUTLINE((char) 0xf463),
        IONI_IOS_MONITOR((char) 0xf466),
        IONI_IOS_MONITOR_OUTLINE((char) 0xf465),
        IONI_IOS_MOON((char) 0xf468),
        IONI_IOS_MOON_OUTLINE((char) 0xf467),
        IONI_IOS_MORE((char) 0xf46a),
        IONI_IOS_MORE_OUTLINE((char) 0xf469),
        IONI_IOS_MUSICAL_NOTE((char) 0xf46b),
        IONI_IOS_MUSICAL_NOTES((char) 0xf46c),
        IONI_IOS_NAVIGATE((char) 0xf46e),
        IONI_IOS_NAVIGATE_OUTLINE((char) 0xf46d),
        IONI_IOS_NUTRITION((char) 0xf470),
        IONI_IOS_NUTRITIONI_OUTLINE((char) 0xf46f),
        IONI_IOS_PAPER((char) 0xf472),
        IONI_IOS_PAPER_OUTLINE((char) 0xf471),
        IONI_IOS_PAPERPLANE((char) 0xf474),
        IONI_IOS_PAPERPLANE_OUTLINE((char) 0xf473),
        IONI_IOS_PARTLYSUNNY((char) 0xf476),
        IONI_IOS_PARTLYSUNNY_OUTLINE((char) 0xf475),
        IONI_IOS_PAUSE((char) 0xf478),
        IONI_IOS_PAUSE_OUTLINE((char) 0xf477),
        IONI_IOS_PAW((char) 0xf47a),
        IONI_IOS_PAW_OUTLINE((char) 0xf479),
        IONI_IOS_PEOPLE((char) 0xf47c),
        IONI_IOS_PEOPLE_OUTLINE((char) 0xf47b),
        IONI_IOS_PERSON((char) 0xf47e),
        IONI_IOS_PERSON_OUTLINE((char) 0xf47d),
        IONI_IOS_PERSONADD((char) 0xf480),
        IONI_IOS_PERSONADD_OUTLINE((char) 0xf47f),
        IONI_IOS_PHOTOS((char) 0xf482),
        IONI_IOS_PHOTOS_OUTLINE((char) 0xf481),
        IONI_IOS_PIE((char) 0xf484),
        IONI_IOS_PIE_OUTLINE((char) 0xf483),
        IONI_IOS_PINT((char) 0xf486),
        IONI_IOS_PINT_OUTLINE((char) 0xf485),
        IONI_IOS_PLAY((char) 0xf488),
        IONI_IOS_PLAY_OUTLINE((char) 0xf487),
        IONI_IOS_PLUS((char) 0xf48b),
        IONI_IOS_PLUS_EMPTY((char) 0xf489),
        IONI_IOS_PLUS_OUTLINE((char) 0xf48a),
        IONI_IOS_PRICETAG((char) 0xf48d),
        IONI_IOS_PRICETAG_OUTLINE((char) 0xf48c),
        IONI_IOS_PRICETAGS((char) 0xf48f),
        IONI_IOS_PRICETAGS_OUTLINE((char) 0xf48e),
        IONI_IOS_PRINTER((char) 0xf491),
        IONI_IOS_PRINTER_OUTLINE((char) 0xf490),
        IONI_IOS_PULSE((char) 0xf493),
        IONI_IOS_PULSE_STRONG((char) 0xf492),
        IONI_IOS_RAINY((char) 0xf495),
        IONI_IOS_RAINY_OUTLINE((char) 0xf494),
        IONI_IOS_RECORDING((char) 0xf497),
        IONI_IOS_RECORDING_OUTLINE((char) 0xf496),
        IONI_IOS_REDO((char) 0xf499),
        IONI_IOS_REDO_OUTLINE((char) 0xf498),
        IONI_IOS_REFRESH((char) 0xf49c),
        IONI_IOS_REFRESH_EMPTY((char) 0xf49a),
        IONI_IOS_REFRESH_OUTLINE((char) 0xf49b),
        IONI_IOS_RELOAD((char) 0xf49d),
        IONI_IOS_REVERSE_CAMERA((char) 0xf49f),
        IONI_IOS_REVERSE_CAMERA_OUTLINE((char) 0xf49e),
        IONI_IOS_REWIND((char) 0xf4a1),
        IONI_IOS_REWIND_OUTLINE((char) 0xf4a0),
        IONI_IOS_ROSE((char) 0xf4a3),
        IONI_IOS_ROSE_OUTLINE((char) 0xf4a2),
        IONI_IOS_SEARCH((char) 0xf4a5),
        IONI_IOS_SEARCH_STRONG((char) 0xf4a4),
        IONI_IOS_SETTINGS((char) 0xf4a7),
        IONI_IOS_SETTINGS_STRONG((char) 0xf4a6),
        IONI_IOS_SHUFFLE((char) 0xf4a9),
        IONI_IOS_SHUFFLE_STRONG((char) 0xf4a8),
        IONI_IOS_SKIPBACKWARD((char) 0xf4ab),
        IONI_IOS_SKIPBACKWARD_OUTLINE((char) 0xf4aa),
        IONI_IOS_SKIPFORWARD((char) 0xf4ad),
        IONI_IOS_SKIPFORWARD_OUTLINE((char) 0xf4ac),
        IONI_IOS_SNOWY((char) 0xf4ae),
        IONI_IOS_SPEEDOMETER((char) 0xf4b0),
        IONI_IOS_SPEEDOMETER_OUTLINE((char) 0xf4af),
        IONI_IOS_STAR((char) 0xf4b3),
        IONI_IOS_STAR_HALF((char) 0xf4b1),
        IONI_IOS_STAR_OUTLINE((char) 0xf4b2),
        IONI_IOS_STOPWATCH((char) 0xf4b5),
        IONI_IOS_STOPWATCH_OUTLINE((char) 0xf4b4),
        IONI_IOS_SUNNY((char) 0xf4b7),
        IONI_IOS_SUNNY_OUTLINE((char) 0xf4b6),
        IONI_IOS_TELEPHONE((char) 0xf4b9),
        IONI_IOS_TELEPHONE_OUTLINE((char) 0xf4b8),
        IONI_IOS_TENNISBALL((char) 0xf4bb),
        IONI_IOS_TENNISBALL_OUTLINE((char) 0xf4ba),
        IONI_IOS_THUNDERSTORM((char) 0xf4bd),
        IONI_IOS_THUNDERSTORM_OUTLINE((char) 0xf4bc),
        IONI_IOS_TIME((char) 0xf4bf),
        IONI_IOS_TIME_OUTLINE((char) 0xf4be),
        IONI_IOS_TIMER((char) 0xf4c1),
        IONI_IOS_TIMER_OUTLINE((char) 0xf4c0),
        IONI_IOS_TOGGLE((char) 0xf4c3),
        IONI_IOS_TOGGLE_OUTLINE((char) 0xf4c2),
        IONI_IOS_TRASH((char) 0xf4c5),
        IONI_IOS_TRASH_OUTLINE((char) 0xf4c4),
        IONI_IOS_UNDO((char) 0xf4c7),
        IONI_IOS_UNDO_OUTLINE((char) 0xf4c6),
        IONI_IOS_UNLOCKED((char) 0xf4c9),
        IONI_IOS_UNLOCKED_OUTLINE((char) 0xf4c8),
        IONI_IOS_UPLOAD((char) 0xf4cb),
        IONI_IOS_UPLOAD_OUTLINE((char) 0xf4ca),
        IONI_IOS_VIDEOCAM((char) 0xf4cd),
        IONI_IOS_VIDEOCAM_OUTLINE((char) 0xf4cc),
        IONI_IOS_VOLUME_HIGH((char) 0xf4ce),
        IONI_IOS_VOLUME_LOW((char) 0xf4cf),
        IONI_IOS_WINEGLASS((char) 0xf4d1),
        IONI_IOS_WINEGLASS_OUTLINE((char) 0xf4d0),
        IONI_IOS_WORLD((char) 0xf4d3),
        IONI_IOS_WORLD_OUTLINE((char) 0xf4d2),
        IONI_IPAD((char) 0xf1f9),
        IONI_IPHONE((char) 0xf1fa),
        IONI_IPOD((char) 0xf1fb),
        IONI_JET((char) 0xf295),
        IONI_KEY((char) 0xf296),
        IONI_KNIFE((char) 0xf297),
        IONI_LAPTOP((char) 0xf1fc),
        IONI_LEAF((char) 0xf1fd),
        IONI_LEVELS((char) 0xf298),
        IONI_LIGHTBULB((char) 0xf299),
        IONI_LINK((char) 0xf1fe),
        IONI_LOAD_A((char) 0xf29a),
        IONI_LOAD_B((char) 0xf29b),
        IONI_LOAD_C((char) 0xf29c),
        IONI_LOAD_D((char) 0xf29d),
        IONI_LOCATION((char) 0xf1ff),
        IONI_LOCK_COMBINATION((char) 0xf4d4),
        IONI_LOCKED((char) 0xf200),
        IONI_LOG_IN((char) 0xf29e),
        IONI_LOG_OUT((char) 0xf29f),
        IONI_LOOP((char) 0xf201),
        IONI_MAGNET((char) 0xf2a0),
        IONI_MALE((char) 0xf2a1),
        IONI_MAN((char) 0xf202),
        IONI_MAP((char) 0xf203),
        IONI_MEDKIT((char) 0xf2a2),
        IONI_MERGE((char) 0xf33f),
        IONI_MIC_A((char) 0xf204),
        IONI_MIC_B((char) 0xf205),
        IONI_MIC_C((char) 0xf206),
        IONI_MINUS((char) 0xf209),
        IONI_MINUS_CIRCLED((char) 0xf207),
        IONI_MINUS_ROUND((char) 0xf208),
        IONI_MODEL_S((char) 0xf2c1),
        IONI_MONITOR((char) 0xf20a),
        IONI_MORE((char) 0xf20b),
        IONI_MOUSE((char) 0xf340),
        IONI_MUSIC_NOTE((char) 0xf20c),
        IONI_NAVICON((char) 0xf20e),
        IONI_NAVICON_ROUND((char) 0xf20d),
        IONI_NAVIGATE((char) 0xf2a3),
        IONI_NETWORK((char) 0xf341),
        IONI_NO_SMOKING((char) 0xf2c2),
        IONI_NUCLEAR((char) 0xf2a4),
        IONI_OUTLET((char) 0xf342),
        IONI_PAINTBRUSH((char) 0xf4d5),
        IONI_PAINTBUCKET((char) 0xf4d6),
        IONI_PAPER_AIRPLANE((char) 0xf2c3),
        IONI_PAPERCLIP((char) 0xf20f),
        IONI_PAUSE((char) 0xf210),
        IONI_PERSON((char) 0xf213),
        IONI_PERSON_ADD((char) 0xf211),
        IONI_PERSON_STALKER((char) 0xf212),
        IONI_PIE_GRAPH((char) 0xf2a5),
        IONI_PIN((char) 0xf2a6),
        IONI_PINPOINT((char) 0xf2a7),
        IONI_PIZZA((char) 0xf2a8),
        IONI_PLANE((char) 0xf214),
        IONI_PLANET((char) 0xf343),
        IONI_PLAY((char) 0xf215),
        IONI_PLAYSTATION((char) 0xf30a),
        IONI_PLUS((char) 0xf218),
        IONI_PLUS_CIRCLED((char) 0xf216),
        IONI_PLUS_ROUND((char) 0xf217),
        IONI_PODIUM((char) 0xf344),
        IONI_POUND((char) 0xf219),
        IONI_POWER((char) 0xf2a9),
        IONI_PRICETAG((char) 0xf2aa),
        IONI_PRICETAGS((char) 0xf2ab),
        IONI_PRINTER((char) 0xf21a),
        IONI_PULL_REQUEST((char) 0xf345),
        IONI_QR_SCANNER((char) 0xf346),
        IONI_QUOTE((char) 0xf347),
        IONI_RADIO_WAVES((char) 0xf2ac),
        IONI_RECORD((char) 0xf21b),
        IONI_REFRESH((char) 0xf21c),
        IONI_REPLY((char) 0xf21e),
        IONI_REPLY_ALL((char) 0xf21d),
        IONI_RIBBON_A((char) 0xf348),
        IONI_RIBBON_B((char) 0xf349),
        IONI_SAD((char) 0xf34a),
        IONI_SAD_OUTLINE((char) 0xf4d7),
        IONI_SCISSORS((char) 0xf34b),
        IONI_SEARCH((char) 0xf21f),
        IONI_SETTINGS((char) 0xf2ad),
        IONI_SHARE((char) 0xf220),
        IONI_SHUFFLE((char) 0xf221),
        IONI_SKIP_BACKWARD((char) 0xf222),
        IONI_SKIP_FORWARD((char) 0xf223),
        IONI_SOCIAL_ANGULAR((char) 0xf4d9),
        IONI_SOCIAL_ANGULAR_OUTLINE((char) 0xf4d8),
        IONI_SOCIAL_APPLE((char) 0xf227),
        IONI_SOCIAL_APPLE_OUTLINE((char) 0xf226),
        IONI_SOCIAL_BITCOIN((char) 0xf2af),
        IONI_SOCIAL_BITCOIN_OUTLINE((char) 0xf2ae),
        IONI_SOCIAL_BUFFER((char) 0xf229),
        IONI_SOCIAL_BUFFER_OUTLINE((char) 0xf228),
        IONI_SOCIAL_CHROME((char) 0xf4db),
        IONI_SOCIAL_CHROME_OUTLINE((char) 0xf4da),
        IONI_SOCIAL_CODEPEN((char) 0xf4dd),
        IONI_SOCIAL_CODEPEN_OUTLINE((char) 0xf4dc),
        IONI_SOCIAL_CSS3((char) 0xf4df),
        IONI_SOCIAL_CSS3_OUTLINE((char) 0xf4de),
        IONI_SOCIAL_DESIGNERNEWS((char) 0xf22b),
        IONI_SOCIAL_DESIGNERNEWS_OUTLINE((char) 0xf22a),
        IONI_SOCIAL_DRIBBBLE((char) 0xf22d),
        IONI_SOCIAL_DRIBBBLE_OUTLINE((char) 0xf22c),
        IONI_SOCIAL_DROPBOX((char) 0xf22f),
        IONI_SOCIAL_DROPBOX_OUTLINE((char) 0xf22e),
        IONI_SOCIAL_EURO((char) 0xf4e1),
        IONI_SOCIAL_EURO_OUTLINE((char) 0xf4e0),
        IONI_SOCIAL_FACEBOOK((char) 0xf231),
        IONI_SOCIAL_FACEBOOK_OUTLINE((char) 0xf230),
        IONI_SOCIAL_FOURSQUARE((char) 0xf34d),
        IONI_SOCIAL_FOURSQUARE_OUTLINE((char) 0xf34c),
        IONI_SOCIAL_FREEBSD_DEVIL((char) 0xf2c4),
        IONI_SOCIAL_GITHUB((char) 0xf233),
        IONI_SOCIAL_GITHUB_OUTLINE((char) 0xf232),
        IONI_SOCIAL_GOOGLE((char) 0xf34f),
        IONI_SOCIAL_GOOGLE_OUTLINE((char) 0xf34e),
        IONI_SOCIAL_GOOGLEPLUS((char) 0xf235),
        IONI_SOCIAL_GOOGLEPLUS_OUTLINE((char) 0xf234),
        IONI_SOCIAL_HACKERNEWS((char) 0xf237),
        IONI_SOCIAL_HACKERNEWS_OUTLINE((char) 0xf236),
        IONI_SOCIAL_HTML5((char) 0xf4e3),
        IONI_SOCIAL_HTML5_OUTLINE((char) 0xf4e2),
        IONI_SOCIAL_INSTAGRAM((char) 0xf351),
        IONI_SOCIAL_INSTAGRAM_OUTLINE((char) 0xf350),
        IONI_SOCIAL_JAVASCRIPT((char) 0xf4e5),
        IONI_SOCIAL_JAVASCRIPT_OUTLINE((char) 0xf4e4),
        IONI_SOCIAL_LINKEDIN((char) 0xf239),
        IONI_SOCIAL_LINKEDIN_OUTLINE((char) 0xf238),
        IONI_SOCIAL_MARKDOWN((char) 0xf4e6),
        IONI_SOCIAL_NODEJS((char) 0xf4e7),
        IONI_SOCIAL_OCTOCAT((char) 0xf4e8),
        IONI_SOCIAL_PINTEREST((char) 0xf2b1),
        IONI_SOCIAL_PINTEREST_OUTLINE((char) 0xf2b0),
        IONI_SOCIAL_PYTHON((char) 0xf4e9),
        IONI_SOCIAL_REDDIT((char) 0xf23b),
        IONI_SOCIAL_REDDIT_OUTLINE((char) 0xf23a),
        IONI_SOCIAL_RSS((char) 0xf23d),
        IONI_SOCIAL_RSS_OUTLINE((char) 0xf23c),
        IONI_SOCIAL_SASS((char) 0xf4ea),
        IONI_SOCIAL_SKYPE((char) 0xf23f),
        IONI_SOCIAL_SKYPE_OUTLINE((char) 0xf23e),
        IONI_SOCIAL_SNAPCHAT((char) 0xf4ec),
        IONI_SOCIAL_SNAPCHAT_OUTLINE((char) 0xf4eb),
        IONI_SOCIAL_TUMBLR((char) 0xf241),
        IONI_SOCIAL_TUMBLR_OUTLINE((char) 0xf240),
        IONI_SOCIAL_TUX((char) 0xf2c5),
        IONI_SOCIAL_TWITCH((char) 0xf4ee),
        IONI_SOCIAL_TWITCH_OUTLINE((char) 0xf4ed),
        IONI_SOCIAL_TWITTER((char) 0xf243),
        IONI_SOCIAL_TWITTER_OUTLINE((char) 0xf242),
        IONI_SOCIAL_USD((char) 0xf353),
        IONI_SOCIAL_USD_OUTLINE((char) 0xf352),
        IONI_SOCIAL_VIMEO((char) 0xf245),
        IONI_SOCIAL_VIMEO_OUTLINE((char) 0xf244),
        IONI_SOCIAL_WHATSAPP((char) 0xf4f0),
        IONI_SOCIAL_WHATSAPP_OUTLINE((char) 0xf4ef),
        IONI_SOCIAL_WINDOWS((char) 0xf247),
        IONI_SOCIAL_WINDOWS_OUTLINE((char) 0xf246),
        IONI_SOCIAL_WORDPRESS((char) 0xf249),
        IONI_SOCIAL_WORDPRESS_OUTLINE((char) 0xf248),
        IONI_SOCIAL_YAHOO((char) 0xf24b),
        IONI_SOCIAL_YAHOO_OUTLINE((char) 0xf24a),
        IONI_SOCIAL_YEN((char) 0xf4f2),
        IONI_SOCIAL_YEN_OUTLINE((char) 0xf4f1),
        IONI_SOCIAL_YOUTUBE((char) 0xf24d),
        IONI_SOCIAL_YOUTUBE_OUTLINE((char) 0xf24c),
        IONI_SOUP_CAN((char) 0xf4f4),
        IONI_SOUP_CAN_OUTLINE((char) 0xf4f3),
        IONI_SPEAKERPHONE((char) 0xf2b2),
        IONI_SPEEDOMETER((char) 0xf2b3),
        IONI_SPOON((char) 0xf2b4),
        IONI_STAR((char) 0xf24e),
        IONI_STATS_BARS((char) 0xf2b5),
        IONI_STEAM((char) 0xf30b),
        IONI_STOP((char) 0xf24f),
        IONI_THERMOMETER((char) 0xf2b6),
        IONI_THUMBSDOWN((char) 0xf250),
        IONI_THUMBSUP((char) 0xf251),
        IONI_TOGGLE((char) 0xf355),
        IONI_TOGGLE_FILLED((char) 0xf354),
        IONI_TRANSGENDER((char) 0xf4f5),
        IONI_TRASH_A((char) 0xf252),
        IONI_TRASH_B((char) 0xf253),
        IONI_TROPHY((char) 0xf356),
        IONI_TSHIRT((char) 0xf4f7),
        IONI_TSHIRT_OUTLINE((char) 0xf4f6),
        IONI_UMBRELLA((char) 0xf2b7),
        IONI_UNIVERSITY((char) 0xf357),
        IONI_UNLOCKED((char) 0xf254),
        IONI_UPLOAD((char) 0xf255),
        IONI_USB((char) 0xf2b8),
        IONI_VIDEOCAMERA((char) 0xf256),
        IONI_VOLUME_HIGH((char) 0xf257),
        IONI_VOLUME_LOW((char) 0xf258),
        IONI_VOLUME_MEDIUM((char) 0xf259),
        IONI_VOLUME_MUTE((char) 0xf25a),
        IONI_WAND((char) 0xf358),
        IONI_WATERDROP((char) 0xf25b),
        IONI_WIFI((char) 0xf25c),
        IONI_WINEGLASS((char) 0xf2b9),
        IONI_WOMAN((char) 0xf25d),
        IONI_WRENCH((char) 0xf2ba),
        IONI_XBOX((char) 0xf30c);

        char ioniconsCharacter;

        Icon(char character) {
            this.ioniconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return ioniconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface ioniconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (ioniconsTypeface == null) {
                setTypeface(new Ionicons());
            }
            return ioniconsTypeface;
        }

        private static void setTypeface(Ionicons ioniconsTypeface) {
            Icon.ioniconsTypeface = ioniconsTypeface;
        }
    }
}
