package com.rilixtech.octiconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Octicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Octicons implements MfbTypeface {
    private static final String TTF_FILE = "octicons-v3.2.0.ttf";
    private static final String OCTICONS_PREFIX = "OCTI";
    public static final String OCTICONS_NAME = "Octicons";
    public static final String OCTICONS_VERSION = "3" + ".2.0";
    public static final String OCTICONS_AUTHOR = "GitHub";
    public static final String OCTICONS_URL = "https://github.com/github/octicons";
    public static final String OCTICONS_DESC = "GitHub's icon font https://octicons.github.com/";
    public static final String OCTICONS_LICENSE = " SIL OFL 1.1";
    public static final String OCTICONS_LICENSE_URL = "http://scripts.sil.org/OFL";

    private static Font octiconsTypeface = null;
    private static HashMap<String, Character> octiconsCharMap;

    /**
     * Octicons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Octicons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Octicons icon characters in a HashMap.
     *
     * @return HashMap of all Octicons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (octiconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.octiconsCharacter);
            }
            setChars(characterHashMap);
        }
        return octiconsCharMap;
    }

    /**
     * Set the Octicons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        octiconsCharMap = characterHashMap;
    }

    /**
     * Return the Octicons Mapping Prefix.
     *
     * @return Octicons Mapping Prefix, used by all Octicons icons.
     */
    @Override
    public String getMappingPrefix() {
        return OCTICONS_PREFIX;
    }

    @Override
    public String getFontName() {
        return OCTICONS_NAME;
    }

    @Override
    public String getVersion() {
        return OCTICONS_VERSION;
    }

    @Override
    public int getIconCount() {
        return octiconsCharMap.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> octiconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            octiconsKeyList.add(value.name());
        }
        return octiconsKeyList;
    }

    @Override
    public String getAuthor() {
        return OCTICONS_AUTHOR;
    }

    @Override
    public String getUrl() {
        return OCTICONS_URL;
    }

    @Override
    public String getDescription() {
        return OCTICONS_DESC;
    }

    @Override
    public String getLicense() {
        return OCTICONS_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return OCTICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (octiconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return octiconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        octiconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Octicons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        //Octicons
        OCTI_ALERT((char) 0xf02d),
        OCTI_ARROW_DOWN((char) 0xf03f),
        OCTI_ARROW_LEFT((char) 0xf040),
        OCTI_ARROW_RIGHT((char) 0xf03e),
        OCTI_ARROW_SMALL_DOWN((char) 0xf0a0),
        OCTI_ARROW_SMALL_LEFT((char) 0xf0a1),
        OCTI_ARROW_SMALL_RIGHT((char) 0xf071),
        OCTI_ARROW_SMALL_UP((char) 0xf09f),
        OCTI_ARROW_UP((char) 0xf03d),
        OCTI_MICROSCOPE((char) 0xf0dd),
        OCTI_BEAKER((char) 0xf0dd),
        OCTI_BELL((char) 0xf0de),
        OCTI_BOLD((char) 0xf0e2),
        OCTI_BOOK((char) 0xf007),
        OCTI_BOOKMARK((char) 0xf07b),
        OCTI_BRIEFCASE((char) 0xf0d3),
        OCTI_BROADCAST((char) 0xf048),
        OCTI_BROWSER((char) 0xf0c5),
        OCTI_BUG((char) 0xf091),
        OCTI_CALENDAR((char) 0xf068),
        OCTI_CHECK((char) 0xf03a),
        OCTI_CHECKLIST((char) 0xf076),
        OCTI_CHEVRON_DOWN((char) 0xf0a3),
        OCTI_CHEVRON_LEFT((char) 0xf0a4),
        OCTI_CHEVRON_RIGHT((char) 0xf078),
        OCTI_CHEVRON_UP((char) 0xf0a2),
        OCTI_CIRCLE_SLASH((char) 0xf084),
        OCTI_CIRCUIT_BOARD((char) 0xf0d6),
        OCTI_CLIPPY((char) 0xf035),
        OCTI_CLOCK((char) 0xf046),
        OCTI_CLOUD_DOWNLOAD((char) 0xf00b),
        OCTI_CLOUD_UPLOAD((char) 0xf00c),
        OCTI_CODE((char) 0xf05f),
        OCTI_COLOR_MODE((char) 0xf065),
        OCTI_COMMENTI_ADD((char) 0xf02b),
        OCTI_COMMENT((char) 0xf02b),
        OCTI_COMMENTI_DISCUSSION((char) 0xf04f),
        OCTI_CREDIT_CARD((char) 0xf045),
        OCTI_DASH((char) 0xf0ca),
        OCTI_DASHBOARD((char) 0xf07d),
        OCTI_DATABASE((char) 0xf096),
        OCTI_CLONE((char) 0xf0dc),
        OCTI_DESKTOP_DOWNLOAD((char) 0xf0dc),
        OCTI_DEVICE_CAMERA((char) 0xf056),
        OCTI_DEVICE_CAMERA_VIDEO((char) 0xf057),
        OCTI_DEVICE_DESKTOP((char) 0xf27c),
        OCTI_DEVICE_MOBILE((char) 0xf038),
        OCTI_DIFF((char) 0xf04d),
        OCTI_DIFF_ADDED((char) 0xf06b),
        OCTI_DIFF_IGNORED((char) 0xf099),
        OCTI_DIFF_MODIFIED((char) 0xf06d),
        OCTI_DIFF_REMOVED((char) 0xf06c),
        OCTI_DIFF_RENAMED((char) 0xf06e),
        OCTI_ELLIPSIS((char) 0xf09a),
        OCTI_EYE_UNWATCH((char) 0xf04e),
        OCTI_EYE_WATCH((char) 0xf04e),
        OCTI_EYE((char) 0xf04e),
        OCTI_FILE_BINARY((char) 0xf094),
        OCTI_FILE_CODE((char) 0xf010),
        OCTI_FILE_DIRECTORY((char) 0xf016),
        OCTI_FILE_MEDIA((char) 0xf012),
        OCTI_FILE_PDF((char) 0xf014),
        OCTI_FILE_SUBMODULE((char) 0xf017),
        OCTI_FILE_SYMLINK_DIRECTORY((char) 0xf0b1),
        OCTI_FILE_SYMLINK_FILE((char) 0xf0b0),
        OCTI_FILE_TEXT((char) 0xf011),
        OCTI_FILE_ZIP((char) 0xf013),
        OCTI_FLAME((char) 0xf0d2),
        OCTI_FOLD((char) 0xf0cc),
        OCTI_GEAR((char) 0xf02f),
        OCTI_GIFT((char) 0xf042),
        OCTI_GIST((char) 0xf00e),
        OCTI_GIST_SECRET((char) 0xf08c),
        OCTI_GIT_BRANCH_CREATE((char) 0xf020),
        OCTI_GIT_BRANCH_DELETE((char) 0xf020),
        OCTI_GIT_BRANCH((char) 0xf020),
        OCTI_GIT_COMMIT((char) 0xf01f),
        OCTI_GIT_COMPARE((char) 0xf0ac),
        OCTI_GIT_MERGE((char) 0xf023),
        OCTI_GIT_PULL_REQUEST_ABANDONED((char) 0xf009),
        OCTI_GIT_PULL_REQUEST((char) 0xf009),
        OCTI_GLOBE((char) 0xf0b6),
        OCTI_GRAPH((char) 0xf043),
        OCTI_HEART((char) 0x2665),
        OCTI_HISTORY((char) 0xf07e),
        OCTI_HOME((char) 0xf08d),
        OCTI_HORIZONTAL_RULE((char) 0xf070),
        OCTI_HUBOT((char) 0xf09d),
        OCTI_INBOX((char) 0xf0cf),
        OCTI_INFO((char) 0xf059),
        OCTI_ISSUE_CLOSED((char) 0xf028),
        OCTI_ISSUE_OPENED((char) 0xf026),
        OCTI_ISSUE_REOPENED((char) 0xf027),
        OCTI_ITALIC((char) 0xf0e4),
        OCTI_JERSEY((char) 0xf019),
        OCTI_KEY((char) 0xf049),
        OCTI_KEYBOARD((char) 0xf00d),
        OCTI_LAW((char) 0xf0d8),
        OCTI_LIGHT_BULB((char) 0xf000),
        OCTI_LINK((char) 0xf05c),
        OCTI_LINK_EXTERNAL((char) 0xf07f),
        OCTI_LIST_ORDERED((char) 0xf062),
        OCTI_LIST_UNORDERED((char) 0xf061),
        OCTI_LOCATION((char) 0xf060),
        OCTI_GIST_PRIVATE((char) 0xf06a),
        OCTI_MIRROR_PRIVATE((char) 0xf06a),
        OCTI_GIT_FORK_PRIVATE((char) 0xf06a),
        OCTI_LOCK((char) 0xf06a),
        OCTI_LOGO_GITHUB((char) 0xf092),
        OCTI_MAIL((char) 0xf03b),
        OCTI_MAIL_READ((char) 0xf03c),
        OCTI_MAIL_REPLY((char) 0xf051),
        OCTI_MARK_GITHUB((char) 0xf00a),
        OCTI_MARKDOWN((char) 0xf0c9),
        OCTI_MEGAPHONE((char) 0xf077),
        OCTI_MENTION((char) 0xf0be),
        OCTI_MILESTONE((char) 0xf075),
        OCTI_MIRROR_PUBLIC((char) 0xf024),
        OCTI_MIRROR((char) 0xf024),
        OCTI_MORTAR_BOARD((char) 0xf0d7),
        OCTI_MUTE((char) 0xf080),
        OCTI_NO_NEWLINE((char) 0xf09c),
        OCTI_OCTOFACE((char) 0xf008),
        OCTI_ORGANIZATION((char) 0xf037),
        OCTI_PACKAGE((char) 0xf0c4),
        OCTI_PAINTCAN((char) 0xf0d1),
        OCTI_PENCIL((char) 0xf058),
        OCTI_PERSON_ADD((char) 0xf018),
        OCTI_PERSON_FOLLOW((char) 0xf018),
        OCTI_PERSON((char) 0xf018),
        OCTI_PIN((char) 0xf041),
        OCTI_PLUG((char) 0xf0d4),
        OCTI_REPO_CREATE((char) 0xf05d),
        OCTI_GIST_NEW((char) 0xf05d),
        OCTI_FILE_DIRECTORY_CREATE((char) 0xf05d),
        OCTI_FILE_ADD((char) 0xf05d),
        OCTI_PLUS((char) 0xf05d),
        OCTI_PRIMITIVE_DOT((char) 0xf052),
        OCTI_PRIMITIVE_SQUARE((char) 0xf053),
        OCTI_PULSE((char) 0xf085),
        OCTI_QUESTION((char) 0xf02c),
        OCTI_QUOTE((char) 0xf063),
        OCTI_RADIO_TOWER((char) 0xf030),
        OCTI_REPO_DELETE((char) 0xf001),
        OCTI_REPO((char) 0xf001),
        OCTI_REPO_CLONE((char) 0xf04c),
        OCTI_REPO_FORCE_PUSH((char) 0xf04a),
        OCTI_GIST_FORK((char) 0xf002),
        OCTI_REPO_FORKED((char) 0xf002),
        OCTI_REPO_PULL((char) 0xf006),
        OCTI_REPO_PUSH((char) 0xf005),
        OCTI_ROCKET((char) 0xf033),
        OCTI_RSS((char) 0xf034),
        OCTI_RUBY((char) 0xf047),
        OCTI_SEARCH_SAVE((char) 0xf02e),
        OCTI_SEARCH((char) 0xf02e),
        OCTI_SERVER((char) 0xf097),
        OCTI_SETTINGS((char) 0xf07c),
        OCTI_SHIELD((char) 0xf0e1),
        OCTI_LOG_IN((char) 0xf036),
        OCTI_SIGN_IN((char) 0xf036),
        OCTI_LOG_OUT((char) 0xf032),
        OCTI_SIGN_OUT((char) 0xf032),
        OCTI_SQUIRREL((char) 0xf0b2),
        OCTI_STAR_ADD((char) 0xf02a),
        OCTI_STAR_DELETE((char) 0xf02a),
        OCTI_STAR((char) 0xf02a),
        OCTI_STOP((char) 0xf08f),
        OCTI_REPO_SYNC((char) 0xf087),
        OCTI_SYNC((char) 0xf087),
        OCTI_TAG_REMOVE((char) 0xf015),
        OCTI_TAG_ADD((char) 0xf015),
        OCTI_TAG((char) 0xf015),
        OCTI_TASKLIST((char) 0xf0e5),
        OCTI_TELESCOPE((char) 0xf088),
        OCTI_TERMINAL((char) 0xf0c8),
        OCTI_TEXT_SIZE((char) 0xf0e3),
        OCTI_THREE_BARS((char) 0xf05e),
        OCTI_THUMBSDOWN((char) 0xf0db),
        OCTI_THUMBSUP((char) 0xf0da),
        OCTI_TOOLS((char) 0xf031),
        OCTI_TRASHCAN((char) 0xf0d0),
        OCTI_TRIANGLE_DOWN((char) 0xf05b),
        OCTI_TRIANGLE_LEFT((char) 0xf044),
        OCTI_TRIANGLE_RIGHT((char) 0xf05a),
        OCTI_TRIANGLE_UP((char) 0xf0aa),
        OCTI_UNFOLD((char) 0xf039),
        OCTI_UNMUTE((char) 0xf0ba),
        OCTI_VERSIONS((char) 0xf064),
        OCTI_WATCH((char) 0xf0e0),
        OCTI_REMOVE_CLOSE((char) 0xf081),
        OCTI_X((char) 0xf081),
        OCTI_ZAP((char) 0x26A1);

        char octiconsCharacter;

        Icon(char character) {
            this.octiconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return octiconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface octiconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (octiconsTypeface == null) {
                setTypeface(new Octicons());
            }
            return octiconsTypeface;
        }

        private static void setTypeface(Octicons octiconsTypeface) {
            Icon.octiconsTypeface = octiconsTypeface;
        }
    }
}
