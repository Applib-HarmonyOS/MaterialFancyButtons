package com.rilixtech.vaadiniconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the VaadinIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class VaadinIcons implements MfbTypeface {
    private static final String TTF_FILE = "vaadin-icons-v4.1.0.ttf";
    private static final String VAADIN_ICONS_PREFIX = "VAAI";
    public static final String VAADIN_ICONS_NAME = "Vaadin Icons";
    public static final String VAADIN_ICONS_VERSION = "4" + ".1.0";
    public static final String VAADIN_ICONS_AUTHOR = "Jarmo Kemppainen";
    public static final String VAADIN_ICONS_URL = "https://vaadin.com/icons/";
    public static final String VAADIN_ICONS_DESC = "Vaadin Icons is a set of 600+ icons designed for web applications."
            + " Free to use, anywhere!";
    public static final String VAADIN_ICONS_LICENSE = "Creative Commons licenses: CC-BY license";
    public static final String VAADIN_ICONS_LICENSE_URL = "https://creativecommons.org/licenses/by/4.0/";

    private static Font vaadinIconsTypeface = null;
    private static HashMap<String, Character> vaadinIconsCharMap;

    /**
     * VaadinIcons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which VaadinIcons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the VaadinIcons icon characters in a HashMap.
     *
     * @return HashMap of all VaadinIcons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (vaadinIconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.vaadinIconsCharacter);
            }
            setChars(characterHashMap);
        }
        return vaadinIconsCharMap;
    }

    /**
     * Set the VaadinIcons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        vaadinIconsCharMap = characterHashMap;
    }

    /**
     * Return the VaadinIcons Mapping Prefix.
     *
     * @return VaadinIcons Mapping Prefix, used by all VaadinIcons icons.
     */
    @Override public String getMappingPrefix() {
        return VAADIN_ICONS_PREFIX;
    }

    @Override public String getFontName() {
        return VAADIN_ICONS_NAME;
    }

    @Override public String getVersion() {
        return VAADIN_ICONS_VERSION;
    }

    @Override public int getIconCount() {
        return vaadinIconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> vaadinIconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            vaadinIconsKeyList.add(value.name());
        }
        return vaadinIconsKeyList;
    }

    @Override public String getAuthor() {
        return VAADIN_ICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return VAADIN_ICONS_URL;
    }

    @Override public String getDescription() {
        return VAADIN_ICONS_DESC;
    }

    @Override public String getLicense() {
        return VAADIN_ICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return VAADIN_ICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (vaadinIconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return vaadinIconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        vaadinIconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by VaadinIcons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        VAAI_ABACUS((char) 0xe682),
        VAAI_ABSOLUTE_POSITION((char) 0xe61e),
        VAAI_ACCESSIBILITY((char) 0xe683),
        VAAI_ACCORDION_MENU((char) 0xe61f),
        VAAI_ADD_DOCK((char) 0xe620),
        VAAI_ADJUST((char) 0xe74a),
        VAAI_AIRPLANE((char) 0xe684),
        VAAI_ALIGN_CENTER((char) 0xe74b),
        VAAI_ALIGN_JUSTIFY((char) 0xe7ae),
        VAAI_ALIGN_LEFT((char) 0xe74c),
        VAAI_ALIGN_RIGHT((char) 0xe74d),
        VAAI_ANCHOR((char) 0xe685),
        VAAI_ANGLE_DOUBLE_DOWN((char) 0xe6e6),
        VAAI_ANGLE_DOUBLE_LEFT((char) 0xe6e7),
        VAAI_ANGLE_DOUBLE_RIGHT((char) 0xe6e8),
        VAAI_ANGLE_DOUBLE_UP((char) 0xe6e9),
        VAAI_ANGLE_DOWN((char) 0xe6ea),
        VAAI_ANGLE_LEFT((char) 0xe6eb),
        VAAI_ANGLE_RIGHT((char) 0xe6ec),
        VAAI_ANGLE_UP((char) 0xe6ed),
        VAAI_ARCHIVE((char) 0xe6ee),
        VAAI_ARCHIVES((char) 0xe621),
        VAAI_AREA_SELECT((char) 0xe806),
        VAAI_ARROW_BACKWARD((char) 0xe622),
        VAAI_ARROW_CIRCLE_DOWN((char) 0xe6f0),
        VAAI_ARROW_CIRCLE_DOWN_O((char) 0xe6ef),
        VAAI_ARROW_CIRCLE_LEFT((char) 0xe6f2),
        VAAI_ARROW_CIRCLE_LEFT_O((char) 0xe6f1),
        VAAI_ARROW_CIRCLE_RIGHT((char) 0xe6f4),
        VAAI_ARROW_CIRCLE_RIGHT_O((char) 0xe6f3),
        VAAI_ARROW_CIRCLE_UP((char) 0xe6f6),
        VAAI_ARROW_CIRCLE_UP_O((char) 0xe6f5),
        VAAI_ARROW_DOWN((char) 0xe7af),
        VAAI_ARROW_FORWARD((char) 0xe623),
        VAAI_ARROW_LEFT((char) 0xe7b0),
        VAAI_ARROW_LONG_DOWN((char) 0xe74e),
        VAAI_ARROW_LONG_LEFT((char) 0xe74f),
        VAAI_ARROW_RIGHT((char) 0xe7b1),
        VAAI_ARROW_UP((char) 0xe7b2),
        VAAI_ARROWS((char) 0xe755),
        VAAI_ARROWS_CROSS((char) 0xe750),
        VAAI_ARROWS_LONG_H((char) 0xe751),
        VAAI_ARROWS_LONG_RIGHT((char) 0xe752),
        VAAI_ARROWS_LONG_UP((char) 0xe753),
        VAAI_ARROWS_LONG_V((char) 0xe754),
        VAAI_ASTERISK((char) 0xe686),
        VAAI_AT((char) 0xe624),
        VAAI_AUTOMATION((char) 0xe687),
        VAAI_BACKWARDS((char) 0xe756),
        VAAI_BAN((char) 0xe6f7),
        VAAI_BAR_CHART((char) 0xe757),
        VAAI_BARCODE((char) 0xe688),
        VAAI_MENU((char) 0xe7b3),
        VAAI_BELL((char) 0xe7b4),
        VAAI_BELL_O((char) 0xe758),
        VAAI_BELL_SLASH((char) 0xe626),
        VAAI_BELL_SLASH_O((char) 0xe625),
        VAAI_BOAT((char) 0xe627),
        VAAI_BOLD((char) 0xe6f8),
        VAAI_BOLT((char) 0xe759),
        VAAI_BOMB((char) 0xe689),
        VAAI_BOOK((char) 0xe6f9),
        VAAI_BOOK_DOLLAR((char) 0xe600),
        VAAI_BOOK_PERCENT((char) 0xe601),
        VAAI_BOOKMARK((char) 0xe7b6),
        VAAI_BOOKMARK_O((char) 0xe7b5),
        VAAI_BRIEFCASE((char) 0xe602),
        VAAI_BROWSER((char) 0xe628),
        VAAI_BUG((char) 0xe68b),
        VAAI_BUG_O((char) 0xe68a),
        VAAI_BUILDING((char) 0xe7b8),
        VAAI_BUILDING_O((char) 0xe7b7),
        VAAI_BULLETS((char) 0xe629),
        VAAI_BULLSEYE((char) 0xe6fa),
        VAAI_BUTTON((char) 0xe62a),
        VAAI_CALC((char) 0xe68c),
        VAAI_CALC_BOOK((char) 0xe62b),
        VAAI_CALENDAR((char) 0xe7ba),
        VAAI_CALENDAR_BRIEFCASE((char) 0xe604),
        VAAI_CALENDAR_CLOCK((char) 0xe605),
        VAAI_CALENDAR_ENVELOPE((char) 0xe62c),
        VAAI_CALENDAR_O((char) 0xe7b9),
        VAAI_CALENDAR_USER((char) 0xe606),
        VAAI_CAMERA((char) 0xe7bb),
        VAAI_CAR((char) 0xe62d),
        VAAI_CARET_DOWN((char) 0xe7bc),
        VAAI_CARET_LEFT((char) 0xe7bd),
        VAAI_CARET_RIGHT((char) 0xe7be),
        VAAI_CARET_SQUARE_DOWN_O((char) 0xe7bf),
        VAAI_CARET_SQUARE_LEFT_O((char) 0xe7c0),
        VAAI_CARET_SQUARE_RIGHT_O((char) 0xe7c1),
        VAAI_CARET_SQUARE_UP_O((char) 0xe7c2),
        VAAI_CARET_UP((char) 0xe7c3),
        VAAI_CART((char) 0xe6fc),
        VAAI_CART_O((char) 0xe6fb),
        VAAI_CHART((char) 0xe68e),
        VAAI_CHART_LINE((char) 0xe68d),
        VAAI_CHAT((char) 0xe75a),
        VAAI_CHECK((char) 0xe75b),
        VAAI_CHECK_CIRCLE((char) 0xe7c5),
        VAAI_CHECK_CIRCLE_O((char) 0xe7c4),
        VAAI_CHECK_SQUARE((char) 0xe62e),
        VAAI_CHECK_SQUARE_O((char) 0xe6fd),
        VAAI_CHEVRON_CIRCLE_DOWN((char) 0xe7c7),
        VAAI_CHEVRON_CIRCLE_DOWN_O((char) 0xe7c6),
        VAAI_CHEVRON_CIRCLE_LEFT((char) 0xe7c9),
        VAAI_CHEVRON_CIRCLE_LEFT_O((char) 0xe7c8),
        VAAI_CHEVRON_CIRCLE_RIGHT((char) 0xe7cb),
        VAAI_CHEVRON_CIRCLE_RIGHT_O((char) 0xe7ca),
        VAAI_CHEVRON_CIRCLE_UP((char) 0xe7cd),
        VAAI_CHEVRON_CIRCLE_UP_O((char) 0xe7cc),
        VAAI_CHEVRON_DOWN((char) 0xe7ce),
        VAAI_CHEVRON_LEFT((char) 0xe7cf),
        VAAI_CHEVRON_RIGHT((char) 0xe7d0),
        VAAI_CHEVRON_UP((char) 0xe7d1),
        VAAI_CHILD((char) 0xe62f),
        VAAI_CIRCLE((char) 0xe75d),
        VAAI_CIRCLE_THIN((char) 0xe75c),
        VAAI_CLIPBOARD((char) 0xe635),
        VAAI_CLIPBOARD_CROSS((char) 0xe630),
        VAAI_CLIPBOARD_HEART((char) 0xe631),
        VAAI_CLIPBOARD_PULSE((char) 0xe632),
        VAAI_CLIPBOARD_TEXT((char) 0xe633),
        VAAI_CLIPBOARD_USER((char) 0xe634),
        VAAI_CLOCK((char) 0xe7d2),
        VAAI_CLOUD((char) 0xe763),
        VAAI_CLOUD_DOWNLOAD((char) 0xe75f),
        VAAI_CLOUD_DOWNLOAD_O((char) 0xe75e),
        VAAI_CLOUD_O((char) 0xe760),
        VAAI_CLOUD_UPLOAD((char) 0xe762),
        VAAI_CLOUD_UPLOAD_O((char) 0xe761),
        VAAI_CODE((char) 0xe68f),
        VAAI_COFFEE((char) 0xe690),
        VAAI_COG((char) 0xe7d3),
        VAAI_COG_O((char) 0xe764),
        VAAI_COGS((char) 0xe691),
        VAAI_COMBOBOX((char) 0xe636),
        VAAI_COMMENT((char) 0xe768),
        VAAI_COMMENT_ELLIPSIS((char) 0xe766),
        VAAI_COMMENT_ELLIPSIS_O((char) 0xe765),
        VAAI_COMMENT_O((char) 0xe767),
        VAAI_COMMENTS((char) 0xe76a),
        VAAI_COMMENTS_O((char) 0xe769),
        VAAI_COMPRESS((char) 0xe76b),
        VAAI_COMPRESS_SQUARE((char) 0xe637),
        VAAI_CONNECT((char) 0xe76d),
        VAAI_CONNECT_O((char) 0xe76c),
        VAAI_CONTROLLER((char) 0xe692),
        VAAI_COPY((char) 0xe7d5),
        VAAI_COPY_O((char) 0xe7d4),
        VAAI_COPYRIGHT((char) 0xe638),
        VAAI_CORNER_LOWER_LEFT((char) 0xe693),
        VAAI_CORNER_LOWER_RIGHT((char) 0xe694),
        VAAI_CORNER_UPPER_LEFT((char) 0xe695),
        VAAI_CORNER_UPPER_RIGHT((char) 0xe696),
        VAAI_CREDIT_CARD((char) 0xe76e),
        VAAI_CROP((char) 0xe76f),
        VAAI_CROSS_CUTLERY((char) 0xe6fe),
        VAAI_CROSSHAIRS((char) 0xe7d6),
        VAAI_CSS((char) 0xe639),
        VAAI_CUBE((char) 0xe697),
        VAAI_CUBES((char) 0xe698),
        VAAI_CURLY_BRACKETS((char) 0xe63a),
        VAAI_CUTLERY((char) 0xe6ff),
        VAAI_DASHBOARD((char) 0xe700),
        VAAI_DATE_INPUT((char) 0xe63b),
        VAAI_DEINDENT((char) 0xe770),
        VAAI_DENTAL_CHAIR((char) 0xe607),
        VAAI_DESKTOP((char) 0xe7d7),
        VAAI_DISC((char) 0xe701),
        VAAI_DOCTOR((char) 0xe609),
        VAAI_DOCTOR_BRIEFCASE((char) 0xe608),
        VAAI_DOLLAR((char) 0xe60a),
        VAAI_DOT_CIRCLE((char) 0xe702),
        VAAI_DOWNLOAD((char) 0xe703),
        VAAI_DOWNLOAD_ALT((char) 0xe699),
        VAAI_INSERT((char) 0xe7d8),
        VAAI_DROP((char) 0xe704),
        VAAI_EDIT((char) 0xe771),
        VAAI_EJECT((char) 0xe772),
        VAAI_ELASTIC((char) 0xe63c),
        VAAI_ELLIPSIS_CIRCLE((char) 0xe7da),
        VAAI_ELLIPSIS_CIRCLE_O((char) 0xe7d9),
        VAAI_ELLIPSIS_H((char) 0xe773),
        VAAI_ELLIPSIS_V((char) 0xe774),
        VAAI_ENVELOPE((char) 0xe7dc),
        VAAI_ENVELOPE_O((char) 0xe7db),
        VAAI_ENVELOPE_OPEN((char) 0xe63e),
        VAAI_ENVELOPE_OPEN_O((char) 0xe63d),
        VAAI_ERASER((char) 0xe69a),
        VAAI_EXCHANGE((char) 0xe705),
        VAAI_EXCLAMATION((char) 0xe708),
        VAAI_EXCLAMATION_CIRCLE((char) 0xe707),
        VAAI_EXCLAMATION_CIRCLE_O((char) 0xe706),
        VAAI_EXIT((char) 0xe60c),
        VAAI_EXIT_O((char) 0xe60b),
        VAAI_EXPAND((char) 0xe776),
        VAAI_EXPAND_FULL((char) 0xe775),
        VAAI_EXPAND_SQUARE((char) 0xe7dd),
        VAAI_EXTERNAL_BROWSER((char) 0xe63f),
        VAAI_EXTERNAL_LINK((char) 0xe7de),
        VAAI_EYE((char) 0xe7df),
        VAAI_EYE_SLASH((char) 0xe709),
        VAAI_EYEDROPPER((char) 0xe640),
        VAAI_FACEBOOK((char) 0xe69c),
        VAAI_FACEBOOK_SQUARE((char) 0xe69b),
        VAAI_FACTORY((char) 0xe641),
        VAAI_FAST_BACKWARD((char) 0xe777),
        VAAI_FAST_FORWARD((char) 0xe778),
        VAAI_FEMALE((char) 0xe69d),
        VAAI_FILE((char) 0xe7e3),
        VAAI_FILE_CODE((char) 0xe70a),
        VAAI_FILE_FONT((char) 0xe69e),
        VAAI_FILE_MOVIE((char) 0xe70b),
        VAAI_FILE_O((char) 0xe7e0),
        VAAI_FILE_PICTURE((char) 0xe70c),
        VAAI_FILE_PRESENTATION((char) 0xe69f),
        VAAI_FILE_PROCESS((char) 0xe642),
        VAAI_FILE_REFRESH((char) 0xe643),
        VAAI_FILE_SOUND((char) 0xe70d),
        VAAI_FILE_START((char) 0xe644),
        VAAI_FILE_TABLE((char) 0xe6a0),
        VAAI_FILE_TEXT((char) 0xe7e2),
        VAAI_FILE_TEXT_O((char) 0xe7e1),
        VAAI_FILE_TREE((char) 0xe647),
        VAAI_FILE_TREE_SMALL((char) 0xe645),
        VAAI_FILE_TREE_SUB((char) 0xe646),
        VAAI_FILE_ZIP((char) 0xe70e),
        VAAI_FILL((char) 0xe6a1),
        VAAI_FILM((char) 0xe779),
        VAAI_FILTER((char) 0xe6a2),
        VAAI_FIRE((char) 0xe6a3),
        VAAI_FLAG((char) 0xe711),
        VAAI_FLAG_CHECKERED((char) 0xe70f),
        VAAI_FLAG_O((char) 0xe710),
        VAAI_ADOBE_FLASH((char) 0xe648),
        VAAI_FLASH((char) 0xe712),
        VAAI_FLASK((char) 0xe7e4),
        VAAI_FLIP_H((char) 0xe649),
        VAAI_FLIP_V((char) 0xe64a),
        VAAI_FOLDER((char) 0xe7e6),
        VAAI_FOLDER_O((char) 0xe7e5),
        VAAI_FOLDER_OPEN((char) 0xe77b),
        VAAI_FOLDER_OPEN_O((char) 0xe77a),
        VAAI_FONT((char) 0xe713),
        VAAI_FORM((char) 0xe64b),
        VAAI_FORWARD((char) 0xe77c),
        VAAI_FROWN_O((char) 0xe6a4),
        VAAI_FUNCION((char) 0xe64c),
        VAAI_GAMEPAD((char) 0xe714),
        VAAI_GAVEL((char) 0xe6a5),
        VAAI_GIFT((char) 0xe715),
        VAAI_GLASS((char) 0xe77d),
        VAAI_GLOBE((char) 0xe77e),
        VAAI_GLASSES((char) 0xe7e7),
        VAAI_GOLF((char) 0xe60d),
        VAAI_GOOGLE_PLUS((char) 0xe6a7),
        VAAI_GOOGLE_PLUS_SQUARE((char) 0xe6a6),
        VAAI_GRAB((char) 0xe64d),
        VAAI_GRID((char) 0xe651),
        VAAI_GRID_BEVEL((char) 0xe64e),
        VAAI_GRID_BIG((char) 0xe7e9),
        VAAI_GRID_BIG_O((char) 0xe7e8),
        VAAI_GRID_H((char) 0xe64f),
        VAAI_GRID_SMALL((char) 0xe7eb),
        VAAI_GRID_SMALL_O((char) 0xe7ea),
        VAAI_GRID_V((char) 0xe650),
        VAAI_GROUP((char) 0xe60e),
        VAAI_HAND((char) 0xe652),
        VAAI_HANDLE_CORNER((char) 0xe716),
        VAAI_HANDS_UP((char) 0xe6a8),
        VAAI_HARDDRIVE((char) 0xe718),
        VAAI_HARDDRIVE_O((char) 0xe717),
        VAAI_HASH((char) 0xe6a9),
        VAAI_HEADER((char) 0xe719),
        VAAI_HEADPHONES((char) 0xe71a),
        VAAI_HEALTH_CARD((char) 0xe60f),
        VAAI_HEART((char) 0xe780),
        VAAI_HEART_O((char) 0xe77f),
        VAAI_HOME((char) 0xe7ed),
        VAAI_HOME_O((char) 0xe7ec),
        VAAI_INBOX((char) 0xe71b),
        VAAI_INDENT((char) 0xe781),
        VAAI_INFO((char) 0xe71e),
        VAAI_INFO_CIRCLE((char) 0xe71d),
        VAAI_INFO_CIRCLE_O((char) 0xe71c),
        VAAI_INPUT((char) 0xe653),
        VAAI_INSTITUTION((char) 0xe6aa),
        VAAI_INVOICE((char) 0xe610),
        VAAI_LIST_OL((char) 0xe71f),
        VAAI_ITALIC((char) 0xe720),
        VAAI_KEY((char) 0xe6ac),
        VAAI_KEY_O((char) 0xe6ab),
        VAAI_KEYBOARD((char) 0xe722),
        VAAI_KEYBOARD_O((char) 0xe721),
        VAAI_LAPTOP((char) 0xe782),
        VAAI_LAYOUT((char) 0xe654),
        VAAI_LEVEL_DOWN((char) 0xe783),
        VAAI_LEVEL_DOWN_BOLD((char) 0xe611),
        VAAI_LEVEL_LEFT((char) 0xe784),
        VAAI_LEVEL_LEFT_BOLD((char) 0xe612),
        VAAI_LEVEL_RIGHT((char) 0xe785),
        VAAI_LEVEL_RIGHT_BOLD((char) 0xe655),
        VAAI_LEVEL_UP((char) 0xe786),
        VAAI_LEVEL_UP_BOLD((char) 0xe613),
        VAAI_LIFEBUOY((char) 0xe6ad),
        VAAI_LIGHTBULB((char) 0xe6ae),
        VAAI_LINE_H((char) 0xe723),
        VAAI_LINE_V((char) 0xe724),
        VAAI_LINES((char) 0xe7ef),
        VAAI_LINES_LIST((char) 0xe7ee),
        VAAI_LINK((char) 0xe725),
        VAAI_LIST((char) 0xe7f1),
        VAAI_LIST_SELECT((char) 0xe656),
        VAAI_LIST_UL((char) 0xe7f0),
        VAAI_LOCATION_ARROW((char) 0xe728),
        VAAI_LOCATION_ARROW_CIRCLE((char) 0xe727),
        VAAI_LOCATION_ARROW_CIRCLE_O((char) 0xe726),
        VAAI_LOCK((char) 0xe7f2),
        VAAI_MAGIC((char) 0xe6b1),
        VAAI_MAGNET((char) 0xe787),
        VAAI_MAILBOX((char) 0xe729),
        VAAI_MALE((char) 0xe6b2),
        VAAI_MAP_MARKER((char) 0xe788),
        VAAI_MARGIN((char) 0xe65b),
        VAAI_MARGIN_BOTTOM((char) 0xe657),
        VAAI_MARGIN_LEFT((char) 0xe658),
        VAAI_MARGIN_RIGHT((char) 0xe659),
        VAAI_MARGIN_TOP((char) 0xe65a),
        VAAI_MEDAL((char) 0xe6b3),
        VAAI_MEGAFONE((char) 0xe6b4),
        VAAI_MEH_O((char) 0xe6b5),
        VAAI_MICROPHONE((char) 0xe72a),
        VAAI_MINUS((char) 0xe7f6),
        VAAI_MINUS_CIRCLE((char) 0xe7f4),
        VAAI_MINUS_CIRCLE_O((char) 0xe7f3),
        VAAI_MINUS_SQUARE_O((char) 0xe7f5),
        VAAI_MOBILE((char) 0xe7f7),
        VAAI_MODAL((char) 0xe7f8),
        VAAI_MODAL_LIST((char) 0xe72b),
        VAAI_MONEY((char) 0xe6b6),
        VAAI_MOON((char) 0xe78a),
        VAAI_MOON_O((char) 0xe789),
        VAAI_MOVIE((char) 0xe78b),
        VAAI_MUSIC((char) 0xe78c),
        VAAI_MUTE((char) 0xe72c),
        VAAI_NATIVE_BUTTON((char) 0xe65c),
        VAAI_NOTEBOOK((char) 0xe65d),
        VAAI_OPEN_BOOK((char) 0xe7f9),
        VAAI_OPTIONS((char) 0xe65e),
        VAAI_ORIENTATION((char) 0xe65f),
        VAAI_OUT((char) 0xe614),
        VAAI_OUTBOX((char) 0xe660),
        VAAI_PACKAGE((char) 0xe6b7),
        VAAI_PADDING((char) 0xe665),
        VAAI_PADDING_BOTTOM((char) 0xe661),
        VAAI_PADDING_LEFT((char) 0xe662),
        VAAI_PADDING_RIGHT((char) 0xe663),
        VAAI_PADDING_TOP((char) 0xe664),
        VAAI_PAINT_ROLL((char) 0xe666),
        VAAI_PAINTBRUSH((char) 0xe6b8),
        VAAI_PALETE((char) 0xe667),
        VAAI_PANEL((char) 0xe668),
        VAAI_PAPERCLIP((char) 0xe72d),
        VAAI_PAPERPLANE((char) 0xe6b9),
        VAAI_PAPERPLANE_O((char) 0xe6ba),
        VAAI_PARAGRAPH((char) 0xe6bb),
        VAAI_PASSWORD((char) 0xe669),
        VAAI_PASTE((char) 0xe6bc),
        VAAI_PAUSE((char) 0xe78d),
        VAAI_PENCIL((char) 0xe7fa),
        VAAI_PHONE((char) 0xe7fb),
        VAAI_PICTURE((char) 0xe7fc),
        VAAI_PIE_CHART((char) 0xe6bd),
        VAAI_PILL((char) 0xe615),
        VAAI_PILLS((char) 0xe616),
        VAAI_PIN((char) 0xe7fd),
        VAAI_PIN_POST((char) 0xe6be),
        VAAI_PLAY((char) 0xe78e),
        VAAI_PLAY_CIRCLE((char) 0xe731),
        VAAI_PLAY_CIRCLE_O((char) 0xe72e),
        VAAI_PLUG((char) 0xe66a),
        VAAI_PLUS((char) 0xe801),
        VAAI_PLUS_CIRCLE((char) 0xe7ff),
        VAAI_PLUS_CIRCLE_O((char) 0xe7fe),
        VAAI_PLUS_MINUS((char) 0xe603),
        VAAI_PLUS_SQUARE_O((char) 0xe800),
        VAAI_POINTER((char) 0xe66b),
        VAAI_POWER_OFF((char) 0xe78f),
        VAAI_PRESENTATION((char) 0xe6bf),
        VAAI_PRINT((char) 0xe802),
        VAAI_PROGRESSBAR((char) 0xe66c),
        VAAI_PUZZLE_PIECE((char) 0xe6c0),
        VAAI_QRCODE((char) 0xe6c1),
        VAAI_QUESTION((char) 0xe732),
        VAAI_QUESTION_CIRCLE((char) 0xe730),
        VAAI_QUESTION_CIRCLE_O((char) 0xe72f),
        VAAI_QUOTE_LEFT((char) 0xe6c2),
        VAAI_QUOTE_RIGHT((char) 0xe6c3),
        VAAI_RANDOM((char) 0xe733),
        VAAI_RASTER((char) 0xe6c5),
        VAAI_RASTER_LOWER_LEFT((char) 0xe6c4),
        VAAI_RECYCLE((char) 0xe6c6),
        VAAI_REFRESH((char) 0xe790),
        VAAI_REPLY((char) 0xe792),
        VAAI_REPLY_ALL((char) 0xe791),
        VAAI_RESIZE_H((char) 0xe66d),
        VAAI_RESIZE_V((char) 0xe66e),
        VAAI_RETWEET((char) 0xe793),
        VAAI_RHOMBUS((char) 0xe66f),
        VAAI_ROAD((char) 0xe6c7),
        VAAI_ROAD_BRANCH((char) 0xe670),
        VAAI_ROAD_BRANCHES((char) 0xe671),
        VAAI_ROAD_SPLIT((char) 0xe672),
        VAAI_ROCKET((char) 0xe6c8),
        VAAI_ROTATE_LEFT((char) 0xe794),
        VAAI_ROTATE_RIGHT((char) 0xe795),
        VAAI_RSS((char) 0xe6ca),
        VAAI_RSS_SQUARE((char) 0xe6c9),
        VAAI_SAFE((char) 0xe6cc),
        VAAI_SAFE_LOCK((char) 0xe6cb),
        VAAI_SCISSORS((char) 0xe734),
        VAAI_SCREWDRIVER((char) 0xe735),
        VAAI_SEARCH((char) 0xe805),
        VAAI_SEARCH_MINUS((char) 0xe803),
        VAAI_SEARCH_PLUS((char) 0xe804),
        VAAI_SELECT((char) 0xe673),
        VAAI_DATABASE((char) 0xe737),
        VAAI_SERVER((char) 0xe736),
        VAAI_SHARE((char) 0xe796),
        VAAI_SHARE_SQUARE((char) 0xe6cd),
        VAAI_SHIELD((char) 0xe6ce),
        VAAI_SIGN_IN((char) 0xe797),
        VAAI_SIGN_IN_ALT((char) 0xe6b0),
        VAAI_SIGN_OUT((char) 0xe798),
        VAAI_SIGN_OUT_ALT((char) 0xe6af),
        VAAI_SIGNAL((char) 0xe738),
        VAAI_SITEMAP((char) 0xe739),
        VAAI_SLIDER((char) 0xe674),
        VAAI_SLIDERS((char) 0xe6cf),
        VAAI_SMILEY_O((char) 0xe6d0),
        VAAI_SORT((char) 0xe799),
        VAAI_SOUND_DISABLE((char) 0xe79a),
        VAAI_SPECIALIST((char) 0xe617),
        VAAI_SPINNER((char) 0xe6d3),
        VAAI_SPINNER_ARC((char) 0xe6d1),
        VAAI_SPINNER_THIRD((char) 0xe6d2),
        VAAI_SPLIT((char) 0xe675),
        VAAI_SPLIT_H((char) 0xe807),
        VAAI_SPLIT_V((char) 0xe808),
        VAAI_SPOON((char) 0xe73a),
        VAAI_SQUARE_SHADOW((char) 0xe79b),
        VAAI_STAR((char) 0xe7a1),
        VAAI_STAR_HALF_LEFT((char) 0xe79d),
        VAAI_STAR_HALF_LEFT_O((char) 0xe79c),
        VAAI_STAR_HALF_RIGHT((char) 0xe79f),
        VAAI_STAR_HALF_RIGHT_O((char) 0xe79e),
        VAAI_STAR_O((char) 0xe7a0),
        VAAI_START_COG((char) 0xe676),
        VAAI_STEP_BACKWARD((char) 0xe7a2),
        VAAI_STEP_FORWARD((char) 0xe7a3),
        VAAI_STETHOSCOPE((char) 0xe618),
        VAAI_STOP((char) 0xe7a4),
        VAAI_STOP_COG((char) 0xe677),
        VAAI_STRIKETHROUGH((char) 0xe73b),
        VAAI_SUBSCRIPT((char) 0xe6d4),
        VAAI_SUITCASE((char) 0xe809),
        VAAI_SUN_O((char) 0xe73c),
        VAAI_SUPERSCRIPT((char) 0xe6d5),
        VAAI_SWORD((char) 0xe678),
        VAAI_TABLE((char) 0xe7a5),
        VAAI_TABLET((char) 0xe80a),
        VAAI_TABS((char) 0xe679),
        VAAI_TAG((char) 0xe6d6),
        VAAI_TAGS((char) 0xe6d7),
        VAAI_TASKS((char) 0xe73d),
        VAAI_TAXI((char) 0xe67a),
        VAAI_TERMINAL((char) 0xe6d8),
        VAAI_TEXT_HEIGHT((char) 0xe73e),
        VAAI_TEXT_INPUT((char) 0xe67b),
        VAAI_TEXT_LABEL((char) 0xe67c),
        VAAI_TEXT_WIDTH((char) 0xe73f),
        VAAI_TEETH((char) 0xe619),
        VAAI_THIN_SQUARE((char) 0xe7a6),
        VAAI_TOOTH((char) 0xe67d),
        VAAI_THUMBS_DOWN((char) 0xe6da),
        VAAI_THUMBS_DOWN_O((char) 0xe6d9),
        VAAI_THUMBS_UP((char) 0xe6dc),
        VAAI_THUMBS_UP_O((char) 0xe6db),
        VAAI_TICKET((char) 0xe740),
        VAAI_TIME_BACKWARD((char) 0xe7a7),
        VAAI_TIME_FORWARD((char) 0xe7a8),
        VAAI_TOOLBOX((char) 0xe741),
        VAAI_TOOLS((char) 0xe742),
        VAAI_TRAIN((char) 0xe67e),
        VAAI_TRASH((char) 0xe80b),
        VAAI_TREE_TABLE((char) 0xe67f),
        VAAI_TROPHY((char) 0xe743),
        VAAI_TRUCK((char) 0xe6dd),
        VAAI_TWIN_COL_SELECT((char) 0xe680),
        VAAI_TWITTER((char) 0xe6df),
        VAAI_TWITTER_SQUARE((char) 0xe6de),
        VAAI_UMBRELLA((char) 0xe6e0),
        VAAI_UNDERLINE((char) 0xe744),
        VAAI_UNLINK((char) 0xe745),
        VAAI_UNLOCK((char) 0xe80c),
        VAAI_UPLOAD((char) 0xe746),
        VAAI_UPLOAD_ALT((char) 0xe6e1),
        VAAI_USER((char) 0xe80d),
        VAAI_USER_CARD((char) 0xe61a),
        VAAI_USER_CHECK((char) 0xe61b),
        VAAI_USER_CLOCK((char) 0xe61c),
        VAAI_USER_HEART((char) 0xe61d),
        VAAI_USERS((char) 0xe747),
        VAAI_VAADIN_H((char) 0xe80e),
        VAAI_VAADIN_V((char) 0xe80f),
        VAAI_VIEWPORT((char) 0xe681),
        VAAI_VIMEO((char) 0xe6e3),
        VAAI_VIMEO_SQUARE((char) 0xe6e2),
        VAAI_VOLUME((char) 0xe7ac),
        VAAI_VOLUME_DOWN((char) 0xe7a9),
        VAAI_VOLUME_OFF((char) 0xe7aa),
        VAAI_VOLUME_UP((char) 0xe7ab),
        VAAI_WARNING((char) 0xe748),
        VAAI_WRENCH((char) 0xe749),
        VAAI_CLOSE((char) 0xe7ad),
        VAAI_CLOSE_CIRCLE((char) 0xe811),
        VAAI_CLOSE_CIRCLE_O((char) 0xe810),
        VAAI_YOUTUBE((char) 0xe6e5),
        VAAI_YOUTUBE_SQUARE((char) 0xe6e4),
        VAAI_DIPLOMA((char) 0xe964),
        VAAI_CHEVRON_DOWN_SMALL((char) 0xe965),
        VAAI_CHEVRON_LEFT_SMALL((char) 0xe966),
        VAAI_CHEVRON_RIGHT_SMALL((char) 0xe967),
        VAAI_CHEVRON_UP_SMALL((char) 0xe968),
        VAAI_DIPLOMA_SCROLL((char) 0xe969),
        VAAI_WORKPLACE((char) 0xe900),
        VAAI_CASH((char) 0xe901),
        VAAI_ACADEMY_CAP((char) 0xe902),
        VAAI_ALARM((char) 0xe903),
        VAAI_ALT_A((char) 0xe904),
        VAAI_ALT((char) 0xe905),
        VAAI_AMBULANCE((char) 0xe906),
        VAAI_BACKSPACE_A((char) 0xe907),
        VAAI_BACKSPACE((char) 0xe908),
        VAAI_BAR_CHART_H((char) 0xe909),
        VAAI_BAR_CHART_V((char) 0xe90a),
        VAAI_BED((char) 0xe90b),
        VAAI_BUSS((char) 0xe90c),
        VAAI_CHART_3D((char) 0xe90d),
        VAAI_CHART_GRID((char) 0xe90e),
        VAAI_CHART_TIMELINE((char) 0xe90f),
        VAAI_CLIPBOARD_CHECK((char) 0xe910),
        VAAI_CLOSE_SMALL((char) 0xe911),
        VAAI_CLUSTER((char) 0xe912),
        VAAI_COIN_PILES((char) 0xe913),
        VAAI_COINS((char) 0xe914),
        VAAI_COMPILE((char) 0xe915),
        VAAI_CLOSE_BIG((char) 0xe916),
        VAAI_CTRL_A((char) 0xe917),
        VAAI_CTRL((char) 0xe918),
        VAAI_CURSOR_O((char) 0xe919),
        VAAI_CURSOR((char) 0xe91a),
        VAAI_DEL_A((char) 0xe91b),
        VAAI_DEL((char) 0xe91c),
        VAAI_DIAMOND_O((char) 0xe91d),
        VAAI_DIAMOND((char) 0xe91e),
        VAAI_ELLIPSIS_DOTS_H((char) 0xe91f),
        VAAI_ELLIPSIS_DOTS_V((char) 0xe920),
        VAAI_ENTER_ARROW((char) 0xe921),
        VAAI_ENTER((char) 0xe922),
        VAAI_ENVELOPES_O((char) 0xe923),
        VAAI_ENVELOPES((char) 0xe924),
        VAAI_ESC_A((char) 0xe925),
        VAAI_ESC((char) 0xe926),
        VAAI_EURO((char) 0xe927),
        VAAI_FAMILY((char) 0xe928),
        VAAI_FILE_ADD((char) 0xe929),
        VAAI_FILE_REMOVE((char) 0xe92a),
        VAAI_FILE_SEARCH((char) 0xe92b),
        VAAI_FLIGHT_LANDING((char) 0xe92c),
        VAAI_FLIGHT_TAKEOFF((char) 0xe92d),
        VAAI_FOLDER_ADD((char) 0xe92e),
        VAAI_FOLDER_REMOVE((char) 0xe92f),
        VAAI_FOLDER_SEARCH((char) 0xe930),
        VAAI_FUNNEL((char) 0xe931),
        VAAI_GLOBE_WIRE((char) 0xe932),
        VAAI_HAMMER((char) 0xe933),
        VAAI_HANDSHAKE((char) 0xe934),
        VAAI_HEADSET((char) 0xe935),
        VAAI_HOSPITAL((char) 0xe936),
        VAAI_HOURGLASS_EMPTY((char) 0xe937),
        VAAI_HOURGLASS_END((char) 0xe938),
        VAAI_HOURGLASS_START((char) 0xe939),
        VAAI_HOURGLASS((char) 0xe93a),
        VAAI_LINE_BAR_CHART((char) 0xe93b),
        VAAI_LINE_CHART((char) 0xe93c),
        VAAI_MOBILE_BROWSER((char) 0xe93d),
        VAAI_MOBILE_RETRO((char) 0xe93e),
        VAAI_MONEY_DEPOSIT((char) 0xe93f),
        VAAI_MONEY_EXCHANGE((char) 0xe940),
        VAAI_MONEY_WITHDRAW((char) 0xe941),
        VAAI_MORNING((char) 0xe942),
        VAAI_NEWSPAPER((char) 0xe943),
        VAAI_NURSE((char) 0xe944),
        VAAI_OFFICE((char) 0xe945),
        VAAI_OPTION_A((char) 0xe946),
        VAAI_OPTION((char) 0xe947),
        VAAI_PHONE_LANDLINE((char) 0xe948),
        VAAI_PIE_BAR_CHART((char) 0xe949),
        VAAI_PIGGY_BANK_COIN((char) 0xe94a),
        VAAI_PIGGY_BANK((char) 0xe94b),
        VAAI_PYRAMID_CHART((char) 0xe94c),
        VAAI_RECORDS((char) 0xe94d),
        VAAI_SCALE_UNBALANCE((char) 0xe94e),
        VAAI_SCALE((char) 0xe94f),
        VAAI_SCATTER_CHART((char) 0xe950),
        VAAI_SHIFT_ARROW((char) 0xe951),
        VAAI_SHIFT((char) 0xe952),
        VAAI_SHOP((char) 0xe953),
        VAAI_SPARK_LINE((char) 0xe954),
        VAAI_SPLINE_AREA_CHART((char) 0xe955),
        VAAI_SPLINE_CHART((char) 0xe956),
        VAAI_STOCK((char) 0xe957),
        VAAI_STOPWATCH((char) 0xe958),
        VAAI_STORAGE((char) 0xe959),
        VAAI_SUN_DOWN((char) 0xe95a),
        VAAI_SUN_RISE((char) 0xe95b),
        VAAI_TAB_A((char) 0xe95c),
        VAAI_TAB((char) 0xe95d),
        VAAI_TIMER((char) 0xe95e),
        VAAI_TOUCH((char) 0xe95f),
        VAAI_TRENDING_DOWN((char) 0xe960),
        VAAI_TRENDING_UP((char) 0xe961),
        VAAI_USER_STAR((char) 0xe962),
        VAAI_WALLET((char) 0xe963);

        char vaadinIconsCharacter;

        Icon(char character) {
            this.vaadinIconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return vaadinIconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface vaadinIconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (vaadinIconsTypeface == null) {
                setTypeface(new VaadinIcons());
            }
            return vaadinIconsTypeface;
        }

        private static void setTypeface(VaadinIcons vaadinIconsTypeface) {
            Icon.vaadinIconsTypeface = vaadinIconsTypeface;
        }
    }
}
