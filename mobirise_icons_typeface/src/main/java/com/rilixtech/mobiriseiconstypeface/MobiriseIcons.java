package com.rilixtech.mobiriseiconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the MobiriseIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class MobiriseIcons implements MfbTypeface {
    private static final String TTF_FILE = "mobirise-icons-v1.0.0.ttf";
    private static final String MOBIRISE_ICONS_PREFIX = "MBRI";
    public static final String MOBIRISE_ICONS_NAME = "Mobirise Icons";
    public static final String MOBIRISE_ICONS_VERSION = "1" + ".0.0";
    public static final String MOBIRISE_ICONS_AUTHOR = "Free Website Builder, https://mobirise.com/";
    public static final String MOBIRISE_ICONS_URL = "https://mobirise.com/";
    public static final String MOBIRISE_ICONS_DESC = "A free, open source set of 150 elegant, pixel-perfect vector"
            + " icons from Free Website Builder.";
    public static final String MOBIRISE_ICONS_LICENSE = "CC BY 4.0.";
    public static final String MOBIRISE_ICONS_LICENSE_URL = "https://creativecommons.org/licenses/by/4.0/";

    private static Font mobiriseIconsTypeface = null;
    private static HashMap<String, Character> mobiriseIconsCharMap;

    /**
     * MobiriseIcons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which MobiriseIcons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the MobiriseIcons icon characters in a HashMap.
     *
     * @return HashMap of all MobiriseIcons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (mobiriseIconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.mobiriseIconsCharacter);
            }
            setChars(characterHashMap);
        }
        return mobiriseIconsCharMap;
    }

    /**
     * Set the MobiriseIcons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        mobiriseIconsCharMap = characterHashMap;
    }

    /**
     * Return the MobiriseIcons Mapping Prefix.
     *
     * @return MobiriseIcons Mapping Prefix, used by all MobiriseIcons icons.
     */
    @Override public String getMappingPrefix() {
        return MOBIRISE_ICONS_PREFIX;
    }

    @Override public String getFontName() {
        return MOBIRISE_ICONS_NAME;
    }

    @Override public String getVersion() {
        return MOBIRISE_ICONS_VERSION;
    }

    @Override public int getIconCount() {
        return mobiriseIconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> mobiriseIconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            mobiriseIconsKeyList.add(value.name());
        }
        return mobiriseIconsKeyList;
    }

    @Override public String getAuthor() {
        return MOBIRISE_ICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return MOBIRISE_ICONS_URL;
    }

    @Override public String getDescription() {
        return MOBIRISE_ICONS_DESC;
    }

    @Override public String getLicense() {
        return MOBIRISE_ICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return MOBIRISE_ICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (mobiriseIconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return mobiriseIconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        mobiriseIconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by MobiriseIcons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        MBRI_ADD_SUBMENU((char) 0xe900),
        MBRI_ALERT((char) 0xe901),
        MBRI_ALIGN_CENTER((char) 0xe902),
        MBRI_ALIGN_JUSTIFY((char) 0xe903),
        MBRI_ALIGN_LEFT((char) 0xe904),
        MBRI_ALIGN_RIGHT((char) 0xe905),
        MBRI_APPLE((char) 0xe907),
        MBRI_ARROW_DOWN((char) 0xe908),
        MBRI_ARROW_NEXT((char) 0xe909),
        MBRI_ARROW_PREV((char) 0xe90a),
        MBRI_ARROW_UP((char) 0xe90b),
        MBRI_BOLD((char) 0xe90c),
        MBRI_BOOKMARK((char) 0xe90d),
        MBRI_BOOTSTRAP((char) 0xe90e),
        MBRI_BRIEFCASE((char) 0xe90f),
        MBRI_BROWSE((char) 0xe910),
        MBRI_BULLETED_LIST((char) 0xe911),
        MBRI_CALENDAR((char) 0xe912),
        MBRI_CAMERA((char) 0xe913),
        MBRI_CART_ADD((char) 0xe914),
        MBRI_CART_FULL((char) 0xe915),
        MBRI_CASH((char) 0xe916),
        MBRI_CHANGE_STYLE((char) 0xe917),
        MBRI_CHAT((char) 0xe918),
        MBRI_CLOCK((char) 0xe919),
        MBRI_CLOSE((char) 0xe91a),
        MBRI_CLOUD((char) 0xe91b),
        MBRI_CODE((char) 0xe91c),
        MBRI_CONTACT_FORM((char) 0xe91d),
        MBRI_CREDIT_CARD((char) 0xe91e),
        MBRI_CURSOR_CLICK((char) 0xe91f),
        MBRI_CUST_FEEDBACK((char) 0xe920),
        MBRI_DATABASE((char) 0xe921),
        MBRI_DELIVERY((char) 0xe922),
        MBRI_DESKTOP((char) 0xe923),
        MBRI_DEVICES((char) 0xe924),
        MBRI_DOWN((char) 0xe925),
        MBRI_DOWNLOAD((char) 0xe926),
        MBRI_DRAG_N_DROP((char) 0xe927),
        MBRI_DRAG_N_DROP2((char) 0xe928),
        MBRI_EDIT((char) 0xe929),
        MBRI_EDIT2((char) 0xe92a),
        MBRI_ERROR((char) 0xe92b),
        MBRI_EXTENSION((char) 0xe92c),
        MBRI_FEATURES((char) 0xe92d),
        MBRI_FILE((char) 0xe92e),
        MBRI_FLAG((char) 0xe92f),
        MBRI_FOLDER((char) 0xe930),
        MBRI_GIFT((char) 0xe931),
        MBRI_GITHUB((char) 0xe932),
        MBRI_GLOBE_2((char) 0xe933),
        MBRI_GLOBE((char) 0xe934),
        MBRI_GROWING_CHART((char) 0xe935),
        MBRI_HEARTH((char) 0xe936),
        MBRI_HELP((char) 0xe937),
        MBRI_HOME((char) 0xe938),
        MBRI_HOT_CUP((char) 0xe939),
        MBRI_IDEA((char) 0xe93a),
        MBRI_IMAGE_GALLERY((char) 0xe93b),
        MBRI_IMAGE_SLIDER((char) 0xe93c),
        MBRI_INFO((char) 0xe93d),
        MBRI_ITALIC((char) 0xe93e),
        MBRI_KEY((char) 0xe93f),
        MBRI_LAPTOP((char) 0xe940),
        MBRI_LAYERS((char) 0xe941),
        MBRI_LEFT_RIGHT((char) 0xe942),
        MBRI_LEFT((char) 0xe943),
        MBRI_LETTER((char) 0xe944),
        MBRI_LIKE((char) 0xe945),
        MBRI_LINK((char) 0xe946),
        MBRI_LOCK((char) 0xe947),
        MBRI_LOGIN((char) 0xe948),
        MBRI_LOGOUT((char) 0xe949),
        MBRI_MAGIC_STICK((char) 0xe94a),
        MBRI_MAP_PIN((char) 0xe94b),
        MBRI_MENU((char) 0xe94c),
        MBRI_MOBILE((char) 0xe94d),
        MBRI_MOBILE2((char) 0xe94e),
        MBRI_MOBIRISE((char) 0xe94f),
        MBRI_MORE_HORIZONTAL((char) 0xe950),
        MBRI_MORE_VERTICAL((char) 0xe951),
        MBRI_MUSIC((char) 0xe952),
        MBRI_NEW_FILE((char) 0xe953),
        MBRI_NUMBERED_LIST((char) 0xe954),
        MBRI_OPENED_FOLDER((char) 0xe955),
        MBRI_PAGES((char) 0xe956),
        MBRI_PAPER_PLANE((char) 0xe957),
        MBRI_PAPERCLIP((char) 0xe958),
        MBRI_PHOTO((char) 0xe959),
        MBRI_PHOTOS((char) 0xe95a),
        MBRI_PIN((char) 0xe95b),
        MBRI_PLAY((char) 0xe95c),
        MBRI_PLUS((char) 0xe95d),
        MBRI_PREVIEW((char) 0xe95e),
        MBRI_PRINT((char) 0xe95f),
        MBRI_PROTECT((char) 0xe960),
        MBRI_QUESTION((char) 0xe961),
        MBRI_QUOTE_LEFT((char) 0xe962),
        MBRI_QUOTE_RIGHT((char) 0xe963),
        MBRI_REDO((char) 0xe964),
        MBRI_REFRESH((char) 0xe965),
        MBRI_RESPONSIVE((char) 0xe966),
        MBRI_RIGHT((char) 0xe967),
        MBRI_ROCKET((char) 0xe968),
        MBRI_SAD_FACE((char) 0xe969),
        MBRI_SALE((char) 0xe96a),
        MBRI_SAVE((char) 0xe96b),
        MBRI_SEARCH((char) 0xe96c),
        MBRI_SETTING((char) 0xe96d),
        MBRI_SETTING2((char) 0xe96e),
        MBRI_SETTING3((char) 0xe96f),
        MBRI_SHARE((char) 0xe970),
        MBRI_SHOPPING_BAG((char) 0xe971),
        MBRI_SHOPPING_BASKET((char) 0xe972),
        MBRI_SHOPPING_CART((char) 0xe973),
        MBRI_SITES((char) 0xe974),
        MBRI_SMILE_FACE((char) 0xe975),
        MBRI_SPEED((char) 0xe976),
        MBRI_STAR((char) 0xe977),
        MBRI_SUCCESS((char) 0xe978),
        MBRI_SUN((char) 0xe979),
        MBRI_SUN2((char) 0xe97a),
        MBRI_TABLET_VERTICAL((char) 0xe97b),
        MBRI_TABLET((char) 0xe97c),
        MBRI_TARGET((char) 0xe97d),
        MBRI_TIMER((char) 0xe97e),
        MBRI_TO_FTP((char) 0xe97f),
        MBRI_TO_LOCAL_DRIVE((char) 0xe980),
        MBRI_TOUCH_SWIPE((char) 0xe981),
        MBRI_TOUCH((char) 0xe982),
        MBRI_TRASH((char) 0xe983),
        MBRI_UNDERLINE((char) 0xe984),
        MBRI_UNDO((char) 0xe985),
        MBRI_UNLINK((char) 0xe986),
        MBRI_UNLOCK((char) 0xe987),
        MBRI_UP_DOWN((char) 0xe988),
        MBRI_UP((char) 0xe989),
        MBRI_UPDATE((char) 0xe98a),
        MBRI_UPLOAD((char) 0xe98b),
        MBRI_USER((char) 0xe98c),
        MBRI_USER2((char) 0xe98d),
        MBRI_USERS((char) 0xe98e),
        MBRI_VIDEO_PLAY((char) 0xe98f),
        MBRI_VIDEO((char) 0xe990),
        MBRI_WATCH((char) 0xe991),
        MBRI_WEBSITE_THEME((char) 0xe992),
        MBRI_WIFI((char) 0xe993),
        MBRI_WINDOWS((char) 0xe994),
        MBRI_ZOOM_OUT((char) 0xe995);

        char mobiriseIconsCharacter;

        Icon(char character) {
            this.mobiriseIconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return mobiriseIconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface mobiriseIconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (mobiriseIconsTypeface == null) {
                setTypeface(new MobiriseIcons());
            }
            return mobiriseIconsTypeface;
        }

        private static void setTypeface(MobiriseIcons mobiriseIconsTypeface) {
            Icon.mobiriseIconsTypeface = mobiriseIconsTypeface;
        }
    }
}
