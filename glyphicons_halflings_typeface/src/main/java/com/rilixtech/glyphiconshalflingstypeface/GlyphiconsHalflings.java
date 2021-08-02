package com.rilixtech.glyphiconshalflingstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the GlyphiconsHalflings font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class GlyphiconsHalflings implements MfbTypeface {
    private static final String TTF_FILE = "glyphicons-halflings-regular.ttf";
    private static final String GLYPHICONS_HALFLINGS_PREFIX = "GLYI";
    public static final String GLYPHICONS_HALFLINGS_NAME = "Glyphicons Halflings";
    public static final String GLYPHICONS_HALFLINGS_VERSION = "1" + ".0.0";
    public static final String GLYPHICONS_HALFLINGS_AUTHOR = "Jan Kovarik";
    public static final String GLYPHICONS_HALFLINGS_URL = "http://glyphicons.com/";
    public static final String GLYPHICONS_HALFLINGS_DESC = "GLYPHICONS Halflings font is also released as an extension"
            + " of a Bootstrap www.getbootstrap.com for free and it is released under the same license as Bootstrap.";
    public static final String GLYPHICONS_HALFLINGS_LICENSE = "MIT License";
    public static final String GLYPHICONS_HALFLINGS_LICENSE_URL = "https://opensource.org/licenses/MIT";

    private static Font glyphiconsHalflingsTypeface = null;
    private static HashMap<String, Character> glyphiconsHalflingsCharMap;

    /**
     * GlyphiconsHalflings MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which GlyphiconsHalflings MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the GlyphiconsHalflings icon characters in a HashMap.
     *
     * @return HashMap of all GlyphiconsHalflings icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (glyphiconsHalflingsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.glyphiconsHalflingsCharacter);
            }
            setChars(characterHashMap);
        }

        return glyphiconsHalflingsCharMap;
    }

    /**
     * Set the GlyphiconsHalflings Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        glyphiconsHalflingsCharMap = characterHashMap;
    }

    /**
     * Return the GlyphiconsHalflings Mapping Prefix.
     *
     * @return GlyphiconsHalflings Mapping Prefix, used by all GlyphiconsHalflings icons.
     */
    @Override public String getMappingPrefix() {
        return GLYPHICONS_HALFLINGS_PREFIX;
    }

    @Override public String getFontName() {
        return GLYPHICONS_HALFLINGS_NAME;
    }

    @Override public String getVersion() {
        return GLYPHICONS_HALFLINGS_VERSION;
    }

    @Override public int getIconCount() {
        return glyphiconsHalflingsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> glyphiconsHalflingsKeyList = new LinkedList<>();

        for (Icon value : Icon.values()) {
            glyphiconsHalflingsKeyList.add(value.name());
        }

        return glyphiconsHalflingsKeyList;
    }

    @Override public String getAuthor() {
        return GLYPHICONS_HALFLINGS_AUTHOR;
    }

    @Override public String getUrl() {
        return GLYPHICONS_HALFLINGS_URL;
    }

    @Override public String getDescription() {
        return GLYPHICONS_HALFLINGS_DESC;
    }

    @Override public String getLicense() {
        return GLYPHICONS_HALFLINGS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return GLYPHICONS_HALFLINGS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (glyphiconsHalflingsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return glyphiconsHalflingsTypeface;
    }

    private static void cacheTypeface(Font font) {
        glyphiconsHalflingsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by GlyphiconsHalflings MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        GLYI_ASTERISK((char) 0x002a),
        GLYI_PLUS((char) 0x002b),
        GLYI_EUR((char) 0x20ac),
        GLYI_MINUS((char) 0x2212),
        GLYI_CLOUD((char) 0x2601),
        GLYI_ENVELOPE((char) 0x2709),
        GLYI_PENCIL((char) 0x270f),
        GLYI_GLASS((char) 0xe001),
        GLYI_MUSIC((char) 0xe002),
        GLYI_SEARCH((char) 0xe003),
        GLYI_HEART((char) 0xe005),
        GLYI_STAR((char) 0xe006),
        GLYI_STAR_EMPTY((char) 0xe007),
        GLYI_USER((char) 0xe008),
        GLYI_FILM((char) 0xe009),
        GLYI_TH_LARGE((char) 0xe010),
        GLYI_TH((char) 0xe011),
        GLYI_TH_LIST((char) 0xe012),
        GLYI_OK((char) 0xe013),
        GLYI_REMOVE((char) 0xe014),
        GLYI_ZOOM_IN((char) 0xe015),
        GLYI_ZOOM_OUT((char) 0xe016),
        GLYI_OFF((char) 0xe017),
        GLYI_SIGNAL((char) 0xe018),
        GLYI_COG((char) 0xe019),
        GLYI_TRASH((char) 0xe020),
        GLYI_HOME((char) 0xe021),
        GLYI_FILE((char) 0xe022),
        GLYI_TIME((char) 0xe023),
        GLYI_ROAD((char) 0xe024),
        GLYI_DOWNLOAD_ALT((char) 0xe025),
        GLYI_DOWNLOAD((char) 0xe026),
        GLYI_UPLOAD((char) 0xe027),
        GLYI_INBOX((char) 0xe028),
        GLYI_PLAY_CIRCLE((char) 0xe029),
        GLYI_REPEAT((char) 0xe030),
        GLYI_REFRESH((char) 0xe031),
        GLYI_LIST_ALT((char) 0xe032),
        GLYI_LOCK((char) 0xe033),
        GLYI_FLAG((char) 0xe034),
        GLYI_HEADPHONES((char) 0xe035),
        GLYI_VOLUME_OFF((char) 0xe036),
        GLYI_VOLUME_DOWN((char) 0xe037),
        GLYI_VOLUME_UP((char) 0xe038),
        GLYI_QRCODE((char) 0xe039),
        GLYI_BARCODE((char) 0xe040),
        GLYI_TAG((char) 0xe041),
        GLYI_TAGS((char) 0xe042),
        GLYI_BOOK((char) 0xe043),
        GLYI_BOOKMARK((char) 0xe044),
        GLYI_PRINT((char) 0xe045),
        GLYI_CAMERA((char) 0xe046),
        GLYI_FONT((char) 0xe047),
        GLYI_BOLD((char) 0xe048),
        GLYI_ITALIC((char) 0xe049),
        GLYI_TEXT_HEIGHT((char) 0xe050),
        GLYI_TEXT_WIDTH((char) 0xe051),
        GLYI_ALIGN_LEFT((char) 0xe052),
        GLYI_ALIGN_CENTER((char) 0xe053),
        GLYI_ALIGN_RIGHT((char) 0xe054),
        GLYI_ALIGN_JUSTIFY((char) 0xe055),
        GLYI_LIST((char) 0xe056),
        GLYI_INDENT_LEFT((char) 0xe057),
        GLYI_INDENT_RIGHT((char) 0xe058),
        GLYI_FACETIME_VIDEO((char) 0xe059),
        GLYI_PICTURE((char) 0xe060),
        GLYI_MAP_MARKER((char) 0xe062),
        GLYI_ADJUST((char) 0xe063),
        GLYI_TINT((char) 0xe064),
        GLYI_EDIT((char) 0xe065),
        GLYI_SHARE((char) 0xe066),
        GLYI_CHECK((char) 0xe067),
        GLYI_MOVE((char) 0xe068),
        GLYI_STEP_BACKWARD((char) 0xe069),
        GLYI_FAST_BACKWARD((char) 0xe070),
        GLYI_BACKWARD((char) 0xe071),
        GLYI_PLAY((char) 0xe072),
        GLYI_PAUSE((char) 0xe073),
        GLYI_STOP((char) 0xe074),
        GLYI_FORWARD((char) 0xe075),
        GLYI_FAST_FORWARD((char) 0xe076),
        GLYI_STEP_FORWARD((char) 0xe077),
        GLYI_EJECT((char) 0xe078),
        GLYI_CHEVRON_LEFT((char) 0xe079),
        GLYI_CHEVRON_RIGHT((char) 0xe080),
        GLYI_PLUS_SIGN((char) 0xe081),
        GLYI_MINUS_SIGN((char) 0xe082),
        GLYI_REMOVE_SIGN((char) 0xe083),
        GLYI_OK_SIGN((char) 0xe084),
        GLYI_QUESTION_SIGN((char) 0xe085),
        GLYI_INFO_SIGN((char) 0xe086),
        GLYI_SCREENSHOT((char) 0xe087),
        GLYI_REMOVE_CIRCLE((char) 0xe088),
        GLYI_OK_CIRCLE((char) 0xe089),
        GLYI_BAN_CIRCLE((char) 0xe090),
        GLYI_ARROW_LEFT((char) 0xe091),
        GLYI_ARROW_RIGHT((char) 0xe092),
        GLYI_ARROW_UP((char) 0xe093),
        GLYI_ARROW_DOWN((char) 0xe094),
        GLYI_SHARE_ALT((char) 0xe095),
        GLYI_RESIZE_FULL((char) 0xe096),
        GLYI_RESIZE_SMALL((char) 0xe097),
        GLYI_EXCLAMATION_SIGN((char) 0xe101),
        GLYI_GIFT((char) 0xe102),
        GLYI_LEAF((char) 0xe103),
        GLYI_FIRE((char) 0xe104),
        GLYI_EYE_OPEN((char) 0xe105),
        GLYI_EYE_CLOSE((char) 0xe106),
        GLYI_WARNING_SIGN((char) 0xe107),
        GLYI_PLANE((char) 0xe108),
        GLYI_CALENDAR((char) 0xe109),
        GLYI_RANDOM((char) 0xe110),
        GLYI_COMMENT((char) 0xe111),
        GLYI_MAGNET((char) 0xe112),
        GLYI_CHEVRON_UP((char) 0xe113),
        GLYI_CHEVRON_DOWN((char) 0xe114),
        GLYI_RETWEET((char) 0xe115),
        GLYI_SHOPPING_CART((char) 0xe116),
        GLYI_FOLDER_CLOSE((char) 0xe117),
        GLYI_FOLDER_OPEN((char) 0xe118),
        GLYI_RESIZE_VERTICAL((char) 0xe119),
        GLYI_RESIZE_HORIZONTAL((char) 0xe120),
        GLYI_HDD((char) 0xe121),
        GLYI_BULLHORN((char) 0xe122),
        GLYI_BELL((char) 0xe123),
        GLYI_CERTIFICATE((char) 0xe124),
        GLYI_THUMBS_UP((char) 0xe125),
        GLYI_THUMBS_DOWN((char) 0xe126),
        GLYI_HAND_RIGHT((char) 0xe127),
        GLYI_HAND_LEFT((char) 0xe128),
        GLYI_HAND_UP((char) 0xe129),
        GLYI_HAND_DOWN((char) 0xe130),
        GLYI_CIRCLE_ARROW_RIGHT((char) 0xe131),
        GLYI_CIRCLE_ARROW_LEFT((char) 0xe132),
        GLYI_CIRCLE_ARROW_UP((char) 0xe133),
        GLYI_CIRCLE_ARROW_DOWN((char) 0xe134),
        GLYI_GLOBE((char) 0xe135),
        GLYI_WRENCH((char) 0xe136),
        GLYI_TASKS((char) 0xe137),
        GLYI_FILTER((char) 0xe138),
        GLYI_BRIEFCASE((char) 0xe139),
        GLYI_FULLSCREEN((char) 0xe140),
        GLYI_DASHBOARD((char) 0xe141),
        GLYI_PAPERCLIP((char) 0xe142),
        GLYI_HEART_EMPTY((char) 0xe143),
        GLYI_LINK((char) 0xe144),
        GLYI_PHONE((char) 0xe145),
        GLYI_PUSHPIN((char) 0xe146),
        GLYI_USD((char) 0xe148),
        GLYI_GBP((char) 0xe149),
        GLYI_SORT((char) 0xe150),
        GLYI_SORT_BY_ALPHABET((char) 0xe151),
        GLYI_SORT_BY_ALPHABET_ALT((char) 0xe152),
        GLYI_SORT_BY_ORDER((char) 0xe153),
        GLYI_SORT_BY_ORDER_ALT((char) 0xe154),
        GLYI_SORT_BY_ATTRIBUTES((char) 0xe155),
        GLYI_SORT_BY_ATTRIBUTES_ALT((char) 0xe156),
        GLYI_UNCHECKED((char) 0xe157),
        GLYI_EXPAND((char) 0xe158),
        GLYI_COLLAPSE_DOWN((char) 0xe159),
        GLYI_COLLAPSE_UP((char) 0xe160),
        GLYI_LOG_IN((char) 0xe161),
        GLYI_FLASH((char) 0xe162),
        GLYI_LOG_OUT((char) 0xe163),
        GLYI_NEW_WINDOW((char) 0xe164),
        GLYI_RECORD((char) 0xe165),
        GLYI_SAVE((char) 0xe166),
        GLYI_OPEN((char) 0xe167),
        GLYI_SAVED((char) 0xe168),
        GLYI_IMPORT((char) 0xe169),
        GLYI_EXPORT((char) 0xe170),
        GLYI_SEND((char) 0xe171),
        GLYI_FLOPPY_DISK((char) 0xe172),
        GLYI_FLOPPY_SAVED((char) 0xe173),
        GLYI_FLOPPY_REMOVE((char) 0xe174),
        GLYI_FLOPPY_SAVE((char) 0xe175),
        GLYI_FLOPPY_OPEN((char) 0xe176),
        GLYI_CREDIT_CARD((char) 0xe177),
        GLYI_TRANSFER((char) 0xe178),
        GLYI_CUTLERY((char) 0xe179),
        GLYI_HEADER((char) 0xe180),
        GLYI_COMPRESSED((char) 0xe181),
        GLYI_EARPHONE((char) 0xe182),
        GLYI_PHONE_ALT((char) 0xe183),
        GLYI_TOWER((char) 0xe184),
        GLYI_STATS((char) 0xe185),
        GLYI_SD_VIDEO((char) 0xe186),
        GLYI_HD_VIDEO((char) 0xe187),
        GLYI_SUBTITLES((char) 0xe188),
        GLYI_SOUND_STEREO((char) 0xe189),
        GLYI_SOUND_DOLBY((char) 0xe190),
        GLYI_SOUND_5_1((char) 0xe191),
        GLYI_SOUND_6_1((char) 0xe192),
        GLYI_SOUND_7_1((char) 0xe193),
        GLYI_COPYRIGHT_MARK((char) 0xe194),
        GLYI_REGISTRATION_MARK((char) 0xe195),
        GLYI_CLOUD_DOWNLOAD((char) 0xe197),
        GLYI_CLOUD_UPLOAD((char) 0xe198),
        GLYI_TREE_CONIFER((char) 0xe199),
        GLYI_TREE_DECIDUOUS((char) 0xe200),
        GLYI_CD((char) 0xe201),
        GLYI_SAVE_FILE((char) 0xe202),
        GLYI_OPEN_FILE((char) 0xe203),
        GLYI_LEVEL_UP((char) 0xe204),
        GLYI_COPY((char) 0xe205),
        GLYI_PASTE((char) 0xe206),
        GLYI_ALERT((char) 0xe209),
        GLYI_EQUALIZER((char) 0xe210),
        GLYI_KING((char) 0xe211),
        GLYI_QUEEN((char) 0xe212),
        GLYI_PAWN((char) 0xe213),
        GLYI_BISHOP((char) 0xe214),
        GLYI_KNIGHT((char) 0xe215),
        GLYI_BABY_FORMULA((char) 0xe216),
        GLYI_TENT((char) 0x26fa),
        GLYI_BLACKBOARD((char) 0xe218),
        GLYI_BED((char) 0xe219),
        GLYI_APPLE((char) 0xf8ff),
        GLYI_ERASE((char) 0xe221),
        GLYI_HOURGLASS((char) 0x231b),
        GLYI_LAMP((char) 0xe223),
        GLYI_DUPLICATE((char) 0xe224),
        GLYI_PIGGY_BANK((char) 0xe225),
        GLYI_SCISSORS((char) 0xe226),
        GLYI_BITCOIN((char) 0xe227),
        GLYI_BTC((char) 0xe227),
        GLYI_XBT((char) 0xe227),
        GLYI_YEN((char) 0x00a5),
        GLYI_JPY((char) 0x00a5),
        GLYI_RUBLE((char) 0x20bd),
        GLYI_RUB((char) 0x20bd),
        GLYI_SCALE((char) 0xe230),
        GLYI_ICE_LOLLY((char) 0xe231),
        GLYI_ICE_LOLLY_TASTED((char) 0xe232),
        GLYI_EDUCATION((char) 0xe233),
        GLYI_OPTION_HORIZONTAL((char) 0xe234),
        GLYI_OPTION_VERTICAL((char) 0xe235),
        GLYI_MENU_HAMBURGER((char) 0xe236),
        GLYI_MODAL_WINDOW((char) 0xe237),
        GLYI_OIL((char) 0xe238),
        GLYI_GRAIN((char) 0xe239),
        GLYI_SUNGLASSES((char) 0xe240),
        GLYI_TEXT_SIZE((char) 0xe241),
        GLYI_TEXT_COLOR((char) 0xe242),
        GLYI_TEXT_BACKGROUND((char) 0xe243),
        GLYI_OBJECT_ALIGN_TOP((char) 0xe244),
        GLYI_OBJECT_ALIGN_BOTTOM((char) 0xe245),
        GLYI_OBJECT_ALIGN_HORIZONTAL((char) 0xe246),
        GLYI_OBJECT_ALIGN_LEFT((char) 0xe247),
        GLYI_OBJECT_ALIGN_VERTICAL((char) 0xe248),
        GLYI_OBJECT_ALIGN_RIGHT((char) 0xe249),
        GLYI_TRIANGLE_RIGHT((char) 0xe250),
        GLYI_TRIANGLE_LEFT((char) 0xe251),
        GLYI_TRIANGLE_BOTTOM((char) 0xe252),
        GLYI_TRIANGLE_TOP((char) 0xe253),
        GLYI_CONSOLE((char) 0xe254),
        GLYI_SUPERSCRIPT((char) 0xe255),
        GLYI_SUBSCRIPT((char) 0xe256),
        GLYI_MENU_LEFT((char) 0xe257),
        GLYI_MENU_RIGHT((char) 0xe258),
        GLYI_MENU_DOWN((char) 0xe259),
        GLYI_MENU_UP((char) 0xe260);

        char glyphiconsHalflingsCharacter;

        Icon(char character) {
            this.glyphiconsHalflingsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return glyphiconsHalflingsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface glyphiconsHalflingsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (glyphiconsHalflingsTypeface == null) {
                setTypeface(new GlyphiconsHalflings());
            }
            return glyphiconsHalflingsTypeface;
        }

        private static void setTypeface(GlyphiconsHalflings glyphiconsHalflingsTypeface) {
            Icon.glyphiconsHalflingsTypeface = glyphiconsHalflingsTypeface;
        }
    }
}
