package com.rilixtech.fontawesome_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the FontAwesome font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class FontAwesome implements ITypeface {
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
     * FontAwesome IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which FontAwesome IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by FontAwesome ITypeface.
     */
    public enum Icon implements IIcon {
        FAWI_GLASS('\uf000'),
        FAWI_MUSIC('\uf001'),
        FAWI_SEARCH('\uf002'),
        FAWI_ENVELOPE_O('\uf003'),
        FAWI_HEART('\uf004'),
        FAWI_STAR('\uf005'),
        FAWI_STAR_O('\uf006'),
        FAWI_USER('\uf007'),
        FAWI_FILM('\uf008'),
        FAWI_TH_LARGE('\uf009'),
        FAWI_TH('\uf00a'),
        FAWI_TH_LIST('\uf00b'),
        FAWI_CHECK('\uf00c'),
        FAWI_TIMES('\uf00d'),
        FAWI_SEARCH_PLUS('\uf00e'),
        FAWI_SEARCH_MINUS('\uf010'),
        FAWI_POWER_OFF('\uf011'),
        FAWI_SIGNAL('\uf012'),
        FAWI_COG('\uf013'),
        FAWI_TRASH_O('\uf014'),
        FAWI_HOME('\uf015'),
        FAWI_FILE_O('\uf016'),
        FAWI_CLOCK_O('\uf017'),
        FAWI_ROAD('\uf018'),
        FAWI_DOWNLOAD('\uf019'),
        FAWI_ARROW_CIRCLE_O_DOWN('\uf01a'),
        FAWI_ARROW_CIRCLE_O_UP('\uf01b'),
        FAWI_INBOX('\uf01c'),
        FAWI_PLAY_CIRCLE_O('\uf01d'),
        FAWI_REPEAT('\uf01e'),
        FAWI_REFRESH('\uf021'),
        FAWI_LIST_ALT('\uf022'),
        FAWI_LOCK('\uf023'),
        FAWI_FLAG('\uf024'),
        FAWI_HEADPHONES('\uf025'),
        FAWI_VOLUME_OFF('\uf026'),
        FAWI_VOLUME_DOWN('\uf027'),
        FAWI_VOLUME_UP('\uf028'),
        FAWI_QRCODE('\uf029'),
        FAWI_BARCODE('\uf02a'),
        FAWI_TAG('\uf02b'),
        FAWI_TAGS('\uf02c'),
        FAWI_BOOK('\uf02d'),
        FAWI_BOOKMARK('\uf02e'),
        FAWI_PRINT('\uf02f'),
        FAWI_CAMERA('\uf030'),
        FAWI_FONT('\uf031'),
        FAWI_BOLD('\uf032'),
        FAWI_ITALIC('\uf033'),
        FAWI_TEXT_HEIGHT('\uf034'),
        FAWI_TEXT_WIDTH('\uf035'),
        FAWI_ALIGN_LEFT('\uf036'),
        FAWI_ALIGN_CENTER('\uf037'),
        FAWI_ALIGN_RIGHT('\uf038'),
        FAWI_ALIGN_JUSTIFY('\uf039'),
        FAWI_LIST('\uf03a'),
        FAWI_OUTDENT('\uf03b'),
        FAWI_INDENT('\uf03c'),
        FAWI_VIDEO_CAMERA('\uf03d'),
        FAWI_PICTURE_O('\uf03e'),
        FAWI_PENCIL('\uf040'),
        FAWI_MAP_MARKER('\uf041'),
        FAWI_ADJUST('\uf042'),
        FAWI_TINT('\uf043'),
        FAWI_PENCIL_SQUARE_O('\uf044'),
        FAWI_SHARE_SQUARE_O('\uf045'),
        FAWI_CHECK_SQUARE_O('\uf046'),
        FAWI_ARROWS('\uf047'),
        FAWI_STEP_BACKWARD('\uf048'),
        FAWI_FAST_BACKWARD('\uf049'),
        FAWI_BACKWARD('\uf04a'),
        FAWI_PLAY('\uf04b'),
        FAWI_PAUSE('\uf04c'),
        FAWI_STOP('\uf04d'),
        FAWI_FORWARD('\uf04e'),
        FAWI_FAST_FORWARD('\uf050'),
        FAWI_STEP_FORWARD('\uf051'),
        FAWI_EJECT('\uf052'),
        FAWI_CHEVRON_LEFT('\uf053'),
        FAWI_CHEVRON_RIGHT('\uf054'),
        FAWI_PLUS_CIRCLE('\uf055'),
        FAWI_MINUS_CIRCLE('\uf056'),
        FAWI_TIMES_CIRCLE('\uf057'),
        FAWI_CHECK_CIRCLE('\uf058'),
        FAWI_QUESTION_CIRCLE('\uf059'),
        FAWI_INFO_CIRCLE('\uf05a'),
        FAWI_CROSSHAIRS('\uf05b'),
        FAWI_TIMES_CIRCLE_O('\uf05c'),
        FAWI_CHECK_CIRCLE_O('\uf05d'),
        FAWI_BAN('\uf05e'),
        FAWI_ARROW_LEFT('\uf060'),
        FAWI_ARROW_RIGHT('\uf061'),
        FAWI_ARROW_UP('\uf062'),
        FAWI_ARROW_DOWN('\uf063'),
        FAWI_SHARE('\uf064'),
        FAWI_EXPAND('\uf065'),
        FAWI_COMPRESS('\uf066'),
        FAWI_PLUS('\uf067'),
        FAWI_MINUS('\uf068'),
        FAWI_ASTERISK('\uf069'),
        FAWI_EXCLAMATION_CIRCLE('\uf06a'),
        FAWI_GIFT('\uf06b'),
        FAWI_LEAF('\uf06c'),
        FAWI_FIRE('\uf06d'),
        FAWI_EYE('\uf06e'),
        FAWI_EYE_SLASH('\uf070'),
        FAWI_EXCLAMATION_TRIANGLE('\uf071'),
        FAWI_PLANE('\uf072'),
        FAWI_CALENDAR('\uf073'),
        FAWI_RANDOM('\uf074'),
        FAWI_COMMENT('\uf075'),
        FAWI_MAGNET('\uf076'),
        FAWI_CHEVRON_UP('\uf077'),
        FAWI_CHEVRON_DOWN('\uf078'),
        FAWI_RETWEET('\uf079'),
        FAWI_SHOPPING_CART('\uf07a'),
        FAWI_FOLDER('\uf07b'),
        FAWI_FOLDER_OPEN('\uf07c'),
        FAWI_ARROWS_V('\uf07d'),
        FAWI_ARROWS_H('\uf07e'),
        FAWI_BAR_CHART('\uf080'),
        FAWI_TWITTER_SQUARE('\uf081'),
        FAWI_FACEBOOK_SQUARE('\uf082'),
        FAWI_CAMERA_RETRO('\uf083'),
        FAWI_KEY('\uf084'),
        FAWI_COGS('\uf085'),
        FAWI_COMMENTS('\uf086'),
        FAWI_THUMBS_O_UP('\uf087'),
        FAWI_THUMBS_O_DOWN('\uf088'),
        FAWI_STAR_HALF('\uf089'),
        FAWI_HEART_O('\uf08a'),
        FAWI_SIGN_OUT('\uf08b'),
        FAWI_LINKEDIN_SQUARE('\uf08c'),
        FAWI_THUMB_TACK('\uf08d'),
        FAWI_EXTERNAL_LINK('\uf08e'),
        FAWI_SIGN_IN('\uf090'),
        FAWI_TROPHY('\uf091'),
        FAWI_GITHUB_SQUARE('\uf092'),
        FAWI_UPLOAD('\uf093'),
        FAWI_LEMON_O('\uf094'),
        FAWI_PHONE('\uf095'),
        FAWI_SQUARE_O('\uf096'),
        FAWI_BOOKMARK_O('\uf097'),
        FAWI_PHONE_SQUARE('\uf098'),
        FAWI_TWITTER('\uf099'),
        FAWI_FACEBOOK('\uf09a'),
        FAWI_GITHUB('\uf09b'),
        FAWI_UNLOCK('\uf09c'),
        FAWI_CREDIT_CARD('\uf09d'),
        FAWI_RSS('\uf09e'),
        FAWI_HDD_O('\uf0a0'),
        FAWI_BULLHORN('\uf0a1'),
        FAWI_BELL_O('\uf0a2'),
        FAWI_CERTIFICATE('\uf0a3'),
        FAWI_HAND_O_RIGHT('\uf0a4'),
        FAWI_HAND_O_LEFT('\uf0a5'),
        FAWI_HAND_O_UP('\uf0a6'),
        FAWI_HAND_O_DOWN('\uf0a7'),
        FAWI_ARROW_CIRCLE_LEFT('\uf0a8'),
        FAWI_ARROW_CIRCLE_RIGHT('\uf0a9'),
        FAWI_ARROW_CIRCLE_UP('\uf0aa'),
        FAWI_ARROW_CIRCLE_DOWN('\uf0ab'),
        FAWI_GLOBE('\uf0ac'),
        FAWI_WRENCH('\uf0ad'),
        FAWI_TASKS('\uf0ae'),
        FAWI_FILTER('\uf0b0'),
        FAWI_BRIEFCASE('\uf0b1'),
        FAWI_ARROWS_ALT('\uf0b2'),
        FAWI_USERS('\uf0c0'),
        FAWI_LINK('\uf0c1'),
        FAWI_CLOUD('\uf0c2'),
        FAWI_FLASK('\uf0c3'),
        FAWI_SCISSORS('\uf0c4'),
        FAWI_FILES_O('\uf0c5'),
        FAWI_PAPERCLIP('\uf0c6'),
        FAWI_FLOPPY_O('\uf0c7'),
        FAWI_SQUARE('\uf0c8'),
        FAWI_BARS('\uf0c9'),
        FAWI_LIST_UL('\uf0ca'),
        FAWI_LIST_OL('\uf0cb'),
        FAWI_STRIKETHROUGH('\uf0cc'),
        FAWI_UNDERLINE('\uf0cd'),
        FAWI_TABLE('\uf0ce'),
        FAWI_MAGIC('\uf0d0'),
        FAWI_TRUCK('\uf0d1'),
        FAWI_PINTEREST('\uf0d2'),
        FAWI_PINTEREST_SQUARE('\uf0d3'),
        FAWI_GOOGLE_PLUS_SQUARE('\uf0d4'),
        FAWI_GOOGLE_PLUS('\uf0d5'),
        FAWI_MONEY('\uf0d6'),
        FAWI_CARET_DOWN('\uf0d7'),
        FAWI_CARET_UP('\uf0d8'),
        FAWI_CARET_LEFT('\uf0d9'),
        FAWI_CARET_RIGHT('\uf0da'),
        FAWI_COLUMNS('\uf0db'),
        FAWI_SORT('\uf0dc'),
        FAWI_SORT_DESC('\uf0dd'),
        FAWI_SORT_ASC('\uf0de'),
        FAWI_ENVELOPE('\uf0e0'),
        FAWI_LINKEDIN('\uf0e1'),
        FAWI_UNDO('\uf0e2'),
        FAWI_GAVEL('\uf0e3'),
        FAWI_TACHOMETER('\uf0e4'),
        FAWI_COMMENTI_O('\uf0e5'),
        FAWI_COMMENTS_O('\uf0e6'),
        FAWI_BOLT('\uf0e7'),
        FAWI_SITEMAP('\uf0e8'),
        FAWI_UMBRELLA('\uf0e9'),
        FAWI_CLIPBOARD('\uf0ea'),
        FAWI_LIGHTBULB_O('\uf0eb'),
        FAWI_EXCHANGE('\uf0ec'),
        FAWI_CLOUD_DOWNLOAD('\uf0ed'),
        FAWI_CLOUD_UPLOAD('\uf0ee'),
        FAWI_USER_MD('\uf0f0'),
        FAWI_STETHOSCOPE('\uf0f1'),
        FAWI_SUITCASE('\uf0f2'),
        FAWI_BELL('\uf0f3'),
        FAWI_COFFEE('\uf0f4'),
        FAWI_CUTLERY('\uf0f5'),
        FAWI_FILE_TEXT_O('\uf0f6'),
        FAWI_BUILDING_O('\uf0f7'),
        FAWI_HOSPITAL_O('\uf0f8'),
        FAWI_AMBULANCE('\uf0f9'),
        FAWI_MEDKIT('\uf0fa'),
        FAWI_FIGHTER_JET('\uf0fb'),
        FAWI_BEER('\uf0fc'),
        FAWI_H_SQUARE('\uf0fd'),
        FAWI_PLUS_SQUARE('\uf0fe'),
        FAWI_ANGLE_DOUBLE_LEFT('\uf100'),
        FAWI_ANGLE_DOUBLE_RIGHT('\uf101'),
        FAWI_ANGLE_DOUBLE_UP('\uf102'),
        FAWI_ANGLE_DOUBLE_DOWN('\uf103'),
        FAWI_ANGLE_LEFT('\uf104'),
        FAWI_ANGLE_RIGHT('\uf105'),
        FAWI_ANGLE_UP('\uf106'),
        FAWI_ANGLE_DOWN('\uf107'),
        FAWI_DESKTOP('\uf108'),
        FAWI_LAPTOP('\uf109'),
        FAWI_TABLET('\uf10a'),
        FAWI_MOBILE('\uf10b'),
        FAWI_CIRCLE_O('\uf10c'),
        FAWI_QUOTE_LEFT('\uf10d'),
        FAWI_QUOTE_RIGHT('\uf10e'),
        FAWI_SPINNER('\uf110'),
        FAWI_CIRCLE('\uf111'),
        FAWI_REPLY('\uf112'),
        FAWI_GITHUB_ALT('\uf113'),
        FAWI_FOLDER_O('\uf114'),
        FAWI_FOLDER_OPEN_O('\uf115'),
        FAWI_SMILE_O('\uf118'),
        FAWI_FROWN_O('\uf119'),
        FAWI_MEH_O('\uf11a'),
        FAWI_GAMEPAD('\uf11b'),
        FAWI_KEYBOARD_O('\uf11c'),
        FAWI_FLAG_O('\uf11d'),
        FAWI_FLAG_CHECKERED('\uf11e'),
        FAWI_TERMINAL('\uf120'),
        FAWI_CODE('\uf121'),
        FAWI_REPLY_ALL('\uf122'),
        FAWI_STAR_HALF_O('\uf123'),
        FAWI_LOCATION_ARROW('\uf124'),
        FAWI_CROP('\uf125'),
        FAWI_CODE_FORK('\uf126'),
        FAWI_CHAIN_BROKEN('\uf127'),
        FAWI_QUESTION('\uf128'),
        FAWI_INFO('\uf129'),
        FAWI_EXCLAMATION('\uf12a'),
        FAWI_SUPERSCRIPT('\uf12b'),
        FAWI_SUBSCRIPT('\uf12c'),
        FAWI_ERASER('\uf12d'),
        FAWI_PUZZLE_PIECE('\uf12e'),
        FAWI_MICROPHONE('\uf130'),
        FAWI_MICROPHONE_SLASH('\uf131'),
        FAWI_SHIELD('\uf132'),
        FAWI_CALENDAR_O('\uf133'),
        FAWI_FIRE_EXTINGUISHER('\uf134'),
        FAWI_ROCKET('\uf135'),
        FAWI_MAXCDN('\uf136'),
        FAWI_CHEVRON_CIRCLE_LEFT('\uf137'),
        FAWI_CHEVRON_CIRCLE_RIGHT('\uf138'),
        FAWI_CHEVRON_CIRCLE_UP('\uf139'),
        FAWI_CHEVRON_CIRCLE_DOWN('\uf13a'),
        FAWI_HTML5('\uf13b'),
        FAWI_CSS3('\uf13c'),
        FAWI_ANCHOR('\uf13d'),
        FAWI_UNLOCK_ALT('\uf13e'),
        FAWI_BULLSEYE('\uf140'),
        FAWI_ELLIPSIS_H('\uf141'),
        FAWI_ELLIPSIS_V('\uf142'),
        FAWI_RSS_SQUARE('\uf143'),
        FAWI_PLAY_CIRCLE('\uf144'),
        FAWI_TICKET('\uf145'),
        FAWI_MINUS_SQUARE('\uf146'),
        FAWI_MINUS_SQUARE_O('\uf147'),
        FAWI_LEVEL_UP('\uf148'),
        FAWI_LEVEL_DOWN('\uf149'),
        FAWI_CHECK_SQUARE('\uf14a'),
        FAWI_PENCIL_SQUARE('\uf14b'),
        FAWI_EXTERNAL_LINK_SQUARE('\uf14c'),
        FAWI_SHARE_SQUARE('\uf14d'),
        FAWI_COMPASS('\uf14e'),
        FAWI_CARET_SQUARE_O_DOWN('\uf150'),
        FAWI_CARET_SQUARE_O_UP('\uf151'),
        FAWI_CARET_SQUARE_O_RIGHT('\uf152'),
        FAWI_EUR('\uf153'),
        FAWI_GBP('\uf154'),
        FAWI_USD('\uf155'),
        FAWI_INR('\uf156'),
        FAWI_JPY('\uf157'),
        FAWI_RUB('\uf158'),
        FAWI_KRW('\uf159'),
        FAWI_BTC('\uf15a'),
        FAWI_FILE('\uf15b'),
        FAWI_FILE_TEXT('\uf15c'),
        FAWI_SORT_ALPHA_ASC('\uf15d'),
        FAWI_SORT_ALPHA_DESC('\uf15e'),
        FAWI_SORT_AMOUNT_ASC('\uf160'),
        FAWI_SORT_AMOUNT_DESC('\uf161'),
        FAWI_SORT_NUMERIC_ASC('\uf162'),
        FAWI_SORT_NUMERIC_DESC('\uf163'),
        FAWI_THUMBS_UP('\uf164'),
        FAWI_THUMBS_DOWN('\uf165'),
        FAWI_YOUTUBE_SQUARE('\uf166'),
        FAWI_YOUTUBE('\uf167'),
        FAWI_XING('\uf168'),
        FAWI_XING_SQUARE('\uf169'),
        FAWI_YOUTUBE_PLAY('\uf16a'),
        FAWI_DROPBOX('\uf16b'),
        FAWI_STACK_OVERFLOW('\uf16c'),
        FAWI_INSTAGRAM('\uf16d'),
        FAWI_FLICKR('\uf16e'),
        FAWI_ADN('\uf170'),
        FAWI_BITBUCKET('\uf171'),
        FAWI_BITBUCKET_SQUARE('\uf172'),
        FAWI_TUMBLR('\uf173'),
        FAWI_TUMBLR_SQUARE('\uf174'),
        FAWI_LONG_ARROW_DOWN('\uf175'),
        FAWI_LONG_ARROW_UP('\uf176'),
        FAWI_LONG_ARROW_LEFT('\uf177'),
        FAWI_LONG_ARROW_RIGHT('\uf178'),
        FAWI_APPLE('\uf179'),
        FAWI_WINDOWS('\uf17a'),
        FAWI_LINUX('\uf17c'),
        FAWI_DRIBBBLE('\uf17d'),
        FAWI_SKYPE('\uf17e'),
        FAWI_FOURSQUARE('\uf180'),
        FAWI_TRELLO('\uf181'),
        FAWI_FEMALE('\uf182'),
        FAWI_MALE('\uf183'),
        FAWI_GRATIPAY('\uf184'),
        FAWI_SUN_O('\uf185'),
        FAWI_MOON_O('\uf186'),
        FAWI_ARCHIVE('\uf187'),
        FAWI_BUG('\uf188'),
        FAWI_VK('\uf189'),
        FAWI_WEIBO('\uf18a'),
        FAWI_RENREN('\uf18b'),
        FAWI_PAGELINES('\uf18c'),
        FAWI_STACK_EXCHANGE('\uf18d'),
        FAWI_ARROW_CIRCLE_O_RIGHT('\uf18e'),
        FAWI_ARROW_CIRCLE_O_LEFT('\uf190'),
        FAWI_CARET_SQUARE_O_LEFT('\uf191'),
        FAWI_DOT_CIRCLE_O('\uf192'),
        FAWI_WHEELCHAIR('\uf193'),
        FAWI_VIMEO_SQUARE('\uf194'),
        FAWI_TRY('\uf195'),
        FAWI_PLUS_SQUARE_O('\uf196'),
        FAWI_SPACE_SHUTTLE('\uf197'),
        FAWI_SLACK('\uf198'),
        FAWI_ENVELOPE_SQUARE('\uf199'),
        FAWI_WORDPRESS('\uf19a'),
        FAWI_OPENID('\uf19b'),
        FAWI_UNIVERSITY('\uf19c'),
        FAWI_GRADUATION_CAP('\uf19d'),
        FAWI_YAHOO('\uf19e'),
        FAWI_GOOGLE('\uf1a0'),
        FAWI_REDDIT('\uf1a1'),
        FAWI_REDDIT_SQUARE('\uf1a2'),
        FAWI_STUMBLEUPON_CIRCLE('\uf1a3'),
        FAWI_STUMBLEUPON('\uf1a4'),
        FAWI_DELICIOUS('\uf1a5'),
        FAWI_DIGG('\uf1a6'),
        FAWI_PIED_PIPER_PP('\uf1a7'),
        FAWI_PIED_PIPER_ALT('\uf1a8'),
        FAWI_DRUPAL('\uf1a9'),
        FAWI_JOOMLA('\uf1aa'),
        FAWI_LANGUAGE('\uf1ab'),
        FAWI_FAX('\uf1ac'),
        FAWI_BUILDING('\uf1ad'),
        FAWI_CHILD('\uf1ae'),
        FAWI_PAW('\uf1b0'),
        FAWI_SPOON('\uf1b1'),
        FAWI_CUBE('\uf1b2'),
        FAWI_CUBES('\uf1b3'),
        FAWI_BEHANCE('\uf1b4'),
        FAWI_BEHANCE_SQUARE('\uf1b5'),
        FAWI_STEAM('\uf1b6'),
        FAWI_STEAM_SQUARE('\uf1b7'),
        FAWI_RECYCLE('\uf1b8'),
        FAWI_CAR('\uf1b9'),
        FAWI_TAXI('\uf1ba'),
        FAWI_TREE('\uf1bb'),
        FAWI_SPOTIFY('\uf1bc'),
        FAWI_DEVIANTART('\uf1bd'),
        FAWI_SOUNDCLOUD('\uf1be'),
        FAWI_DATABASE('\uf1c0'),
        FAWI_FILE_PDF_O('\uf1c1'),
        FAWI_FILE_WORD_O('\uf1c2'),
        FAWI_FILE_EXCEL_O('\uf1c3'),
        FAWI_FILE_POWERPOINT_O('\uf1c4'),
        FAWI_FILE_IMAGE_O('\uf1c5'),
        FAWI_FILE_ARCHIVE_O('\uf1c6'),
        FAWI_FILE_AUDIO_O('\uf1c7'),
        FAWI_FILE_VIDEO_O('\uf1c8'),
        FAWI_FILE_CODE_O('\uf1c9'),
        FAWI_VINE('\uf1ca'),
        FAWI_CODEPEN('\uf1cb'),
        FAWI_JSFIDDLE('\uf1cc'),
        FAWI_LIFE_RING('\uf1cd'),
        FAWI_CIRCLE_O_NOTCH('\uf1ce'),
        FAWI_REBEL('\uf1d0'),
        FAWI_EMPIRE('\uf1d1'),
        FAWI_GIT_SQUARE('\uf1d2'),
        FAWI_GIT('\uf1d3'),
        FAWI_HACKER_NEWS('\uf1d4'),
        FAWI_TENCENTI_WEIBO('\uf1d5'),
        FAWI_QQ('\uf1d6'),
        FAWI_WEIXIN('\uf1d7'),
        FAWI_PAPER_PLANE('\uf1d8'),
        FAWI_PAPER_PLANE_O('\uf1d9'),
        FAWI_HISTORY('\uf1da'),
        FAWI_CIRCLE_THIN('\uf1db'),
        FAWI_HEADER('\uf1dc'),
        FAWI_PARAGRAPH('\uf1dd'),
        FAWI_SLIDERS('\uf1de'),
        FAWI_SHARE_ALT('\uf1e0'),
        FAWI_SHARE_ALT_SQUARE('\uf1e1'),
        FAWI_BOMB('\uf1e2'),
        FAWI_FUTBOL_O('\uf1e3'),
        FAWI_TTY('\uf1e4'),
        FAWI_BINOCULARS('\uf1e5'),
        FAWI_PLUG('\uf1e6'),
        FAWI_SLIDESHARE('\uf1e7'),
        FAWI_TWITCH('\uf1e8'),
        FAWI_YELP('\uf1e9'),
        FAWI_NEWSPAPER_O('\uf1ea'),
        FAWI_WIFI('\uf1eb'),
        FAWI_CALCULATOR('\uf1ec'),
        FAWI_PAYPAL('\uf1ed'),
        FAWI_GOOGLE_WALLET('\uf1ee'),
        FAWI_CC_VISA('\uf1f0'),
        FAWI_CC_MASTERCARD('\uf1f1'),
        FAWI_CC_DISCOVER('\uf1f2'),
        FAWI_CC_AMEX('\uf1f3'),
        FAWI_CC_PAYPAL('\uf1f4'),
        FAWI_CC_STRIPE('\uf1f5'),
        FAWI_BELL_SLASH('\uf1f6'),
        FAWI_BELL_SLASH_O('\uf1f7'),
        FAWI_TRASH('\uf1f8'),
        FAWI_COPYRIGHT('\uf1f9'),
        FAWI_AT('\uf1fa'),
        FAWI_EYEDROPPER('\uf1fb'),
        FAWI_PAINT_BRUSH('\uf1fc'),
        FAWI_BIRTHDAY_CAKE('\uf1fd'),
        FAWI_AREA_CHART('\uf1fe'),
        FAWI_PIE_CHART('\uf200'),
        FAWI_LINE_CHART('\uf201'),
        FAWI_LASTFM('\uf202'),
        FAWI_LASTFM_SQUARE('\uf203'),
        FAWI_TOGGLE_OFF('\uf204'),
        FAWI_TOGGLE_ON('\uf205'),
        FAWI_BICYCLE('\uf206'),
        FAWI_BUS('\uf207'),
        FAWI_IOXHOST('\uf208'),
        FAWI_ANGELLIST('\uf209'),
        FAWI_CC('\uf20a'),
        FAWI_ILS('\uf20b'),
        FAWI_MEANPATH('\uf20c'),
        FAWI_BUYSELLADS('\uf20d'),
        FAWI_CONNECTDEVELOP('\uf20e'),
        FAWI_DASHCUBE('\uf210'),
        FAWI_FORUMBEE('\uf211'),
        FAWI_LEANPUB('\uf212'),
        FAWI_SELLSY('\uf213'),
        FAWI_SHIRTSINBULK('\uf214'),
        FAWI_SIMPLYBUILT('\uf215'),
        FAWI_SKYATLAS('\uf216'),
        FAWI_CART_PLUS('\uf217'),
        FAWI_CART_ARROW_DOWN('\uf218'),
        FAWI_DIAMOND('\uf219'),
        FAWI_SHIP('\uf21a'),
        FAWI_USER_SECRET('\uf21b'),
        FAWI_MOTORCYCLE('\uf21c'),
        FAWI_STREET_VIEW('\uf21d'),
        FAWI_HEARTBEAT('\uf21e'),
        FAWI_VENUS('\uf221'),
        FAWI_MARS('\uf222'),
        FAWI_MERCURY('\uf223'),
        FAWI_TRANSGENDER('\uf224'),
        FAWI_TRANSGENDER_ALT('\uf225'),
        FAWI_VENUS_DOUBLE('\uf226'),
        FAWI_MARS_DOUBLE('\uf227'),
        FAWI_VENUS_MARS('\uf228'),
        FAWI_MARS_STROKE('\uf229'),
        FAWI_MARS_STROKE_V('\uf22a'),
        FAWI_MARS_STROKE_H('\uf22b'),
        FAWI_NEUTER('\uf22c'),
        FAWI_GENDERLESS('\uf22d'),
        FAWI_FACEBOOK_OFFICIAL('\uf230'),
        FAWI_PINTEREST_P('\uf231'),
        FAWI_WHATSAPP('\uf232'),
        FAWI_SERVER('\uf233'),
        FAWI_USER_PLUS('\uf234'),
        FAWI_USER_TIMES('\uf235'),
        FAWI_BED('\uf236'),
        FAWI_VIACOIN('\uf237'),
        FAWI_TRAIN('\uf238'),
        FAWI_SUBWAY('\uf239'),
        FAWI_MEDIUM('\uf23a'),
        FAWI_Y_COMBINATOR('\uf23b'),
        FAWI_OPTIN_MONSTER('\uf23c'),
        FAWI_OPENCART('\uf23d'),
        FAWI_EXPEDITEDSSL('\uf23e'),
        FAWI_BATTERY_FULL('\uf240'),
        FAWI_BATTERY_THREE_QUARTERS('\uf241'),
        FAWI_BATTERY_HALF('\uf242'),
        FAWI_BATTERY_QUARTER('\uf243'),
        FAWI_BATTERY_EMPTY('\uf244'),
        FAWI_MOUSE_POINTER('\uf245'),
        FAWI_I_CURSOR('\uf246'),
        FAWI_OBJECT_GROUP('\uf247'),
        FAWI_OBJECT_UNGROUP('\uf248'),
        FAWI_STICKY_NOTE('\uf249'),
        FAWI_STICKY_NOTE_O('\uf24a'),
        FAWI_CC_JCB('\uf24b'),
        FAWI_CC_DINERS_CLUB('\uf24c'),
        FAWI_CLONE('\uf24d'),
        FAWI_BALANCE_SCALE('\uf24e'),
        FAWI_HOURGLASS_O('\uf250'),
        FAWI_HOURGLASS_START('\uf251'),
        FAWI_HOURGLASS_HALF('\uf252'),
        FAWI_HOURGLASS_END('\uf253'),
        FAWI_HOURGLASS('\uf254'),
        FAWI_HAND_ROCK_O('\uf255'),
        FAWI_HAND_PAPER_O('\uf256'),
        FAWI_HAND_SCISSORS_O('\uf257'),
        FAWI_HAND_LIZARD_O('\uf258'),
        FAWI_HAND_SPOCK_O('\uf259'),
        FAWI_HAND_POINTER_O('\uf25a'),
        FAWI_HAND_PEACE_O('\uf25b'),
        FAWI_TRADEMARK('\uf25c'),
        FAWI_REGISTERED('\uf25d'),
        FAWI_CREATIVE_COMMONS('\uf25e'),
        FAWI_GG('\uf260'),
        FAWI_GG_CIRCLE('\uf261'),
        FAWI_TRIPADVISOR('\uf262'),
        FAWI_ODNOKLASSNIKI('\uf263'),
        FAWI_ODNOKLASSNIKI_SQUARE('\uf264'),
        FAWI_GET_POCKET('\uf265'),
        FAWI_WIKIPEDIA_W('\uf266'),
        FAWI_SAFARI('\uf267'),
        FAWI_CHROME('\uf268'),
        FAWI_FIREFOX('\uf269'),
        FAWI_OPERA('\uf26a'),
        FAWI_INTERNET_EXPLORER('\uf26b'),
        FAWI_TELEVISION('\uf26c'),
        FAWI_CONTAO('\uf26d'),
        FAWI_500PX('\uf26e'),
        FAWI_AMAZON('\uf270'),
        FAWI_CALENDAR_PLUS_O('\uf271'),
        FAWI_CALENDAR_MINUS_O('\uf272'),
        FAWI_CALENDAR_TIMES_O('\uf273'),
        FAWI_CALENDAR_CHECK_O('\uf274'),
        FAWI_INDUSTRY('\uf275'),
        FAWI_MAP_PIN('\uf276'),
        FAWI_MAP_SIGNS('\uf277'),
        FAWI_MAP_O('\uf278'),
        FAWI_MAP('\uf279'),
        FAWI_COMMENTING('\uf27a'),
        FAWI_COMMENTING_O('\uf27b'),
        FAWI_HOUZZ('\uf27c'),
        FAWI_VIMEO('\uf27d'),
        FAWI_BLACK_TIE('\uf27e'),
        FAWI_FONTICONS('\uf280'),
        FAWI_REDDIT_ALIEN('\uf281'),
        FAWI_EDGE('\uf282'),
        FAWI_CREDIT_CARD_ALT('\uf283'),
        FAWI_CODIEPIE('\uf284'),
        FAWI_MODX('\uf285'),
        FAWI_FORT_AWESOME('\uf286'),
        FAWI_USB('\uf287'),
        FAWI_PRODUCT_HUNT('\uf288'),
        FAWI_MIXCLOUD('\uf289'),
        FAWI_SCRIBD('\uf28a'),
        FAWI_PAUSE_CIRCLE('\uf28b'),
        FAWI_PAUSE_CIRCLE_O('\uf28c'),
        FAWI_STOP_CIRCLE('\uf28d'),
        FAWI_STOP_CIRCLE_O('\uf28e'),
        FAWI_SHOPPING_BAG('\uf290'),
        FAWI_SHOPPING_BASKET('\uf291'),
        FAWI_HASHTAG('\uf292'),
        FAWI_BLUETOOTH('\uf293'),
        FAWI_BLUETOOTH_B('\uf294'),
        FAWI_PERCENT('\uf295'),
        FAWI_GITLAB('\uf296'),
        FAWI_WPBEGINNER('\uf297'),
        FAWI_WPFORMS('\uf298'),
        FAWI_ENVIRA('\uf299'),
        FAWI_UNIVERSAL_ACCESS('\uf29a'),
        FAWI_WHEELCHAIR_ALT('\uf29b'),
        FAWI_QUESTION_CIRCLE_O('\uf29c'),
        FAWI_BLIND('\uf29d'),
        FAWI_AUDIO_DESCRIPTION('\uf29e'),
        FAWI_VOLUME_CONTROL_PHONE('\uf2a0'),
        FAWI_BRAILLE('\uf2a1'),
        FAWI_ASSISTIVE_LISTENING_SYSTEMS('\uf2a2'),
        FAWI_AMERICAN_SIGN_LANGUAGE_INTERPRETING('\uf2a3'),
        FAWI_DEAF('\uf2a4'),
        FAWI_GLIDE('\uf2a5'),
        FAWI_GLIDE_G('\uf2a6'),
        FAWI_SIGN_LANGUAGE('\uf2a7'),
        FAWI_LOW_VISION('\uf2a8'),
        FAWI_VIADEO('\uf2a9'),
        FAWI_VIADEO_SQUARE('\uf2aa'),
        FAWI_SNAPCHAT('\uf2ab'),
        FAWI_SNAPCHAT_GHOST('\uf2ac'),
        FAWI_SNAPCHAT_SQUARE('\uf2ad'),
        FAWI_PIED_PIPER('\uf2ae'),
        FAWI_FIRST_ORDER('\uf2b0'),
        FAWI_YOAST('\uf2b1'),
        FAWI_THEMEISLE('\uf2b2'),
        FAWI_GOOGLE_PLUS_OFFICIAL('\uf2b3'),
        FAWI_FONT_AWESOME('\uf2b4'),
        FAWI_HANDSHAKE_O('\uf2b5'),
        FAWI_ENVELOPE_OPEN('\uf2b6'),
        FAWI_ENVELOPE_OPEN_O('\uf2b7'),
        FAWI_LINODE('\uf2b8'),
        FAWI_ADDRESS_BOOK('\uf2b9'),
        FAWI_ADDRESS_BOOK_O('\uf2ba'),
        FAWI_ADDRESS_CARD('\uf2bb'),
        FAWI_ADDRESS_CARD_O('\uf2bc'),
        FAWI_USER_CIRCLE('\uf2bd'),
        FAWI_USER_CIRCLE_O('\uf2be'),
        FAWI_USER_O('\uf2c0'),
        FAWI_ID_BADGE('\uf2c1'),
        FAWI_ID_CARD('\uf2c2'),
        FAWI_ID_CARD_O('\uf2c3'),
        FAWI_QUORA('\uf2c4'),
        FAWI_FREE_CODE_CAMP('\uf2c5'),
        FAWI_TELEGRAM('\uf2c6'),
        FAWI_THERMOMETER_FULL('\uf2c7'),
        FAWI_THERMOMETER_THREE_QUARTERS('\uf2c8'),
        FAWI_THERMOMETER_HALF('\uf2c9'),
        FAWI_THERMOMETER_QUARTER('\uf2ca'),
        FAWI_THERMOMETER_EMPTY('\uf2cb'),
        FAWI_SHOWER('\uf2cc'),
        FAWI_BATH('\uf2cd'),
        FAWI_PODCAST('\uf2ce'),
        FAWI_WINDOW_MAXIMIZE('\uf2d0'),
        FAWI_WINDOW_MINIMIZE('\uf2d1'),
        FAWI_WINDOW_RESTORE('\uf2d2'),
        FAWI_WINDOW_CLOSE('\uf2d3'),
        FAWI_WINDOW_CLOSE_O('\uf2d4'),
        FAWI_BANDCAMP('\uf2d5'),
        FAWI_GRAV('\uf2d6'),
        FAWI_ETSY('\uf2d7'),
        FAWI_IMDB('\uf2d8'),
        FAWI_RAVELRY('\uf2d9'),
        FAWI_EERCAST('\uf2da'),
        FAWI_MICROCHIP('\uf2db'),
        FAWI_SNOWFLAKE_O('\uf2dc'),
        FAWI_SUPERPOWERS('\uf2dd'),
        FAWI_WPEXPLORER('\uf2de'),
        FAWI_MEETUP('\uf2e0');

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
        private static ITypeface fontAwesomeTypeface;

        @Override
        public ITypeface getTypeface() {
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
