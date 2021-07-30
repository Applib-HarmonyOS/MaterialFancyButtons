package com.rilixtech.ionicons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Ionicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Ionicons implements ITypeface {
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
     * Ionicons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Ionicons IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Ionicons ITypeface.
     */
    public enum Icon implements IIcon {
        IONI_ALERT('\uf101'),
        IONI_ALERT_CIRCLED('\uf100'),
        IONI_APERTURE('\uf313'),
        IONI_ARCHIVE('\uf102'),
        IONI_ARROW_DOWN_A('\uf103'),
        IONI_ARROW_DOWN_B('\uf104'),
        IONI_ARROW_DOWN_C('\uf105'),
        IONI_ARROW_EXPAND('\uf25e'),
        IONI_ARROW_GRAPH_DOWN_LEFT('\uf25f'),
        IONI_ARROW_GRAPH_DOWN_RIGHT('\uf260'),
        IONI_ARROW_GRAPH_UP_LEFT('\uf261'),
        IONI_ARROW_GRAPH_UP_RIGHT('\uf262'),
        IONI_ARROW_LEFT_A('\uf106'),
        IONI_ARROW_LEFT_B('\uf107'),
        IONI_ARROW_LEFT_C('\uf108'),
        IONI_ARROW_MOVE('\uf263'),
        IONI_ARROW_RESIZE('\uf264'),
        IONI_ARROW_RETURN_LEFT('\uf265'),
        IONI_ARROW_RETURN_RIGHT('\uf266'),
        IONI_ARROW_RIGHT_A('\uf109'),
        IONI_ARROW_RIGHT_B('\uf10a'),
        IONI_ARROW_RIGHT_C('\uf10b'),
        IONI_ARROW_SHRINK('\uf267'),
        IONI_ARROW_SWAP('\uf268'),
        IONI_ARROW_UP_A('\uf10c'),
        IONI_ARROW_UP_B('\uf10d'),
        IONI_ARROW_UP_C('\uf10e'),
        IONI_ASTERISK('\uf314'),
        IONI_AT('\uf10f'),
        IONI_BACKSPACE('\uf3bf'),
        IONI_BACKSPACE_OUTLINE('\uf3be'),
        IONI_BAG('\uf110'),
        IONI_BATTERY_CHARGING('\uf111'),
        IONI_BATTERY_EMPTY('\uf112'),
        IONI_BATTERY_FULL('\uf113'),
        IONI_BATTERY_HALF('\uf114'),
        IONI_BATTERY_LOW('\uf115'),
        IONI_BEAKER('\uf269'),
        IONI_BEER('\uf26a'),
        IONI_BLUETOOTH('\uf116'),
        IONI_BONFIRE('\uf315'),
        IONI_BOOKMARK('\uf26b'),
        IONI_BOWTIE('\uf3c0'),
        IONI_BRIEFCASE('\uf26c'),
        IONI_BUG('\uf2be'),
        IONI_CALCULATOR('\uf26d'),
        IONI_CALENDAR('\uf117'),
        IONI_CAMERA('\uf118'),
        IONI_CARD('\uf119'),
        IONI_CASH('\uf316'),
        IONI_CHATBOX('\uf11b'),
        IONI_CHATBOX_WORKING('\uf11a'),
        IONI_CHATBOXES('\uf11c'),
        IONI_CHATBUBBLE('\uf11e'),
        IONI_CHATBUBBLE_WORKING('\uf11d'),
        IONI_CHATBUBBLES('\uf11f'),
        IONI_CHECKMARK('\uf122'),
        IONI_CHECKMARK_CIRCLED('\uf120'),
        IONI_CHECKMARK_ROUND('\uf121'),
        IONI_CHEVRON_DOWN('\uf123'),
        IONI_CHEVRON_LEFT('\uf124'),
        IONI_CHEVRON_RIGHT('\uf125'),
        IONI_CHEVRON_UP('\uf126'),
        IONI_CLIPBOARD('\uf127'),
        IONI_CLOCK('\uf26e'),
        IONI_CLOSE('\uf12a'),
        IONI_CLOSE_CIRCLED('\uf128'),
        IONI_CLOSE_ROUND('\uf129'),
        IONI_CLOSED_CAPTIONING('\uf317'),
        IONI_CLOUD('\uf12b'),
        IONI_CODE('\uf271'),
        IONI_CODE_DOWNLOAD('\uf26f'),
        IONI_CODE_WORKING('\uf270'),
        IONI_COFFEE('\uf272'),
        IONI_COMPASS('\uf273'),
        IONI_COMPOSE('\uf12c'),
        IONI_CONNECTIONI_BARS('\uf274'),
        IONI_CONTRAST('\uf275'),
        IONI_CROP('\uf3c1'),
        IONI_CUBE('\uf318'),
        IONI_DISC('\uf12d'),
        IONI_DOCUMENT('\uf12f'),
        IONI_DOCUMENTI_TEXT('\uf12e'),
        IONI_DRAG('\uf130'),
        IONI_EARTH('\uf276'),
        IONI_EASEL('\uf3c2'),
        IONI_EDIT('\uf2bf'),
        IONI_EGG('\uf277'),
        IONI_EJECT('\uf131'),
        IONI_EMAIL('\uf132'),
        IONI_EMAIL_UNREAD('\uf3c3'),
        IONI_ERLENMEYER_FLASK('\uf3c5'),
        IONI_ERLENMEYER_FLASK_BUBBLES('\uf3c4'),
        IONI_EYE('\uf133'),
        IONI_EYE_DISABLED('\uf306'),
        IONI_FEMALE('\uf278'),
        IONI_FILING('\uf134'),
        IONI_FILM_MARKER('\uf135'),
        IONI_FIREBALL('\uf319'),
        IONI_FLAG('\uf279'),
        IONI_FLAME('\uf31a'),
        IONI_FLASH('\uf137'),
        IONI_FLASH_OFF('\uf136'),
        IONI_FOLDER('\uf139'),
        IONI_FORK('\uf27a'),
        IONI_FORK_REPO('\uf2c0'),
        IONI_FORWARD('\uf13a'),
        IONI_FUNNEL('\uf31b'),
        IONI_GEAR_A('\uf13d'),
        IONI_GEAR_B('\uf13e'),
        IONI_GRID('\uf13f'),
        IONI_HAMMER('\uf27b'),
        IONI_HAPPY('\uf31c'),
        IONI_HAPPY_OUTLINE('\uf3c6'),
        IONI_HEADPHONE('\uf140'),
        IONI_HEART('\uf141'),
        IONI_HEART_BROKEN('\uf31d'),
        IONI_HELP('\uf143'),
        IONI_HELP_BUOY('\uf27c'),
        IONI_HELP_CIRCLED('\uf142'),
        IONI_HOME('\uf144'),
        IONI_ICECREAM('\uf27d'),
        IONI_IMAGE('\uf147'),
        IONI_IMAGES('\uf148'),
        IONI_INFORMATION('\uf14a'),
        IONI_INFORMATIONI_CIRCLED('\uf149'),
        IONI_IONIC('\uf14b'),
        IONI_IOS_ALARM('\uf3c8'),
        IONI_IOS_ALARM_OUTLINE('\uf3c7'),
        IONI_IOS_ALBUMS('\uf3ca'),
        IONI_IOS_ALBUMS_OUTLINE('\uf3c9'),
        IONI_IOS_AMERICANFOOTBALL('\uf3cc'),
        IONI_IOS_AMERICANFOOTBALL_OUTLINE('\uf3cb'),
        IONI_IOS_ANALYTICS('\uf3ce'),
        IONI_IOS_ANALYTICS_OUTLINE('\uf3cd'),
        IONI_IOS_ARROW_BACK('\uf3cf'),
        IONI_IOS_ARROW_DOWN('\uf3d0'),
        IONI_IOS_ARROW_FORWARD('\uf3d1'),
        IONI_IOS_ARROW_LEFT('\uf3d2'),
        IONI_IOS_ARROW_RIGHT('\uf3d3'),
        IONI_IOS_ARROW_THIN_DOWN('\uf3d4'),
        IONI_IOS_ARROW_THIN_LEFT('\uf3d5'),
        IONI_IOS_ARROW_THIN_RIGHT('\uf3d6'),
        IONI_IOS_ARROW_THIN_UP('\uf3d7'),
        IONI_IOS_ARROW_UP('\uf3d8'),
        IONI_IOS_AT('\uf3da'),
        IONI_IOS_AT_OUTLINE('\uf3d9'),
        IONI_IOS_BARCODE('\uf3dc'),
        IONI_IOS_BARCODE_OUTLINE('\uf3db'),
        IONI_IOS_BASEBALL('\uf3de'),
        IONI_IOS_BASEBALL_OUTLINE('\uf3dd'),
        IONI_IOS_BASKETBALL('\uf3e0'),
        IONI_IOS_BASKETBALL_OUTLINE('\uf3df'),
        IONI_IOS_BELL('\uf3e2'),
        IONI_IOS_BELL_OUTLINE('\uf3e1'),
        IONI_IOS_BODY('\uf3e4'),
        IONI_IOS_BODY_OUTLINE('\uf3e3'),
        IONI_IOS_BOLT('\uf3e6'),
        IONI_IOS_BOLT_OUTLINE('\uf3e5'),
        IONI_IOS_BOOK('\uf3e8'),
        IONI_IOS_BOOK_OUTLINE('\uf3e7'),
        IONI_IOS_BOOKMARKS('\uf3ea'),
        IONI_IOS_BOOKMARKS_OUTLINE('\uf3e9'),
        IONI_IOS_BOX('\uf3ec'),
        IONI_IOS_BOX_OUTLINE('\uf3eb'),
        IONI_IOS_BRIEFCASE('\uf3ee'),
        IONI_IOS_BRIEFCASE_OUTLINE('\uf3ed'),
        IONI_IOS_BROWSERS('\uf3f0'),
        IONI_IOS_BROWSERS_OUTLINE('\uf3ef'),
        IONI_IOS_CALCULATOR('\uf3f2'),
        IONI_IOS_CALCULATOR_OUTLINE('\uf3f1'),
        IONI_IOS_CALENDAR('\uf3f4'),
        IONI_IOS_CALENDAR_OUTLINE('\uf3f3'),
        IONI_IOS_CAMERA('\uf3f6'),
        IONI_IOS_CAMERA_OUTLINE('\uf3f5'),
        IONI_IOS_CART('\uf3f8'),
        IONI_IOS_CART_OUTLINE('\uf3f7'),
        IONI_IOS_CHATBOXES('\uf3fa'),
        IONI_IOS_CHATBOXES_OUTLINE('\uf3f9'),
        IONI_IOS_CHATBUBBLE('\uf3fc'),
        IONI_IOS_CHATBUBBLE_OUTLINE('\uf3fb'),
        IONI_IOS_CHECKMARK('\uf3ff'),
        IONI_IOS_CHECKMARK_EMPTY('\uf3fd'),
        IONI_IOS_CHECKMARK_OUTLINE('\uf3fe'),
        IONI_IOS_CIRCLE_FILLED('\uf400'),
        IONI_IOS_CIRCLE_OUTLINE('\uf401'),
        IONI_IOS_CLOCK('\uf403'),
        IONI_IOS_CLOCK_OUTLINE('\uf402'),
        IONI_IOS_CLOSE('\uf406'),
        IONI_IOS_CLOSE_EMPTY('\uf404'),
        IONI_IOS_CLOSE_OUTLINE('\uf405'),
        IONI_IOS_CLOUD('\uf40c'),
        IONI_IOS_CLOUD_DOWNLOAD('\uf408'),
        IONI_IOS_CLOUD_DOWNLOAD_OUTLINE('\uf407'),
        IONI_IOS_CLOUD_OUTLINE('\uf409'),
        IONI_IOS_CLOUD_UPLOAD('\uf40b'),
        IONI_IOS_CLOUD_UPLOAD_OUTLINE('\uf40a'),
        IONI_IOS_CLOUDY('\uf410'),
        IONI_IOS_CLOUDY_NIGHT('\uf40e'),
        IONI_IOS_CLOUDY_NIGHT_OUTLINE('\uf40d'),
        IONI_IOS_CLOUDY_OUTLINE('\uf40f'),
        IONI_IOS_COG('\uf412'),
        IONI_IOS_COG_OUTLINE('\uf411'),
        IONI_IOS_COLOR_FILTER('\uf414'),
        IONI_IOS_COLOR_FILTER_OUTLINE('\uf413'),
        IONI_IOS_COLOR_WAND('\uf416'),
        IONI_IOS_COLOR_WAND_OUTLINE('\uf415'),
        IONI_IOS_COMPOSE('\uf418'),
        IONI_IOS_COMPOSE_OUTLINE('\uf417'),
        IONI_IOS_CONTACT('\uf41a'),
        IONI_IOS_CONTACT_OUTLINE('\uf419'),
        IONI_IOS_COPY('\uf41c'),
        IONI_IOS_COPY_OUTLINE('\uf41b'),
        IONI_IOS_CROP('\uf41e'),
        IONI_IOS_CROP_STRONG('\uf41d'),
        IONI_IOS_DOWNLOAD('\uf420'),
        IONI_IOS_DOWNLOAD_OUTLINE('\uf41f'),
        IONI_IOS_DRAG('\uf421'),
        IONI_IOS_EMAIL('\uf423'),
        IONI_IOS_EMAIL_OUTLINE('\uf422'),
        IONI_IOS_EYE('\uf425'),
        IONI_IOS_EYE_OUTLINE('\uf424'),
        IONI_IOS_FASTFORWARD('\uf427'),
        IONI_IOS_FASTFORWARD_OUTLINE('\uf426'),
        IONI_IOS_FILING('\uf429'),
        IONI_IOS_FILING_OUTLINE('\uf428'),
        IONI_IOS_FILM('\uf42b'),
        IONI_IOS_FILM_OUTLINE('\uf42a'),
        IONI_IOS_FLAG('\uf42d'),
        IONI_IOS_FLAG_OUTLINE('\uf42c'),
        IONI_IOS_FLAME('\uf42f'),
        IONI_IOS_FLAME_OUTLINE('\uf42e'),
        IONI_IOS_FLASK('\uf431'),
        IONI_IOS_FLASK_OUTLINE('\uf430'),
        IONI_IOS_FLOWER('\uf433'),
        IONI_IOS_FLOWER_OUTLINE('\uf432'),
        IONI_IOS_FOLDER('\uf435'),
        IONI_IOS_FOLDER_OUTLINE('\uf434'),
        IONI_IOS_FOOTBALL('\uf437'),
        IONI_IOS_FOOTBALL_OUTLINE('\uf436'),
        IONI_IOS_GAME_CONTROLLER_A('\uf439'),
        IONI_IOS_GAME_CONTROLLER_A_OUTLINE('\uf438'),
        IONI_IOS_GAME_CONTROLLER_B('\uf43b'),
        IONI_IOS_GAME_CONTROLLER_B_OUTLINE('\uf43a'),
        IONI_IOS_GEAR('\uf43d'),
        IONI_IOS_GEAR_OUTLINE('\uf43c'),
        IONI_IOS_GLASSES('\uf43f'),
        IONI_IOS_GLASSES_OUTLINE('\uf43e'),
        IONI_IOS_GRID_VIEW('\uf441'),
        IONI_IOS_GRID_VIEW_OUTLINE('\uf440'),
        IONI_IOS_HEART('\uf443'),
        IONI_IOS_HEART_OUTLINE('\uf442'),
        IONI_IOS_HELP('\uf446'),
        IONI_IOS_HELP_EMPTY('\uf444'),
        IONI_IOS_HELP_OUTLINE('\uf445'),
        IONI_IOS_HOME('\uf448'),
        IONI_IOS_HOME_OUTLINE('\uf447'),
        IONI_IOS_INFINITE('\uf44a'),
        IONI_IOS_INFINITE_OUTLINE('\uf449'),
        IONI_IOS_INFORMATION('\uf44d'),
        IONI_IOS_INFORMATIONI_EMPTY('\uf44b'),
        IONI_IOS_INFORMATIONI_OUTLINE('\uf44c'),
        IONI_IOS_IONIC_OUTLINE('\uf44e'),
        IONI_IOS_KEYPAD('\uf450'),
        IONI_IOS_KEYPAD_OUTLINE('\uf44f'),
        IONI_IOS_LIGHTBULB('\uf452'),
        IONI_IOS_LIGHTBULB_OUTLINE('\uf451'),
        IONI_IOS_LIST('\uf454'),
        IONI_IOS_LIST_OUTLINE('\uf453'),
        IONI_IOS_LOCATION('\uf456'),
        IONI_IOS_LOCATIONI_OUTLINE('\uf455'),
        IONI_IOS_LOCKED('\uf458'),
        IONI_IOS_LOCKED_OUTLINE('\uf457'),
        IONI_IOS_LOOP('\uf45a'),
        IONI_IOS_LOOP_STRONG('\uf459'),
        IONI_IOS_MEDICAL('\uf45c'),
        IONI_IOS_MEDICAL_OUTLINE('\uf45b'),
        IONI_IOS_MEDKIT('\uf45e'),
        IONI_IOS_MEDKIT_OUTLINE('\uf45d'),
        IONI_IOS_MIC('\uf461'),
        IONI_IOS_MIC_OFF('\uf45f'),
        IONI_IOS_MIC_OUTLINE('\uf460'),
        IONI_IOS_MINUS('\uf464'),
        IONI_IOS_MINUS_EMPTY('\uf462'),
        IONI_IOS_MINUS_OUTLINE('\uf463'),
        IONI_IOS_MONITOR('\uf466'),
        IONI_IOS_MONITOR_OUTLINE('\uf465'),
        IONI_IOS_MOON('\uf468'),
        IONI_IOS_MOON_OUTLINE('\uf467'),
        IONI_IOS_MORE('\uf46a'),
        IONI_IOS_MORE_OUTLINE('\uf469'),
        IONI_IOS_MUSICAL_NOTE('\uf46b'),
        IONI_IOS_MUSICAL_NOTES('\uf46c'),
        IONI_IOS_NAVIGATE('\uf46e'),
        IONI_IOS_NAVIGATE_OUTLINE('\uf46d'),
        IONI_IOS_NUTRITION('\uf470'),
        IONI_IOS_NUTRITIONI_OUTLINE('\uf46f'),
        IONI_IOS_PAPER('\uf472'),
        IONI_IOS_PAPER_OUTLINE('\uf471'),
        IONI_IOS_PAPERPLANE('\uf474'),
        IONI_IOS_PAPERPLANE_OUTLINE('\uf473'),
        IONI_IOS_PARTLYSUNNY('\uf476'),
        IONI_IOS_PARTLYSUNNY_OUTLINE('\uf475'),
        IONI_IOS_PAUSE('\uf478'),
        IONI_IOS_PAUSE_OUTLINE('\uf477'),
        IONI_IOS_PAW('\uf47a'),
        IONI_IOS_PAW_OUTLINE('\uf479'),
        IONI_IOS_PEOPLE('\uf47c'),
        IONI_IOS_PEOPLE_OUTLINE('\uf47b'),
        IONI_IOS_PERSON('\uf47e'),
        IONI_IOS_PERSON_OUTLINE('\uf47d'),
        IONI_IOS_PERSONADD('\uf480'),
        IONI_IOS_PERSONADD_OUTLINE('\uf47f'),
        IONI_IOS_PHOTOS('\uf482'),
        IONI_IOS_PHOTOS_OUTLINE('\uf481'),
        IONI_IOS_PIE('\uf484'),
        IONI_IOS_PIE_OUTLINE('\uf483'),
        IONI_IOS_PINT('\uf486'),
        IONI_IOS_PINT_OUTLINE('\uf485'),
        IONI_IOS_PLAY('\uf488'),
        IONI_IOS_PLAY_OUTLINE('\uf487'),
        IONI_IOS_PLUS('\uf48b'),
        IONI_IOS_PLUS_EMPTY('\uf489'),
        IONI_IOS_PLUS_OUTLINE('\uf48a'),
        IONI_IOS_PRICETAG('\uf48d'),
        IONI_IOS_PRICETAG_OUTLINE('\uf48c'),
        IONI_IOS_PRICETAGS('\uf48f'),
        IONI_IOS_PRICETAGS_OUTLINE('\uf48e'),
        IONI_IOS_PRINTER('\uf491'),
        IONI_IOS_PRINTER_OUTLINE('\uf490'),
        IONI_IOS_PULSE('\uf493'),
        IONI_IOS_PULSE_STRONG('\uf492'),
        IONI_IOS_RAINY('\uf495'),
        IONI_IOS_RAINY_OUTLINE('\uf494'),
        IONI_IOS_RECORDING('\uf497'),
        IONI_IOS_RECORDING_OUTLINE('\uf496'),
        IONI_IOS_REDO('\uf499'),
        IONI_IOS_REDO_OUTLINE('\uf498'),
        IONI_IOS_REFRESH('\uf49c'),
        IONI_IOS_REFRESH_EMPTY('\uf49a'),
        IONI_IOS_REFRESH_OUTLINE('\uf49b'),
        IONI_IOS_RELOAD('\uf49d'),
        IONI_IOS_REVERSE_CAMERA('\uf49f'),
        IONI_IOS_REVERSE_CAMERA_OUTLINE('\uf49e'),
        IONI_IOS_REWIND('\uf4a1'),
        IONI_IOS_REWIND_OUTLINE('\uf4a0'),
        IONI_IOS_ROSE('\uf4a3'),
        IONI_IOS_ROSE_OUTLINE('\uf4a2'),
        IONI_IOS_SEARCH('\uf4a5'),
        IONI_IOS_SEARCH_STRONG('\uf4a4'),
        IONI_IOS_SETTINGS('\uf4a7'),
        IONI_IOS_SETTINGS_STRONG('\uf4a6'),
        IONI_IOS_SHUFFLE('\uf4a9'),
        IONI_IOS_SHUFFLE_STRONG('\uf4a8'),
        IONI_IOS_SKIPBACKWARD('\uf4ab'),
        IONI_IOS_SKIPBACKWARD_OUTLINE('\uf4aa'),
        IONI_IOS_SKIPFORWARD('\uf4ad'),
        IONI_IOS_SKIPFORWARD_OUTLINE('\uf4ac'),
        IONI_IOS_SNOWY('\uf4ae'),
        IONI_IOS_SPEEDOMETER('\uf4b0'),
        IONI_IOS_SPEEDOMETER_OUTLINE('\uf4af'),
        IONI_IOS_STAR('\uf4b3'),
        IONI_IOS_STAR_HALF('\uf4b1'),
        IONI_IOS_STAR_OUTLINE('\uf4b2'),
        IONI_IOS_STOPWATCH('\uf4b5'),
        IONI_IOS_STOPWATCH_OUTLINE('\uf4b4'),
        IONI_IOS_SUNNY('\uf4b7'),
        IONI_IOS_SUNNY_OUTLINE('\uf4b6'),
        IONI_IOS_TELEPHONE('\uf4b9'),
        IONI_IOS_TELEPHONE_OUTLINE('\uf4b8'),
        IONI_IOS_TENNISBALL('\uf4bb'),
        IONI_IOS_TENNISBALL_OUTLINE('\uf4ba'),
        IONI_IOS_THUNDERSTORM('\uf4bd'),
        IONI_IOS_THUNDERSTORM_OUTLINE('\uf4bc'),
        IONI_IOS_TIME('\uf4bf'),
        IONI_IOS_TIME_OUTLINE('\uf4be'),
        IONI_IOS_TIMER('\uf4c1'),
        IONI_IOS_TIMER_OUTLINE('\uf4c0'),
        IONI_IOS_TOGGLE('\uf4c3'),
        IONI_IOS_TOGGLE_OUTLINE('\uf4c2'),
        IONI_IOS_TRASH('\uf4c5'),
        IONI_IOS_TRASH_OUTLINE('\uf4c4'),
        IONI_IOS_UNDO('\uf4c7'),
        IONI_IOS_UNDO_OUTLINE('\uf4c6'),
        IONI_IOS_UNLOCKED('\uf4c9'),
        IONI_IOS_UNLOCKED_OUTLINE('\uf4c8'),
        IONI_IOS_UPLOAD('\uf4cb'),
        IONI_IOS_UPLOAD_OUTLINE('\uf4ca'),
        IONI_IOS_VIDEOCAM('\uf4cd'),
        IONI_IOS_VIDEOCAM_OUTLINE('\uf4cc'),
        IONI_IOS_VOLUME_HIGH('\uf4ce'),
        IONI_IOS_VOLUME_LOW('\uf4cf'),
        IONI_IOS_WINEGLASS('\uf4d1'),
        IONI_IOS_WINEGLASS_OUTLINE('\uf4d0'),
        IONI_IOS_WORLD('\uf4d3'),
        IONI_IOS_WORLD_OUTLINE('\uf4d2'),
        IONI_IPAD('\uf1f9'),
        IONI_IPHONE('\uf1fa'),
        IONI_IPOD('\uf1fb'),
        IONI_JET('\uf295'),
        IONI_KEY('\uf296'),
        IONI_KNIFE('\uf297'),
        IONI_LAPTOP('\uf1fc'),
        IONI_LEAF('\uf1fd'),
        IONI_LEVELS('\uf298'),
        IONI_LIGHTBULB('\uf299'),
        IONI_LINK('\uf1fe'),
        IONI_LOAD_A('\uf29a'),
        IONI_LOAD_B('\uf29b'),
        IONI_LOAD_C('\uf29c'),
        IONI_LOAD_D('\uf29d'),
        IONI_LOCATION('\uf1ff'),
        IONI_LOCK_COMBINATION('\uf4d4'),
        IONI_LOCKED('\uf200'),
        IONI_LOG_IN('\uf29e'),
        IONI_LOG_OUT('\uf29f'),
        IONI_LOOP('\uf201'),
        IONI_MAGNET('\uf2a0'),
        IONI_MALE('\uf2a1'),
        IONI_MAN('\uf202'),
        IONI_MAP('\uf203'),
        IONI_MEDKIT('\uf2a2'),
        IONI_MERGE('\uf33f'),
        IONI_MIC_A('\uf204'),
        IONI_MIC_B('\uf205'),
        IONI_MIC_C('\uf206'),
        IONI_MINUS('\uf209'),
        IONI_MINUS_CIRCLED('\uf207'),
        IONI_MINUS_ROUND('\uf208'),
        IONI_MODEL_S('\uf2c1'),
        IONI_MONITOR('\uf20a'),
        IONI_MORE('\uf20b'),
        IONI_MOUSE('\uf340'),
        IONI_MUSIC_NOTE('\uf20c'),
        IONI_NAVICON('\uf20e'),
        IONI_NAVICON_ROUND('\uf20d'),
        IONI_NAVIGATE('\uf2a3'),
        IONI_NETWORK('\uf341'),
        IONI_NO_SMOKING('\uf2c2'),
        IONI_NUCLEAR('\uf2a4'),
        IONI_OUTLET('\uf342'),
        IONI_PAINTBRUSH('\uf4d5'),
        IONI_PAINTBUCKET('\uf4d6'),
        IONI_PAPER_AIRPLANE('\uf2c3'),
        IONI_PAPERCLIP('\uf20f'),
        IONI_PAUSE('\uf210'),
        IONI_PERSON('\uf213'),
        IONI_PERSON_ADD('\uf211'),
        IONI_PERSON_STALKER('\uf212'),
        IONI_PIE_GRAPH('\uf2a5'),
        IONI_PIN('\uf2a6'),
        IONI_PINPOINT('\uf2a7'),
        IONI_PIZZA('\uf2a8'),
        IONI_PLANE('\uf214'),
        IONI_PLANET('\uf343'),
        IONI_PLAY('\uf215'),
        IONI_PLAYSTATION('\uf30a'),
        IONI_PLUS('\uf218'),
        IONI_PLUS_CIRCLED('\uf216'),
        IONI_PLUS_ROUND('\uf217'),
        IONI_PODIUM('\uf344'),
        IONI_POUND('\uf219'),
        IONI_POWER('\uf2a9'),
        IONI_PRICETAG('\uf2aa'),
        IONI_PRICETAGS('\uf2ab'),
        IONI_PRINTER('\uf21a'),
        IONI_PULL_REQUEST('\uf345'),
        IONI_QR_SCANNER('\uf346'),
        IONI_QUOTE('\uf347'),
        IONI_RADIO_WAVES('\uf2ac'),
        IONI_RECORD('\uf21b'),
        IONI_REFRESH('\uf21c'),
        IONI_REPLY('\uf21e'),
        IONI_REPLY_ALL('\uf21d'),
        IONI_RIBBON_A('\uf348'),
        IONI_RIBBON_B('\uf349'),
        IONI_SAD('\uf34a'),
        IONI_SAD_OUTLINE('\uf4d7'),
        IONI_SCISSORS('\uf34b'),
        IONI_SEARCH('\uf21f'),
        IONI_SETTINGS('\uf2ad'),
        IONI_SHARE('\uf220'),
        IONI_SHUFFLE('\uf221'),
        IONI_SKIP_BACKWARD('\uf222'),
        IONI_SKIP_FORWARD('\uf223'),
        IONI_SOCIAL_ANGULAR('\uf4d9'),
        IONI_SOCIAL_ANGULAR_OUTLINE('\uf4d8'),
        IONI_SOCIAL_APPLE('\uf227'),
        IONI_SOCIAL_APPLE_OUTLINE('\uf226'),
        IONI_SOCIAL_BITCOIN('\uf2af'),
        IONI_SOCIAL_BITCOIN_OUTLINE('\uf2ae'),
        IONI_SOCIAL_BUFFER('\uf229'),
        IONI_SOCIAL_BUFFER_OUTLINE('\uf228'),
        IONI_SOCIAL_CHROME('\uf4db'),
        IONI_SOCIAL_CHROME_OUTLINE('\uf4da'),
        IONI_SOCIAL_CODEPEN('\uf4dd'),
        IONI_SOCIAL_CODEPEN_OUTLINE('\uf4dc'),
        IONI_SOCIAL_CSS3('\uf4df'),
        IONI_SOCIAL_CSS3_OUTLINE('\uf4de'),
        IONI_SOCIAL_DESIGNERNEWS('\uf22b'),
        IONI_SOCIAL_DESIGNERNEWS_OUTLINE('\uf22a'),
        IONI_SOCIAL_DRIBBBLE('\uf22d'),
        IONI_SOCIAL_DRIBBBLE_OUTLINE('\uf22c'),
        IONI_SOCIAL_DROPBOX('\uf22f'),
        IONI_SOCIAL_DROPBOX_OUTLINE('\uf22e'),
        IONI_SOCIAL_EURO('\uf4e1'),
        IONI_SOCIAL_EURO_OUTLINE('\uf4e0'),
        IONI_SOCIAL_FACEBOOK('\uf231'),
        IONI_SOCIAL_FACEBOOK_OUTLINE('\uf230'),
        IONI_SOCIAL_FOURSQUARE('\uf34d'),
        IONI_SOCIAL_FOURSQUARE_OUTLINE('\uf34c'),
        IONI_SOCIAL_FREEBSD_DEVIL('\uf2c4'),
        IONI_SOCIAL_GITHUB('\uf233'),
        IONI_SOCIAL_GITHUB_OUTLINE('\uf232'),
        IONI_SOCIAL_GOOGLE('\uf34f'),
        IONI_SOCIAL_GOOGLE_OUTLINE('\uf34e'),
        IONI_SOCIAL_GOOGLEPLUS('\uf235'),
        IONI_SOCIAL_GOOGLEPLUS_OUTLINE('\uf234'),
        IONI_SOCIAL_HACKERNEWS('\uf237'),
        IONI_SOCIAL_HACKERNEWS_OUTLINE('\uf236'),
        IONI_SOCIAL_HTML5('\uf4e3'),
        IONI_SOCIAL_HTML5_OUTLINE('\uf4e2'),
        IONI_SOCIAL_INSTAGRAM('\uf351'),
        IONI_SOCIAL_INSTAGRAM_OUTLINE('\uf350'),
        IONI_SOCIAL_JAVASCRIPT('\uf4e5'),
        IONI_SOCIAL_JAVASCRIPT_OUTLINE('\uf4e4'),
        IONI_SOCIAL_LINKEDIN('\uf239'),
        IONI_SOCIAL_LINKEDIN_OUTLINE('\uf238'),
        IONI_SOCIAL_MARKDOWN('\uf4e6'),
        IONI_SOCIAL_NODEJS('\uf4e7'),
        IONI_SOCIAL_OCTOCAT('\uf4e8'),
        IONI_SOCIAL_PINTEREST('\uf2b1'),
        IONI_SOCIAL_PINTEREST_OUTLINE('\uf2b0'),
        IONI_SOCIAL_PYTHON('\uf4e9'),
        IONI_SOCIAL_REDDIT('\uf23b'),
        IONI_SOCIAL_REDDIT_OUTLINE('\uf23a'),
        IONI_SOCIAL_RSS('\uf23d'),
        IONI_SOCIAL_RSS_OUTLINE('\uf23c'),
        IONI_SOCIAL_SASS('\uf4ea'),
        IONI_SOCIAL_SKYPE('\uf23f'),
        IONI_SOCIAL_SKYPE_OUTLINE('\uf23e'),
        IONI_SOCIAL_SNAPCHAT('\uf4ec'),
        IONI_SOCIAL_SNAPCHAT_OUTLINE('\uf4eb'),
        IONI_SOCIAL_TUMBLR('\uf241'),
        IONI_SOCIAL_TUMBLR_OUTLINE('\uf240'),
        IONI_SOCIAL_TUX('\uf2c5'),
        IONI_SOCIAL_TWITCH('\uf4ee'),
        IONI_SOCIAL_TWITCH_OUTLINE('\uf4ed'),
        IONI_SOCIAL_TWITTER('\uf243'),
        IONI_SOCIAL_TWITTER_OUTLINE('\uf242'),
        IONI_SOCIAL_USD('\uf353'),
        IONI_SOCIAL_USD_OUTLINE('\uf352'),
        IONI_SOCIAL_VIMEO('\uf245'),
        IONI_SOCIAL_VIMEO_OUTLINE('\uf244'),
        IONI_SOCIAL_WHATSAPP('\uf4f0'),
        IONI_SOCIAL_WHATSAPP_OUTLINE('\uf4ef'),
        IONI_SOCIAL_WINDOWS('\uf247'),
        IONI_SOCIAL_WINDOWS_OUTLINE('\uf246'),
        IONI_SOCIAL_WORDPRESS('\uf249'),
        IONI_SOCIAL_WORDPRESS_OUTLINE('\uf248'),
        IONI_SOCIAL_YAHOO('\uf24b'),
        IONI_SOCIAL_YAHOO_OUTLINE('\uf24a'),
        IONI_SOCIAL_YEN('\uf4f2'),
        IONI_SOCIAL_YEN_OUTLINE('\uf4f1'),
        IONI_SOCIAL_YOUTUBE('\uf24d'),
        IONI_SOCIAL_YOUTUBE_OUTLINE('\uf24c'),
        IONI_SOUP_CAN('\uf4f4'),
        IONI_SOUP_CAN_OUTLINE('\uf4f3'),
        IONI_SPEAKERPHONE('\uf2b2'),
        IONI_SPEEDOMETER('\uf2b3'),
        IONI_SPOON('\uf2b4'),
        IONI_STAR('\uf24e'),
        IONI_STATS_BARS('\uf2b5'),
        IONI_STEAM('\uf30b'),
        IONI_STOP('\uf24f'),
        IONI_THERMOMETER('\uf2b6'),
        IONI_THUMBSDOWN('\uf250'),
        IONI_THUMBSUP('\uf251'),
        IONI_TOGGLE('\uf355'),
        IONI_TOGGLE_FILLED('\uf354'),
        IONI_TRANSGENDER('\uf4f5'),
        IONI_TRASH_A('\uf252'),
        IONI_TRASH_B('\uf253'),
        IONI_TROPHY('\uf356'),
        IONI_TSHIRT('\uf4f7'),
        IONI_TSHIRT_OUTLINE('\uf4f6'),
        IONI_UMBRELLA('\uf2b7'),
        IONI_UNIVERSITY('\uf357'),
        IONI_UNLOCKED('\uf254'),
        IONI_UPLOAD('\uf255'),
        IONI_USB('\uf2b8'),
        IONI_VIDEOCAMERA('\uf256'),
        IONI_VOLUME_HIGH('\uf257'),
        IONI_VOLUME_LOW('\uf258'),
        IONI_VOLUME_MEDIUM('\uf259'),
        IONI_VOLUME_MUTE('\uf25a'),
        IONI_WAND('\uf358'),
        IONI_WATERDROP('\uf25b'),
        IONI_WIFI('\uf25c'),
        IONI_WINEGLASS('\uf2b9'),
        IONI_WOMAN('\uf25d'),
        IONI_WRENCH('\uf2ba'),
        IONI_XBOX('\uf30c');

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
        private static ITypeface ioniconsTypeface;

        @Override
        public ITypeface getTypeface() {
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
