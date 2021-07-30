package com.rilixtech.fontawesometypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the FontAwesome font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class FontAwesome implements MfbTypeface {
    private static final String TTF_FILE = "fontawesome-font-v4.7.ttf";
    private static final String FONT_AWESOME_PREFIX = "FAWI";
    public static final String FONT_AWESOME_NAME = "FontAwesome";
    public static final String FONT_AWESOME_VERSION = "4" + ".7.0.0";
    public static final String FONT_AWESOME_AUTHOR = "Dave Gandy";
    public static final String FONT_AWESOME_URL = "https://github.com/FortAwesome/Font-Awesome";
    public static final String FONT_AWESOME_DESC = "Font Awesome is a full suite of 675 pictographic icons for easy"
            + " scalable vector graphics on websites, created and maintained by Dave Gandy."
            + " Stay up to date @fontawesome.";
    public static final String FONT_AWESOME_LICENSE = "SIL OFL 1.1";
    public static final String FONT_AWESOME_LICENSE_URL = "http://scripts.sil.org/OFL";

    private static Font fontAwesomeTypeface = null;

    private static HashMap<String, Character> fontAwesomeCharMap;

    /**
     * FontAwesome MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which FontAwesome MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the FontAwesome icon characters in a HashMap.
     *
     * @return HashMap of all FontAwesome icon character names mapped to their character values.
     */
    @Override
    public HashMap<String, Character> getCharacters() {
        if (fontAwesomeCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(),
                        v.fontAwesomeCharacter);
            }
            setChars(characterHashMap);
        }

        return fontAwesomeCharMap;
    }

    /**
     * Set the FontAwesome Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        fontAwesomeCharMap = characterHashMap;
    }

    /**
     * Return the FontAwesome Mapping Prefix.
     *
     * @return FontAwesome Mapping Prefix, used by all FontAwesome icons.
     */
    @Override public String getMappingPrefix() {
        return FONT_AWESOME_PREFIX;
    }

    @Override public String getFontName() {
        return FONT_AWESOME_NAME;
    }

    @Override public String getVersion() {
        return FONT_AWESOME_VERSION;
    }

    @Override public int getIconCount() {
        return fontAwesomeCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> fontAwesomeKeyList = new LinkedList<>();

        for (Icon value : Icon.values()) {
            fontAwesomeKeyList.add(value.name());
        }

        return fontAwesomeKeyList;
    }

    @Override public String getAuthor() {
        return FONT_AWESOME_AUTHOR;
    }

    @Override public String getUrl() {
        return FONT_AWESOME_URL;
    }

    @Override public String getDescription() {
        return FONT_AWESOME_DESC;
    }

    @Override public String getLicense() {
        return FONT_AWESOME_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return FONT_AWESOME_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (fontAwesomeTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return fontAwesomeTypeface;
    }

    private static void cacheTypeface(Font font) {
        fontAwesomeTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by FontAwesome MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        FAWI_GLASS((char) 0xf000),
        FAWI_MUSIC((char) 0xf001),
        FAWI_SEARCH((char) 0xf002),
        FAWI_ENVELOPE_O((char) 0xf003),
        FAWI_HEART((char) 0xf004),
        FAWI_STAR((char) 0xf005),
        FAWI_STAR_O((char) 0xf006),
        FAWI_USER((char) 0xf007),
        FAWI_FILM((char) 0xf008),
        FAWI_TH_LARGE((char) 0xf009),
        FAWI_TH((char) 0xf00a),
        FAWI_TH_LIST((char) 0xf00b),
        FAWI_CHECK((char) 0xf00c),
        FAWI_TIMES((char) 0xf00d),
        FAWI_SEARCH_PLUS((char) 0xf00e),
        FAWI_SEARCH_MINUS((char) 0xf010),
        FAWI_POWER_OFF((char) 0xf011),
        FAWI_SIGNAL((char) 0xf012),
        FAWI_COG((char) 0xf013),
        FAWI_TRASH_O((char) 0xf014),
        FAWI_HOME((char) 0xf015),
        FAWI_FILE_O((char) 0xf016),
        FAWI_CLOCK_O((char) 0xf017),
        FAWI_ROAD((char) 0xf018),
        FAWI_DOWNLOAD((char) 0xf019),
        FAWI_ARROW_CIRCLE_O_DOWN((char) 0xf01a),
        FAWI_ARROW_CIRCLE_O_UP((char) 0xf01b),
        FAWI_INBOX((char) 0xf01c),
        FAWI_PLAY_CIRCLE_O((char) 0xf01d),
        FAWI_REPEAT((char) 0xf01e),
        FAWI_REFRESH((char) 0xf021),
        FAWI_LIST_ALT((char) 0xf022),
        FAWI_LOCK((char) 0xf023),
        FAWI_FLAG((char) 0xf024),
        FAWI_HEADPHONES((char) 0xf025),
        FAWI_VOLUME_OFF((char) 0xf026),
        FAWI_VOLUME_DOWN((char) 0xf027),
        FAWI_VOLUME_UP((char) 0xf028),
        FAWI_QRCODE((char) 0xf029),
        FAWI_BARCODE((char) 0xf02a),
        FAWI_TAG((char) 0xf02b),
        FAWI_TAGS((char) 0xf02c),
        FAWI_BOOK((char) 0xf02d),
        FAWI_BOOKMARK((char) 0xf02e),
        FAWI_PRINT((char) 0xf02f),
        FAWI_CAMERA((char) 0xf030),
        FAWI_FONT((char) 0xf031),
        FAWI_BOLD((char) 0xf032),
        FAWI_ITALIC((char) 0xf033),
        FAWI_TEXT_HEIGHT((char) 0xf034),
        FAWI_TEXT_WIDTH((char) 0xf035),
        FAWI_ALIGN_LEFT((char) 0xf036),
        FAWI_ALIGN_CENTER((char) 0xf037),
        FAWI_ALIGN_RIGHT((char) 0xf038),
        FAWI_ALIGN_JUSTIFY((char) 0xf039),
        FAWI_LIST((char) 0xf03a),
        FAWI_OUTDENT((char) 0xf03b),
        FAWI_INDENT((char) 0xf03c),
        FAWI_VIDEO_CAMERA((char) 0xf03d),
        FAWI_PICTURE_O((char) 0xf03e),
        FAWI_PENCIL((char) 0xf040),
        FAWI_MAP_MARKER((char) 0xf041),
        FAWI_ADJUST((char) 0xf042),
        FAWI_TINT((char) 0xf043),
        FAWI_PENCIL_SQUARE_O((char) 0xf044),
        FAWI_SHARE_SQUARE_O((char) 0xf045),
        FAWI_CHECK_SQUARE_O((char) 0xf046),
        FAWI_ARROWS((char) 0xf047),
        FAWI_STEP_BACKWARD((char) 0xf048),
        FAWI_FAST_BACKWARD((char) 0xf049),
        FAWI_BACKWARD((char) 0xf04a),
        FAWI_PLAY((char) 0xf04b),
        FAWI_PAUSE((char) 0xf04c),
        FAWI_STOP((char) 0xf04d),
        FAWI_FORWARD((char) 0xf04e),
        FAWI_FAST_FORWARD((char) 0xf050),
        FAWI_STEP_FORWARD((char) 0xf051),
        FAWI_EJECT((char) 0xf052),
        FAWI_CHEVRON_LEFT((char) 0xf053),
        FAWI_CHEVRON_RIGHT((char) 0xf054),
        FAWI_PLUS_CIRCLE((char) 0xf055),
        FAWI_MINUS_CIRCLE((char) 0xf056),
        FAWI_TIMES_CIRCLE((char) 0xf057),
        FAWI_CHECK_CIRCLE((char) 0xf058),
        FAWI_QUESTION_CIRCLE((char) 0xf059),
        FAWI_INFO_CIRCLE((char) 0xf05a),
        FAWI_CROSSHAIRS((char) 0xf05b),
        FAWI_TIMES_CIRCLE_O((char) 0xf05c),
        FAWI_CHECK_CIRCLE_O((char) 0xf05d),
        FAWI_BAN((char) 0xf05e),
        FAWI_ARROW_LEFT((char) 0xf060),
        FAWI_ARROW_RIGHT((char) 0xf061),
        FAWI_ARROW_UP((char) 0xf062),
        FAWI_ARROW_DOWN((char) 0xf063),
        FAWI_SHARE((char) 0xf064),
        FAWI_EXPAND((char) 0xf065),
        FAWI_COMPRESS((char) 0xf066),
        FAWI_PLUS((char) 0xf067),
        FAWI_MINUS((char) 0xf068),
        FAWI_ASTERISK((char) 0xf069),
        FAWI_EXCLAMATION_CIRCLE((char) 0xf06a),
        FAWI_GIFT((char) 0xf06b),
        FAWI_LEAF((char) 0xf06c),
        FAWI_FIRE((char) 0xf06d),
        FAWI_EYE((char) 0xf06e),
        FAWI_EYE_SLASH((char) 0xf070),
        FAWI_EXCLAMATION_TRIANGLE((char) 0xf071),
        FAWI_PLANE((char) 0xf072),
        FAWI_CALENDAR((char) 0xf073),
        FAWI_RANDOM((char) 0xf074),
        FAWI_COMMENT((char) 0xf075),
        FAWI_MAGNET((char) 0xf076),
        FAWI_CHEVRON_UP((char) 0xf077),
        FAWI_CHEVRON_DOWN((char) 0xf078),
        FAWI_RETWEET((char) 0xf079),
        FAWI_SHOPPING_CART((char) 0xf07a),
        FAWI_FOLDER((char) 0xf07b),
        FAWI_FOLDER_OPEN((char) 0xf07c),
        FAWI_ARROWS_V((char) 0xf07d),
        FAWI_ARROWS_H((char) 0xf07e),
        FAWI_BAR_CHART((char) 0xf080),
        FAWI_TWITTER_SQUARE((char) 0xf081),
        FAWI_FACEBOOK_SQUARE((char) 0xf082),
        FAWI_CAMERA_RETRO((char) 0xf083),
        FAWI_KEY((char) 0xf084),
        FAWI_COGS((char) 0xf085),
        FAWI_COMMENTS((char) 0xf086),
        FAWI_THUMBS_O_UP((char) 0xf087),
        FAWI_THUMBS_O_DOWN((char) 0xf088),
        FAWI_STAR_HALF((char) 0xf089),
        FAWI_HEART_O((char) 0xf08a),
        FAWI_SIGN_OUT((char) 0xf08b),
        FAWI_LINKEDIN_SQUARE((char) 0xf08c),
        FAWI_THUMB_TACK((char) 0xf08d),
        FAWI_EXTERNAL_LINK((char) 0xf08e),
        FAWI_SIGN_IN((char) 0xf090),
        FAWI_TROPHY((char) 0xf091),
        FAWI_GITHUB_SQUARE((char) 0xf092),
        FAWI_UPLOAD((char) 0xf093),
        FAWI_LEMON_O((char) 0xf094),
        FAWI_PHONE((char) 0xf095),
        FAWI_SQUARE_O((char) 0xf096),
        FAWI_BOOKMARK_O((char) 0xf097),
        FAWI_PHONE_SQUARE((char) 0xf098),
        FAWI_TWITTER((char) 0xf099),
        FAWI_FACEBOOK((char) 0xf09a),
        FAWI_GITHUB((char) 0xf09b),
        FAWI_UNLOCK((char) 0xf09c),
        FAWI_CREDIT_CARD((char) 0xf09d),
        FAWI_RSS((char) 0xf09e),
        FAWI_HDD_O((char) 0xf0a0),
        FAWI_BULLHORN((char) 0xf0a1),
        FAWI_BELL_O((char) 0xf0a2),
        FAWI_CERTIFICATE((char) 0xf0a3),
        FAWI_HAND_O_RIGHT((char) 0xf0a4),
        FAWI_HAND_O_LEFT((char) 0xf0a5),
        FAWI_HAND_O_UP((char) 0xf0a6),
        FAWI_HAND_O_DOWN((char) 0xf0a7),
        FAWI_ARROW_CIRCLE_LEFT((char) 0xf0a8),
        FAWI_ARROW_CIRCLE_RIGHT((char) 0xf0a9),
        FAWI_ARROW_CIRCLE_UP((char) 0xf0aa),
        FAWI_ARROW_CIRCLE_DOWN((char) 0xf0ab),
        FAWI_GLOBE((char) 0xf0ac),
        FAWI_WRENCH((char) 0xf0ad),
        FAWI_TASKS((char) 0xf0ae),
        FAWI_FILTER((char) 0xf0b0),
        FAWI_BRIEFCASE((char) 0xf0b1),
        FAWI_ARROWS_ALT((char) 0xf0b2),
        FAWI_USERS((char) 0xf0c0),
        FAWI_LINK((char) 0xf0c1),
        FAWI_CLOUD((char) 0xf0c2),
        FAWI_FLASK((char) 0xf0c3),
        FAWI_SCISSORS((char) 0xf0c4),
        FAWI_FILES_O((char) 0xf0c5),
        FAWI_PAPERCLIP((char) 0xf0c6),
        FAWI_FLOPPY_O((char) 0xf0c7),
        FAWI_SQUARE((char) 0xf0c8),
        FAWI_BARS((char) 0xf0c9),
        FAWI_LIST_UL((char) 0xf0ca),
        FAWI_LIST_OL((char) 0xf0cb),
        FAWI_STRIKETHROUGH((char) 0xf0cc),
        FAWI_UNDERLINE((char) 0xf0cd),
        FAWI_TABLE((char) 0xf0ce),
        FAWI_MAGIC((char) 0xf0d0),
        FAWI_TRUCK((char) 0xf0d1),
        FAWI_PINTEREST((char) 0xf0d2),
        FAWI_PINTEREST_SQUARE((char) 0xf0d3),
        FAWI_GOOGLE_PLUS_SQUARE((char) 0xf0d4),
        FAWI_GOOGLE_PLUS((char) 0xf0d5),
        FAWI_MONEY((char) 0xf0d6),
        FAWI_CARET_DOWN((char) 0xf0d7),
        FAWI_CARET_UP((char) 0xf0d8),
        FAWI_CARET_LEFT((char) 0xf0d9),
        FAWI_CARET_RIGHT((char) 0xf0da),
        FAWI_COLUMNS((char) 0xf0db),
        FAWI_SORT((char) 0xf0dc),
        FAWI_SORT_DESC((char) 0xf0dd),
        FAWI_SORT_ASC((char) 0xf0de),
        FAWI_ENVELOPE((char) 0xf0e0),
        FAWI_LINKEDIN((char) 0xf0e1),
        FAWI_UNDO((char) 0xf0e2),
        FAWI_GAVEL((char) 0xf0e3),
        FAWI_TACHOMETER((char) 0xf0e4),
        FAWI_COMMENTI_O((char) 0xf0e5),
        FAWI_COMMENTS_O((char) 0xf0e6),
        FAWI_BOLT((char) 0xf0e7),
        FAWI_SITEMAP((char) 0xf0e8),
        FAWI_UMBRELLA((char) 0xf0e9),
        FAWI_CLIPBOARD((char) 0xf0ea),
        FAWI_LIGHTBULB_O((char) 0xf0eb),
        FAWI_EXCHANGE((char) 0xf0ec),
        FAWI_CLOUD_DOWNLOAD((char) 0xf0ed),
        FAWI_CLOUD_UPLOAD((char) 0xf0ee),
        FAWI_USER_MD((char) 0xf0f0),
        FAWI_STETHOSCOPE((char) 0xf0f1),
        FAWI_SUITCASE((char) 0xf0f2),
        FAWI_BELL((char) 0xf0f3),
        FAWI_COFFEE((char) 0xf0f4),
        FAWI_CUTLERY((char) 0xf0f5),
        FAWI_FILE_TEXT_O((char) 0xf0f6),
        FAWI_BUILDING_O((char) 0xf0f7),
        FAWI_HOSPITAL_O((char) 0xf0f8),
        FAWI_AMBULANCE((char) 0xf0f9),
        FAWI_MEDKIT((char) 0xf0fa),
        FAWI_FIGHTER_JET((char) 0xf0fb),
        FAWI_BEER((char) 0xf0fc),
        FAWI_H_SQUARE((char) 0xf0fd),
        FAWI_PLUS_SQUARE((char) 0xf0fe),
        FAWI_ANGLE_DOUBLE_LEFT((char) 0xf100),
        FAWI_ANGLE_DOUBLE_RIGHT((char) 0xf101),
        FAWI_ANGLE_DOUBLE_UP((char) 0xf102),
        FAWI_ANGLE_DOUBLE_DOWN((char) 0xf103),
        FAWI_ANGLE_LEFT((char) 0xf104),
        FAWI_ANGLE_RIGHT((char) 0xf105),
        FAWI_ANGLE_UP((char) 0xf106),
        FAWI_ANGLE_DOWN((char) 0xf107),
        FAWI_DESKTOP((char) 0xf108),
        FAWI_LAPTOP((char) 0xf109),
        FAWI_TABLET((char) 0xf10a),
        FAWI_MOBILE((char) 0xf10b),
        FAWI_CIRCLE_O((char) 0xf10c),
        FAWI_QUOTE_LEFT((char) 0xf10d),
        FAWI_QUOTE_RIGHT((char) 0xf10e),
        FAWI_SPINNER((char) 0xf110),
        FAWI_CIRCLE((char) 0xf111),
        FAWI_REPLY((char) 0xf112),
        FAWI_GITHUB_ALT((char) 0xf113),
        FAWI_FOLDER_O((char) 0xf114),
        FAWI_FOLDER_OPEN_O((char) 0xf115),
        FAWI_SMILE_O((char) 0xf118),
        FAWI_FROWN_O((char) 0xf119),
        FAWI_MEH_O((char) 0xf11a),
        FAWI_GAMEPAD((char) 0xf11b),
        FAWI_KEYBOARD_O((char) 0xf11c),
        FAWI_FLAG_O((char) 0xf11d),
        FAWI_FLAG_CHECKERED((char) 0xf11e),
        FAWI_TERMINAL((char) 0xf120),
        FAWI_CODE((char) 0xf121),
        FAWI_REPLY_ALL((char) 0xf122),
        FAWI_STAR_HALF_O((char) 0xf123),
        FAWI_LOCATION_ARROW((char) 0xf124),
        FAWI_CROP((char) 0xf125),
        FAWI_CODE_FORK((char) 0xf126),
        FAWI_CHAIN_BROKEN((char) 0xf127),
        FAWI_QUESTION((char) 0xf128),
        FAWI_INFO((char) 0xf129),
        FAWI_EXCLAMATION((char) 0xf12a),
        FAWI_SUPERSCRIPT((char) 0xf12b),
        FAWI_SUBSCRIPT((char) 0xf12c),
        FAWI_ERASER((char) 0xf12d),
        FAWI_PUZZLE_PIECE((char) 0xf12e),
        FAWI_MICROPHONE((char) 0xf130),
        FAWI_MICROPHONE_SLASH((char) 0xf131),
        FAWI_SHIELD((char) 0xf132),
        FAWI_CALENDAR_O((char) 0xf133),
        FAWI_FIRE_EXTINGUISHER((char) 0xf134),
        FAWI_ROCKET((char) 0xf135),
        FAWI_MAXCDN((char) 0xf136),
        FAWI_CHEVRON_CIRCLE_LEFT((char) 0xf137),
        FAWI_CHEVRON_CIRCLE_RIGHT((char) 0xf138),
        FAWI_CHEVRON_CIRCLE_UP((char) 0xf139),
        FAWI_CHEVRON_CIRCLE_DOWN((char) 0xf13a),
        FAWI_HTML5((char) 0xf13b),
        FAWI_CSS3((char) 0xf13c),
        FAWI_ANCHOR((char) 0xf13d),
        FAWI_UNLOCK_ALT((char) 0xf13e),
        FAWI_BULLSEYE((char) 0xf140),
        FAWI_ELLIPSIS_H((char) 0xf141),
        FAWI_ELLIPSIS_V((char) 0xf142),
        FAWI_RSS_SQUARE((char) 0xf143),
        FAWI_PLAY_CIRCLE((char) 0xf144),
        FAWI_TICKET((char) 0xf145),
        FAWI_MINUS_SQUARE((char) 0xf146),
        FAWI_MINUS_SQUARE_O((char) 0xf147),
        FAWI_LEVEL_UP((char) 0xf148),
        FAWI_LEVEL_DOWN((char) 0xf149),
        FAWI_CHECK_SQUARE((char) 0xf14a),
        FAWI_PENCIL_SQUARE((char) 0xf14b),
        FAWI_EXTERNAL_LINK_SQUARE((char) 0xf14c),
        FAWI_SHARE_SQUARE((char) 0xf14d),
        FAWI_COMPASS((char) 0xf14e),
        FAWI_CARET_SQUARE_O_DOWN((char) 0xf150),
        FAWI_CARET_SQUARE_O_UP((char) 0xf151),
        FAWI_CARET_SQUARE_O_RIGHT((char) 0xf152),
        FAWI_EUR((char) 0xf153),
        FAWI_GBP((char) 0xf154),
        FAWI_USD((char) 0xf155),
        FAWI_INR((char) 0xf156),
        FAWI_JPY((char) 0xf157),
        FAWI_RUB((char) 0xf158),
        FAWI_KRW((char) 0xf159),
        FAWI_BTC((char) 0xf15a),
        FAWI_FILE((char) 0xf15b),
        FAWI_FILE_TEXT((char) 0xf15c),
        FAWI_SORT_ALPHA_ASC((char) 0xf15d),
        FAWI_SORT_ALPHA_DESC((char) 0xf15e),
        FAWI_SORT_AMOUNT_ASC((char) 0xf160),
        FAWI_SORT_AMOUNT_DESC((char) 0xf161),
        FAWI_SORT_NUMERIC_ASC((char) 0xf162),
        FAWI_SORT_NUMERIC_DESC((char) 0xf163),
        FAWI_THUMBS_UP((char) 0xf164),
        FAWI_THUMBS_DOWN((char) 0xf165),
        FAWI_YOUTUBE_SQUARE((char) 0xf166),
        FAWI_YOUTUBE((char) 0xf167),
        FAWI_XING((char) 0xf168),
        FAWI_XING_SQUARE((char) 0xf169),
        FAWI_YOUTUBE_PLAY((char) 0xf16a),
        FAWI_DROPBOX((char) 0xf16b),
        FAWI_STACK_OVERFLOW((char) 0xf16c),
        FAWI_INSTAGRAM((char) 0xf16d),
        FAWI_FLICKR((char) 0xf16e),
        FAWI_ADN((char) 0xf170),
        FAWI_BITBUCKET((char) 0xf171),
        FAWI_BITBUCKET_SQUARE((char) 0xf172),
        FAWI_TUMBLR((char) 0xf173),
        FAWI_TUMBLR_SQUARE((char) 0xf174),
        FAWI_LONG_ARROW_DOWN((char) 0xf175),
        FAWI_LONG_ARROW_UP((char) 0xf176),
        FAWI_LONG_ARROW_LEFT((char) 0xf177),
        FAWI_LONG_ARROW_RIGHT((char) 0xf178),
        FAWI_APPLE((char) 0xf179),
        FAWI_WINDOWS((char) 0xf17a),
        FAWI_LINUX((char) 0xf17c),
        FAWI_DRIBBBLE((char) 0xf17d),
        FAWI_SKYPE((char) 0xf17e),
        FAWI_FOURSQUARE((char) 0xf180),
        FAWI_TRELLO((char) 0xf181),
        FAWI_FEMALE((char) 0xf182),
        FAWI_MALE((char) 0xf183),
        FAWI_GRATIPAY((char) 0xf184),
        FAWI_SUN_O((char) 0xf185),
        FAWI_MOON_O((char) 0xf186),
        FAWI_ARCHIVE((char) 0xf187),
        FAWI_BUG((char) 0xf188),
        FAWI_VK((char) 0xf189),
        FAWI_WEIBO((char) 0xf18a),
        FAWI_RENREN((char) 0xf18b),
        FAWI_PAGELINES((char) 0xf18c),
        FAWI_STACK_EXCHANGE((char) 0xf18d),
        FAWI_ARROW_CIRCLE_O_RIGHT((char) 0xf18e),
        FAWI_ARROW_CIRCLE_O_LEFT((char) 0xf190),
        FAWI_CARET_SQUARE_O_LEFT((char) 0xf191),
        FAWI_DOT_CIRCLE_O((char) 0xf192),
        FAWI_WHEELCHAIR((char) 0xf193),
        FAWI_VIMEO_SQUARE((char) 0xf194),
        FAWI_TRY((char) 0xf195),
        FAWI_PLUS_SQUARE_O((char) 0xf196),
        FAWI_SPACE_SHUTTLE((char) 0xf197),
        FAWI_SLACK((char) 0xf198),
        FAWI_ENVELOPE_SQUARE((char) 0xf199),
        FAWI_WORDPRESS((char) 0xf19a),
        FAWI_OPENID((char) 0xf19b),
        FAWI_UNIVERSITY((char) 0xf19c),
        FAWI_GRADUATION_CAP((char) 0xf19d),
        FAWI_YAHOO((char) 0xf19e),
        FAWI_GOOGLE((char) 0xf1a0),
        FAWI_REDDIT((char) 0xf1a1),
        FAWI_REDDIT_SQUARE((char) 0xf1a2),
        FAWI_STUMBLEUPON_CIRCLE((char) 0xf1a3),
        FAWI_STUMBLEUPON((char) 0xf1a4),
        FAWI_DELICIOUS((char) 0xf1a5),
        FAWI_DIGG((char) 0xf1a6),
        FAWI_PIED_PIPER_PP((char) 0xf1a7),
        FAWI_PIED_PIPER_ALT((char) 0xf1a8),
        FAWI_DRUPAL((char) 0xf1a9),
        FAWI_JOOMLA((char) 0xf1aa),
        FAWI_LANGUAGE((char) 0xf1ab),
        FAWI_FAX((char) 0xf1ac),
        FAWI_BUILDING((char) 0xf1ad),
        FAWI_CHILD((char) 0xf1ae),
        FAWI_PAW((char) 0xf1b0),
        FAWI_SPOON((char) 0xf1b1),
        FAWI_CUBE((char) 0xf1b2),
        FAWI_CUBES((char) 0xf1b3),
        FAWI_BEHANCE((char) 0xf1b4),
        FAWI_BEHANCE_SQUARE((char) 0xf1b5),
        FAWI_STEAM((char) 0xf1b6),
        FAWI_STEAM_SQUARE((char) 0xf1b7),
        FAWI_RECYCLE((char) 0xf1b8),
        FAWI_CAR((char) 0xf1b9),
        FAWI_TAXI((char) 0xf1ba),
        FAWI_TREE((char) 0xf1bb),
        FAWI_SPOTIFY((char) 0xf1bc),
        FAWI_DEVIANTART((char) 0xf1bd),
        FAWI_SOUNDCLOUD((char) 0xf1be),
        FAWI_DATABASE((char) 0xf1c0),
        FAWI_FILE_PDF_O((char) 0xf1c1),
        FAWI_FILE_WORD_O((char) 0xf1c2),
        FAWI_FILE_EXCEL_O((char) 0xf1c3),
        FAWI_FILE_POWERPOINT_O((char) 0xf1c4),
        FAWI_FILE_IMAGE_O((char) 0xf1c5),
        FAWI_FILE_ARCHIVE_O((char) 0xf1c6),
        FAWI_FILE_AUDIO_O((char) 0xf1c7),
        FAWI_FILE_VIDEO_O((char) 0xf1c8),
        FAWI_FILE_CODE_O((char) 0xf1c9),
        FAWI_VINE((char) 0xf1ca),
        FAWI_CODEPEN((char) 0xf1cb),
        FAWI_JSFIDDLE((char) 0xf1cc),
        FAWI_LIFE_RING((char) 0xf1cd),
        FAWI_CIRCLE_O_NOTCH((char) 0xf1ce),
        FAWI_REBEL((char) 0xf1d0),
        FAWI_EMPIRE((char) 0xf1d1),
        FAWI_GIT_SQUARE((char) 0xf1d2),
        FAWI_GIT((char) 0xf1d3),
        FAWI_HACKER_NEWS((char) 0xf1d4),
        FAWI_TENCENTI_WEIBO((char) 0xf1d5),
        FAWI_QQ((char) 0xf1d6),
        FAWI_WEIXIN((char) 0xf1d7),
        FAWI_PAPER_PLANE((char) 0xf1d8),
        FAWI_PAPER_PLANE_O((char) 0xf1d9),
        FAWI_HISTORY((char) 0xf1da),
        FAWI_CIRCLE_THIN((char) 0xf1db),
        FAWI_HEADER((char) 0xf1dc),
        FAWI_PARAGRAPH((char) 0xf1dd),
        FAWI_SLIDERS((char) 0xf1de),
        FAWI_SHARE_ALT((char) 0xf1e0),
        FAWI_SHARE_ALT_SQUARE((char) 0xf1e1),
        FAWI_BOMB((char) 0xf1e2),
        FAWI_FUTBOL_O((char) 0xf1e3),
        FAWI_TTY((char) 0xf1e4),
        FAWI_BINOCULARS((char) 0xf1e5),
        FAWI_PLUG((char) 0xf1e6),
        FAWI_SLIDESHARE((char) 0xf1e7),
        FAWI_TWITCH((char) 0xf1e8),
        FAWI_YELP((char) 0xf1e9),
        FAWI_NEWSPAPER_O((char) 0xf1ea),
        FAWI_WIFI((char) 0xf1eb),
        FAWI_CALCULATOR((char) 0xf1ec),
        FAWI_PAYPAL((char) 0xf1ed),
        FAWI_GOOGLE_WALLET((char) 0xf1ee),
        FAWI_CC_VISA((char) 0xf1f0),
        FAWI_CC_MASTERCARD((char) 0xf1f1),
        FAWI_CC_DISCOVER((char) 0xf1f2),
        FAWI_CC_AMEX((char) 0xf1f3),
        FAWI_CC_PAYPAL((char) 0xf1f4),
        FAWI_CC_STRIPE((char) 0xf1f5),
        FAWI_BELL_SLASH((char) 0xf1f6),
        FAWI_BELL_SLASH_O((char) 0xf1f7),
        FAWI_TRASH((char) 0xf1f8),
        FAWI_COPYRIGHT((char) 0xf1f9),
        FAWI_AT((char) 0xf1fa),
        FAWI_EYEDROPPER((char) 0xf1fb),
        FAWI_PAINT_BRUSH((char) 0xf1fc),
        FAWI_BIRTHDAY_CAKE((char) 0xf1fd),
        FAWI_AREA_CHART((char) 0xf1fe),
        FAWI_PIE_CHART((char) 0xf200),
        FAWI_LINE_CHART((char) 0xf201),
        FAWI_LASTFM((char) 0xf202),
        FAWI_LASTFM_SQUARE((char) 0xf203),
        FAWI_TOGGLE_OFF((char) 0xf204),
        FAWI_TOGGLE_ON((char) 0xf205),
        FAWI_BICYCLE((char) 0xf206),
        FAWI_BUS((char) 0xf207),
        FAWI_IOXHOST((char) 0xf208),
        FAWI_ANGELLIST((char) 0xf209),
        FAWI_CC((char) 0xf20a),
        FAWI_ILS((char) 0xf20b),
        FAWI_MEANPATH((char) 0xf20c),
        FAWI_BUYSELLADS((char) 0xf20d),
        FAWI_CONNECTDEVELOP((char) 0xf20e),
        FAWI_DASHCUBE((char) 0xf210),
        FAWI_FORUMBEE((char) 0xf211),
        FAWI_LEANPUB((char) 0xf212),
        FAWI_SELLSY((char) 0xf213),
        FAWI_SHIRTSINBULK((char) 0xf214),
        FAWI_SIMPLYBUILT((char) 0xf215),
        FAWI_SKYATLAS((char) 0xf216),
        FAWI_CART_PLUS((char) 0xf217),
        FAWI_CART_ARROW_DOWN((char) 0xf218),
        FAWI_DIAMOND((char) 0xf219),
        FAWI_SHIP((char) 0xf21a),
        FAWI_USER_SECRET((char) 0xf21b),
        FAWI_MOTORCYCLE((char) 0xf21c),
        FAWI_STREET_VIEW((char) 0xf21d),
        FAWI_HEARTBEAT((char) 0xf21e),
        FAWI_VENUS((char) 0xf221),
        FAWI_MARS((char) 0xf222),
        FAWI_MERCURY((char) 0xf223),
        FAWI_TRANSGENDER((char) 0xf224),
        FAWI_TRANSGENDER_ALT((char) 0xf225),
        FAWI_VENUS_DOUBLE((char) 0xf226),
        FAWI_MARS_DOUBLE((char) 0xf227),
        FAWI_VENUS_MARS((char) 0xf228),
        FAWI_MARS_STROKE((char) 0xf229),
        FAWI_MARS_STROKE_V((char) 0xf22a),
        FAWI_MARS_STROKE_H((char) 0xf22b),
        FAWI_NEUTER((char) 0xf22c),
        FAWI_GENDERLESS((char) 0xf22d),
        FAWI_FACEBOOK_OFFICIAL((char) 0xf230),
        FAWI_PINTEREST_P((char) 0xf231),
        FAWI_WHATSAPP((char) 0xf232),
        FAWI_SERVER((char) 0xf233),
        FAWI_USER_PLUS((char) 0xf234),
        FAWI_USER_TIMES((char) 0xf235),
        FAWI_BED((char) 0xf236),
        FAWI_VIACOIN((char) 0xf237),
        FAWI_TRAIN((char) 0xf238),
        FAWI_SUBWAY((char) 0xf239),
        FAWI_MEDIUM((char) 0xf23a),
        FAWI_Y_COMBINATOR((char) 0xf23b),
        FAWI_OPTIN_MONSTER((char) 0xf23c),
        FAWI_OPENCART((char) 0xf23d),
        FAWI_EXPEDITEDSSL((char) 0xf23e),
        FAWI_BATTERY_FULL((char) 0xf240),
        FAWI_BATTERY_THREE_QUARTERS((char) 0xf241),
        FAWI_BATTERY_HALF((char) 0xf242),
        FAWI_BATTERY_QUARTER((char) 0xf243),
        FAWI_BATTERY_EMPTY((char) 0xf244),
        FAWI_MOUSE_POINTER((char) 0xf245),
        FAWI_I_CURSOR((char) 0xf246),
        FAWI_OBJECT_GROUP((char) 0xf247),
        FAWI_OBJECT_UNGROUP((char) 0xf248),
        FAWI_STICKY_NOTE((char) 0xf249),
        FAWI_STICKY_NOTE_O((char) 0xf24a),
        FAWI_CC_JCB((char) 0xf24b),
        FAWI_CC_DINERS_CLUB((char) 0xf24c),
        FAWI_CLONE((char) 0xf24d),
        FAWI_BALANCE_SCALE((char) 0xf24e),
        FAWI_HOURGLASS_O((char) 0xf250),
        FAWI_HOURGLASS_START((char) 0xf251),
        FAWI_HOURGLASS_HALF((char) 0xf252),
        FAWI_HOURGLASS_END((char) 0xf253),
        FAWI_HOURGLASS((char) 0xf254),
        FAWI_HAND_ROCK_O((char) 0xf255),
        FAWI_HAND_PAPER_O((char) 0xf256),
        FAWI_HAND_SCISSORS_O((char) 0xf257),
        FAWI_HAND_LIZARD_O((char) 0xf258),
        FAWI_HAND_SPOCK_O((char) 0xf259),
        FAWI_HAND_POINTER_O((char) 0xf25a),
        FAWI_HAND_PEACE_O((char) 0xf25b),
        FAWI_TRADEMARK((char) 0xf25c),
        FAWI_REGISTERED((char) 0xf25d),
        FAWI_CREATIVE_COMMONS((char) 0xf25e),
        FAWI_GG((char) 0xf260),
        FAWI_GG_CIRCLE((char) 0xf261),
        FAWI_TRIPADVISOR((char) 0xf262),
        FAWI_ODNOKLASSNIKI((char) 0xf263),
        FAWI_ODNOKLASSNIKI_SQUARE((char) 0xf264),
        FAWI_GET_POCKET((char) 0xf265),
        FAWI_WIKIPEDIA_W((char) 0xf266),
        FAWI_SAFARI((char) 0xf267),
        FAWI_CHROME((char) 0xf268),
        FAWI_FIREFOX((char) 0xf269),
        FAWI_OPERA((char) 0xf26a),
        FAWI_INTERNET_EXPLORER((char) 0xf26b),
        FAWI_TELEVISION((char) 0xf26c),
        FAWI_CONTAO((char) 0xf26d),
        FAWI_500PX((char) 0xf26e),
        FAWI_AMAZON((char) 0xf270),
        FAWI_CALENDAR_PLUS_O((char) 0xf271),
        FAWI_CALENDAR_MINUS_O((char) 0xf272),
        FAWI_CALENDAR_TIMES_O((char) 0xf273),
        FAWI_CALENDAR_CHECK_O((char) 0xf274),
        FAWI_INDUSTRY((char) 0xf275),
        FAWI_MAP_PIN((char) 0xf276),
        FAWI_MAP_SIGNS((char) 0xf277),
        FAWI_MAP_O((char) 0xf278),
        FAWI_MAP((char) 0xf279),
        FAWI_COMMENTING((char) 0xf27a),
        FAWI_COMMENTING_O((char) 0xf27b),
        FAWI_HOUZZ((char) 0xf27c),
        FAWI_VIMEO((char) 0xf27d),
        FAWI_BLACK_TIE((char) 0xf27e),
        FAWI_FONTICONS((char) 0xf280),
        FAWI_REDDIT_ALIEN((char) 0xf281),
        FAWI_EDGE((char) 0xf282),
        FAWI_CREDIT_CARD_ALT((char) 0xf283),
        FAWI_CODIEPIE((char) 0xf284),
        FAWI_MODX((char) 0xf285),
        FAWI_FORT_AWESOME((char) 0xf286),
        FAWI_USB((char) 0xf287),
        FAWI_PRODUCT_HUNT((char) 0xf288),
        FAWI_MIXCLOUD((char) 0xf289),
        FAWI_SCRIBD((char) 0xf28a),
        FAWI_PAUSE_CIRCLE((char) 0xf28b),
        FAWI_PAUSE_CIRCLE_O((char) 0xf28c),
        FAWI_STOP_CIRCLE((char) 0xf28d),
        FAWI_STOP_CIRCLE_O((char) 0xf28e),
        FAWI_SHOPPING_BAG((char) 0xf290),
        FAWI_SHOPPING_BASKET((char) 0xf291),
        FAWI_HASHTAG((char) 0xf292),
        FAWI_BLUETOOTH((char) 0xf293),
        FAWI_BLUETOOTH_B((char) 0xf294),
        FAWI_PERCENT((char) 0xf295),
        FAWI_GITLAB((char) 0xf296),
        FAWI_WPBEGINNER((char) 0xf297),
        FAWI_WPFORMS((char) 0xf298),
        FAWI_ENVIRA((char) 0xf299),
        FAWI_UNIVERSAL_ACCESS((char) 0xf29a),
        FAWI_WHEELCHAIR_ALT((char) 0xf29b),
        FAWI_QUESTION_CIRCLE_O((char) 0xf29c),
        FAWI_BLIND((char) 0xf29d),
        FAWI_AUDIO_DESCRIPTION((char) 0xf29e),
        FAWI_VOLUME_CONTROL_PHONE((char) 0xf2a0),
        FAWI_BRAILLE((char) 0xf2a1),
        FAWI_ASSISTIVE_LISTENING_SYSTEMS((char) 0xf2a2),
        FAWI_AMERICAN_SIGN_LANGUAGE_INTERPRETING((char) 0xf2a3),
        FAWI_DEAF((char) 0xf2a4),
        FAWI_GLIDE((char) 0xf2a5),
        FAWI_GLIDE_G((char) 0xf2a6),
        FAWI_SIGN_LANGUAGE((char) 0xf2a7),
        FAWI_LOW_VISION((char) 0xf2a8),
        FAWI_VIADEO((char) 0xf2a9),
        FAWI_VIADEO_SQUARE((char) 0xf2aa),
        FAWI_SNAPCHAT((char) 0xf2ab),
        FAWI_SNAPCHAT_GHOST((char) 0xf2ac),
        FAWI_SNAPCHAT_SQUARE((char) 0xf2ad),
        FAWI_PIED_PIPER((char) 0xf2ae),
        FAWI_FIRST_ORDER((char) 0xf2b0),
        FAWI_YOAST((char) 0xf2b1),
        FAWI_THEMEISLE((char) 0xf2b2),
        FAWI_GOOGLE_PLUS_OFFICIAL((char) 0xf2b3),
        FAWI_FONT_AWESOME((char) 0xf2b4),
        FAWI_HANDSHAKE_O((char) 0xf2b5),
        FAWI_ENVELOPE_OPEN((char) 0xf2b6),
        FAWI_ENVELOPE_OPEN_O((char) 0xf2b7),
        FAWI_LINODE((char) 0xf2b8),
        FAWI_ADDRESS_BOOK((char) 0xf2b9),
        FAWI_ADDRESS_BOOK_O((char) 0xf2ba),
        FAWI_ADDRESS_CARD((char) 0xf2bb),
        FAWI_ADDRESS_CARD_O((char) 0xf2bc),
        FAWI_USER_CIRCLE((char) 0xf2bd),
        FAWI_USER_CIRCLE_O((char) 0xf2be),
        FAWI_USER_O((char) 0xf2c0),
        FAWI_ID_BADGE((char) 0xf2c1),
        FAWI_ID_CARD((char) 0xf2c2),
        FAWI_ID_CARD_O((char) 0xf2c3),
        FAWI_QUORA((char) 0xf2c4),
        FAWI_FREE_CODE_CAMP((char) 0xf2c5),
        FAWI_TELEGRAM((char) 0xf2c6),
        FAWI_THERMOMETER_FULL((char) 0xf2c7),
        FAWI_THERMOMETER_THREE_QUARTERS((char) 0xf2c8),
        FAWI_THERMOMETER_HALF((char) 0xf2c9),
        FAWI_THERMOMETER_QUARTER((char) 0xf2ca),
        FAWI_THERMOMETER_EMPTY((char) 0xf2cb),
        FAWI_SHOWER((char) 0xf2cc),
        FAWI_BATH((char) 0xf2cd),
        FAWI_PODCAST((char) 0xf2ce),
        FAWI_WINDOW_MAXIMIZE((char) 0xf2d0),
        FAWI_WINDOW_MINIMIZE((char) 0xf2d1),
        FAWI_WINDOW_RESTORE((char) 0xf2d2),
        FAWI_WINDOW_CLOSE((char) 0xf2d3),
        FAWI_WINDOW_CLOSE_O((char) 0xf2d4),
        FAWI_BANDCAMP((char) 0xf2d5),
        FAWI_GRAV((char) 0xf2d6),
        FAWI_ETSY((char) 0xf2d7),
        FAWI_IMDB((char) 0xf2d8),
        FAWI_RAVELRY((char) 0xf2d9),
        FAWI_EERCAST((char) 0xf2da),
        FAWI_MICROCHIP((char) 0xf2db),
        FAWI_SNOWFLAKE_O((char) 0xf2dc),
        FAWI_SUPERPOWERS((char) 0xf2dd),
        FAWI_WPEXPLORER((char) 0xf2de),
        FAWI_MEETUP((char) 0xf2e0);

        char fontAwesomeCharacter;

        Icon(char character) {
            this.fontAwesomeCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return fontAwesomeCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface fontAwesomeTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (fontAwesomeTypeface == null) {
                setTypeface(new FontAwesome());
            }
            return fontAwesomeTypeface;
        }

        private static void setTypeface(FontAwesome fontAwesomeTypeface) {
            Icon.fontAwesomeTypeface = fontAwesomeTypeface;
        }
    }
}
