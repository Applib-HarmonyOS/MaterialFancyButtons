package com.rilixtech.mfglabsiconsettypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the MfgLabsIconset font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class MfgLabsIconset implements MfbTypeface {
    private static final String TTF_FILE = "mfglabsiconset-webfont-1.0.ttf";
    private static final String MFGLABS_ICONSET_PREFIX = "MFGI";
    public static final String MFGLABS_ICONSET_NAME = "mfglabs-iconset";
    public static final String MFGLABS_ICONSET_VERSION = "1" + ".0";
    public static final String MFGLABS_ICONSET_AUTHOR = "MFG Labs";
    public static final String MFGLABS_ICONSET_URL = "https://github.com/MfgLabs/mfglabs-iconset";
    public static final String MFGLABS_ICONSET_DESC = "Awesome web font icon by MFG Labs.";
    public static final String MFGLABS_ICONSET_LICENSE = "Licensed under the SIL Open Font License - http://scripts.sil.org/OFL";
    public static final String MFGLABS_ICONSET_LICENSE_URL = "http://scripts.sil.org/OFL";

    private static Font mfgLabsIconsetTypeface = null;

    private static HashMap<String, Character> mfgLabsIconsetCharMap;

    /**
     * MfgLabsIconset MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which MfgLabsIconset MfbIcon is to be retrieved.
     */
    @Override
    public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the MfgLabsIconset icon characters in a HashMap.
     *
     * @return HashMap of all MfgLabsIconset icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (mfgLabsIconsetCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.mfgLabsIconsetCharacter);
            }
            setChars(characterHashMap);
        }
        return mfgLabsIconsetCharMap;
    }

    /**
     * Set the MfgLabsIconset Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        mfgLabsIconsetCharMap = characterHashMap;
    }

    /**
     * Return the MfgLabsIconset Mapping Prefix.
     *
     * @return MfgLabsIconset Mapping Prefix, used by all MfgLabsIconset icons.
     */
    @Override
    public String getMappingPrefix() {
        return MFGLABS_ICONSET_PREFIX;
    }

    @Override
    public String getFontName() {
        return MFGLABS_ICONSET_NAME;
    }

    @Override
    public String getVersion() {
        return MFGLABS_ICONSET_VERSION;
    }

    @Override
    public int getIconCount() {
        return mfgLabsIconsetCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> mfgLabsIconsetKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            mfgLabsIconsetKeyList.add(value.name());
        }
        return mfgLabsIconsetKeyList;
    }

    @Override
    public String getAuthor() {
        return MFGLABS_ICONSET_AUTHOR;
    }

    @Override
    public String getUrl() {
        return MFGLABS_ICONSET_URL;
    }

    @Override
    public String getDescription() {
        return MFGLABS_ICONSET_DESC;
    }

    @Override
    public String getLicense() {
        return MFGLABS_ICONSET_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return MFGLABS_ICONSET_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (mfgLabsIconsetTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return mfgLabsIconsetTypeface;
    }

    private static void cacheTypeface(Font font) {
        mfgLabsIconsetTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by MfgLabsIconset MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        // MFG Labs iconset 1.0
        MFGI_ICON_CLOUD((char) 0x2601),
        MFGI_ICON_AT((char) 0x0040),
        MFGI_ICON_PLUS((char) 0x002B),
        MFGI_ICON_MINUS((char) 0x2212),
        MFGI_ICON_ARROW_UP((char) 0x2191),
        MFGI_ICON_ARROW_DOWN((char) 0x2193),
        MFGI_ICON_ARROW_RIGHT((char) 0x2192),
        MFGI_ICON_ARROW_LEFT((char) 0x2190),
        MFGI_ICON_CHEVRON_DOWN((char) 0xf004),
        MFGI_ICON_CHEVRON_UP((char) 0xf005),
        MFGI_ICON_CHEVRON_RIGHT((char) 0xf006),
        MFGI_ICON_CHEVRON_LEFT((char) 0xf007),
        MFGI_ICON_REORDER((char) 0xf008),
        MFGI_ICON_LIST((char) 0xf009),
        MFGI_ICON_REORDER_SQUARE((char) 0xf00a),
        MFGI_ICON_REORDER_SQUARE_LINE((char) 0xf00b),
        MFGI_ICON_COVERFLOW((char) 0xf00c),
        MFGI_ICON_COVERFLOW_LINE((char) 0xf00d),
        MFGI_ICON_PAUSE((char) 0xf00e),
        MFGI_ICON_PLAY((char) 0xf00f),
        MFGI_ICON_STEP_FORWARD((char) 0xf010),
        MFGI_ICON_STEP_BACKWARD((char) 0xf011),
        MFGI_ICON_FAST_FORWARD((char) 0xf012),
        MFGI_ICON_FAST_BACKWARD((char) 0xf013),
        MFGI_ICON_CLOUD_UPLOAD((char) 0xf014),
        MFGI_ICON_CLOUD_DOWNLOAD((char) 0xf015),
        MFGI_ICON_DATA_SCIENCE((char) 0xf016),
        MFGI_ICON_DATA_SCIENCE_BLACK((char) 0xf017),
        MFGI_ICON_GLOBE((char) 0xf018),
        MFGI_ICON_GLOBE_BLACK((char) 0xf019),
        MFGI_ICON_MATH_ICO((char) 0xf01a),
        MFGI_ICON_MATH((char) 0xf01b),
        MFGI_ICON_MATH_BLACK((char) 0xf01c),
        MFGI_ICON_PAPERPLANE_ICO((char) 0xf01d),
        MFGI_ICON_PAPERPLANE((char) 0xf01e),
        MFGI_ICON_PAPERPLANE_BLACK((char) 0xf01f),
        MFGI_ICON_COLOR_BALANCE((char) 0xf020),
        MFGI_ICON_STAR((char) 0x2605),
        MFGI_ICON_STAR_HALF((char) 0xf022),
        MFGI_ICON_STAR_EMPTY((char) 0x2606),
        MFGI_ICON_STAR_HALF_EMPTY((char) 0xf024),
        MFGI_ICON_RELOAD((char) 0xf025),
        MFGI_ICON_HEART((char) 0x2665),
        MFGI_ICON_HEART_BROKEN((char) 0xf028),
        MFGI_ICON_HASHTAG((char) 0xf029),
        MFGI_ICON_REPLY((char) 0xf02a),
        MFGI_ICON_RETWEET((char) 0xf02b),
        MFGI_ICON_SIGNIN((char) 0xf02c),
        MFGI_ICON_SIGNOUT((char) 0xf02d),
        MFGI_ICON_DOWNLOAD((char) 0xf02e),
        MFGI_ICON_UPLOAD((char) 0xf02f),
        MFGI_ICON_PLACEPIN((char) 0xf031),
        MFGI_ICON_DISPLAY_SCREEN((char) 0xf032),
        MFGI_ICON_TABLET((char) 0xf033),
        MFGI_ICON_SMARTPHONE((char) 0xf034),
        MFGI_ICON_CONNECTED_OBJECT((char) 0xf035),
        MFGI_ICON_LOCK((char) 0xF512),
        MFGI_ICON_UNLOCK((char) 0xF513),
        MFGI_ICON_CAMERA((char) 0xF4F7),
        MFGI_ICON_ISIGHT((char) 0xf039),
        MFGI_ICON_VIDEO_CAMERA((char) 0xf03a),
        MFGI_ICON_RANDOM((char) 0xf03b),
        MFGI_ICON_MESSAGE((char) 0xF4AC),
        MFGI_ICON_DISCUSSION((char) 0xf03d),
        MFGI_ICON_CALENDAR((char) 0xF4C5),
        MFGI_ICON_RINGBELL((char) 0xf03f),
        MFGI_ICON_MOVIE((char) 0xf040),
        MFGI_ICON_MAIL((char) 0x2709),
        MFGI_ICON_PEN((char) 0x270F),
        MFGI_ICON_SETTINGS((char) 0x9881),
        MFGI_ICON_MEASURE((char) 0xf044),
        MFGI_ICON_VECTOR((char) 0xf045),
        MFGI_ICON_VECTOR_PEN((char) 0x2712),
        MFGI_ICON_MUTE_ON((char) 0xf047),
        MFGI_ICON_MUTE_OFF((char) 0xf048),
        MFGI_ICON_HOME((char) 0x2302),
        MFGI_ICON_SHEET((char) 0xf04a),
        MFGI_ICON_ARROW_BIG_RIGHT((char) 0x21C9),
        MFGI_ICON_ARROW_BIG_LEFT((char) 0x21C7),
        MFGI_ICON_ARROW_BIG_DOWN((char) 0x21CA),
        MFGI_ICON_ARROW_BIG_UP((char) 0x21C8),
        MFGI_ICON_DRIBBBLE_CIRCLE((char) 0xf04f),
        MFGI_ICON_DRIBBBLE((char) 0xf050),
        MFGI_ICON_FACEBOOK_CIRCLE((char) 0xf051),
        MFGI_ICON_FACEBOOK((char) 0xf052),
        MFGI_ICON_GIT_CIRCLE_ALT((char) 0xf053),
        MFGI_ICON_GIT_CIRCLE((char) 0xf054),
        MFGI_ICON_GIT((char) 0xf055),
        MFGI_ICON_OCTOPUS((char) 0xf056),
        MFGI_ICON_TWITTER_CIRCLE((char) 0xf057),
        MFGI_ICON_TWITTER((char) 0xf058),
        MFGI_ICON_GOOGLE_PLUS_CIRCLE((char) 0xf059),
        MFGI_ICON_GOOGLE_PLUS((char) 0xf05a),
        MFGI_ICON_LINKED_IN_CIRCLE((char) 0xf05b),
        MFGI_ICON_LINKED_IN((char) 0xf05c),
        MFGI_ICON_INSTAGRAM((char) 0xf05d),
        MFGI_ICON_INSTAGRAM_CIRCLE((char) 0xf05e),
        MFGI_ICON_MFG_ICON((char) 0xf05f),
        MFGI_ICON_XING((char) 0xF532),
        MFGI_ICON_XING_CIRCLE((char) 0xF533),
        MFGI_ICON_MFG_ICON_CIRCLE((char) 0xf060),
        MFGI_ICON_USER((char) 0xf061),
        MFGI_ICON_USER_MALE((char) 0xf062),
        MFGI_ICON_USER_FEMALE((char) 0xf063),
        MFGI_ICON_USERS((char) 0xf064),
        MFGI_ICON_FILE_OPEN((char) 0xF4C2),
        MFGI_ICON_FILE_CLOSE((char) 0xf067),
        MFGI_ICON_FILE_ALT((char) 0xf068),
        MFGI_ICON_FILE_CLOSE_ALT((char) 0xf069),
        MFGI_ICON_ATTACHMENT((char) 0xf06a),
        MFGI_ICON_CHECK((char) 0x2713),
        MFGI_ICON_CROSS_MARK((char) 0x274C),
        MFGI_ICON_CANCEL_CIRCLE((char) 0xF06E),
        MFGI_ICON_CHECK_CIRCLE((char) 0xf06d),
        MFGI_ICON_MAGNIFYING((char) 0xF50D),
        MFGI_ICON_INBOX((char) 0xf070),
        MFGI_ICON_CLOCK((char) 0x23F2),
        MFGI_ICON_STOPWATCH((char) 0x23F1),
        MFGI_ICON_HOURGLASS((char) 0x231B),
        MFGI_ICON_TROPHY((char) 0xf074),
        MFGI_ICON_UNLOCK_ALT((char) 0xF075),
        MFGI_ICON_LOCK_ALT((char) 0xF510),
        MFGI_ICON_ARROW_DOUBLED_RIGHT((char) 0x21D2),
        MFGI_ICON_ARROW_DOUBLED_LEFT((char) 0x21D0),
        MFGI_ICON_ARROW_DOUBLED_DOWN((char) 0x21D3),
        MFGI_ICON_ARROW_DOUBLED_UP((char) 0x21D1),
        MFGI_ICON_LINK((char) 0xf07B),
        MFGI_ICON_WARNING((char) 0x2757),
        MFGI_ICON_WARNING_ALT((char) 0x2755),
        MFGI_ICON_MAGNIFYING_PLUS((char) 0xf07E),
        MFGI_ICON_MAGNIFYING_MINUS((char) 0xf07F),
        MFGI_ICON_WHITE_QUESTION((char) 0x2754),
        MFGI_ICON_BLACK_QUESTION((char) 0x2753),
        MFGI_ICON_STOP((char) 0xf080),
        MFGI_ICON_SHARE((char) 0xf081),
        MFGI_ICON_EYE((char) 0xf082),
        MFGI_ICON_TRASH_CAN((char) 0xf083),
        MFGI_ICON_HARD_DRIVE((char) 0xf084),
        MFGI_ICON_INFORMATION_BLACK((char) 0xf085),
        MFGI_ICON_INFORMATION_WHITE((char) 0xf086),
        MFGI_ICON_PRINTER((char) 0xf087),
        MFGI_ICON_LETTER((char) 0xf088),
        MFGI_ICON_SOUNDCLOUD((char) 0xf089),
        MFGI_ICON_SOUNDCLOUD_CIRCLE((char) 0xf08A),
        MFGI_ICON_ANCHOR((char) 0x2693),
        MFGI_ICON_FEMALE_SIGN((char) 0x2640),
        MFGI_ICON_MALE_SIGN((char) 0x2642),
        MFGI_ICON_JOYSTICK((char) 0xF514),
        MFGI_ICON_HIGH_VOLTAGE((char) 0x26A1),
        MFGI_ICON_FIRE((char) 0xF525),
        MFGI_ICON_NEWSPAPER((char) 0xF4F0),
        MFGI_ICON_CHART((char) 0xF526),
        MFGI_ICON_SPREAD((char) 0xF527),
        MFGI_ICON_SPINNER_1((char) 0xF528),
        MFGI_ICON_SPINNER_2((char) 0xF529),
        MFGI_ICON_CHART_ALT((char) 0xF530),
        MFGI_ICON_LABEL((char) 0xF531),
        MFGI_ICON_BRUSH((char) 0xE000),
        MFGI_ICON_REFRESH((char) 0xE001),
        MFGI_ICON_NODE((char) 0xE002),
        MFGI_ICON_NODE_2((char) 0xE003),
        MFGI_ICON_NODE_3((char) 0xE004),
        MFGI_ICON_LINK_2_NODES((char) 0xE005),
        MFGI_ICON_LINK_3_NODES((char) 0xE006),
        MFGI_ICON_LINK_LOOP_NODES((char) 0xE007),
        MFGI_ICON_NODE_SIZE((char) 0xE008),
        MFGI_ICON_NODE_COLOR((char) 0xE009),
        MFGI_ICON_LAYOUT_DIRECTED((char) 0xE010),
        MFGI_ICON_LAYOUT_RADIAL((char) 0xE011),
        MFGI_ICON_LAYOUT_HIERARCHICAL((char) 0xE012),
        MFGI_ICON_NODE_LINK_DIRECTION((char) 0xE013),
        MFGI_ICON_NODE_LINK_SHORT_PATH((char) 0xE014),
        MFGI_ICON_NODE_CLUSTER((char) 0xE015),
        MFGI_ICON_DISPLAY_GRAPH((char) 0xE016),
        MFGI_ICON_NODE_LINK_WEIGHT((char) 0xE017),
        MFGI_ICON_MORE_NODE_LINKS((char) 0xE018),
        MFGI_ICON_NODE_SHAPE((char) 0xE00A),
        MFGI_ICON_NODE_ICON((char) 0xE00B),
        MFGI_ICON_NODE_TEXT((char) 0xE00C),
        MFGI_ICON_NODE_LINK_TEXT((char) 0xE00D),
        MFGI_ICON_NODE_LINK_COLOR((char) 0xE00E),
        MFGI_ICON_NODE_LINK_SHAPE((char) 0xE00F),
        MFGI_ICON_CREDIT_CARD((char) 0xF4B3),
        MFGI_ICON_DISCONNECT((char) 0xF534),
        MFGI_ICON_GRAPH((char) 0xF535),
        MFGI_ICON_NEW_USER((char) 0xF536);

        char mfgLabsIconsetCharacter;

        Icon(char character) {
            this.mfgLabsIconsetCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return mfgLabsIconsetCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface mfgLabsIconsetTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (mfgLabsIconsetTypeface == null) {
                setTypeface(new MfgLabsIconset());
            }
            return mfgLabsIconsetTypeface;
        }

        private static void setTypeface(MfgLabsIconset mfgLabsIconsetTypeface) {
            Icon.mfgLabsIconsetTypeface = mfgLabsIconsetTypeface;
        }
    }
}
