package com.rilixtech.vaadin_icons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the VaadinIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class VaadinIcons implements ITypeface {
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
     * VaadinIcons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which VaadinIcons IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by VaadinIcons ITypeface.
     */
    public enum Icon implements IIcon {
        VAAI_ABACUS('\ue682'),
        VAAI_ABSOLUTE_POSITION('\ue61e'),
        VAAI_ACCESSIBILITY('\ue683'),
        VAAI_ACCORDION_MENU('\ue61f'),
        VAAI_ADD_DOCK('\ue620'),
        VAAI_ADJUST('\ue74a'),
        VAAI_AIRPLANE('\ue684'),
        VAAI_ALIGN_CENTER('\ue74b'),
        VAAI_ALIGN_JUSTIFY('\ue7ae'),
        VAAI_ALIGN_LEFT('\ue74c'),
        VAAI_ALIGN_RIGHT('\ue74d'),
        VAAI_ANCHOR('\ue685'),
        VAAI_ANGLE_DOUBLE_DOWN('\ue6e6'),
        VAAI_ANGLE_DOUBLE_LEFT('\ue6e7'),
        VAAI_ANGLE_DOUBLE_RIGHT('\ue6e8'),
        VAAI_ANGLE_DOUBLE_UP('\ue6e9'),
        VAAI_ANGLE_DOWN('\ue6ea'),
        VAAI_ANGLE_LEFT('\ue6eb'),
        VAAI_ANGLE_RIGHT('\ue6ec'),
        VAAI_ANGLE_UP('\ue6ed'),
        VAAI_ARCHIVE('\ue6ee'),
        VAAI_ARCHIVES('\ue621'),
        VAAI_AREA_SELECT('\ue806'),
        VAAI_ARROW_BACKWARD('\ue622'),
        VAAI_ARROW_CIRCLE_DOWN('\ue6f0'),
        VAAI_ARROW_CIRCLE_DOWN_O('\ue6ef'),
        VAAI_ARROW_CIRCLE_LEFT('\ue6f2'),
        VAAI_ARROW_CIRCLE_LEFT_O('\ue6f1'),
        VAAI_ARROW_CIRCLE_RIGHT('\ue6f4'),
        VAAI_ARROW_CIRCLE_RIGHT_O('\ue6f3'),
        VAAI_ARROW_CIRCLE_UP('\ue6f6'),
        VAAI_ARROW_CIRCLE_UP_O('\ue6f5'),
        VAAI_ARROW_DOWN('\ue7af'),
        VAAI_ARROW_FORWARD('\ue623'),
        VAAI_ARROW_LEFT('\ue7b0'),
        VAAI_ARROW_LONG_DOWN('\ue74e'),
        VAAI_ARROW_LONG_LEFT('\ue74f'),
        VAAI_ARROW_RIGHT('\ue7b1'),
        VAAI_ARROW_UP('\ue7b2'),
        VAAI_ARROWS('\ue755'),
        VAAI_ARROWS_CROSS('\ue750'),
        VAAI_ARROWS_LONG_H('\ue751'),
        VAAI_ARROWS_LONG_RIGHT('\ue752'),
        VAAI_ARROWS_LONG_UP('\ue753'),
        VAAI_ARROWS_LONG_V('\ue754'),
        VAAI_ASTERISK('\ue686'),
        VAAI_AT('\ue624'),
        VAAI_AUTOMATION('\ue687'),
        VAAI_BACKWARDS('\ue756'),
        VAAI_BAN('\ue6f7'),
        VAAI_BAR_CHART('\ue757'),
        VAAI_BARCODE('\ue688'),
        VAAI_MENU('\ue7b3'),
        VAAI_BELL('\ue7b4'),
        VAAI_BELL_O('\ue758'),
        VAAI_BELL_SLASH('\ue626'),
        VAAI_BELL_SLASH_O('\ue625'),
        VAAI_BOAT('\ue627'),
        VAAI_BOLD('\ue6f8'),
        VAAI_BOLT('\ue759'),
        VAAI_BOMB('\ue689'),
        VAAI_BOOK('\ue6f9'),
        VAAI_BOOK_DOLLAR('\ue600'),
        VAAI_BOOK_PERCENT('\ue601'),
        VAAI_BOOKMARK('\ue7b6'),
        VAAI_BOOKMARK_O('\ue7b5'),
        VAAI_BRIEFCASE('\ue602'),
        VAAI_BROWSER('\ue628'),
        VAAI_BUG('\ue68b'),
        VAAI_BUG_O('\ue68a'),
        VAAI_BUILDING('\ue7b8'),
        VAAI_BUILDING_O('\ue7b7'),
        VAAI_BULLETS('\ue629'),
        VAAI_BULLSEYE('\ue6fa'),
        VAAI_BUTTON('\ue62a'),
        VAAI_CALC('\ue68c'),
        VAAI_CALC_BOOK('\ue62b'),
        VAAI_CALENDAR('\ue7ba'),
        VAAI_CALENDAR_BRIEFCASE('\ue604'),
        VAAI_CALENDAR_CLOCK('\ue605'),
        VAAI_CALENDAR_ENVELOPE('\ue62c'),
        VAAI_CALENDAR_O('\ue7b9'),
        VAAI_CALENDAR_USER('\ue606'),
        VAAI_CAMERA('\ue7bb'),
        VAAI_CAR('\ue62d'),
        VAAI_CARET_DOWN('\ue7bc'),
        VAAI_CARET_LEFT('\ue7bd'),
        VAAI_CARET_RIGHT('\ue7be'),
        VAAI_CARET_SQUARE_DOWN_O('\ue7bf'),
        VAAI_CARET_SQUARE_LEFT_O('\ue7c0'),
        VAAI_CARET_SQUARE_RIGHT_O('\ue7c1'),
        VAAI_CARET_SQUARE_UP_O('\ue7c2'),
        VAAI_CARET_UP('\ue7c3'),
        VAAI_CART('\ue6fc'),
        VAAI_CART_O('\ue6fb'),
        VAAI_CHART('\ue68e'),
        VAAI_CHART_LINE('\ue68d'),
        VAAI_CHAT('\ue75a'),
        VAAI_CHECK('\ue75b'),
        VAAI_CHECK_CIRCLE('\ue7c5'),
        VAAI_CHECK_CIRCLE_O('\ue7c4'),
        VAAI_CHECK_SQUARE('\ue62e'),
        VAAI_CHECK_SQUARE_O('\ue6fd'),
        VAAI_CHEVRON_CIRCLE_DOWN('\ue7c7'),
        VAAI_CHEVRON_CIRCLE_DOWN_O('\ue7c6'),
        VAAI_CHEVRON_CIRCLE_LEFT('\ue7c9'),
        VAAI_CHEVRON_CIRCLE_LEFT_O('\ue7c8'),
        VAAI_CHEVRON_CIRCLE_RIGHT('\ue7cb'),
        VAAI_CHEVRON_CIRCLE_RIGHT_O('\ue7ca'),
        VAAI_CHEVRON_CIRCLE_UP('\ue7cd'),
        VAAI_CHEVRON_CIRCLE_UP_O('\ue7cc'),
        VAAI_CHEVRON_DOWN('\ue7ce'),
        VAAI_CHEVRON_LEFT('\ue7cf'),
        VAAI_CHEVRON_RIGHT('\ue7d0'),
        VAAI_CHEVRON_UP('\ue7d1'),
        VAAI_CHILD('\ue62f'),
        VAAI_CIRCLE('\ue75d'),
        VAAI_CIRCLE_THIN('\ue75c'),
        VAAI_CLIPBOARD('\ue635'),
        VAAI_CLIPBOARD_CROSS('\ue630'),
        VAAI_CLIPBOARD_HEART('\ue631'),
        VAAI_CLIPBOARD_PULSE('\ue632'),
        VAAI_CLIPBOARD_TEXT('\ue633'),
        VAAI_CLIPBOARD_USER('\ue634'),
        VAAI_CLOCK('\ue7d2'),
        VAAI_CLOUD('\ue763'),
        VAAI_CLOUD_DOWNLOAD('\ue75f'),
        VAAI_CLOUD_DOWNLOAD_O('\ue75e'),
        VAAI_CLOUD_O('\ue760'),
        VAAI_CLOUD_UPLOAD('\ue762'),
        VAAI_CLOUD_UPLOAD_O('\ue761'),
        VAAI_CODE('\ue68f'),
        VAAI_COFFEE('\ue690'),
        VAAI_COG('\ue7d3'),
        VAAI_COG_O('\ue764'),
        VAAI_COGS('\ue691'),
        VAAI_COMBOBOX('\ue636'),
        VAAI_COMMENT('\ue768'),
        VAAI_COMMENT_ELLIPSIS('\ue766'),
        VAAI_COMMENT_ELLIPSIS_O('\ue765'),
        VAAI_COMMENT_O('\ue767'),
        VAAI_COMMENTS('\ue76a'),
        VAAI_COMMENTS_O('\ue769'),
        VAAI_COMPRESS('\ue76b'),
        VAAI_COMPRESS_SQUARE('\ue637'),
        VAAI_CONNECT('\ue76d'),
        VAAI_CONNECT_O('\ue76c'),
        VAAI_CONTROLLER('\ue692'),
        VAAI_COPY('\ue7d5'),
        VAAI_COPY_O('\ue7d4'),
        VAAI_COPYRIGHT('\ue638'),
        VAAI_CORNER_LOWER_LEFT('\ue693'),
        VAAI_CORNER_LOWER_RIGHT('\ue694'),
        VAAI_CORNER_UPPER_LEFT('\ue695'),
        VAAI_CORNER_UPPER_RIGHT('\ue696'),
        VAAI_CREDIT_CARD('\ue76e'),
        VAAI_CROP('\ue76f'),
        VAAI_CROSS_CUTLERY('\ue6fe'),
        VAAI_CROSSHAIRS('\ue7d6'),
        VAAI_CSS('\ue639'),
        VAAI_CUBE('\ue697'),
        VAAI_CUBES('\ue698'),
        VAAI_CURLY_BRACKETS('\ue63a'),
        VAAI_CUTLERY('\ue6ff'),
        VAAI_DASHBOARD('\ue700'),
        VAAI_DATE_INPUT('\ue63b'),
        VAAI_DEINDENT('\ue770'),
        VAAI_DENTAL_CHAIR('\ue607'),
        VAAI_DESKTOP('\ue7d7'),
        VAAI_DISC('\ue701'),
        VAAI_DOCTOR('\ue609'),
        VAAI_DOCTOR_BRIEFCASE('\ue608'),
        VAAI_DOLLAR('\ue60a'),
        VAAI_DOT_CIRCLE('\ue702'),
        VAAI_DOWNLOAD('\ue703'),
        VAAI_DOWNLOAD_ALT('\ue699'),
        VAAI_INSERT('\ue7d8'),
        VAAI_DROP('\ue704'),
        VAAI_EDIT('\ue771'),
        VAAI_EJECT('\ue772'),
        VAAI_ELASTIC('\ue63c'),
        VAAI_ELLIPSIS_CIRCLE('\ue7da'),
        VAAI_ELLIPSIS_CIRCLE_O('\ue7d9'),
        VAAI_ELLIPSIS_H('\ue773'),
        VAAI_ELLIPSIS_V('\ue774'),
        VAAI_ENVELOPE('\ue7dc'),
        VAAI_ENVELOPE_O('\ue7db'),
        VAAI_ENVELOPE_OPEN('\ue63e'),
        VAAI_ENVELOPE_OPEN_O('\ue63d'),
        VAAI_ERASER('\ue69a'),
        VAAI_EXCHANGE('\ue705'),
        VAAI_EXCLAMATION('\ue708'),
        VAAI_EXCLAMATION_CIRCLE('\ue707'),
        VAAI_EXCLAMATION_CIRCLE_O('\ue706'),
        VAAI_EXIT('\ue60c'),
        VAAI_EXIT_O('\ue60b'),
        VAAI_EXPAND('\ue776'),
        VAAI_EXPAND_FULL('\ue775'),
        VAAI_EXPAND_SQUARE('\ue7dd'),
        VAAI_EXTERNAL_BROWSER('\ue63f'),
        VAAI_EXTERNAL_LINK('\ue7de'),
        VAAI_EYE('\ue7df'),
        VAAI_EYE_SLASH('\ue709'),
        VAAI_EYEDROPPER('\ue640'),
        VAAI_FACEBOOK('\ue69c'),
        VAAI_FACEBOOK_SQUARE('\ue69b'),
        VAAI_FACTORY('\ue641'),
        VAAI_FAST_BACKWARD('\ue777'),
        VAAI_FAST_FORWARD('\ue778'),
        VAAI_FEMALE('\ue69d'),
        VAAI_FILE('\ue7e3'),
        VAAI_FILE_CODE('\ue70a'),
        VAAI_FILE_FONT('\ue69e'),
        VAAI_FILE_MOVIE('\ue70b'),
        VAAI_FILE_O('\ue7e0'),
        VAAI_FILE_PICTURE('\ue70c'),
        VAAI_FILE_PRESENTATION('\ue69f'),
        VAAI_FILE_PROCESS('\ue642'),
        VAAI_FILE_REFRESH('\ue643'),
        VAAI_FILE_SOUND('\ue70d'),
        VAAI_FILE_START('\ue644'),
        VAAI_FILE_TABLE('\ue6a0'),
        VAAI_FILE_TEXT('\ue7e2'),
        VAAI_FILE_TEXT_O('\ue7e1'),
        VAAI_FILE_TREE('\ue647'),
        VAAI_FILE_TREE_SMALL('\ue645'),
        VAAI_FILE_TREE_SUB('\ue646'),
        VAAI_FILE_ZIP('\ue70e'),
        VAAI_FILL('\ue6a1'),
        VAAI_FILM('\ue779'),
        VAAI_FILTER('\ue6a2'),
        VAAI_FIRE('\ue6a3'),
        VAAI_FLAG('\ue711'),
        VAAI_FLAG_CHECKERED('\ue70f'),
        VAAI_FLAG_O('\ue710'),
        VAAI_ADOBE_FLASH('\ue648'),
        VAAI_FLASH('\ue712'),
        VAAI_FLASK('\ue7e4'),
        VAAI_FLIP_H('\ue649'),
        VAAI_FLIP_V('\ue64a'),
        VAAI_FOLDER('\ue7e6'),
        VAAI_FOLDER_O('\ue7e5'),
        VAAI_FOLDER_OPEN('\ue77b'),
        VAAI_FOLDER_OPEN_O('\ue77a'),
        VAAI_FONT('\ue713'),
        VAAI_FORM('\ue64b'),
        VAAI_FORWARD('\ue77c'),
        VAAI_FROWN_O('\ue6a4'),
        VAAI_FUNCION('\ue64c'),
        VAAI_GAMEPAD('\ue714'),
        VAAI_GAVEL('\ue6a5'),
        VAAI_GIFT('\ue715'),
        VAAI_GLASS('\ue77d'),
        VAAI_GLOBE('\ue77e'),
        VAAI_GLASSES('\ue7e7'),
        VAAI_GOLF('\ue60d'),
        VAAI_GOOGLE_PLUS('\ue6a7'),
        VAAI_GOOGLE_PLUS_SQUARE('\ue6a6'),
        VAAI_GRAB('\ue64d'),
        VAAI_GRID('\ue651'),
        VAAI_GRID_BEVEL('\ue64e'),
        VAAI_GRID_BIG('\ue7e9'),
        VAAI_GRID_BIG_O('\ue7e8'),
        VAAI_GRID_H('\ue64f'),
        VAAI_GRID_SMALL('\ue7eb'),
        VAAI_GRID_SMALL_O('\ue7ea'),
        VAAI_GRID_V('\ue650'),
        VAAI_GROUP('\ue60e'),
        VAAI_HAND('\ue652'),
        VAAI_HANDLE_CORNER('\ue716'),
        VAAI_HANDS_UP('\ue6a8'),
        VAAI_HARDDRIVE('\ue718'),
        VAAI_HARDDRIVE_O('\ue717'),
        VAAI_HASH('\ue6a9'),
        VAAI_HEADER('\ue719'),
        VAAI_HEADPHONES('\ue71a'),
        VAAI_HEALTH_CARD('\ue60f'),
        VAAI_HEART('\ue780'),
        VAAI_HEART_O('\ue77f'),
        VAAI_HOME('\ue7ed'),
        VAAI_HOME_O('\ue7ec'),
        VAAI_INBOX('\ue71b'),
        VAAI_INDENT('\ue781'),
        VAAI_INFO('\ue71e'),
        VAAI_INFO_CIRCLE('\ue71d'),
        VAAI_INFO_CIRCLE_O('\ue71c'),
        VAAI_INPUT('\ue653'),
        VAAI_INSTITUTION('\ue6aa'),
        VAAI_INVOICE('\ue610'),
        VAAI_LIST_OL('\ue71f'),
        VAAI_ITALIC('\ue720'),
        VAAI_KEY('\ue6ac'),
        VAAI_KEY_O('\ue6ab'),
        VAAI_KEYBOARD('\ue722'),
        VAAI_KEYBOARD_O('\ue721'),
        VAAI_LAPTOP('\ue782'),
        VAAI_LAYOUT('\ue654'),
        VAAI_LEVEL_DOWN('\ue783'),
        VAAI_LEVEL_DOWN_BOLD('\ue611'),
        VAAI_LEVEL_LEFT('\ue784'),
        VAAI_LEVEL_LEFT_BOLD('\ue612'),
        VAAI_LEVEL_RIGHT('\ue785'),
        VAAI_LEVEL_RIGHT_BOLD('\ue655'),
        VAAI_LEVEL_UP('\ue786'),
        VAAI_LEVEL_UP_BOLD('\ue613'),
        VAAI_LIFEBUOY('\ue6ad'),
        VAAI_LIGHTBULB('\ue6ae'),
        VAAI_LINE_H('\ue723'),
        VAAI_LINE_V('\ue724'),
        VAAI_LINES('\ue7ef'),
        VAAI_LINES_LIST('\ue7ee'),
        VAAI_LINK('\ue725'),
        VAAI_LIST('\ue7f1'),
        VAAI_LIST_SELECT('\ue656'),
        VAAI_LIST_UL('\ue7f0'),
        VAAI_LOCATION_ARROW('\ue728'),
        VAAI_LOCATION_ARROW_CIRCLE('\ue727'),
        VAAI_LOCATION_ARROW_CIRCLE_O('\ue726'),
        VAAI_LOCK('\ue7f2'),
        VAAI_MAGIC('\ue6b1'),
        VAAI_MAGNET('\ue787'),
        VAAI_MAILBOX('\ue729'),
        VAAI_MALE('\ue6b2'),
        VAAI_MAP_MARKER('\ue788'),
        VAAI_MARGIN('\ue65b'),
        VAAI_MARGIN_BOTTOM('\ue657'),
        VAAI_MARGIN_LEFT('\ue658'),
        VAAI_MARGIN_RIGHT('\ue659'),
        VAAI_MARGIN_TOP('\ue65a'),
        VAAI_MEDAL('\ue6b3'),
        VAAI_MEGAFONE('\ue6b4'),
        VAAI_MEH_O('\ue6b5'),
        VAAI_MICROPHONE('\ue72a'),
        VAAI_MINUS('\ue7f6'),
        VAAI_MINUS_CIRCLE('\ue7f4'),
        VAAI_MINUS_CIRCLE_O('\ue7f3'),
        VAAI_MINUS_SQUARE_O('\ue7f5'),
        VAAI_MOBILE('\ue7f7'),
        VAAI_MODAL('\ue7f8'),
        VAAI_MODAL_LIST('\ue72b'),
        VAAI_MONEY('\ue6b6'),
        VAAI_MOON('\ue78a'),
        VAAI_MOON_O('\ue789'),
        VAAI_MOVIE('\ue78b'),
        VAAI_MUSIC('\ue78c'),
        VAAI_MUTE('\ue72c'),
        VAAI_NATIVE_BUTTON('\ue65c'),
        VAAI_NOTEBOOK('\ue65d'),
        VAAI_OPEN_BOOK('\ue7f9'),
        VAAI_OPTIONS('\ue65e'),
        VAAI_ORIENTATION('\ue65f'),
        VAAI_OUT('\ue614'),
        VAAI_OUTBOX('\ue660'),
        VAAI_PACKAGE('\ue6b7'),
        VAAI_PADDING('\ue665'),
        VAAI_PADDING_BOTTOM('\ue661'),
        VAAI_PADDING_LEFT('\ue662'),
        VAAI_PADDING_RIGHT('\ue663'),
        VAAI_PADDING_TOP('\ue664'),
        VAAI_PAINT_ROLL('\ue666'),
        VAAI_PAINTBRUSH('\ue6b8'),
        VAAI_PALETE('\ue667'),
        VAAI_PANEL('\ue668'),
        VAAI_PAPERCLIP('\ue72d'),
        VAAI_PAPERPLANE('\ue6b9'),
        VAAI_PAPERPLANE_O('\ue6ba'),
        VAAI_PARAGRAPH('\ue6bb'),
        VAAI_PASSWORD('\ue669'),
        VAAI_PASTE('\ue6bc'),
        VAAI_PAUSE('\ue78d'),
        VAAI_PENCIL('\ue7fa'),
        VAAI_PHONE('\ue7fb'),
        VAAI_PICTURE('\ue7fc'),
        VAAI_PIE_CHART('\ue6bd'),
        VAAI_PILL('\ue615'),
        VAAI_PILLS('\ue616'),
        VAAI_PIN('\ue7fd'),
        VAAI_PIN_POST('\ue6be'),
        VAAI_PLAY('\ue78e'),
        VAAI_PLAY_CIRCLE('\ue731'),
        VAAI_PLAY_CIRCLE_O('\ue72e'),
        VAAI_PLUG('\ue66a'),
        VAAI_PLUS('\ue801'),
        VAAI_PLUS_CIRCLE('\ue7ff'),
        VAAI_PLUS_CIRCLE_O('\ue7fe'),
        VAAI_PLUS_MINUS('\ue603'),
        VAAI_PLUS_SQUARE_O('\ue800'),
        VAAI_POINTER('\ue66b'),
        VAAI_POWER_OFF('\ue78f'),
        VAAI_PRESENTATION('\ue6bf'),
        VAAI_PRINT('\ue802'),
        VAAI_PROGRESSBAR('\ue66c'),
        VAAI_PUZZLE_PIECE('\ue6c0'),
        VAAI_QRCODE('\ue6c1'),
        VAAI_QUESTION('\ue732'),
        VAAI_QUESTION_CIRCLE('\ue730'),
        VAAI_QUESTION_CIRCLE_O('\ue72f'),
        VAAI_QUOTE_LEFT('\ue6c2'),
        VAAI_QUOTE_RIGHT('\ue6c3'),
        VAAI_RANDOM('\ue733'),
        VAAI_RASTER('\ue6c5'),
        VAAI_RASTER_LOWER_LEFT('\ue6c4'),
        VAAI_RECYCLE('\ue6c6'),
        VAAI_REFRESH('\ue790'),
        VAAI_REPLY('\ue792'),
        VAAI_REPLY_ALL('\ue791'),
        VAAI_RESIZE_H('\ue66d'),
        VAAI_RESIZE_V('\ue66e'),
        VAAI_RETWEET('\ue793'),
        VAAI_RHOMBUS('\ue66f'),
        VAAI_ROAD('\ue6c7'),
        VAAI_ROAD_BRANCH('\ue670'),
        VAAI_ROAD_BRANCHES('\ue671'),
        VAAI_ROAD_SPLIT('\ue672'),
        VAAI_ROCKET('\ue6c8'),
        VAAI_ROTATE_LEFT('\ue794'),
        VAAI_ROTATE_RIGHT('\ue795'),
        VAAI_RSS('\ue6ca'),
        VAAI_RSS_SQUARE('\ue6c9'),
        VAAI_SAFE('\ue6cc'),
        VAAI_SAFE_LOCK('\ue6cb'),
        VAAI_SCISSORS('\ue734'),
        VAAI_SCREWDRIVER('\ue735'),
        VAAI_SEARCH('\ue805'),
        VAAI_SEARCH_MINUS('\ue803'),
        VAAI_SEARCH_PLUS('\ue804'),
        VAAI_SELECT('\ue673'),
        VAAI_DATABASE('\ue737'),
        VAAI_SERVER('\ue736'),
        VAAI_SHARE('\ue796'),
        VAAI_SHARE_SQUARE('\ue6cd'),
        VAAI_SHIELD('\ue6ce'),
        VAAI_SIGN_IN('\ue797'),
        VAAI_SIGN_IN_ALT('\ue6b0'),
        VAAI_SIGN_OUT('\ue798'),
        VAAI_SIGN_OUT_ALT('\ue6af'),
        VAAI_SIGNAL('\ue738'),
        VAAI_SITEMAP('\ue739'),
        VAAI_SLIDER('\ue674'),
        VAAI_SLIDERS('\ue6cf'),
        VAAI_SMILEY_O('\ue6d0'),
        VAAI_SORT('\ue799'),
        VAAI_SOUND_DISABLE('\ue79a'),
        VAAI_SPECIALIST('\ue617'),
        VAAI_SPINNER('\ue6d3'),
        VAAI_SPINNER_ARC('\ue6d1'),
        VAAI_SPINNER_THIRD('\ue6d2'),
        VAAI_SPLIT('\ue675'),
        VAAI_SPLIT_H('\ue807'),
        VAAI_SPLIT_V('\ue808'),
        VAAI_SPOON('\ue73a'),
        VAAI_SQUARE_SHADOW('\ue79b'),
        VAAI_STAR('\ue7a1'),
        VAAI_STAR_HALF_LEFT('\ue79d'),
        VAAI_STAR_HALF_LEFT_O('\ue79c'),
        VAAI_STAR_HALF_RIGHT('\ue79f'),
        VAAI_STAR_HALF_RIGHT_O('\ue79e'),
        VAAI_STAR_O('\ue7a0'),
        VAAI_START_COG('\ue676'),
        VAAI_STEP_BACKWARD('\ue7a2'),
        VAAI_STEP_FORWARD('\ue7a3'),
        VAAI_STETHOSCOPE('\ue618'),
        VAAI_STOP('\ue7a4'),
        VAAI_STOP_COG('\ue677'),
        VAAI_STRIKETHROUGH('\ue73b'),
        VAAI_SUBSCRIPT('\ue6d4'),
        VAAI_SUITCASE('\ue809'),
        VAAI_SUN_O('\ue73c'),
        VAAI_SUPERSCRIPT('\ue6d5'),
        VAAI_SWORD('\ue678'),
        VAAI_TABLE('\ue7a5'),
        VAAI_TABLET('\ue80a'),
        VAAI_TABS('\ue679'),
        VAAI_TAG('\ue6d6'),
        VAAI_TAGS('\ue6d7'),
        VAAI_TASKS('\ue73d'),
        VAAI_TAXI('\ue67a'),
        VAAI_TERMINAL('\ue6d8'),
        VAAI_TEXT_HEIGHT('\ue73e'),
        VAAI_TEXT_INPUT('\ue67b'),
        VAAI_TEXT_LABEL('\ue67c'),
        VAAI_TEXT_WIDTH('\ue73f'),
        VAAI_TEETH('\ue619'),
        VAAI_THIN_SQUARE('\ue7a6'),
        VAAI_TOOTH('\ue67d'),
        VAAI_THUMBS_DOWN('\ue6da'),
        VAAI_THUMBS_DOWN_O('\ue6d9'),
        VAAI_THUMBS_UP('\ue6dc'),
        VAAI_THUMBS_UP_O('\ue6db'),
        VAAI_TICKET('\ue740'),
        VAAI_TIME_BACKWARD('\ue7a7'),
        VAAI_TIME_FORWARD('\ue7a8'),
        VAAI_TOOLBOX('\ue741'),
        VAAI_TOOLS('\ue742'),
        VAAI_TRAIN('\ue67e'),
        VAAI_TRASH('\ue80b'),
        VAAI_TREE_TABLE('\ue67f'),
        VAAI_TROPHY('\ue743'),
        VAAI_TRUCK('\ue6dd'),
        VAAI_TWIN_COL_SELECT('\ue680'),
        VAAI_TWITTER('\ue6df'),
        VAAI_TWITTER_SQUARE('\ue6de'),
        VAAI_UMBRELLA('\ue6e0'),
        VAAI_UNDERLINE('\ue744'),
        VAAI_UNLINK('\ue745'),
        VAAI_UNLOCK('\ue80c'),
        VAAI_UPLOAD('\ue746'),
        VAAI_UPLOAD_ALT('\ue6e1'),
        VAAI_USER('\ue80d'),
        VAAI_USER_CARD('\ue61a'),
        VAAI_USER_CHECK('\ue61b'),
        VAAI_USER_CLOCK('\ue61c'),
        VAAI_USER_HEART('\ue61d'),
        VAAI_USERS('\ue747'),
        VAAI_VAADIN_H('\ue80e'),
        VAAI_VAADIN_V('\ue80f'),
        VAAI_VIEWPORT('\ue681'),
        VAAI_VIMEO('\ue6e3'),
        VAAI_VIMEO_SQUARE('\ue6e2'),
        VAAI_VOLUME('\ue7ac'),
        VAAI_VOLUME_DOWN('\ue7a9'),
        VAAI_VOLUME_OFF('\ue7aa'),
        VAAI_VOLUME_UP('\ue7ab'),
        VAAI_WARNING('\ue748'),
        VAAI_WRENCH('\ue749'),
        VAAI_CLOSE('\ue7ad'),
        VAAI_CLOSE_CIRCLE('\ue811'),
        VAAI_CLOSE_CIRCLE_O('\ue810'),
        VAAI_YOUTUBE('\ue6e5'),
        VAAI_YOUTUBE_SQUARE('\ue6e4'),
        VAAI_DIPLOMA('\ue964'),
        VAAI_CHEVRON_DOWN_SMALL('\ue965'),
        VAAI_CHEVRON_LEFT_SMALL('\ue966'),
        VAAI_CHEVRON_RIGHT_SMALL('\ue967'),
        VAAI_CHEVRON_UP_SMALL('\ue968'),
        VAAI_DIPLOMA_SCROLL('\ue969'),
        VAAI_WORKPLACE('\ue900'),
        VAAI_CASH('\ue901'),
        VAAI_ACADEMY_CAP('\ue902'),
        VAAI_ALARM('\ue903'),
        VAAI_ALT_A('\ue904'),
        VAAI_ALT('\ue905'),
        VAAI_AMBULANCE('\ue906'),
        VAAI_BACKSPACE_A('\ue907'),
        VAAI_BACKSPACE('\ue908'),
        VAAI_BAR_CHART_H('\ue909'),
        VAAI_BAR_CHART_V('\ue90a'),
        VAAI_BED('\ue90b'),
        VAAI_BUSS('\ue90c'),
        VAAI_CHART_3D('\ue90d'),
        VAAI_CHART_GRID('\ue90e'),
        VAAI_CHART_TIMELINE('\ue90f'),
        VAAI_CLIPBOARD_CHECK('\ue910'),
        VAAI_CLOSE_SMALL('\ue911'),
        VAAI_CLUSTER('\ue912'),
        VAAI_COIN_PILES('\ue913'),
        VAAI_COINS('\ue914'),
        VAAI_COMPILE('\ue915'),
        VAAI_CLOSE_BIG('\ue916'),
        VAAI_CTRL_A('\ue917'),
        VAAI_CTRL('\ue918'),
        VAAI_CURSOR_O('\ue919'),
        VAAI_CURSOR('\ue91a'),
        VAAI_DEL_A('\ue91b'),
        VAAI_DEL('\ue91c'),
        VAAI_DIAMOND_O('\ue91d'),
        VAAI_DIAMOND('\ue91e'),
        VAAI_ELLIPSIS_DOTS_H('\ue91f'),
        VAAI_ELLIPSIS_DOTS_V('\ue920'),
        VAAI_ENTER_ARROW('\ue921'),
        VAAI_ENTER('\ue922'),
        VAAI_ENVELOPES_O('\ue923'),
        VAAI_ENVELOPES('\ue924'),
        VAAI_ESC_A('\ue925'),
        VAAI_ESC('\ue926'),
        VAAI_EURO('\ue927'),
        VAAI_FAMILY('\ue928'),
        VAAI_FILE_ADD('\ue929'),
        VAAI_FILE_REMOVE('\ue92a'),
        VAAI_FILE_SEARCH('\ue92b'),
        VAAI_FLIGHT_LANDING('\ue92c'),
        VAAI_FLIGHT_TAKEOFF('\ue92d'),
        VAAI_FOLDER_ADD('\ue92e'),
        VAAI_FOLDER_REMOVE('\ue92f'),
        VAAI_FOLDER_SEARCH('\ue930'),
        VAAI_FUNNEL('\ue931'),
        VAAI_GLOBE_WIRE('\ue932'),
        VAAI_HAMMER('\ue933'),
        VAAI_HANDSHAKE('\ue934'),
        VAAI_HEADSET('\ue935'),
        VAAI_HOSPITAL('\ue936'),
        VAAI_HOURGLASS_EMPTY('\ue937'),
        VAAI_HOURGLASS_END('\ue938'),
        VAAI_HOURGLASS_START('\ue939'),
        VAAI_HOURGLASS('\ue93a'),
        VAAI_LINE_BAR_CHART('\ue93b'),
        VAAI_LINE_CHART('\ue93c'),
        VAAI_MOBILE_BROWSER('\ue93d'),
        VAAI_MOBILE_RETRO('\ue93e'),
        VAAI_MONEY_DEPOSIT('\ue93f'),
        VAAI_MONEY_EXCHANGE('\ue940'),
        VAAI_MONEY_WITHDRAW('\ue941'),
        VAAI_MORNING('\ue942'),
        VAAI_NEWSPAPER('\ue943'),
        VAAI_NURSE('\ue944'),
        VAAI_OFFICE('\ue945'),
        VAAI_OPTION_A('\ue946'),
        VAAI_OPTION('\ue947'),
        VAAI_PHONE_LANDLINE('\ue948'),
        VAAI_PIE_BAR_CHART('\ue949'),
        VAAI_PIGGY_BANK_COIN('\ue94a'),
        VAAI_PIGGY_BANK('\ue94b'),
        VAAI_PYRAMID_CHART('\ue94c'),
        VAAI_RECORDS('\ue94d'),
        VAAI_SCALE_UNBALANCE('\ue94e'),
        VAAI_SCALE('\ue94f'),
        VAAI_SCATTER_CHART('\ue950'),
        VAAI_SHIFT_ARROW('\ue951'),
        VAAI_SHIFT('\ue952'),
        VAAI_SHOP('\ue953'),
        VAAI_SPARK_LINE('\ue954'),
        VAAI_SPLINE_AREA_CHART('\ue955'),
        VAAI_SPLINE_CHART('\ue956'),
        VAAI_STOCK('\ue957'),
        VAAI_STOPWATCH('\ue958'),
        VAAI_STORAGE('\ue959'),
        VAAI_SUN_DOWN('\ue95a'),
        VAAI_SUN_RISE('\ue95b'),
        VAAI_TAB_A('\ue95c'),
        VAAI_TAB('\ue95d'),
        VAAI_TIMER('\ue95e'),
        VAAI_TOUCH('\ue95f'),
        VAAI_TRENDING_DOWN('\ue960'),
        VAAI_TRENDING_UP('\ue961'),
        VAAI_USER_STAR('\ue962'),
        VAAI_WALLET('\ue963');

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
        private static ITypeface vaadinIconsTypeface;

        @Override
        public ITypeface getTypeface() {
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