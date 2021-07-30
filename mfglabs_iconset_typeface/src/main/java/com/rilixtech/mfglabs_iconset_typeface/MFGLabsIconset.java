package com.rilixtech.mfglabs_iconset_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the MFGLabsIconset font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class MFGLabsIconset implements ITypeface {
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
     * MFGLabsIconset IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which MFGLabsIconset IIcon is to be retrieved.
     */
    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the MFGLabsIconset icon characters in a HashMap.
     *
     * @return HashMap of all MFGLabsIconset icon character names mapped to their character values.
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
     * Set the MFGLabsIconset Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        mfgLabsIconsetCharMap = characterHashMap;
    }

    /**
     * Return the MFGLabsIconset Mapping Prefix.
     *
     * @return MFGLabsIconset Mapping Prefix, used by all MFGLabsIconset icons.
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
     * Enumerates all the supported Custom Icon Unicode characters by MFGLabsIconset ITypeface.
     */
    public enum Icon implements IIcon {
        // MFG Labs iconset 1.0
        MFGI_ICON_CLOUD('\u2601'),
        MFGI_ICON_AT('\u0040'),
        MFGI_ICON_PLUS('\u002B'),
        MFGI_ICON_MINUS('\u2212'),
        MFGI_ICON_ARROW_UP('\u2191'),
        MFGI_ICON_ARROW_DOWN('\u2193'),
        MFGI_ICON_ARROW_RIGHT('\u2192'),
        MFGI_ICON_ARROW_LEFT('\u2190'),
        MFGI_ICON_CHEVRON_DOWN('\uf004'),
        MFGI_ICON_CHEVRON_UP('\uf005'),
        MFGI_ICON_CHEVRON_RIGHT('\uf006'),
        MFGI_ICON_CHEVRON_LEFT('\uf007'),
        MFGI_ICON_REORDER('\uf008'),
        MFGI_ICON_LIST('\uf009'),
        MFGI_ICON_REORDER_SQUARE('\uf00a'),
        MFGI_ICON_REORDER_SQUARE_LINE('\uf00b'),
        MFGI_ICON_COVERFLOW('\uf00c'),
        MFGI_ICON_COVERFLOW_LINE('\uf00d'),
        MFGI_ICON_PAUSE('\uf00e'),
        MFGI_ICON_PLAY('\uf00f'),
        MFGI_ICON_STEP_FORWARD('\uf010'),
        MFGI_ICON_STEP_BACKWARD('\uf011'),
        MFGI_ICON_FAST_FORWARD('\uf012'),
        MFGI_ICON_FAST_BACKWARD('\uf013'),
        MFGI_ICON_CLOUD_UPLOAD('\uf014'),
        MFGI_ICON_CLOUD_DOWNLOAD('\uf015'),
        MFGI_ICON_DATA_SCIENCE('\uf016'),
        MFGI_ICON_DATA_SCIENCE_BLACK('\uf017'),
        MFGI_ICON_GLOBE('\uf018'),
        MFGI_ICON_GLOBE_BLACK('\uf019'),
        MFGI_ICON_MATH_ICO('\uf01a'),
        MFGI_ICON_MATH('\uf01b'),
        MFGI_ICON_MATH_BLACK('\uf01c'),
        MFGI_ICON_PAPERPLANE_ICO('\uf01d'),
        MFGI_ICON_PAPERPLANE('\uf01e'),
        MFGI_ICON_PAPERPLANE_BLACK('\uf01f'),
        MFGI_ICON_COLOR_BALANCE('\uf020'),
        MFGI_ICON_STAR('\u2605'),
        MFGI_ICON_STAR_HALF('\uf022'),
        MFGI_ICON_STAR_EMPTY('\u2606'),
        MFGI_ICON_STAR_HALF_EMPTY('\uf024'),
        MFGI_ICON_RELOAD('\uf025'),
        MFGI_ICON_HEART('\u2665'),
        MFGI_ICON_HEART_BROKEN('\uf028'),
        MFGI_ICON_HASHTAG('\uf029'),
        MFGI_ICON_REPLY('\uf02a'),
        MFGI_ICON_RETWEET('\uf02b'),
        MFGI_ICON_SIGNIN('\uf02c'),
        MFGI_ICON_SIGNOUT('\uf02d'),
        MFGI_ICON_DOWNLOAD('\uf02e'),
        MFGI_ICON_UPLOAD('\uf02f'),
        MFGI_ICON_PLACEPIN('\uf031'),
        MFGI_ICON_DISPLAY_SCREEN('\uf032'),
        MFGI_ICON_TABLET('\uf033'),
        MFGI_ICON_SMARTPHONE('\uf034'),
        MFGI_ICON_CONNECTED_OBJECT('\uf035'),
        MFGI_ICON_LOCK('\uF512'),
        MFGI_ICON_UNLOCK('\uF513'),
        MFGI_ICON_CAMERA('\uF4F7'),
        MFGI_ICON_ISIGHT('\uf039'),
        MFGI_ICON_VIDEO_CAMERA('\uf03a'),
        MFGI_ICON_RANDOM('\uf03b'),
        MFGI_ICON_MESSAGE('\uF4AC'),
        MFGI_ICON_DISCUSSION('\uf03d'),
        MFGI_ICON_CALENDAR('\uF4C5'),
        MFGI_ICON_RINGBELL('\uf03f'),
        MFGI_ICON_MOVIE('\uf040'),
        MFGI_ICON_MAIL('\u2709'),
        MFGI_ICON_PEN('\u270F'),
        MFGI_ICON_SETTINGS('\u9881'),
        MFGI_ICON_MEASURE('\uf044'),
        MFGI_ICON_VECTOR('\uf045'),
        MFGI_ICON_VECTOR_PEN('\u2712'),
        MFGI_ICON_MUTE_ON('\uf047'),
        MFGI_ICON_MUTE_OFF('\uf048'),
        MFGI_ICON_HOME('\u2302'),
        MFGI_ICON_SHEET('\uf04a'),
        MFGI_ICON_ARROW_BIG_RIGHT('\u21C9'),
        MFGI_ICON_ARROW_BIG_LEFT('\u21C7'),
        MFGI_ICON_ARROW_BIG_DOWN('\u21CA'),
        MFGI_ICON_ARROW_BIG_UP('\u21C8'),
        MFGI_ICON_DRIBBBLE_CIRCLE('\uf04f'),
        MFGI_ICON_DRIBBBLE('\uf050'),
        MFGI_ICON_FACEBOOK_CIRCLE('\uf051'),
        MFGI_ICON_FACEBOOK('\uf052'),
        MFGI_ICON_GIT_CIRCLE_ALT('\uf053'),
        MFGI_ICON_GIT_CIRCLE('\uf054'),
        MFGI_ICON_GIT('\uf055'),
        MFGI_ICON_OCTOPUS('\uf056'),
        MFGI_ICON_TWITTER_CIRCLE('\uf057'),
        MFGI_ICON_TWITTER('\uf058'),
        MFGI_ICON_GOOGLE_PLUS_CIRCLE('\uf059'),
        MFGI_ICON_GOOGLE_PLUS('\uf05a'),
        MFGI_ICON_LINKED_IN_CIRCLE('\uf05b'),
        MFGI_ICON_LINKED_IN('\uf05c'),
        MFGI_ICON_INSTAGRAM('\uf05d'),
        MFGI_ICON_INSTAGRAM_CIRCLE('\uf05e'),
        MFGI_ICON_MFG_ICON('\uf05f'),
        MFGI_ICON_XING('\uF532'),
        MFGI_ICON_XING_CIRCLE('\uF533'),
        MFGI_ICON_MFG_ICON_CIRCLE('\uf060'),
        MFGI_ICON_USER('\uf061'),
        MFGI_ICON_USER_MALE('\uf062'),
        MFGI_ICON_USER_FEMALE('\uf063'),
        MFGI_ICON_USERS('\uf064'),
        MFGI_ICON_FILE_OPEN('\uF4C2'),
        MFGI_ICON_FILE_CLOSE('\uf067'),
        MFGI_ICON_FILE_ALT('\uf068'),
        MFGI_ICON_FILE_CLOSE_ALT('\uf069'),
        MFGI_ICON_ATTACHMENT('\uf06a'),
        MFGI_ICON_CHECK('\u2713'),
        MFGI_ICON_CROSS_MARK('\u274C'),
        MFGI_ICON_CANCEL_CIRCLE('\uF06E'),
        MFGI_ICON_CHECK_CIRCLE('\uf06d'),
        MFGI_ICON_MAGNIFYING('\uF50D'),
        MFGI_ICON_INBOX('\uf070'),
        MFGI_ICON_CLOCK('\u23F2'),
        MFGI_ICON_STOPWATCH('\u23F1'),
        MFGI_ICON_HOURGLASS('\u231B'),
        MFGI_ICON_TROPHY('\uf074'),
        MFGI_ICON_UNLOCK_ALT('\uF075'),
        MFGI_ICON_LOCK_ALT('\uF510'),
        MFGI_ICON_ARROW_DOUBLED_RIGHT('\u21D2'),
        MFGI_ICON_ARROW_DOUBLED_LEFT('\u21D0'),
        MFGI_ICON_ARROW_DOUBLED_DOWN('\u21D3'),
        MFGI_ICON_ARROW_DOUBLED_UP('\u21D1'),
        MFGI_ICON_LINK('\uf07B'),
        MFGI_ICON_WARNING('\u2757'),
        MFGI_ICON_WARNING_ALT('\u2755'),
        MFGI_ICON_MAGNIFYING_PLUS('\uf07E'),
        MFGI_ICON_MAGNIFYING_MINUS('\uf07F'),
        MFGI_ICON_WHITE_QUESTION('\u2754'),
        MFGI_ICON_BLACK_QUESTION('\u2753'),
        MFGI_ICON_STOP('\uf080'),
        MFGI_ICON_SHARE('\uf081'),
        MFGI_ICON_EYE('\uf082'),
        MFGI_ICON_TRASH_CAN('\uf083'),
        MFGI_ICON_HARD_DRIVE('\uf084'),
        MFGI_ICON_INFORMATION_BLACK('\uf085'),
        MFGI_ICON_INFORMATION_WHITE('\uf086'),
        MFGI_ICON_PRINTER('\uf087'),
        MFGI_ICON_LETTER('\uf088'),
        MFGI_ICON_SOUNDCLOUD('\uf089'),
        MFGI_ICON_SOUNDCLOUD_CIRCLE('\uf08A'),
        MFGI_ICON_ANCHOR('\u2693'),
        MFGI_ICON_FEMALE_SIGN('\u2640'),
        MFGI_ICON_MALE_SIGN('\u2642'),
        MFGI_ICON_JOYSTICK('\uF514'),
        MFGI_ICON_HIGH_VOLTAGE('\u26A1'),
        MFGI_ICON_FIRE('\uF525'),
        MFGI_ICON_NEWSPAPER('\uF4F0'),
        MFGI_ICON_CHART('\uF526'),
        MFGI_ICON_SPREAD('\uF527'),
        MFGI_ICON_SPINNER_1('\uF528'),
        MFGI_ICON_SPINNER_2('\uF529'),
        MFGI_ICON_CHART_ALT('\uF530'),
        MFGI_ICON_LABEL('\uF531'),
        MFGI_ICON_BRUSH('\uE000'),
        MFGI_ICON_REFRESH('\uE001'),
        MFGI_ICON_NODE('\uE002'),
        MFGI_ICON_NODE_2('\uE003'),
        MFGI_ICON_NODE_3('\uE004'),
        MFGI_ICON_LINK_2_NODES('\uE005'),
        MFGI_ICON_LINK_3_NODES('\uE006'),
        MFGI_ICON_LINK_LOOP_NODES('\uE007'),
        MFGI_ICON_NODE_SIZE('\uE008'),
        MFGI_ICON_NODE_COLOR('\uE009'),
        MFGI_ICON_LAYOUT_DIRECTED('\uE010'),
        MFGI_ICON_LAYOUT_RADIAL('\uE011'),
        MFGI_ICON_LAYOUT_HIERARCHICAL('\uE012'),
        MFGI_ICON_NODE_LINK_DIRECTION('\uE013'),
        MFGI_ICON_NODE_LINK_SHORT_PATH('\uE014'),
        MFGI_ICON_NODE_CLUSTER('\uE015'),
        MFGI_ICON_DISPLAY_GRAPH('\uE016'),
        MFGI_ICON_NODE_LINK_WEIGHT('\uE017'),
        MFGI_ICON_MORE_NODE_LINKS('\uE018'),
        MFGI_ICON_NODE_SHAPE('\uE00A'),
        MFGI_ICON_NODE_ICON('\uE00B'),
        MFGI_ICON_NODE_TEXT('\uE00C'),
        MFGI_ICON_NODE_LINK_TEXT('\uE00D'),
        MFGI_ICON_NODE_LINK_COLOR('\uE00E'),
        MFGI_ICON_NODE_LINK_SHAPE('\uE00F'),
        MFGI_ICON_CREDIT_CARD('\uF4B3'),
        MFGI_ICON_DISCONNECT('\uF534'),
        MFGI_ICON_GRAPH('\uF535'),
        MFGI_ICON_NEW_USER('\uF536');

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
        private static ITypeface mfgLabsIconsetTypeface;

        @Override
        public ITypeface getTypeface() {
            if (mfgLabsIconsetTypeface == null) {
                setTypeface(new MFGLabsIconset());
            }
            return mfgLabsIconsetTypeface;
        }

        private static void setTypeface(MFGLabsIconset mfgLabsIconsetTypeface) {
            Icon.mfgLabsIconsetTypeface = mfgLabsIconsetTypeface;
        }
    }
}