package com.rilixtech.open_iconic_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the OpenIconic font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class OpenIconic implements ITypeface {
    private static final String TTF_FILE = "open-iconic-1.1.1.ttf";
    private static final String OPEN_ICONIC_PREFIX = "OPIC";
    public static final String OPEN_ICONIC_NAME = "Open Iconic";
    public static final String OPEN_ICONIC_VERSION = "1" + ".1.1";
    public static final String OPEN_ICONIC_AUTHOR = "Iconic";
    public static final String OPEN_ICONIC_URL = "https://github.com/iconic/open-iconic/";
    public static final String OPEN_ICONIC_DESC = "GitHub's icon font http://useiconic.com/";
    public static final String OPEN_ICONIC_LICENSE = " SIL OFL 1.1";
    public static final String OPEN_ICONIC_LICENSE_URL = "http://scripts.sil.org/OFL";

    private static Font openIconicTypeface = null;
    private static HashMap<String, Character> openIconicCharMap;

    /**
     * OpenIconic IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which OpenIconic IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the OpenIconic icon characters in a HashMap.
     *
     * @return HashMap of all OpenIconic icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (openIconicCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.openIconicCharacter);
            }
            setChars(characterHashMap);
        }
        return openIconicCharMap;
    }

    /**
     * Set the OpenIconic Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        openIconicCharMap = characterHashMap;
    }

    /**
     * Return the OpenIconic Mapping Prefix.
     *
     * @return OpenIconic Mapping Prefix, used by all OpenIconic icons.
     */
    @Override
    public String getMappingPrefix() {
        return OPEN_ICONIC_PREFIX;
    }

    @Override
    public String getFontName() {
        return OPEN_ICONIC_NAME;
    }

    @Override
    public String getVersion() {
        return OPEN_ICONIC_VERSION;
    }

    @Override
    public int getIconCount() {
        return openIconicCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> openIconicKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            openIconicKeyList.add(value.name());
        }
        return openIconicKeyList;
    }

    @Override
    public String getAuthor() {
        return OPEN_ICONIC_AUTHOR;
    }

    @Override
    public String getUrl() {
        return OPEN_ICONIC_URL;
    }

    @Override
    public String getDescription() {
        return OPEN_ICONIC_DESC;
    }

    @Override
    public String getLicense() {
        return OPEN_ICONIC_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return OPEN_ICONIC_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (openIconicTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return openIconicTypeface;
    }

    private static void cacheTypeface(Font font) {
        openIconicTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by OpenIconic ITypeface.
     */
    public enum Icon implements IIcon {
        //Open Iconic
        OPIC_ACCOUNT_LOGIN('\ue000'),
        OPIC_ACCOUNT_LOGOUT('\ue001'),
        OPIC_ACTION_REDO('\ue002'),
        OPIC_ACTION_UNDO('\ue003'),
        OPIC_ALIGN_CENTER('\ue004'),
        OPIC_ALIGN_LEFT('\ue005'),
        OPIC_ALIGN_RIGHT('\ue006'),
        OPIC_APERTURE('\ue007'),
        OPIC_ARROW_BOTTOM('\ue008'),
        OPIC_ARROW_CIRCLE_BOTTOM('\ue009'),
        OPIC_ARROW_CIRCLE_LEFT('\ue00a'),
        OPIC_ARROW_CIRCLE_RIGHT('\ue00b'),
        OPIC_ARROW_CIRCLE_TOP('\ue00c'),
        OPIC_ARROW_LEFT('\ue00d'),
        OPIC_ARROW_RIGHT('\ue00e'),
        OPIC_ARROW_THICK_BOTTOM('\ue00f'),
        OPIC_ARROW_THICK_LEFT('\ue010'),
        OPIC_ARROW_THICK_RIGHT('\ue011'),
        OPIC_ARROW_THICK_TOP('\ue012'),
        OPIC_ARROW_TOP('\ue013'),
        OPIC_AUDIO_SPECTRUM('\ue014'),
        OPIC_AUDIO('\ue015'),
        OPIC_BADGE('\ue016'),
        OPIC_BAN('\ue017'),
        OPIC_BAR_CHART('\ue018'),
        OPIC_BASKET('\ue019'),
        OPIC_BATTERY_EMPTY('\ue01a'),
        OPIC_BATTERY_FULL('\ue01b'),
        OPIC_BEAKER('\ue01c'),
        OPIC_BELL('\ue01d'),
        OPIC_BLUETOOTH('\ue01e'),
        OPIC_BOLD('\ue01f'),
        OPIC_BOLT('\ue020'),
        OPIC_BOOK('\ue021'),
        OPIC_BOOKMARK('\ue022'),
        OPIC_BOX('\ue023'),
        OPIC_BRIEFCASE('\ue024'),
        OPIC_BRITISH_POUND('\ue025'),
        OPIC_BROWSER('\ue026'),
        OPIC_BRUSH('\ue027'),
        OPIC_BUG('\ue028'),
        OPIC_BULLHORN('\ue029'),
        OPIC_CALCULATOR('\ue02a'),
        OPIC_CALENDAR('\ue02b'),
        OPIC_CAMERA_SLR('\ue02c'),
        OPIC_CARET_BOTTOM('\ue02d'),
        OPIC_CARET_LEFT('\ue02e'),
        OPIC_CARET_RIGHT('\ue02f'),
        OPIC_CARET_TOP('\ue030'),
        OPIC_CART('\ue031'),
        OPIC_CHAT('\ue032'),
        OPIC_CHECK('\ue033'),
        OPIC_CHEVRON_BOTTOM('\ue034'),
        OPIC_CHEVRON_LEFT('\ue035'),
        OPIC_CHEVRON_RIGHT('\ue036'),
        OPIC_CHEVRON_TOP('\ue037'),
        OPIC_CIRCLE_CHECK('\ue038'),
        OPIC_CIRCLE_X('\ue039'),
        OPIC_CLIPBOARD('\ue03a'),
        OPIC_CLOCK('\ue03b'),
        OPIC_CLOUD_DOWNLOAD('\ue03c'),
        OPIC_CLOUD_UPLOAD('\ue03d'),
        OPIC_CLOUD('\ue03e'),
        OPIC_CLOUDY('\ue03f'),
        OPIC_CODE('\ue040'),
        OPIC_COG('\ue041'),
        OPIC_COLLAPSE_DOWN('\ue042'),
        OPIC_COLLAPSE_LEFT('\ue043'),
        OPIC_COLLAPSE_RIGHT('\ue044'),
        OPIC_COLLAPSE_UP('\ue045'),
        OPIC_COMMAND('\ue046'),
        OPIC_COMMENT_SQUARE('\ue047'),
        OPIC_COMPASS('\ue048'),
        OPIC_CONTRAST('\ue049'),
        OPIC_COPYWRITING('\ue04a'),
        OPIC_CREDIT_CARD('\ue04b'),
        OPIC_CROP('\ue04c'),
        OPIC_DASHBOARD('\ue04d'),
        OPIC_DATA_TRANSFER_DOWNLOAD('\ue04e'),
        OPIC_DATA_TRANSFER_UPLOAD('\ue04f'),
        OPIC_DELETE('\ue050'),
        OPIC_DIAL('\ue051'),
        OPIC_DOCUMENT('\ue052'),
        OPIC_DOLLAR('\ue053'),
        OPIC_DOUBLE_QUOTE_SANS_LEFT('\ue054'),
        OPIC_DOUBLE_QUOTE_SANS_RIGHT('\ue055'),
        OPIC_DOUBLE_QUOTE_SERIF_LEFT('\ue056'),
        OPIC_DOUBLE_QUOTE_SERIF_RIGHT('\ue057'),
        OPIC_DROPLET('\ue058'),
        OPIC_EJECT('\ue059'),
        OPIC_ELEVATOR('\ue05a'),
        OPIC_ELLIPSES('\ue05b'),
        OPIC_ENVELOPE_CLOSED('\ue05c'),
        OPIC_ENVELOPE_OPEN('\ue05d'),
        OPIC_EURO('\ue05e'),
        OPIC_EXCERPT('\ue05f'),
        OPIC_EXPAND_DOWN('\ue060'),
        OPIC_EXPAND_LEFT('\ue061'),
        OPIC_EXPAND_RIGHT('\ue062'),
        OPIC_EXPAND_UP('\ue063'),
        OPIC_EXTERNAL_LINK('\ue064'),
        OPIC_EYE('\ue065'),
        OPIC_EYEDROPPER('\ue066'),
        OPIC_FILE('\ue067'),
        OPIC_FIRE('\ue068'),
        OPIC_FLAG('\ue069'),
        OPIC_FLASH('\ue06a'),
        OPIC_FOLDER('\ue06b'),
        OPIC_FORK('\ue06c'),
        OPIC_FULLSCREEN_ENTER('\ue06d'),
        OPIC_FULLSCREEN_EXIT('\ue06e'),
        OPIC_GLOBE('\ue06f'),
        OPIC_GRAPH('\ue070'),
        OPIC_GRID_FOUR_UP('\ue071'),
        OPIC_GRID_THREE_UP('\ue072'),
        OPIC_GRID_TWO_UP('\ue073'),
        OPIC_HARD_DRIVE('\ue074'),
        OPIC_HEADER('\ue075'),
        OPIC_HEADPHONES('\ue076'),
        OPIC_HEART('\ue077'),
        OPIC_HOME('\ue078'),
        OPIC_IMAGE('\ue079'),
        OPIC_INBOX('\ue07a'),
        OPIC_INFINITY('\ue07b'),
        OPIC_INFO('\ue07c'),
        OPIC_ITALIC('\ue07d'),
        OPIC_JUSTIFY_CENTER('\ue07e'),
        OPIC_JUSTIFY_LEFT('\ue07f'),
        OPIC_JUSTIFY_RIGHT('\ue080'),
        OPIC_KEY('\ue081'),
        OPIC_LAPTOP('\ue082'),
        OPIC_LAYERS('\ue083'),
        OPIC_LIGHTBULB('\ue084'),
        OPIC_LINK_BROKEN('\ue085'),
        OPIC_LINK_INTACT('\ue086'),
        OPIC_LIST_RICH('\ue087'),
        OPIC_LIST('\ue088'),
        OPIC_LOCATION('\ue089'),
        OPIC_LOCK_LOCKED('\ue08a'),
        OPIC_LOCK_UNLOCKED('\ue08b'),
        OPIC_LOOP_CIRCULAR('\ue08c'),
        OPIC_LOOP_SQUARE('\ue08d'),
        OPIC_LOOP('\ue08e'),
        OPIC_MAGNIFYING_GLASS('\ue08f'),
        OPIC_MAP_MARKER('\ue090'),
        OPIC_MAP('\ue091'),
        OPIC_MEDIA_PAUSE('\ue092'),
        OPIC_MEDIA_PLAY('\ue093'),
        OPIC_MEDIA_RECORD('\ue094'),
        OPIC_MEDIA_SKIP_BACKWARD('\ue095'),
        OPIC_MEDIA_SKIP_FORWARD('\ue096'),
        OPIC_MEDIA_STEP_BACKWARD('\ue097'),
        OPIC_MEDIA_STEP_FORWARD('\ue098'),
        OPIC_MEDIA_STOP('\ue099'),
        OPIC_MEDICAL_CROSS('\ue09a'),
        OPIC_MENU('\ue09b'),
        OPIC_MICROPHONE('\ue09c'),
        OPIC_MINUS('\ue09d'),
        OPIC_MONITOR('\ue09e'),
        OPIC_MOON('\ue09f'),
        OPIC_MOVE('\ue0a0'),
        OPIC_MUSICAL_NOTE('\ue0a1'),
        OPIC_PAPERCLIP('\ue0a2'),
        OPIC_PENCIL('\ue0a3'),
        OPIC_PEOPLE('\ue0a4'),
        OPIC_PERSON('\ue0a5'),
        OPIC_PHONE('\ue0a6'),
        OPIC_PIE_CHART('\ue0a7'),
        OPIC_PIN('\ue0a8'),
        OPIC_PLAY_CIRCLE('\ue0a9'),
        OPIC_PLUS('\ue0aa'),
        OPIC_POWER_STANDBY('\ue0ab'),
        OPIC_PRINT('\ue0ac'),
        OPIC_PROJECT('\ue0ad'),
        OPIC_PULSE('\ue0ae'),
        OPIC_PUZZLE_PIECE('\ue0af'),
        OPIC_QUESTION_MARK('\ue0b0'),
        OPIC_RAIN('\ue0b1'),
        OPIC_RANDOM('\ue0b2'),
        OPIC_RELOAD('\ue0b3'),
        OPIC_RESIZE_BOTH('\ue0b4'),
        OPIC_RESIZE_HEIGHT('\ue0b5'),
        OPIC_RESIZE_WIDTH('\ue0b6'),
        OPIC_RSS_ALT('\ue0b7'),
        OPIC_RSS('\ue0b8'),
        OPIC_SCRIPT('\ue0b9'),
        OPIC_SHARE_BOXED('\ue0ba'),
        OPIC_SHARE('\ue0bb'),
        OPIC_SHIELD('\ue0bc'),
        OPIC_SIGNAL('\ue0bd'),
        OPIC_SIGNPOST('\ue0be'),
        OPIC_SORT_ASCENDING('\ue0bf'),
        OPIC_SORT_DESCENDING('\ue0c0'),
        OPIC_SPREADSHEET('\ue0c1'),
        OPIC_STAR('\ue0c2'),
        OPIC_SUN('\ue0c3'),
        OPIC_TABLET('\ue0c4'),
        OPIC_TAG('\ue0c5'),
        OPIC_TAGS('\ue0c6'),
        OPIC_TARGET('\ue0c7'),
        OPIC_TASK('\ue0c8'),
        OPIC_TERMINAL('\ue0c9'),
        OPIC_TEXT('\ue0ca'),
        OPIC_THUMB_DOWN('\ue0cb'),
        OPIC_THUMB_UP('\ue0cc'),
        OPIC_TIMER('\ue0cd'),
        OPIC_TRANSFER('\ue0ce'),
        OPIC_TRASH('\ue0cf'),
        OPIC_UNDERLINE('\ue0d0'),
        OPIC_VERTICAL_ALIGN_BOTTOM('\ue0d1'),
        OPIC_VERTICAL_ALIGN_CENTER('\ue0d2'),
        OPIC_VERTICAL_ALIGN_TOP('\ue0d3'),
        OPIC_VIDEO('\ue0d4'),
        OPIC_VOLUME_HIGH('\ue0d5'),
        OPIC_VOLUME_LOW('\ue0d6'),
        OPIC_VOLUME_OFF('\ue0d7'),
        OPIC_WARNING('\ue0d8'),
        OPIC_WIFI('\ue0d9'),
        OPIC_WRENCH('\ue0da'),
        OPIC_X('\ue0db'),
        OPIC_YEN('\ue0dc'),
        OPIC_ZOOM_IN('\ue0dd'),
        OPIC_ZOOM_OUT('\ue0de');

        char openIconicCharacter;

        Icon(char character) {
            this.openIconicCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return openIconicCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface openIconicTypeface;

        @Override
        public ITypeface getTypeface() {
            if (openIconicTypeface == null) {
                setTypeface(new OpenIconic());
            }
            return openIconicTypeface;
        }

        private static void setTypeface(OpenIconic openIconicTypeface) {
            Icon.openIconicTypeface = openIconicTypeface;
        }
    }
}