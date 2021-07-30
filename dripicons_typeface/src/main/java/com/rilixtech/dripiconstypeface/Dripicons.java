package com.rilixtech.dripiconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Dripicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Dripicons implements MfbTypeface {
    private static final String TTF_FILE = "dripicons-v2.ttf";
    private static final String DRIPICONS_PREFIX = "DRPI";
    public static final String DRIPICONS_NAME = "Dripicons";
    public static final String DRIPICONS_VERSION = "2.0";
    public static final String DRIPICONS_AUTHOR = "Amit Jakhu";
    public static final String DRIPICONS_URL = "https://github.com/amitjakhu/dripicons";
    public static final String DRIPICONS_DESC = "A completely free vector line iconset by Amit Jakhu.";
    public static final String DRIPICONS_LICENSE = "SIL Open Font License";
    public static final String DRIPICONS_LICENSE_URL = "http://scripts.sil.org/cms/scripts/page.php?site_id=nrsi&id=OFL";

    private static Font dripiconsTypeface = null;

    private static HashMap<String, Character> dripiconsCharMap;

    /**
     * Dripicons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Dripicons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Dripicons icon characters in a HashMap.
     *
     * @return HashMap of all Dripicons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (dripiconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.dripiconsCharacter);
            }
            setChars(characterHashMap);
        }

        return dripiconsCharMap;
    }

    /**
     * Set the Dripicons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        dripiconsCharMap = characterHashMap;
    }

    /**
     * Return the Dripicons Mapping Prefix.
     *
     * @return Dripicons Mapping Prefix, used by all Dripicons icons.
     */
    @Override public String getMappingPrefix() {
        return DRIPICONS_PREFIX;
    }

    @Override public String getFontName() {
        return DRIPICONS_NAME;
    }

    @Override public String getVersion() {
        return DRIPICONS_VERSION;
    }

    @Override public int getIconCount() {
        return dripiconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> dripiconsKeyList = new LinkedList<>();

        for (Icon value : Icon.values()) {
            dripiconsKeyList.add(value.name());
        }

        return dripiconsKeyList;
    }

    @Override public String getAuthor() {
        return DRIPICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return DRIPICONS_URL;
    }

    @Override public String getDescription() {
        return DRIPICONS_DESC;
    }

    @Override public String getLicense() {
        return DRIPICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return DRIPICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (dripiconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return dripiconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        dripiconsTypeface = font;
    }

    private static final char A_LOWERCASE = 0x0027;
    private static final char BACK_SLASH = 0x005C;

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Dripicons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        DRPI_ALARM((char) 0x0061),
        DRPI_ALIGN_CENTER((char) 0x0062),
        DRPI_ALIGN_JUSTIFY((char) 0x0063),
        DRPI_ALIGN_LEFT((char) 0x0064),
        DRPI_ALIGN_RIGHT((char) 0x0065),
        DRPI_ANCHOR((char) 0x0066),
        DRPI_ARCHIVE((char) 0x0067),
        DRPI_ARROW_DOWN((char) 0x0068),
        DRPI_ARROW_LEFT((char) 0x0069),
        DRPI_ARROW_RIGHT((char) 0x006a),
        DRPI_ARROW_THIN_DOWN((char) 0x006b),
        DRPI_ARROW_THIN_LEFT((char) 0x006c),
        DRPI_ARROW_THIN_RIGHT((char) 0x006d),
        DRPI_ARROW_THIN_UP((char) 0x006e),
        DRPI_ARROW_UP((char) 0x006f),
        DRPI_ARTICLE((char) 0x0070),
        DRPI_BACKSPACE((char) 0x0071),
        DRPI_BASKET((char) 0x0072),
        DRPI_BASKETBALL((char) 0x0073),
        DRPI_BATTERY_EMPTY((char) 0x0074),
        DRPI_BATTERY_FULL((char) 0x0075),
        DRPI_BATTERY_LOW((char) 0x0076),
        DRPI_BATTERY_MEDIUM((char) 0x0077),
        DRPI_BELL((char) 0x0078),
        DRPI_BLOG((char) 0x0079),
        DRPI_BLUETOOTH((char) 0x007a),
        DRPI_BOLD((char) 0x0041),
        DRPI_BOOKMARK((char) 0x0042),
        DRPI_BOOKMARKS((char) 0x0043),
        DRPI_BOX((char) 0x0044),
        DRPI_BRIEFCASE((char) 0x0045),
        DRPI_BRIGHTNESS_LOW((char) 0x0046),
        DRPI_BRIGHTNESS_MAX((char) 0x0047),
        DRPI_BRIGHTNESS_MEDIUM((char) 0x0048),
        DRPI_BROADCAST((char) 0x0049),
        DRPI_BROWSER((char) 0x004a),
        DRPI_BROWSER_UPLOAD((char) 0x004b),
        DRPI_BRUSH((char) 0x004c),
        DRPI_CALENDAR((char) 0x004d),
        DRPI_CAMCORDER((char) 0x004e),
        DRPI_CAMERA((char) 0x004f),
        DRPI_CARD((char) 0x0050),
        DRPI_CART((char) 0x0051),
        DRPI_CHECKLIST((char) 0x0052),
        DRPI_CHECKMARK((char) 0x0053),
        DRPI_CHEVRON_DOWN((char) 0x0054),
        DRPI_CHEVRON_LEFT((char) 0x0055),
        DRPI_CHEVRON_RIGHT((char) 0x0056),
        DRPI_CHEVRON_UP((char) 0x0057),
        DRPI_CLIPBOARD((char) 0x0058),
        DRPI_CLOCK((char) 0x0059),
        DRPI_CLOCKWISE((char) 0x005a),
        DRPI_CLOUD((char) 0x0030),
        DRPI_CLOUD_DOWNLOAD((char) 0x0031),
        DRPI_CLOUD_UPLOAD((char) 0x0032),
        DRPI_CODE((char) 0x0033),
        DRPI_CONTRACT((char) 0x0034),
        DRPI_CONTRACT_2((char) 0x0035),
        DRPI_CONVERSATION((char) 0x0036),
        DRPI_COPY((char) 0x0037),
        DRPI_CROP((char) 0x0038),
        DRPI_CROSS((char) 0x0039),
        DRPI_CROSSHAIR((char) 0x0021),
        DRPI_CUTLERY((char) 0x0022),
        DRPI_DEVICE_DESKTOP((char) 0x0023),
        DRPI_DEVICE_MOBILE((char) 0x0024),
        DRPI_DEVICE_TABLET((char) 0x0025),
        DRPI_DIRECTION((char) 0x0026),
        DRPI_DISC(A_LOWERCASE),
        DRPI_DOCUMENT((char) 0x0028),
        DRPI_DOCUMENT_DELETE((char) 0x0029),
        DRPI_DOCUMENT_EDIT((char) 0x002a),
        DRPI_DOCUMENT_NEW((char) 0x002b),
        DRPI_DOCUMENT_REMOVE((char) 0x002c),
        DRPI_DOT((char) 0x002d),
        DRPI_DOTS_2((char) 0x002e),
        DRPI_DOTS_3((char) 0x002f),
        DRPI_DOWNLOAD((char) 0x003a),
        DRPI_DUPLICATE((char) 0x003b),
        DRPI_ENTER((char) 0x003c),
        DRPI_EXIT((char) 0x003d),
        DRPI_EXPAND((char) 0x003e),
        DRPI_EXPAND_2((char) 0x003f),
        DRPI_EXPERIMENT((char) 0x0040),
        DRPI_EXPORT((char) 0x005b),
        DRPI_FEED((char) 0x005d),
        DRPI_FLAG((char) 0x005e),
        DRPI_FLASHLIGHT((char) 0x005f),
        DRPI_FOLDER((char) 0x0060),
        DRPI_FOLDER_OPEN((char) 0x007b),
        DRPI_FORWARD((char) 0x007c),
        DRPI_GAMING((char) 0x007d),
        DRPI_GEAR((char) 0x007e),
        DRPI_GRADUATION(BACK_SLASH),
        DRPI_GRAPH_BAR((char) 0xe000),
        DRPI_GRAPH_LINE((char) 0xe001),
        DRPI_GRAPH_PIE((char) 0xe002),
        DRPI_HEADSET((char) 0xe003),
        DRPI_HEART((char) 0xe004),
        DRPI_HELP((char) 0xe005),
        DRPI_HOME((char) 0xe006),
        DRPI_HOURGLASS((char) 0xe007),
        DRPI_INBOX((char) 0xe008),
        DRPI_INFORMATION((char) 0xe009),
        DRPI_ITALIC((char) 0xe00a),
        DRPI_JEWEL((char) 0xe00b),
        DRPI_LIFTING((char) 0xe00c),
        DRPI_LIGHTBULB((char) 0xe00d),
        DRPI_LINK((char) 0xe00e),
        DRPI_LINK_BROKEN((char) 0xe00f),
        DRPI_LIST((char) 0xe010),
        DRPI_LOADING((char) 0xe011),
        DRPI_LOCATION((char) 0xe012),
        DRPI_LOCK((char) 0xe013),
        DRPI_LOCK_OPEN((char) 0xe014),
        DRPI_MAIL((char) 0xe015),
        DRPI_MAP((char) 0xe016),
        DRPI_MEDIA_LOOP((char) 0xe017),
        DRPI_MEDIA_NEXT((char) 0xe018),
        DRPI_MEDIA_PAUSE((char) 0xe019),
        DRPI_MEDIA_PLAY((char) 0xe01a),
        DRPI_MEDIA_PREVIOUS((char) 0xe01b),
        DRPI_MEDIA_RECORD((char) 0xe01c),
        DRPI_MEDIA_SHUFFLE((char) 0xe01d),
        DRPI_MEDIA_STOP((char) 0xe01e),
        DRPI_MEDICAL((char) 0xe01f),
        DRPI_MENU((char) 0xe020),
        DRPI_MESSAGE((char) 0xe021),
        DRPI_METER((char) 0xe022),
        DRPI_MICROPHONE((char) 0xe023),
        DRPI_MINUS((char) 0xe024),
        DRPI_MONITOR((char) 0xe025),
        DRPI_MOVE((char) 0xe026),
        DRPI_MUSIC((char) 0xe027),
        DRPI_NETWORK_1((char) 0xe028),
        DRPI_NETWORK_2((char) 0xe029),
        DRPI_NETWORK_3((char) 0xe02a),
        DRPI_NETWORK_4((char) 0xe02b),
        DRPI_NETWORK_5((char) 0xe02c),
        DRPI_PAMPHLET((char) 0xe02d),
        DRPI_PAPERCLIP((char) 0xe02e),
        DRPI_PENCIL((char) 0xe02f),
        DRPI_PHONE((char) 0xe030),
        DRPI_PHOTO((char) 0xe031),
        DRPI_PHOTO_GROUP((char) 0xe032),
        DRPI_PILL((char) 0xe033),
        DRPI_PIN((char) 0xe034),
        DRPI_PLUS((char) 0xe035),
        DRPI_POWER((char) 0xe036),
        DRPI_PREVIEW((char) 0xe037),
        DRPI_PRINT((char) 0xe038),
        DRPI_PULSE((char) 0xe039),
        DRPI_QUESTION((char) 0xe03a),
        DRPI_REPLY((char) 0xe03b),
        DRPI_REPLY_ALL((char) 0xe03c),
        DRPI_RETURN((char) 0xe03d),
        DRPI_RETWEET((char) 0xe03e),
        DRPI_ROCKET((char) 0xe03f),
        DRPI_SCALE((char) 0xe040),
        DRPI_SEARCH((char) 0xe041),
        DRPI_SHOPPING_BAG((char) 0xe042),
        DRPI_SKIP((char) 0xe043),
        DRPI_STACK((char) 0xe044),
        DRPI_STAR((char) 0xe045),
        DRPI_STOPWATCH((char) 0xe046),
        DRPI_STORE((char) 0xe047),
        DRPI_SUITCASE((char) 0xe048),
        DRPI_SWAP((char) 0xe049),
        DRPI_TAG((char) 0xe04a),
        DRPI_TAG_DELETE((char) 0xe04b),
        DRPI_TAGS((char) 0xe04c),
        DRPI_THUMBS_DOWN((char) 0xe04d),
        DRPI_THUMBS_UP((char) 0xe04e),
        DRPI_TICKET((char) 0xe04f),
        DRPI_TIME_REVERSE((char) 0xe050),
        DRPI_TO_DO((char) 0xe051),
        DRPI_TOGGLES((char) 0xe052),
        DRPI_TRASH((char) 0xe053),
        DRPI_TROPHY((char) 0xe054),
        DRPI_UPLOAD((char) 0xe055),
        DRPI_USER((char) 0xe056),
        DRPI_USER_GROUP((char) 0xe057),
        DRPI_USER_ID((char) 0xe058),
        DRPI_VIBRATE((char) 0xe059),
        DRPI_VIEW_APPS((char) 0xe05a),
        DRPI_VIEW_LIST((char) 0xe05b),
        DRPI_VIEW_LIST_LARGE((char) 0xe05c),
        DRPI_VIEW_THUMB((char) 0xe05d),
        DRPI_VOLUME_FULL((char) 0xe05e),
        DRPI_VOLUME_LOW((char) 0xe05f),
        DRPI_VOLUME_MEDIUM((char) 0xe060),
        DRPI_VOLUME_OFF((char) 0xe061),
        DRPI_WALLET((char) 0xe062),
        DRPI_WARNING((char) 0xe063),
        DRPI_WEB((char) 0xe064),
        DRPI_WEIGHT((char) 0xe065),
        DRPI_WIFI((char) 0xe066),
        DRPI_WRONG((char) 0xe067),
        DRPI_ZOOM_IN((char) 0xe068),
        DRPI_ZOOM_OUT((char) 0xe069);

        char dripiconsCharacter;

        Icon(char character) {
            this.dripiconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return dripiconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface dripiconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (dripiconsTypeface == null) {
                setTypeface(new Dripicons());
            }
            return dripiconsTypeface;
        }

        private static void setTypeface(Dripicons dripiconsTypeface) {
            Icon.dripiconsTypeface = dripiconsTypeface;
        }
    }
}
