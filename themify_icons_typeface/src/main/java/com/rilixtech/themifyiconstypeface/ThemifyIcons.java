package com.rilixtech.themifyiconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the ThemifyIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class ThemifyIcons implements MfbTypeface {
    private static final String TTF_FILE = "themify-icons-v0.1.2.ttf";
    private static final String THEMIFY_ICONS_PREFIX = "THEI";
    public static final String THEMIFY_ICONS_NAME = "Themify Icons";
    public static final String THEMIFY_ICONS_VERSION = "0" + ".1.2";
    public static final String THEMIFY_ICONS_AUTHOR = "Lally Elias";
    public static final String THEMIFY_ICONS_URL = "http://themify.me/themify-icons";
    public static final String THEMIFY_ICONS_DESC = "Themify Icons is a complete set of icons for use in web design and"
            + " apps, consisting of 320+ pixel-perfect, hand-crafted icons that draw inspiration from Apple iOS 7.";
    public static final String THEMIFY_ICONS_LICENSE = "SIL Open Font License (OFL)";
    public static final String THEMIFY_ICONS_LICENSE_URL = "http://scripts.sil.org/OFL";

    private static Font themifyIconsTypeface = null;
    private static HashMap<String, Character> themifyIconsCharMap;

    /**
     * ThemifyIcons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which ThemifyIcons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the ThemifyIcons icon characters in a HashMap.
     *
     * @return HashMap of all ThemifyIcons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (themifyIconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.themifyIconsCharacter);
            }
            setChars(characterHashMap);
        }
        return themifyIconsCharMap;
    }

    /**
     * Set the ThemifyIcons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        themifyIconsCharMap = characterHashMap;
    }

    /**
     * Return the ThemifyIcons Mapping Prefix.
     *
     * @return ThemifyIcons Mapping Prefix, used by all ThemifyIcons icons.
     */
    @Override public String getMappingPrefix() {
        return THEMIFY_ICONS_PREFIX;
    }

    @Override public String getFontName() {
        return THEMIFY_ICONS_NAME;
    }

    @Override public String getVersion() {
        return THEMIFY_ICONS_VERSION;
    }

    @Override public int getIconCount() {
        return themifyIconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> themifyIconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            themifyIconsKeyList.add(value.name());
        }
        return themifyIconsKeyList;
    }

    @Override public String getAuthor() {
        return THEMIFY_ICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return THEMIFY_ICONS_URL;
    }

    @Override public String getDescription() {
        return THEMIFY_ICONS_DESC;
    }

    @Override public String getLicense() {
        return THEMIFY_ICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return THEMIFY_ICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (themifyIconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return themifyIconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        themifyIconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by ThemifyIcons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        THEI_WAND((char) 0xe600),
        THEI_VOLUME((char) 0xe601),
        THEI_USER((char) 0xe602),
        THEI_UNLOCK((char) 0xe603),
        THEI_UNLINK((char) 0xe604),
        THEI_TRASH((char) 0xe605),
        THEI_THOUGHT((char) 0xe606),
        THEI_TARGET((char) 0xe607),
        THEI_TAG((char) 0xe608),
        THEI_TABLET((char) 0xe609),
        THEI_STAR((char) 0xe60a),
        THEI_SPRAY((char) 0xe60b),
        THEI_SIGNAL((char) 0xe60c),
        THEI_SHOPPING_CART((char) 0xe60d),
        THEI_SHOPPING_CART_FULL((char) 0xe60e),
        THEI_SETTINGS((char) 0xe60f),
        THEI_SEARCH((char) 0xe610),
        THEI_ZOOM_IN((char) 0xe611),
        THEI_ZOOM_OUT((char) 0xe612),
        THEI_CUT((char) 0xe613),
        THEI_RULER((char) 0xe614),
        THEI_RULER_PENCIL((char) 0xe615),
        THEI_RULER_ALT((char) 0xe616),
        THEI_BOOKMARK((char) 0xe617),
        THEI_BOOKMARK_ALT((char) 0xe618),
        THEI_RELOAD((char) 0xe619),
        THEI_PLUS((char) 0xe61a),
        THEI_PIN((char) 0xe61b),
        THEI_PENCIL((char) 0xe61c),
        THEI_PENCIL_ALT((char) 0xe61d),
        THEI_PAINT_ROLLER((char) 0xe61e),
        THEI_PAINT_BUCKET((char) 0xe61f),
        THEI_NA((char) 0xe620),
        THEI_MOBILE((char) 0xe621),
        THEI_MINUS((char) 0xe622),
        THEI_MEDALL((char) 0xe623),
        THEI_MEDALL_ALT((char) 0xe624),
        THEI_MARKER((char) 0xe625),
        THEI_MARKER_ALT((char) 0xe626),
        THEI_ARROW_UP((char) 0xe627),
        THEI_ARROW_RIGHT((char) 0xe628),
        THEI_ARROW_LEFT((char) 0xe629),
        THEI_ARROW_DOWN((char) 0xe62a),
        THEI_LOCK((char) 0xe62b),
        THEI_LOCATION_ARROW((char) 0xe62c),
        THEI_LINK((char) 0xe62d),
        THEI_LAYOUT((char) 0xe62e),
        THEI_LAYERS((char) 0xe62f),
        THEI_LAYERS_ALT((char) 0xe630),
        THEI_KEY((char) 0xe631),
        THEI_IMPORT((char) 0xe632),
        THEI_IMAGE((char) 0xe633),
        THEI_HEART((char) 0xe634),
        THEI_HEART_BROKEN((char) 0xe635),
        THEI_HAND_STOP((char) 0xe636),
        THEI_HAND_OPEN((char) 0xe637),
        THEI_HAND_DRAG((char) 0xe638),
        THEI_FOLDER((char) 0xe639),
        THEI_FLAG((char) 0xe63a),
        THEI_FLAG_ALT((char) 0xe63b),
        THEI_FLAG_ALT_2((char) 0xe63c),
        THEI_EYE((char) 0xe63d),
        THEI_EXPORT((char) 0xe63e),
        THEI_EXCHANGE_VERTICAL((char) 0xe63f),
        THEI_DESKTOP((char) 0xe640),
        THEI_CUP((char) 0xe641),
        THEI_CROWN((char) 0xe642),
        THEI_COMMENTS((char) 0xe643),
        THEI_COMMENT((char) 0xe644),
        THEI_COMMENT_ALT((char) 0xe645),
        THEI_CLOSE((char) 0xe646),
        THEI_CLIP((char) 0xe647),
        THEI_ANGLE_UP((char) 0xe648),
        THEI_ANGLE_RIGHT((char) 0xe649),
        THEI_ANGLE_LEFT((char) 0xe64a),
        THEI_ANGLE_DOWN((char) 0xe64b),
        THEI_CHECK((char) 0xe64c),
        THEI_CHECK_BOX((char) 0xe64d),
        THEI_CAMERA((char) 0xe64e),
        THEI_ANNOUNCEMENT((char) 0xe64f),
        THEI_BRUSH((char) 0xe650),
        THEI_BRIEFCASE((char) 0xe651),
        THEI_BOLT((char) 0xe652),
        THEI_BOLT_ALT((char) 0xe653),
        THEI_BLACKBOARD((char) 0xe654),
        THEI_BAG((char) 0xe655),
        THEI_MOVE((char) 0xe656),
        THEI_ARROWS_VERTICAL((char) 0xe657),
        THEI_ARROWS_HORIZONTAL((char) 0xe658),
        THEI_FULLSCREEN((char) 0xe659),
        THEI_ARROW_TOP_RIGHT((char) 0xe65a),
        THEI_ARROW_TOP_LEFT((char) 0xe65b),
        THEI_ARROW_CIRCLE_UP((char) 0xe65c),
        THEI_ARROW_CIRCLE_RIGHT((char) 0xe65d),
        THEI_ARROW_CIRCLE_LEFT((char) 0xe65e),
        THEI_ARROW_CIRCLE_DOWN((char) 0xe65f),
        THEI_ANGLE_DOUBLE_UP((char) 0xe660),
        THEI_ANGLE_DOUBLE_RIGHT((char) 0xe661),
        THEI_ANGLE_DOUBLE_LEFT((char) 0xe662),
        THEI_ANGLE_DOUBLE_DOWN((char) 0xe663),
        THEI_ZIP((char) 0xe664),
        THEI_WORLD((char) 0xe665),
        THEI_WHEELCHAIR((char) 0xe666),
        THEI_VIEW_LIST((char) 0xe667),
        THEI_VIEW_LIST_ALT((char) 0xe668),
        THEI_VIEW_GRID((char) 0xe669),
        THEI_UPPERCASE((char) 0xe66a),
        THEI_UPLOAD((char) 0xe66b),
        THEI_UNDERLINE((char) 0xe66c),
        THEI_TRUCK((char) 0xe66d),
        THEI_TIMER((char) 0xe66e),
        THEI_TICKET((char) 0xe66f),
        THEI_THUMB_UP((char) 0xe670),
        THEI_THUMB_DOWN((char) 0xe671),
        THEI_TEXT((char) 0xe672),
        THEI_STATS_UP((char) 0xe673),
        THEI_STATS_DOWN((char) 0xe674),
        THEI_SPLIT_V((char) 0xe675),
        THEI_SPLIT_H((char) 0xe676),
        THEI_SMALLCAP((char) 0xe677),
        THEI_SHINE((char) 0xe678),
        THEI_SHIFT_RIGHT((char) 0xe679),
        THEI_SHIFT_LEFT((char) 0xe67a),
        THEI_SHIELD((char) 0xe67b),
        THEI_NOTEPAD((char) 0xe67c),
        THEI_SERVER((char) 0xe67d),
        THEI_QUOTE_RIGHT((char) 0xe67e),
        THEI_QUOTE_LEFT((char) 0xe67f),
        THEI_PULSE((char) 0xe680),
        THEI_PRINTER((char) 0xe681),
        THEI_POWER_OFF((char) 0xe682),
        THEI_PLUG((char) 0xe683),
        THEI_PIE_CHART((char) 0xe684),
        THEI_PARAGRAPH((char) 0xe685),
        THEI_PANEL((char) 0xe686),
        THEI_PACKAGE((char) 0xe687),
        THEI_MUSIC((char) 0xe688),
        THEI_MUSIC_ALT((char) 0xe689),
        THEI_MOUSE((char) 0xe68a),
        THEI_MOUSE_ALT((char) 0xe68b),
        THEI_MONEY((char) 0xe68c),
        THEI_MICROPHONE((char) 0xe68d),
        THEI_MENU((char) 0xe68e),
        THEI_MENU_ALT((char) 0xe68f),
        THEI_MAP((char) 0xe690),
        THEI_MAP_ALT((char) 0xe691),
        THEI_LOOP((char) 0xe692),
        THEI_LOCATION_PIN((char) 0xe693),
        THEI_LIST((char) 0xe694),
        THEI_LIGHT_BULB((char) 0xe695),
        THEI_ITALIC((char) 0xe696),
        THEI_INFO((char) 0xe697),
        THEI_INFINITE((char) 0xe698),
        THEI_ID_BADGE((char) 0xe699),
        THEI_HUMMER((char) 0xe69a),
        THEI_HOME((char) 0xe69b),
        THEI_HELP((char) 0xe69c),
        THEI_HEADPHONE((char) 0xe69d),
        THEI_HARDDRIVES((char) 0xe69e),
        THEI_HARDDRIVE((char) 0xe69f),
        THEI_GIFT((char) 0xe6a0),
        THEI_GAME((char) 0xe6a1),
        THEI_FILTER((char) 0xe6a2),
        THEI_FILES((char) 0xe6a3),
        THEI_FILE((char) 0xe6a4),
        THEI_ERASER((char) 0xe6a5),
        THEI_ENVELOPE((char) 0xe6a6),
        THEI_DOWNLOAD((char) 0xe6a7),
        THEI_DIRECTION((char) 0xe6a8),
        THEI_DIRECTION_ALT((char) 0xe6a9),
        THEI_DASHBOARD((char) 0xe6aa),
        THEI_CONTROL_STOP((char) 0xe6ab),
        THEI_CONTROL_SHUFFLE((char) 0xe6ac),
        THEI_CONTROL_PLAY((char) 0xe6ad),
        THEI_CONTROL_PAUSE((char) 0xe6ae),
        THEI_CONTROL_FORWARD((char) 0xe6af),
        THEI_CONTROL_BACKWARD((char) 0xe6b0),
        THEI_CLOUD((char) 0xe6b1),
        THEI_CLOUD_UP((char) 0xe6b2),
        THEI_CLOUD_DOWN((char) 0xe6b3),
        THEI_CLIPBOARD((char) 0xe6b4),
        THEI_CAR((char) 0xe6b5),
        THEI_CALENDAR((char) 0xe6b6),
        THEI_BOOK((char) 0xe6b7),
        THEI_BELL((char) 0xe6b8),
        THEI_BASKETBALL((char) 0xe6b9),
        THEI_BAR_CHART((char) 0xe6ba),
        THEI_BAR_CHART_ALT((char) 0xe6bb),
        THEI_BACK_RIGHT((char) 0xe6bc),
        THEI_BACK_LEFT((char) 0xe6bd),
        THEI_ARROWS_CORNER((char) 0xe6be),
        THEI_ARCHIVE((char) 0xe6bf),
        THEI_ANCHOR((char) 0xe6c0),
        THEI_ALIGN_RIGHT((char) 0xe6c1),
        THEI_ALIGN_LEFT((char) 0xe6c2),
        THEI_ALIGN_JUSTIFY((char) 0xe6c3),
        THEI_ALIGN_CENTER((char) 0xe6c4),
        THEI_ALERT((char) 0xe6c5),
        THEI_ALARM_CLOCK((char) 0xe6c6),
        THEI_AGENDA((char) 0xe6c7),
        THEI_WRITE((char) 0xe6c8),
        THEI_WINDOW((char) 0xe6c9),
        THEI_WIDGETIZED((char) 0xe6ca),
        THEI_WIDGET((char) 0xe6cb),
        THEI_WIDGET_ALT((char) 0xe6cc),
        THEI_WALLET((char) 0xe6cd),
        THEI_VIDEO_CLAPPER((char) 0xe6ce),
        THEI_VIDEO_CAMERA((char) 0xe6cf),
        THEI_VECTOR((char) 0xe6d0),
        THEI_THEMIFY_LOGO((char) 0xe6d1),
        THEI_THEMIFY_FAVICON((char) 0xe6d2),
        THEI_THEMIFY_FAVICON_ALT((char) 0xe6d3),
        THEI_SUPPORT((char) 0xe6d4),
        THEI_STAMP((char) 0xe6d5),
        THEI_SPLIT_V_ALT((char) 0xe6d6),
        THEI_SLICE((char) 0xe6d7),
        THEI_SHORTCODE((char) 0xe6d8),
        THEI_SHIFT_RIGHT_ALT((char) 0xe6d9),
        THEI_SHIFT_LEFT_ALT((char) 0xe6da),
        THEI_RULER_ALT_2((char) 0xe6db),
        THEI_RECEIPT((char) 0xe6dc),
        THEI_PIN2((char) 0xe6dd),
        THEI_PIN_ALT((char) 0xe6de),
        THEI_PENCIL_ALT2((char) 0xe6df),
        THEI_PALETTE((char) 0xe6e0),
        THEI_MORE((char) 0xe6e1),
        THEI_MORE_ALT((char) 0xe6e2),
        THEI_MICROPHONE_ALT((char) 0xe6e3),
        THEI_MAGNET((char) 0xe6e4),
        THEI_LINE_DOUBLE((char) 0xe6e5),
        THEI_LINE_DOTTED((char) 0xe6e6),
        THEI_LINE_DASHED((char) 0xe6e7),
        THEI_LAYOUT_WIDTH_FULL((char) 0xe6e8),
        THEI_LAYOUT_WIDTH_DEFAULT((char) 0xe6e9),
        THEI_LAYOUT_WIDTH_DEFAULT_ALT((char) 0xe6ea),
        THEI_LAYOUT_TAB((char) 0xe6eb),
        THEI_LAYOUT_TAB_WINDOW((char) 0xe6ec),
        THEI_LAYOUT_TAB_V((char) 0xe6ed),
        THEI_LAYOUT_TAB_MIN((char) 0xe6ee),
        THEI_LAYOUT_SLIDER((char) 0xe6ef),
        THEI_LAYOUT_SLIDER_ALT((char) 0xe6f0),
        THEI_LAYOUT_SIDEBAR_RIGHT((char) 0xe6f1),
        THEI_LAYOUT_SIDEBAR_NONE((char) 0xe6f2),
        THEI_LAYOUT_SIDEBAR_LEFT((char) 0xe6f3),
        THEI_LAYOUT_PLACEHOLDER((char) 0xe6f4),
        THEI_LAYOUT_MENU((char) 0xe6f5),
        THEI_LAYOUT_MENU_V((char) 0xe6f6),
        THEI_LAYOUT_MENU_SEPARATED((char) 0xe6f7),
        THEI_LAYOUT_MENU_FULL((char) 0xe6f8),
        THEI_LAYOUT_MEDIA_RIGHT_ALT((char) 0xe6f9),
        THEI_LAYOUT_MEDIA_RIGHT((char) 0xe6fa),
        THEI_LAYOUT_MEDIA_OVERLAY((char) 0xe6fb),
        THEI_LAYOUT_MEDIA_OVERLAY_ALT((char) 0xe6fc),
        THEI_LAYOUT_MEDIA_OVERLAY_ALT_2((char) 0xe6fd),
        THEI_LAYOUT_MEDIA_LEFT_ALT((char) 0xe6fe),
        THEI_LAYOUT_MEDIA_LEFT((char) 0xe6ff),
        THEI_LAYOUT_MEDIA_CENTER_ALT((char) 0xe700),
        THEI_LAYOUT_MEDIA_CENTER((char) 0xe701),
        THEI_LAYOUT_LIST_THUMB((char) 0xe702),
        THEI_LAYOUT_LIST_THUMB_ALT((char) 0xe703),
        THEI_LAYOUT_LIST_POST((char) 0xe704),
        THEI_LAYOUT_LIST_LARGE_IMAGE((char) 0xe705),
        THEI_LAYOUT_LINE_SOLID((char) 0xe706),
        THEI_LAYOUT_GRID4((char) 0xe707),
        THEI_LAYOUT_GRID3((char) 0xe708),
        THEI_LAYOUT_GRID2((char) 0xe709),
        THEI_LAYOUT_GRID2_THUMB((char) 0xe70a),
        THEI_LAYOUT_CTA_RIGHT((char) 0xe70b),
        THEI_LAYOUT_CTA_LEFT((char) 0xe70c),
        THEI_LAYOUT_CTA_CENTER((char) 0xe70d),
        THEI_LAYOUT_CTA_BTN_RIGHT((char) 0xe70e),
        THEI_LAYOUT_CTA_BTN_LEFT((char) 0xe70f),
        THEI_LAYOUT_COLUMN4((char) 0xe710),
        THEI_LAYOUT_COLUMN3((char) 0xe711),
        THEI_LAYOUT_COLUMN2((char) 0xe712),
        THEI_LAYOUT_ACCORDION_SEPARATED((char) 0xe713),
        THEI_LAYOUT_ACCORDION_MERGED((char) 0xe714),
        THEI_LAYOUT_ACCORDION_LIST((char) 0xe715),
        THEI_INK_PEN((char) 0xe716),
        THEI_INFO_ALT((char) 0xe717),
        THEI_HELP_ALT((char) 0xe718),
        THEI_HEADPHONE_ALT((char) 0xe719),
        THEI_HAND_POINT_UP((char) 0xe71a),
        THEI_HAND_POINT_RIGHT((char) 0xe71b),
        THEI_HAND_POINT_LEFT((char) 0xe71c),
        THEI_HAND_POINT_DOWN((char) 0xe71d),
        THEI_GALLERY((char) 0xe71e),
        THEI_FACE_SMILE((char) 0xe71f),
        THEI_FACE_SAD((char) 0xe720),
        THEI_CREDIT_CARD((char) 0xe721),
        THEI_CONTROL_SKIP_FORWARD((char) 0xe722),
        THEI_CONTROL_SKIP_BACKWARD((char) 0xe723),
        THEI_CONTROL_RECORD((char) 0xe724),
        THEI_CONTROL_EJECT((char) 0xe725),
        THEI_COMMENTS_SMILEY((char) 0xe726),
        THEI_BRUSH_ALT((char) 0xe727),
        THEI_YOUTUBE((char) 0xe728),
        THEI_VIMEO((char) 0xe729),
        THEI_TWITTER((char) 0xe72a),
        THEI_TIME((char) 0xe72b),
        THEI_TUMBLR((char) 0xe72c),
        THEI_SKYPE((char) 0xe72d),
        THEI_SHARE((char) 0xe72e),
        THEI_SHARE_ALT((char) 0xe72f),
        THEI_ROCKET((char) 0xe730),
        THEI_PINTEREST((char) 0xe731),
        THEI_NEW_WINDOW((char) 0xe732),
        THEI_MICROSOFT((char) 0xe733),
        THEI_LIST_OL((char) 0xe734),
        THEI_LINKEDIN((char) 0xe735),
        THEI_LAYOUT_SIDEBAR_2((char) 0xe736),
        THEI_LAYOUT_GRID4_ALT((char) 0xe737),
        THEI_LAYOUT_GRID3_ALT((char) 0xe738),
        THEI_LAYOUT_GRID2_ALT((char) 0xe739),
        THEI_LAYOUT_COLUMN4_ALT((char) 0xe73a),
        THEI_LAYOUT_COLUMN3_ALT((char) 0xe73b),
        THEI_LAYOUT_COLUMN2_ALT((char) 0xe73c),
        THEI_INSTAGRAM((char) 0xe73d),
        THEI_GOOGLE((char) 0xe73e),
        THEI_GITHUB((char) 0xe73f),
        THEI_FLICKR((char) 0xe740),
        THEI_FACEBOOK((char) 0xe741),
        THEI_DROPBOX((char) 0xe742),
        THEI_DRIBBBLE((char) 0xe743),
        THEI_APPLE((char) 0xe744),
        THEI_SAVE((char) 0xe746),
        THEI_SAVE_ALT((char) 0xe747),
        THEI_YAHOO((char) 0xe748),
        THEI_WORDPRESS((char) 0xe749),
        THEI_VIMEO_ALT((char) 0xe74a),
        THEI_TWITTER_ALT((char) 0xe74b),
        THEI_TUMBLR_ALT((char) 0xe74c),
        THEI_TRELLO((char) 0xe74d),
        THEI_STACK_OVERFLOW((char) 0xe74e),
        THEI_SOUNDCLOUD((char) 0xe74f),
        THEI_SHARETHIS((char) 0xe750),
        THEI_SHARETHIS_ALT((char) 0xe751),
        THEI_REDDIT((char) 0xe752),
        THEI_PINTEREST_ALT((char) 0xe753),
        THEI_MICROSOFT_ALT((char) 0xe754),
        THEI_LINUX((char) 0xe755),
        THEI_JSFIDDLE((char) 0xe756),
        THEI_JOOMLA((char) 0xe757),
        THEI_HTML5((char) 0xe758),
        THEI_FLICKR_ALT((char) 0xe759),
        THEI_EMAIL((char) 0xe75a),
        THEI_DRUPAL((char) 0xe75b),
        THEI_DROPBOX_ALT((char) 0xe75c),
        THEI_CSS3((char) 0xe75d),
        THEI_RSS((char) 0xe75e),
        THEI_RSS_ALT((char) 0xe75f);

        char themifyIconsCharacter;

        Icon(char character) {
            this.themifyIconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return themifyIconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface themifyIconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (themifyIconsTypeface == null) {
                setTypeface(new ThemifyIcons());
            }
            return themifyIconsTypeface;
        }

        private static void setTypeface(ThemifyIcons themifyIconsTypeface) {
            Icon.themifyIconsTypeface = themifyIconsTypeface;
        }
    }
}
