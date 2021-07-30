package com.rilixtech.octicons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Octicons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Octicons implements ITypeface {
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
     * Octicons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Octicons IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Octicons ITypeface.
     */
    public enum Icon implements IIcon {
        //Octicons
        OCTI_ALERT('\uf02d'),
        OCTI_ARROW_DOWN('\uf03f'),
        OCTI_ARROW_LEFT('\uf040'),
        OCTI_ARROW_RIGHT('\uf03e'),
        OCTI_ARROW_SMALL_DOWN('\uf0a0'),
        OCTI_ARROW_SMALL_LEFT('\uf0a1'),
        OCTI_ARROW_SMALL_RIGHT('\uf071'),
        OCTI_ARROW_SMALL_UP('\uf09f'),
        OCTI_ARROW_UP('\uf03d'),
        OCTI_MICROSCOPE('\uf0dd'),
        OCTI_BEAKER('\uf0dd'),
        OCTI_BELL('\uf0de'),
        OCTI_BOLD('\uf0e2'),
        OCTI_BOOK('\uf007'),
        OCTI_BOOKMARK('\uf07b'),
        OCTI_BRIEFCASE('\uf0d3'),
        OCTI_BROADCAST('\uf048'),
        OCTI_BROWSER('\uf0c5'),
        OCTI_BUG('\uf091'),
        OCTI_CALENDAR('\uf068'),
        OCTI_CHECK('\uf03a'),
        OCTI_CHECKLIST('\uf076'),
        OCTI_CHEVRON_DOWN('\uf0a3'),
        OCTI_CHEVRON_LEFT('\uf0a4'),
        OCTI_CHEVRON_RIGHT('\uf078'),
        OCTI_CHEVRON_UP('\uf0a2'),
        OCTI_CIRCLE_SLASH('\uf084'),
        OCTI_CIRCUIT_BOARD('\uf0d6'),
        OCTI_CLIPPY('\uf035'),
        OCTI_CLOCK('\uf046'),
        OCTI_CLOUD_DOWNLOAD('\uf00b'),
        OCTI_CLOUD_UPLOAD('\uf00c'),
        OCTI_CODE('\uf05f'),
        OCTI_COLOR_MODE('\uf065'),
        OCTI_COMMENTI_ADD('\uf02b'),
        OCTI_COMMENT('\uf02b'),
        OCTI_COMMENTI_DISCUSSION('\uf04f'),
        OCTI_CREDIT_CARD('\uf045'),
        OCTI_DASH('\uf0ca'),
        OCTI_DASHBOARD('\uf07d'),
        OCTI_DATABASE('\uf096'),
        OCTI_CLONE('\uf0dc'),
        OCTI_DESKTOP_DOWNLOAD('\uf0dc'),
        OCTI_DEVICE_CAMERA('\uf056'),
        OCTI_DEVICE_CAMERA_VIDEO('\uf057'),
        OCTI_DEVICE_DESKTOP('\uf27c'),
        OCTI_DEVICE_MOBILE('\uf038'),
        OCTI_DIFF('\uf04d'),
        OCTI_DIFF_ADDED('\uf06b'),
        OCTI_DIFF_IGNORED('\uf099'),
        OCTI_DIFF_MODIFIED('\uf06d'),
        OCTI_DIFF_REMOVED('\uf06c'),
        OCTI_DIFF_RENAMED('\uf06e'),
        OCTI_ELLIPSIS('\uf09a'),
        OCTI_EYE_UNWATCH('\uf04e'),
        OCTI_EYE_WATCH('\uf04e'),
        OCTI_EYE('\uf04e'),
        OCTI_FILE_BINARY('\uf094'),
        OCTI_FILE_CODE('\uf010'),
        OCTI_FILE_DIRECTORY('\uf016'),
        OCTI_FILE_MEDIA('\uf012'),
        OCTI_FILE_PDF('\uf014'),
        OCTI_FILE_SUBMODULE('\uf017'),
        OCTI_FILE_SYMLINK_DIRECTORY('\uf0b1'),
        OCTI_FILE_SYMLINK_FILE('\uf0b0'),
        OCTI_FILE_TEXT('\uf011'),
        OCTI_FILE_ZIP('\uf013'),
        OCTI_FLAME('\uf0d2'),
        OCTI_FOLD('\uf0cc'),
        OCTI_GEAR('\uf02f'),
        OCTI_GIFT('\uf042'),
        OCTI_GIST('\uf00e'),
        OCTI_GIST_SECRET('\uf08c'),
        OCTI_GIT_BRANCH_CREATE('\uf020'),
        OCTI_GIT_BRANCH_DELETE('\uf020'),
        OCTI_GIT_BRANCH('\uf020'),
        OCTI_GIT_COMMIT('\uf01f'),
        OCTI_GIT_COMPARE('\uf0ac'),
        OCTI_GIT_MERGE('\uf023'),
        OCTI_GIT_PULL_REQUEST_ABANDONED('\uf009'),
        OCTI_GIT_PULL_REQUEST('\uf009'),
        OCTI_GLOBE('\uf0b6'),
        OCTI_GRAPH('\uf043'),
        OCTI_HEART('\u2665'),
        OCTI_HISTORY('\uf07e'),
        OCTI_HOME('\uf08d'),
        OCTI_HORIZONTAL_RULE('\uf070'),
        OCTI_HUBOT('\uf09d'),
        OCTI_INBOX('\uf0cf'),
        OCTI_INFO('\uf059'),
        OCTI_ISSUE_CLOSED('\uf028'),
        OCTI_ISSUE_OPENED('\uf026'),
        OCTI_ISSUE_REOPENED('\uf027'),
        OCTI_ITALIC('\uf0e4'),
        OCTI_JERSEY('\uf019'),
        OCTI_KEY('\uf049'),
        OCTI_KEYBOARD('\uf00d'),
        OCTI_LAW('\uf0d8'),
        OCTI_LIGHT_BULB('\uf000'),
        OCTI_LINK('\uf05c'),
        OCTI_LINK_EXTERNAL('\uf07f'),
        OCTI_LIST_ORDERED('\uf062'),
        OCTI_LIST_UNORDERED('\uf061'),
        OCTI_LOCATION('\uf060'),
        OCTI_GIST_PRIVATE('\uf06a'),
        OCTI_MIRROR_PRIVATE('\uf06a'),
        OCTI_GIT_FORK_PRIVATE('\uf06a'),
        OCTI_LOCK('\uf06a'),
        OCTI_LOGO_GITHUB('\uf092'),
        OCTI_MAIL('\uf03b'),
        OCTI_MAIL_READ('\uf03c'),
        OCTI_MAIL_REPLY('\uf051'),
        OCTI_MARK_GITHUB('\uf00a'),
        OCTI_MARKDOWN('\uf0c9'),
        OCTI_MEGAPHONE('\uf077'),
        OCTI_MENTION('\uf0be'),
        OCTI_MILESTONE('\uf075'),
        OCTI_MIRROR_PUBLIC('\uf024'),
        OCTI_MIRROR('\uf024'),
        OCTI_MORTAR_BOARD('\uf0d7'),
        OCTI_MUTE('\uf080'),
        OCTI_NO_NEWLINE('\uf09c'),
        OCTI_OCTOFACE('\uf008'),
        OCTI_ORGANIZATION('\uf037'),
        OCTI_PACKAGE('\uf0c4'),
        OCTI_PAINTCAN('\uf0d1'),
        OCTI_PENCIL('\uf058'),
        OCTI_PERSON_ADD('\uf018'),
        OCTI_PERSON_FOLLOW('\uf018'),
        OCTI_PERSON('\uf018'),
        OCTI_PIN('\uf041'),
        OCTI_PLUG('\uf0d4'),
        OCTI_REPO_CREATE('\uf05d'),
        OCTI_GIST_NEW('\uf05d'),
        OCTI_FILE_DIRECTORY_CREATE('\uf05d'),
        OCTI_FILE_ADD('\uf05d'),
        OCTI_PLUS('\uf05d'),
        OCTI_PRIMITIVE_DOT('\uf052'),
        OCTI_PRIMITIVE_SQUARE('\uf053'),
        OCTI_PULSE('\uf085'),
        OCTI_QUESTION('\uf02c'),
        OCTI_QUOTE('\uf063'),
        OCTI_RADIO_TOWER('\uf030'),
        OCTI_REPO_DELETE('\uf001'),
        OCTI_REPO('\uf001'),
        OCTI_REPO_CLONE('\uf04c'),
        OCTI_REPO_FORCE_PUSH('\uf04a'),
        OCTI_GIST_FORK('\uf002'),
        OCTI_REPO_FORKED('\uf002'),
        OCTI_REPO_PULL('\uf006'),
        OCTI_REPO_PUSH('\uf005'),
        OCTI_ROCKET('\uf033'),
        OCTI_RSS('\uf034'),
        OCTI_RUBY('\uf047'),
        OCTI_SEARCH_SAVE('\uf02e'),
        OCTI_SEARCH('\uf02e'),
        OCTI_SERVER('\uf097'),
        OCTI_SETTINGS('\uf07c'),
        OCTI_SHIELD('\uf0e1'),
        OCTI_LOG_IN('\uf036'),
        OCTI_SIGN_IN('\uf036'),
        OCTI_LOG_OUT('\uf032'),
        OCTI_SIGN_OUT('\uf032'),
        OCTI_SQUIRREL('\uf0b2'),
        OCTI_STAR_ADD('\uf02a'),
        OCTI_STAR_DELETE('\uf02a'),
        OCTI_STAR('\uf02a'),
        OCTI_STOP('\uf08f'),
        OCTI_REPO_SYNC('\uf087'),
        OCTI_SYNC('\uf087'),
        OCTI_TAG_REMOVE('\uf015'),
        OCTI_TAG_ADD('\uf015'),
        OCTI_TAG('\uf015'),
        OCTI_TASKLIST('\uf0e5'),
        OCTI_TELESCOPE('\uf088'),
        OCTI_TERMINAL('\uf0c8'),
        OCTI_TEXT_SIZE('\uf0e3'),
        OCTI_THREE_BARS('\uf05e'),
        OCTI_THUMBSDOWN('\uf0db'),
        OCTI_THUMBSUP('\uf0da'),
        OCTI_TOOLS('\uf031'),
        OCTI_TRASHCAN('\uf0d0'),
        OCTI_TRIANGLE_DOWN('\uf05b'),
        OCTI_TRIANGLE_LEFT('\uf044'),
        OCTI_TRIANGLE_RIGHT('\uf05a'),
        OCTI_TRIANGLE_UP('\uf0aa'),
        OCTI_UNFOLD('\uf039'),
        OCTI_UNMUTE('\uf0ba'),
        OCTI_VERSIONS('\uf064'),
        OCTI_WATCH('\uf0e0'),
        OCTI_REMOVE_CLOSE('\uf081'),
        OCTI_X('\uf081'),
        OCTI_ZAP('\u26A1');

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
        private static ITypeface octiconsTypeface;

        @Override
        public ITypeface getTypeface() {
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