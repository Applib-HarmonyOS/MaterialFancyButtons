package com.rilixtech.openiconictypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the OpenIconic font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class OpenIconic implements MfbTypeface {
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
     * OpenIconic MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which OpenIconic MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by OpenIconic MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        //Open Iconic
        OPIC_ACCOUNT_LOGIN((char) 0xe000),
        OPIC_ACCOUNT_LOGOUT((char) 0xe001),
        OPIC_ACTION_REDO((char) 0xe002),
        OPIC_ACTION_UNDO((char) 0xe003),
        OPIC_ALIGN_CENTER((char) 0xe004),
        OPIC_ALIGN_LEFT((char) 0xe005),
        OPIC_ALIGN_RIGHT((char) 0xe006),
        OPIC_APERTURE((char) 0xe007),
        OPIC_ARROW_BOTTOM((char) 0xe008),
        OPIC_ARROW_CIRCLE_BOTTOM((char) 0xe009),
        OPIC_ARROW_CIRCLE_LEFT((char) 0xe00a),
        OPIC_ARROW_CIRCLE_RIGHT((char) 0xe00b),
        OPIC_ARROW_CIRCLE_TOP((char) 0xe00c),
        OPIC_ARROW_LEFT((char) 0xe00d),
        OPIC_ARROW_RIGHT((char) 0xe00e),
        OPIC_ARROW_THICK_BOTTOM((char) 0xe00f),
        OPIC_ARROW_THICK_LEFT((char) 0xe010),
        OPIC_ARROW_THICK_RIGHT((char) 0xe011),
        OPIC_ARROW_THICK_TOP((char) 0xe012),
        OPIC_ARROW_TOP((char) 0xe013),
        OPIC_AUDIO_SPECTRUM((char) 0xe014),
        OPIC_AUDIO((char) 0xe015),
        OPIC_BADGE((char) 0xe016),
        OPIC_BAN((char) 0xe017),
        OPIC_BAR_CHART((char) 0xe018),
        OPIC_BASKET((char) 0xe019),
        OPIC_BATTERY_EMPTY((char) 0xe01a),
        OPIC_BATTERY_FULL((char) 0xe01b),
        OPIC_BEAKER((char) 0xe01c),
        OPIC_BELL((char) 0xe01d),
        OPIC_BLUETOOTH((char) 0xe01e),
        OPIC_BOLD((char) 0xe01f),
        OPIC_BOLT((char) 0xe020),
        OPIC_BOOK((char) 0xe021),
        OPIC_BOOKMARK((char) 0xe022),
        OPIC_BOX((char) 0xe023),
        OPIC_BRIEFCASE((char) 0xe024),
        OPIC_BRITISH_POUND((char) 0xe025),
        OPIC_BROWSER((char) 0xe026),
        OPIC_BRUSH((char) 0xe027),
        OPIC_BUG((char) 0xe028),
        OPIC_BULLHORN((char) 0xe029),
        OPIC_CALCULATOR((char) 0xe02a),
        OPIC_CALENDAR((char) 0xe02b),
        OPIC_CAMERA_SLR((char) 0xe02c),
        OPIC_CARET_BOTTOM((char) 0xe02d),
        OPIC_CARET_LEFT((char) 0xe02e),
        OPIC_CARET_RIGHT((char) 0xe02f),
        OPIC_CARET_TOP((char) 0xe030),
        OPIC_CART((char) 0xe031),
        OPIC_CHAT((char) 0xe032),
        OPIC_CHECK((char) 0xe033),
        OPIC_CHEVRON_BOTTOM((char) 0xe034),
        OPIC_CHEVRON_LEFT((char) 0xe035),
        OPIC_CHEVRON_RIGHT((char) 0xe036),
        OPIC_CHEVRON_TOP((char) 0xe037),
        OPIC_CIRCLE_CHECK((char) 0xe038),
        OPIC_CIRCLE_X((char) 0xe039),
        OPIC_CLIPBOARD((char) 0xe03a),
        OPIC_CLOCK((char) 0xe03b),
        OPIC_CLOUD_DOWNLOAD((char) 0xe03c),
        OPIC_CLOUD_UPLOAD((char) 0xe03d),
        OPIC_CLOUD((char) 0xe03e),
        OPIC_CLOUDY((char) 0xe03f),
        OPIC_CODE((char) 0xe040),
        OPIC_COG((char) 0xe041),
        OPIC_COLLAPSE_DOWN((char) 0xe042),
        OPIC_COLLAPSE_LEFT((char) 0xe043),
        OPIC_COLLAPSE_RIGHT((char) 0xe044),
        OPIC_COLLAPSE_UP((char) 0xe045),
        OPIC_COMMAND((char) 0xe046),
        OPIC_COMMENT_SQUARE((char) 0xe047),
        OPIC_COMPASS((char) 0xe048),
        OPIC_CONTRAST((char) 0xe049),
        OPIC_COPYWRITING((char) 0xe04a),
        OPIC_CREDIT_CARD((char) 0xe04b),
        OPIC_CROP((char) 0xe04c),
        OPIC_DASHBOARD((char) 0xe04d),
        OPIC_DATA_TRANSFER_DOWNLOAD((char) 0xe04e),
        OPIC_DATA_TRANSFER_UPLOAD((char) 0xe04f),
        OPIC_DELETE((char) 0xe050),
        OPIC_DIAL((char) 0xe051),
        OPIC_DOCUMENT((char) 0xe052),
        OPIC_DOLLAR((char) 0xe053),
        OPIC_DOUBLE_QUOTE_SANS_LEFT((char) 0xe054),
        OPIC_DOUBLE_QUOTE_SANS_RIGHT((char) 0xe055),
        OPIC_DOUBLE_QUOTE_SERIF_LEFT((char) 0xe056),
        OPIC_DOUBLE_QUOTE_SERIF_RIGHT((char) 0xe057),
        OPIC_DROPLET((char) 0xe058),
        OPIC_EJECT((char) 0xe059),
        OPIC_ELEVATOR((char) 0xe05a),
        OPIC_ELLIPSES((char) 0xe05b),
        OPIC_ENVELOPE_CLOSED((char) 0xe05c),
        OPIC_ENVELOPE_OPEN((char) 0xe05d),
        OPIC_EURO((char) 0xe05e),
        OPIC_EXCERPT((char) 0xe05f),
        OPIC_EXPAND_DOWN((char) 0xe060),
        OPIC_EXPAND_LEFT((char) 0xe061),
        OPIC_EXPAND_RIGHT((char) 0xe062),
        OPIC_EXPAND_UP((char) 0xe063),
        OPIC_EXTERNAL_LINK((char) 0xe064),
        OPIC_EYE((char) 0xe065),
        OPIC_EYEDROPPER((char) 0xe066),
        OPIC_FILE((char) 0xe067),
        OPIC_FIRE((char) 0xe068),
        OPIC_FLAG((char) 0xe069),
        OPIC_FLASH((char) 0xe06a),
        OPIC_FOLDER((char) 0xe06b),
        OPIC_FORK((char) 0xe06c),
        OPIC_FULLSCREEN_ENTER((char) 0xe06d),
        OPIC_FULLSCREEN_EXIT((char) 0xe06e),
        OPIC_GLOBE((char) 0xe06f),
        OPIC_GRAPH((char) 0xe070),
        OPIC_GRID_FOUR_UP((char) 0xe071),
        OPIC_GRID_THREE_UP((char) 0xe072),
        OPIC_GRID_TWO_UP((char) 0xe073),
        OPIC_HARD_DRIVE((char) 0xe074),
        OPIC_HEADER((char) 0xe075),
        OPIC_HEADPHONES((char) 0xe076),
        OPIC_HEART((char) 0xe077),
        OPIC_HOME((char) 0xe078),
        OPIC_IMAGE((char) 0xe079),
        OPIC_INBOX((char) 0xe07a),
        OPIC_INFINITY((char) 0xe07b),
        OPIC_INFO((char) 0xe07c),
        OPIC_ITALIC((char) 0xe07d),
        OPIC_JUSTIFY_CENTER((char) 0xe07e),
        OPIC_JUSTIFY_LEFT((char) 0xe07f),
        OPIC_JUSTIFY_RIGHT((char) 0xe080),
        OPIC_KEY((char) 0xe081),
        OPIC_LAPTOP((char) 0xe082),
        OPIC_LAYERS((char) 0xe083),
        OPIC_LIGHTBULB((char) 0xe084),
        OPIC_LINK_BROKEN((char) 0xe085),
        OPIC_LINK_INTACT((char) 0xe086),
        OPIC_LIST_RICH((char) 0xe087),
        OPIC_LIST((char) 0xe088),
        OPIC_LOCATION((char) 0xe089),
        OPIC_LOCK_LOCKED((char) 0xe08a),
        OPIC_LOCK_UNLOCKED((char) 0xe08b),
        OPIC_LOOP_CIRCULAR((char) 0xe08c),
        OPIC_LOOP_SQUARE((char) 0xe08d),
        OPIC_LOOP((char) 0xe08e),
        OPIC_MAGNIFYING_GLASS((char) 0xe08f),
        OPIC_MAP_MARKER((char) 0xe090),
        OPIC_MAP((char) 0xe091),
        OPIC_MEDIA_PAUSE((char) 0xe092),
        OPIC_MEDIA_PLAY((char) 0xe093),
        OPIC_MEDIA_RECORD((char) 0xe094),
        OPIC_MEDIA_SKIP_BACKWARD((char) 0xe095),
        OPIC_MEDIA_SKIP_FORWARD((char) 0xe096),
        OPIC_MEDIA_STEP_BACKWARD((char) 0xe097),
        OPIC_MEDIA_STEP_FORWARD((char) 0xe098),
        OPIC_MEDIA_STOP((char) 0xe099),
        OPIC_MEDICAL_CROSS((char) 0xe09a),
        OPIC_MENU((char) 0xe09b),
        OPIC_MICROPHONE((char) 0xe09c),
        OPIC_MINUS((char) 0xe09d),
        OPIC_MONITOR((char) 0xe09e),
        OPIC_MOON((char) 0xe09f),
        OPIC_MOVE((char) 0xe0a0),
        OPIC_MUSICAL_NOTE((char) 0xe0a1),
        OPIC_PAPERCLIP((char) 0xe0a2),
        OPIC_PENCIL((char) 0xe0a3),
        OPIC_PEOPLE((char) 0xe0a4),
        OPIC_PERSON((char) 0xe0a5),
        OPIC_PHONE((char) 0xe0a6),
        OPIC_PIE_CHART((char) 0xe0a7),
        OPIC_PIN((char) 0xe0a8),
        OPIC_PLAY_CIRCLE((char) 0xe0a9),
        OPIC_PLUS((char) 0xe0aa),
        OPIC_POWER_STANDBY((char) 0xe0ab),
        OPIC_PRINT((char) 0xe0ac),
        OPIC_PROJECT((char) 0xe0ad),
        OPIC_PULSE((char) 0xe0ae),
        OPIC_PUZZLE_PIECE((char) 0xe0af),
        OPIC_QUESTION_MARK((char) 0xe0b0),
        OPIC_RAIN((char) 0xe0b1),
        OPIC_RANDOM((char) 0xe0b2),
        OPIC_RELOAD((char) 0xe0b3),
        OPIC_RESIZE_BOTH((char) 0xe0b4),
        OPIC_RESIZE_HEIGHT((char) 0xe0b5),
        OPIC_RESIZE_WIDTH((char) 0xe0b6),
        OPIC_RSS_ALT((char) 0xe0b7),
        OPIC_RSS((char) 0xe0b8),
        OPIC_SCRIPT((char) 0xe0b9),
        OPIC_SHARE_BOXED((char) 0xe0ba),
        OPIC_SHARE((char) 0xe0bb),
        OPIC_SHIELD((char) 0xe0bc),
        OPIC_SIGNAL((char) 0xe0bd),
        OPIC_SIGNPOST((char) 0xe0be),
        OPIC_SORT_ASCENDING((char) 0xe0bf),
        OPIC_SORT_DESCENDING((char) 0xe0c0),
        OPIC_SPREADSHEET((char) 0xe0c1),
        OPIC_STAR((char) 0xe0c2),
        OPIC_SUN((char) 0xe0c3),
        OPIC_TABLET((char) 0xe0c4),
        OPIC_TAG((char) 0xe0c5),
        OPIC_TAGS((char) 0xe0c6),
        OPIC_TARGET((char) 0xe0c7),
        OPIC_TASK((char) 0xe0c8),
        OPIC_TERMINAL((char) 0xe0c9),
        OPIC_TEXT((char) 0xe0ca),
        OPIC_THUMB_DOWN((char) 0xe0cb),
        OPIC_THUMB_UP((char) 0xe0cc),
        OPIC_TIMER((char) 0xe0cd),
        OPIC_TRANSFER((char) 0xe0ce),
        OPIC_TRASH((char) 0xe0cf),
        OPIC_UNDERLINE((char) 0xe0d0),
        OPIC_VERTICAL_ALIGN_BOTTOM((char) 0xe0d1),
        OPIC_VERTICAL_ALIGN_CENTER((char) 0xe0d2),
        OPIC_VERTICAL_ALIGN_TOP((char) 0xe0d3),
        OPIC_VIDEO((char) 0xe0d4),
        OPIC_VOLUME_HIGH((char) 0xe0d5),
        OPIC_VOLUME_LOW((char) 0xe0d6),
        OPIC_VOLUME_OFF((char) 0xe0d7),
        OPIC_WARNING((char) 0xe0d8),
        OPIC_WIFI((char) 0xe0d9),
        OPIC_WRENCH((char) 0xe0da),
        OPIC_X((char) 0xe0db),
        OPIC_YEN((char) 0xe0dc),
        OPIC_ZOOM_IN((char) 0xe0dd),
        OPIC_ZOOM_OUT((char) 0xe0de);

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
        private static MfbTypeface openIconicTypeface;

        @Override
        public MfbTypeface getTypeface() {
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
