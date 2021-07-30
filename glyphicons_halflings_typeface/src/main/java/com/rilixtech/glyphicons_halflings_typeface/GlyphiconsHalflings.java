package com.rilixtech.glyphicons_halflings_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the GlyphiconsHalflings font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class GlyphiconsHalflings implements ITypeface {
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
     * GlyphiconsHalflings IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which GlyphiconsHalflings IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by GlyphiconsHalflings ITypeface.
     */
    public enum Icon implements IIcon {
        GLYI_ASTERISK('\u002a'),
        GLYI_PLUS('\u002b'),
        GLYI_EUR('\u20ac'),
        GLYI_MINUS('\u2212'),
        GLYI_CLOUD('\u2601'),
        GLYI_ENVELOPE('\u2709'),
        GLYI_PENCIL('\u270f'),
        GLYI_GLASS('\ue001'),
        GLYI_MUSIC('\ue002'),
        GLYI_SEARCH('\ue003'),
        GLYI_HEART('\ue005'),
        GLYI_STAR('\ue006'),
        GLYI_STAR_EMPTY('\ue007'),
        GLYI_USER('\ue008'),
        GLYI_FILM('\ue009'),
        GLYI_TH_LARGE('\ue010'),
        GLYI_TH('\ue011'),
        GLYI_TH_LIST('\ue012'),
        GLYI_OK('\ue013'),
        GLYI_REMOVE('\ue014'),
        GLYI_ZOOM_IN('\ue015'),
        GLYI_ZOOM_OUT('\ue016'),
        GLYI_OFF('\ue017'),
        GLYI_SIGNAL('\ue018'),
        GLYI_COG('\ue019'),
        GLYI_TRASH('\ue020'),
        GLYI_HOME('\ue021'),
        GLYI_FILE('\ue022'),
        GLYI_TIME('\ue023'),
        GLYI_ROAD('\ue024'),
        GLYI_DOWNLOAD_ALT('\ue025'),
        GLYI_DOWNLOAD('\ue026'),
        GLYI_UPLOAD('\ue027'),
        GLYI_INBOX('\ue028'),
        GLYI_PLAY_CIRCLE('\ue029'),
        GLYI_REPEAT('\ue030'),
        GLYI_REFRESH('\ue031'),
        GLYI_LIST_ALT('\ue032'),
        GLYI_LOCK('\ue033'),
        GLYI_FLAG('\ue034'),
        GLYI_HEADPHONES('\ue035'),
        GLYI_VOLUME_OFF('\ue036'),
        GLYI_VOLUME_DOWN('\ue037'),
        GLYI_VOLUME_UP('\ue038'),
        GLYI_QRCODE('\ue039'),
        GLYI_BARCODE('\ue040'),
        GLYI_TAG('\ue041'),
        GLYI_TAGS('\ue042'),
        GLYI_BOOK('\ue043'),
        GLYI_BOOKMARK('\ue044'),
        GLYI_PRINT('\ue045'),
        GLYI_CAMERA('\ue046'),
        GLYI_FONT('\ue047'),
        GLYI_BOLD('\ue048'),
        GLYI_ITALIC('\ue049'),
        GLYI_TEXT_HEIGHT('\ue050'),
        GLYI_TEXT_WIDTH('\ue051'),
        GLYI_ALIGN_LEFT('\ue052'),
        GLYI_ALIGN_CENTER('\ue053'),
        GLYI_ALIGN_RIGHT('\ue054'),
        GLYI_ALIGN_JUSTIFY('\ue055'),
        GLYI_LIST('\ue056'),
        GLYI_INDENT_LEFT('\ue057'),
        GLYI_INDENT_RIGHT('\ue058'),
        GLYI_FACETIME_VIDEO('\ue059'),
        GLYI_PICTURE('\ue060'),
        GLYI_MAP_MARKER('\ue062'),
        GLYI_ADJUST('\ue063'),
        GLYI_TINT('\ue064'),
        GLYI_EDIT('\ue065'),
        GLYI_SHARE('\ue066'),
        GLYI_CHECK('\ue067'),
        GLYI_MOVE('\ue068'),
        GLYI_STEP_BACKWARD('\ue069'),
        GLYI_FAST_BACKWARD('\ue070'),
        GLYI_BACKWARD('\ue071'),
        GLYI_PLAY('\ue072'),
        GLYI_PAUSE('\ue073'),
        GLYI_STOP('\ue074'),
        GLYI_FORWARD('\ue075'),
        GLYI_FAST_FORWARD('\ue076'),
        GLYI_STEP_FORWARD('\ue077'),
        GLYI_EJECT('\ue078'),
        GLYI_CHEVRON_LEFT('\ue079'),
        GLYI_CHEVRON_RIGHT('\ue080'),
        GLYI_PLUS_SIGN('\ue081'),
        GLYI_MINUS_SIGN('\ue082'),
        GLYI_REMOVE_SIGN('\ue083'),
        GLYI_OK_SIGN('\ue084'),
        GLYI_QUESTION_SIGN('\ue085'),
        GLYI_INFO_SIGN('\ue086'),
        GLYI_SCREENSHOT('\ue087'),
        GLYI_REMOVE_CIRCLE('\ue088'),
        GLYI_OK_CIRCLE('\ue089'),
        GLYI_BAN_CIRCLE('\ue090'),
        GLYI_ARROW_LEFT('\ue091'),
        GLYI_ARROW_RIGHT('\ue092'),
        GLYI_ARROW_UP('\ue093'),
        GLYI_ARROW_DOWN('\ue094'),
        GLYI_SHARE_ALT('\ue095'),
        GLYI_RESIZE_FULL('\ue096'),
        GLYI_RESIZE_SMALL('\ue097'),
        GLYI_EXCLAMATION_SIGN('\ue101'),
        GLYI_GIFT('\ue102'),
        GLYI_LEAF('\ue103'),
        GLYI_FIRE('\ue104'),
        GLYI_EYE_OPEN('\ue105'),
        GLYI_EYE_CLOSE('\ue106'),
        GLYI_WARNING_SIGN('\ue107'),
        GLYI_PLANE('\ue108'),
        GLYI_CALENDAR('\ue109'),
        GLYI_RANDOM('\ue110'),
        GLYI_COMMENT('\ue111'),
        GLYI_MAGNET('\ue112'),
        GLYI_CHEVRON_UP('\ue113'),
        GLYI_CHEVRON_DOWN('\ue114'),
        GLYI_RETWEET('\ue115'),
        GLYI_SHOPPING_CART('\ue116'),
        GLYI_FOLDER_CLOSE('\ue117'),
        GLYI_FOLDER_OPEN('\ue118'),
        GLYI_RESIZE_VERTICAL('\ue119'),
        GLYI_RESIZE_HORIZONTAL('\ue120'),
        GLYI_HDD('\ue121'),
        GLYI_BULLHORN('\ue122'),
        GLYI_BELL('\ue123'),
        GLYI_CERTIFICATE('\ue124'),
        GLYI_THUMBS_UP('\ue125'),
        GLYI_THUMBS_DOWN('\ue126'),
        GLYI_HAND_RIGHT('\ue127'),
        GLYI_HAND_LEFT('\ue128'),
        GLYI_HAND_UP('\ue129'),
        GLYI_HAND_DOWN('\ue130'),
        GLYI_CIRCLE_ARROW_RIGHT('\ue131'),
        GLYI_CIRCLE_ARROW_LEFT('\ue132'),
        GLYI_CIRCLE_ARROW_UP('\ue133'),
        GLYI_CIRCLE_ARROW_DOWN('\ue134'),
        GLYI_GLOBE('\ue135'),
        GLYI_WRENCH('\ue136'),
        GLYI_TASKS('\ue137'),
        GLYI_FILTER('\ue138'),
        GLYI_BRIEFCASE('\ue139'),
        GLYI_FULLSCREEN('\ue140'),
        GLYI_DASHBOARD('\ue141'),
        GLYI_PAPERCLIP('\ue142'),
        GLYI_HEART_EMPTY('\ue143'),
        GLYI_LINK('\ue144'),
        GLYI_PHONE('\ue145'),
        GLYI_PUSHPIN('\ue146'),
        GLYI_USD('\ue148'),
        GLYI_GBP('\ue149'),
        GLYI_SORT('\ue150'),
        GLYI_SORT_BY_ALPHABET('\ue151'),
        GLYI_SORT_BY_ALPHABET_ALT('\ue152'),
        GLYI_SORT_BY_ORDER('\ue153'),
        GLYI_SORT_BY_ORDER_ALT('\ue154'),
        GLYI_SORT_BY_ATTRIBUTES('\ue155'),
        GLYI_SORT_BY_ATTRIBUTES_ALT('\ue156'),
        GLYI_UNCHECKED('\ue157'),
        GLYI_EXPAND('\ue158'),
        GLYI_COLLAPSE_DOWN('\ue159'),
        GLYI_COLLAPSE_UP('\ue160'),
        GLYI_LOG_IN('\ue161'),
        GLYI_FLASH('\ue162'),
        GLYI_LOG_OUT('\ue163'),
        GLYI_NEW_WINDOW('\ue164'),
        GLYI_RECORD('\ue165'),
        GLYI_SAVE('\ue166'),
        GLYI_OPEN('\ue167'),
        GLYI_SAVED('\ue168'),
        GLYI_IMPORT('\ue169'),
        GLYI_EXPORT('\ue170'),
        GLYI_SEND('\ue171'),
        GLYI_FLOPPY_DISK('\ue172'),
        GLYI_FLOPPY_SAVED('\ue173'),
        GLYI_FLOPPY_REMOVE('\ue174'),
        GLYI_FLOPPY_SAVE('\ue175'),
        GLYI_FLOPPY_OPEN('\ue176'),
        GLYI_CREDIT_CARD('\ue177'),
        GLYI_TRANSFER('\ue178'),
        GLYI_CUTLERY('\ue179'),
        GLYI_HEADER('\ue180'),
        GLYI_COMPRESSED('\ue181'),
        GLYI_EARPHONE('\ue182'),
        GLYI_PHONE_ALT('\ue183'),
        GLYI_TOWER('\ue184'),
        GLYI_STATS('\ue185'),
        GLYI_SD_VIDEO('\ue186'),
        GLYI_HD_VIDEO('\ue187'),
        GLYI_SUBTITLES('\ue188'),
        GLYI_SOUND_STEREO('\ue189'),
        GLYI_SOUND_DOLBY('\ue190'),
        GLYI_SOUND_5_1('\ue191'),
        GLYI_SOUND_6_1('\ue192'),
        GLYI_SOUND_7_1('\ue193'),
        GLYI_COPYRIGHT_MARK('\ue194'),
        GLYI_REGISTRATION_MARK('\ue195'),
        GLYI_CLOUD_DOWNLOAD('\ue197'),
        GLYI_CLOUD_UPLOAD('\ue198'),
        GLYI_TREE_CONIFER('\ue199'),
        GLYI_TREE_DECIDUOUS('\ue200'),
        GLYI_CD('\ue201'),
        GLYI_SAVE_FILE('\ue202'),
        GLYI_OPEN_FILE('\ue203'),
        GLYI_LEVEL_UP('\ue204'),
        GLYI_COPY('\ue205'),
        GLYI_PASTE('\ue206'),
        GLYI_ALERT('\ue209'),
        GLYI_EQUALIZER('\ue210'),
        GLYI_KING('\ue211'),
        GLYI_QUEEN('\ue212'),
        GLYI_PAWN('\ue213'),
        GLYI_BISHOP('\ue214'),
        GLYI_KNIGHT('\ue215'),
        GLYI_BABY_FORMULA('\ue216'),
        GLYI_TENT('\u26fa'),
        GLYI_BLACKBOARD('\ue218'),
        GLYI_BED('\ue219'),
        GLYI_APPLE('\uf8ff'),
        GLYI_ERASE('\ue221'),
        GLYI_HOURGLASS('\u231b'),
        GLYI_LAMP('\ue223'),
        GLYI_DUPLICATE('\ue224'),
        GLYI_PIGGY_BANK('\ue225'),
        GLYI_SCISSORS('\ue226'),
        GLYI_BITCOIN('\ue227'),
        GLYI_BTC('\ue227'),
        GLYI_XBT('\ue227'),
        GLYI_YEN('\u00a5'),
        GLYI_JPY('\u00a5'),
        GLYI_RUBLE('\u20bd'),
        GLYI_RUB('\u20bd'),
        GLYI_SCALE('\ue230'),
        GLYI_ICE_LOLLY('\ue231'),
        GLYI_ICE_LOLLY_TASTED('\ue232'),
        GLYI_EDUCATION('\ue233'),
        GLYI_OPTION_HORIZONTAL('\ue234'),
        GLYI_OPTION_VERTICAL('\ue235'),
        GLYI_MENU_HAMBURGER('\ue236'),
        GLYI_MODAL_WINDOW('\ue237'),
        GLYI_OIL('\ue238'),
        GLYI_GRAIN('\ue239'),
        GLYI_SUNGLASSES('\ue240'),
        GLYI_TEXT_SIZE('\ue241'),
        GLYI_TEXT_COLOR('\ue242'),
        GLYI_TEXT_BACKGROUND('\ue243'),
        GLYI_OBJECT_ALIGN_TOP('\ue244'),
        GLYI_OBJECT_ALIGN_BOTTOM('\ue245'),
        GLYI_OBJECT_ALIGN_HORIZONTAL('\ue246'),
        GLYI_OBJECT_ALIGN_LEFT('\ue247'),
        GLYI_OBJECT_ALIGN_VERTICAL('\ue248'),
        GLYI_OBJECT_ALIGN_RIGHT('\ue249'),
        GLYI_TRIANGLE_RIGHT('\ue250'),
        GLYI_TRIANGLE_LEFT('\ue251'),
        GLYI_TRIANGLE_BOTTOM('\ue252'),
        GLYI_TRIANGLE_TOP('\ue253'),
        GLYI_CONSOLE('\ue254'),
        GLYI_SUPERSCRIPT('\ue255'),
        GLYI_SUBSCRIPT('\ue256'),
        GLYI_MENU_LEFT('\ue257'),
        GLYI_MENU_RIGHT('\ue258'),
        GLYI_MENU_DOWN('\ue259'),
        GLYI_MENU_UP('\ue260');

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
        private static ITypeface glyphiconsHalflingsTypeface;

        @Override
        public ITypeface getTypeface() {
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
