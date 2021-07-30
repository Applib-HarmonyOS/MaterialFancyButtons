package com.rilixtech.picol_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Picol Icon font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Picol implements ITypeface {
    private static final String TTF_FILE = "picol-v1.1.ttf";
    private static final String PICOL_ICON_PREFIX = "PICI";
    public static final String PICOL_ICON_NAME = "Picol Icon";
    public static final String PICOL_ICON_VERSION = "1" + ".1";
    public static final String PICOL_ICON_AUTHOR = "http://picol.org/";
    public static final String PICOL_ICON_URL = "http://picol.org/";
    public static final String PICOL_ICON_DESC = "PICOL stands for PIctorial COmmunication Language and is a project to"
            + " find a standard and reduced sign system for electronic communication.";
    public static final String PICOL_ICON_LICENSE = "Creative Commons-License BY";
    public static final String PICOL_ICON_LICENSE_URL = "http://www.creativecommons.org/licenses/by/3.0/";

    private static Font picolIconTypeface = null;
    private static HashMap<String, Character> picolIconCharMap;

    /**
     * Picol Icon IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Picol Icon IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Picol Icon icon characters in a HashMap.
     *
     * @return HashMap of all Picol Icon icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (picolIconCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.picolIconCharacter);
            }
            setChars(characterHashMap);
        }
        return picolIconCharMap;
    }

    /**
     * Set the Picol Icon Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        picolIconCharMap = characterHashMap;
    }

    /**
     * Return the Picol Icon Mapping Prefix.
     *
     * @return Picol Icon Mapping Prefix, used by all Picol Icon icons.
     */
    @Override public String getMappingPrefix() {
        return PICOL_ICON_PREFIX;
    }

    @Override public String getFontName() {
        return PICOL_ICON_NAME;
    }

    @Override public String getVersion() {
        return PICOL_ICON_VERSION;
    }

    @Override public int getIconCount() {
        return picolIconCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> picolIconKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            picolIconKeyList.add(value.name());
        }
        return picolIconKeyList;
    }

    @Override public String getAuthor() {
        return PICOL_ICON_AUTHOR;
    }

    @Override public String getUrl() {
        return PICOL_ICON_URL;
    }

    @Override public String getDescription() {
        return PICOL_ICON_DESC;
    }

    @Override public String getLicense() {
        return PICOL_ICON_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return PICOL_ICON_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (picolIconTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return picolIconTypeface;
    }

    private static void cacheTypeface(Font font) {
        picolIconTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Picol Icon ITypeface.
     */
    public enum Icon implements IIcon {
        PICI_ACCEPT('\ue800'),
        PICI_ZOOM_OUT('\uea24'),
        PICI_AGENT('\ue802'),
        PICI_API('\ue803'),
        PICI_APPLE('\ue804'),
        PICI_APPLICATION('\ue805'),
        PICI_ARROW_FULL_DOWN('\ue806'),
        PICI_ARROW_FULL_LEFT('\ue807'),
        PICI_ARROW_FULL_LOWERLEFT('\ue808'),
        PICI_ARROW_FULL_LOWERRIGHT('\ue809'),
        PICI_ARROW_FULL_RIGHT('\ue80a'),
        PICI_ARROW_FULL_UP('\ue80b'),
        PICI_ARROW_FULL_UPPERLEFT('\ue80c'),
        PICI_ARROW_FULL_UPPERRIGHT('\ue80d'),
        PICI_ARROW_SANS_DOWN('\ue80e'),
        PICI_ARROW_SANS_LEFT('\ue80f'),
        PICI_ARROW_SANS_LOWERLEFT('\ue810'),
        PICI_ARROW_SANS_LOWERRIGHT('\ue811'),
        PICI_ARROW_SANS_RIGHT('\ue812'),
        PICI_ARROW_SANS_UP('\ue813'),
        PICI_ARROW_SANS_UPPERLEFT('\ue814'),
        PICI_ARROW_SANS_UPPERRIGHT('\ue815'),
        PICI_ATTACHMENT('\ue816'),
        PICI_ATTACHMENT_ADD('\ue817'),
        PICI_ATTACHMENT_DOWN('\ue818'),
        PICI_AVATAR('\ue819'),
        PICI_AVATAR_EDIT('\ue81a'),
        PICI_AVATAR_INFORMATION('\ue81b'),
        PICI_BACKUP('\ue81c'),
        PICI_BACKUP_PAUSE('\ue81d'),
        PICI_BACKUP_RUN('\ue81e'),
        PICI_BACKUP_SETTINGS('\ue81f'),
        PICI_BACKUP_STOP('\ue820'),
        PICI_BADGE_ACCEPT('\ue821'),
        PICI_BADGE_CANCEL('\ue822'),
        PICI_BADGE_DOWN('\ue823'),
        PICI_BADGE_EDIT('\ue824'),
        PICI_BADGE_EJECT('\ue825'),
        PICI_BADGE_INFORMATION('\ue826'),
        PICI_BADGE_MINUS('\ue827'),
        PICI_BADGE_PAUSE('\ue828'),
        PICI_BADGE_PLUS('\ue829'),
        PICI_BADGE_RUN('\ue82a'),
        PICI_BADGE_SECURITY('\ue82b'),
        PICI_BADGE_SETTINGS('\ue82c'),
        PICI_BADGE_STOP('\ue82d'),
        PICI_BADGE_UP('\ue82e'),
        PICI_BASEBALL('\ue82f'),
        PICI_BASKETBALL('\ue830'),
        PICI_BATTERY_1('\ue831'),
        PICI_BATTERY_2('\ue832'),
        PICI_BATTERY_3('\ue833'),
        PICI_BATTERY_4('\ue834'),
        PICI_BATTERY_EMPTY('\ue835'),
        PICI_BATTERY_FULL('\ue836'),
        PICI_BATTERY_PLUGGED('\ue837'),
        PICI_BED('\ue838'),
        PICI_BOOK_AUDIO('\ue839'),
        PICI_BOOK_AUDIO_ADD('\ue83a'),
        PICI_BOOK_AUDIO_EJECT('\ue83b'),
        PICI_BOOK_AUDIO_INFORMATION('\ue83c'),
        PICI_BOOK_AUDIO_PAUSE('\ue83d'),
        PICI_BOOK_AUDIO_REMOVE('\ue83e'),
        PICI_BOOK_AUDIO_RUN('\ue83f'),
        PICI_BOOK_AUDIO_SECURITY('\ue840'),
        PICI_BOOK_AUDIO_SETTINGS('\ue841'),
        PICI_BOOK_AUDIO_STOP('\ue842'),
        PICI_BOOK_IMAGE('\ue843'),
        PICI_BOOK_IMAGE_ADD('\ue844'),
        PICI_BOOK_IMAGE_INFORMATION('\ue845'),
        PICI_BOOK_IMAGE_PAUSE('\ue846'),
        PICI_BOOK_IMAGE_REMOVE('\ue847'),
        PICI_BOOK_IMAGE_RUN('\ue848'),
        PICI_BOOK_IMAGE_SECURITY('\ue849'),
        PICI_BOOK_IMAGE_SETTINGS('\ue84a'),
        PICI_BOOK_IMAGE_STOP('\ue84b'),
        PICI_BOOKMARK('\ue84c'),
        PICI_BOOKMARK_SETTINGS('\ue84d'),
        PICI_BOOK_SANS('\ue84e'),
        PICI_BOOK_SANS_ADD('\ue84f'),
        PICI_BOOK_SANS_DOWN('\ue850'),
        PICI_BOOK_SANS_INFORMATION('\ue851'),
        PICI_BOOK_SANS_REMOVE('\ue852'),
        PICI_BOOK_SANS_RUN('\ue853'),
        PICI_BOOK_SANS_SECURITY('\ue854'),
        PICI_BOOK_SANS_UP('\ue855'),
        PICI_BOOK_TEXT('\ue856'),
        PICI_BOOK_TEXT_ADD('\ue857'),
        PICI_BOOK_TEXT_DOWN('\ue858'),
        PICI_BOOK_TEXT_INFORMATION('\ue859'),
        PICI_BOOK_TEXT_REMOVE('\ue85a'),
        PICI_BOOK_TEXT_RUN('\ue85b'),
        PICI_BOOK_TEXT_SECURITY('\ue85c'),
        PICI_BOOK_TEXT_SETTINGS('\ue85d'),
        PICI_BOOK_TEXT_STOP('\ue85e'),
        PICI_BOOK_TEXT_UP('\ue85f'),
        PICI_BRIGHTNESS_BRIGHTEN('\ue860'),
        PICI_BRIGHTNESS_DARKEN('\ue861'),
        PICI_BROWSER_WINDOW('\ue862'),
        PICI_BROWSER_WINDOW_ADD('\ue863'),
        PICI_BROWSER_WINDOW_CANCEL('\ue864'),
        PICI_BROWSER_WINDOW_REMOVE('\ue865'),
        PICI_BROWSER_WINDOW_SECURITY('\ue866'),
        PICI_BROWSER_WINDOW_SETTINGS('\ue867'),
        PICI_BUY('\ue868'),
        PICI_CALCULATOR('\ue869'),
        PICI_CALENDAR('\ue86a'),
        PICI_CANCEL('\ue86b'),
        PICI_CATEGORY('\ue86c'),
        PICI_CATEGORY_ADD('\ue86d'),
        PICI_CATEGORY_EDIT('\ue86e'),
        PICI_CATEGORY_REMOVE('\ue86f'),
        PICI_CATEGORY_SETTINGS('\ue870'),
        PICI_CD('\ue871'),
        PICI_CD_EJECT('\ue872'),
        PICI_CD_PAUSE('\ue873'),
        PICI_CD_RUN('\ue874'),
        PICI_CD_SECURITY('\ue875'),
        PICI_CD_STOP('\ue876'),
        PICI_CD_WRITE('\ue877'),
        PICI_CHAT('\ue878'),
        PICI_CHAT_PAUSE('\ue879'),
        PICI_CHAT_RUN('\ue87a'),
        PICI_CHAT_SECURITY('\ue87b'),
        PICI_CHAT_SETTINGS('\ue87c'),
        PICI_CHAT_STOP('\ue87d'),
        PICI_CLOCK('\ue87e'),
        PICI_CLOCK_MINI('\ue87f'),
        PICI_CLOUD('\ue880'),
        PICI_CODEC_IMAGE('\ue881'),
        PICI_CODEC_VIDEO('\ue882'),
        PICI_COMBINE('\ue883'),
        PICI_COMMENT('\ue884'),
        PICI_COMMENT_ACCEPT('\ue885'),
        PICI_COMMENT_ADD('\ue886'),
        PICI_COMMENT_CANCEL('\ue887'),
        PICI_COMMENT_EDIT('\ue888'),
        PICI_COMMENT_REMOVE('\ue889'),
        PICI_COMMENT_SETTINGS('\ue88a'),
        PICI_COMPUTER('\ue88b'),
        PICI_COMPUTER_ACCEPT('\ue88c'),
        PICI_COMPUTER_ADD('\ue88d'),
        PICI_COMPUTER_CANCEL('\ue88e'),
        PICI_COMPUTER_REMOVE('\ue88f'),
        PICI_COMPUTER_SETTINGS('\ue890'),
        PICI_CONTROLS_CHAPTER_NEXT('\ue891'),
        PICI_CONTROLS_CHAPTER_PREVIOUS('\ue892'),
        PICI_CONTROLS_EJECT('\ue893'),
        PICI_CONTROLS_FAST_FORWARD('\ue894'),
        PICI_CONTROLS_PAUSE('\ue895'),
        PICI_CONTROLS_PLAY('\ue896'),
        PICI_CONTROLS_PLAY_BACK('\ue897'),
        PICI_CONTROLS_REWIND('\ue898'),
        PICI_CONTROLS_STOP('\ue899'),
        PICI_COOLER('\ue89a'),
        PICI_COPY('\ue89b'),
        PICI_CREDIT_CARD('\ue89c'),
        PICI_CROWN('\ue89d'),
        PICI_CUT('\ue89e'),
        PICI_DATABASE('\ue89f'),
        PICI_DATABASE_ADD('\ue8a0'),
        PICI_DATABASE_EDIT('\ue8a1'),
        PICI_DATABASE_INFORMATION('\ue8a2'),
        PICI_DATABASE_REMOVE('\ue8a3'),
        PICI_DATABASE_RUN('\ue8a4'),
        PICI_DATABASE_SECURITY('\ue8a5'),
        PICI_DATA_PRIVACY('\ue8a6'),
        PICI_DOCUMENT_IMAGE('\ue8a7'),
        PICI_DOCUMENT_IMAGE_ACCEPT('\ue8a8'),
        PICI_DOCUMENT_IMAGE_ADD('\ue8a9'),
        PICI_DOCUMENT_IMAGE_CANCEL('\ue8aa'),
        PICI_DOCUMENT_IMAGE_DOWN('\ue8ab'),
        PICI_DOCUMENT_IMAGE_EDIT('\ue8ac'),
        PICI_DOCUMENT_IMAGE_INFORMATION('\ue8ad'),
        PICI_DOCUMENT_IMAGE_REMOVE('\ue8ae'),
        PICI_DOCUMENT_IMAGE_RUN('\ue8af'),
        PICI_DOCUMENT_IMAGE_SECURITY('\ue8b0'),
        PICI_DOCUMENT_IMAGE_SETTINGS('\ue8b1'),
        PICI_DOCUMENT_IMAGE_UP('\ue8b2'),
        PICI_DOCUMENT_MUSIC('\ue8b3'),
        PICI_DOCUMENT_MUSIC_ACCEPT('\ue8b4'),
        PICI_DOCUMENT_MUSIC_ADD('\ue8b5'),
        PICI_DOCUMENT_MUSIC_CANCEL('\ue8b6'),
        PICI_DOCUMENT_MUSIC_DOWN('\ue8b7'),
        PICI_DOCUMENT_MUSIC_EDIT('\ue8b8'),
        PICI_DOCUMENT_MUSIC_INFORMATION('\ue8b9'),
        PICI_DOCUMENT_MUSIC_REMOVE('\ue8ba'),
        PICI_DOCUMENT_MUSIC_RUN('\ue8bb'),
        PICI_DOCUMENT_MUSIC_SECURITY('\ue8bc'),
        PICI_DOCUMENT_MUSIC_SETTINGS('\ue8bd'),
        PICI_DOCUMENT_MUSIC_UP('\ue8be'),
        PICI_DOCUMENT_SANS('\ue8bf'),
        PICI_DOCUMENT_SANS_ACCEPT('\ue8c0'),
        PICI_DOCUMENT_SANS_ADD('\ue8c1'),
        PICI_DOCUMENT_SANS_CANCEL('\ue8c2'),
        PICI_DOCUMENT_SANS_DOWN('\ue8c3'),
        PICI_DOCUMENT_SANS_EDIT('\ue8c4'),
        PICI_DOCUMENT_SANS_INFORMATION('\ue8c5'),
        PICI_DOCUMENT_SANS_REMOVE('\ue8c6'),
        PICI_DOCUMENT_SANS_RUN('\ue8c7'),
        PICI_DOCUMENT_SANS_SECURITY('\ue8c8'),
        PICI_DOCUMENT_SANS_SETTINGS('\ue8c9'),
        PICI_DOCUMENT_SANS_UP('\ue8ca'),
        PICI_DOCUMENT_TEXT('\ue8cb'),
        PICI_DOCUMENT_TEXT_ACCEPT('\ue8cc'),
        PICI_DOCUMENT_TEXT_ADD('\ue8cd'),
        PICI_DOCUMENT_TEXT_CANCEL('\ue8ce'),
        PICI_DOCUMENT_TEXT_DOWN('\ue8cf'),
        PICI_DOCUMENT_TEXT_EDIT('\ue8d0'),
        PICI_DOCUMENT_TEXT_INFORMATION('\ue8d1'),
        PICI_DOCUMENT_TEXT_REMOVE('\ue8d2'),
        PICI_DOCUMENT_TEXT_RUN('\ue8d3'),
        PICI_DOCUMENT_TEXT_SECURITY('\ue8d4'),
        PICI_DOCUMENT_TEXT_SETTINGS('\ue8d5'),
        PICI_DOCUMENT_TEXT_UP('\ue8d6'),
        PICI_DOCUMENT_VIDEO('\ue8d7'),
        PICI_DOCUMENT_VIDEO_ACCEPT('\ue8d8'),
        PICI_DOCUMENT_VIDEO_ADD('\ue8d9'),
        PICI_DOCUMENT_VIDEO_CANCEL('\ue8da'),
        PICI_DOCUMENT_VIDEO_DOWN('\ue8db'),
        PICI_DOCUMENT_VIDEO_EDIT('\ue8dc'),
        PICI_DOCUMENT_VIDEO_INFORMATION('\ue8dd'),
        PICI_DOCUMENT_VIDEO_REMOVE('\ue8de'),
        PICI_DOCUMENT_VIDEO_RUN('\ue8df'),
        PICI_DOCUMENT_VIDEO_SECURITY('\ue8e0'),
        PICI_DOCUMENT_VIDEO_SETTINGS('\ue8e1'),
        PICI_DOCUMENT_VIDEO_UP('\ue8e2'),
        PICI_DONATE('\ue8e3'),
        PICI_DOWNLOAD('\ue8e4'),
        PICI_DOWNLOAD_ACCEPT('\ue8e5'),
        PICI_DOWNLOAD_CANCEL('\ue8e6'),
        PICI_DOWNLOAD_INFORMATION('\ue8e7'),
        PICI_DOWNLOAD_PAUSE('\ue8e8'),
        PICI_DOWNLOAD_RUN('\ue8e9'),
        PICI_DOWNLOAD_SECURITY('\ue8ea'),
        PICI_DOWNLOAD_SETTINGS('\ue8eb'),
        PICI_DOWNLOAD_STOP('\ue8ec'),
        PICI_DROPBOX('\ue8ed'),
        PICI_EDIT('\ue8ee'),
        PICI_ENTRANCE('\ue8ef'),
        PICI_EQUAL('\ue8f0'),
        PICI_FILEPATH('\ue8f1'),
        PICI_FILTER('\ue8f2'),
        PICI_FILTER_SETTINGS('\ue8f3'),
        PICI_FIREWALL('\ue8f4'),
        PICI_FIREWALL_PAUSE('\ue8f5'),
        PICI_FIREWALL_RUN('\ue8f6'),
        PICI_FIREWALL_SETTINGS('\ue8f7'),
        PICI_FIREWALL_STOP('\ue8f8'),
        PICI_FLAG('\ue8f9'),
        PICI_FLASH('\ue8fa'),
        PICI_FLASH_OFF('\ue8fb'),
        PICI_FLOPPY_DISK('\ue8fc'),
        PICI_FOLDER_DOWNLOADS('\ue8fd'),
        PICI_FOLDER_IMAGE('\ue8fe'),
        PICI_FOLDER_MUSIC('\ue8ff'),
        PICI_FOLDER_SANS('\ue900'),
        PICI_FOLDER_SANS_ACCEPT('\ue901'),
        PICI_FOLDER_SANS_ADD('\ue902'),
        PICI_FOLDER_SANS_CANCEL('\ue903'),
        PICI_FOLDER_SANS_DOWN('\ue904'),
        PICI_FOLDER_SANS_EDIT('\ue905'),
        PICI_FOLDER_SANS_INFORMATION('\ue906'),
        PICI_FOLDER_SANS_REMOVE('\ue907'),
        PICI_FOLDER_SANS_RUN('\ue908'),
        PICI_FOLDER_SANS_SECURITY('\ue909'),
        PICI_FOLDER_SANS_SETTINGS('\ue90a'),
        PICI_FOLDER_SANS_UP('\ue90b'),
        PICI_FOLDER_TEXT('\ue90c'),
        PICI_FOLDER_VIDEO('\ue90d'),
        PICI_FOOTBALL('\ue90e'),
        PICI_FULLSCREEN('\ue90f'),
        PICI_FULLSCREEN_CANCEL('\ue910'),
        PICI_GAME_CONTROLLER('\ue911'),
        PICI_ADRESSBOOK('\ue801'),
        PICI_GOLF('\ue913'),
        PICI_GROUP_FULL('\ue914'),
        PICI_GROUP_FULL_ADD('\ue915'),
        PICI_GROUP_FULL_EDIT('\ue916'),
        PICI_GROUP_FULL_REMOVE('\ue917'),
        PICI_GROUP_FULL_SECURITY('\ue918'),
        PICI_GROUP_HALF('\ue919'),
        PICI_GROUP_HALF_ADD('\ue91a'),
        PICI_GROUP_HALF_EDIT('\ue91b'),
        PICI_GROUP_HALF_REMOVE('\ue91c'),
        PICI_GROUP_HALF_SECURITY('\ue91d'),
        PICI_HARDDISK_SANS('\ue91e'),
        PICI_HARDDISK_SANS_EJECT('\ue91f'),
        PICI_HARDDISK_SANS_SECURITY('\ue920'),
        PICI_HARDDISK_SANS_SETTINGS('\ue921'),
        PICI_HIERARCHY('\ue922'),
        PICI_HOME('\ue923'),
        PICI_IMAGE('\ue924'),
        PICI_IMAGE_ACCEPT('\ue925'),
        PICI_IMAGE_ADD('\ue926'),
        PICI_IMAGE_CANCEL('\ue927'),
        PICI_IMAGE_EDIT('\ue928'),
        PICI_IMAGE_PAUSE('\ue929'),
        PICI_IMAGE_REMOVE('\ue92a'),
        PICI_IMAGE_RUN('\ue92b'),
        PICI_IMAGE_SECURITY('\ue92c'),
        PICI_IMAGE_SETTINGS('\ue92d'),
        PICI_IMPRINT('\ue92e'),
        PICI_INFORMATION('\ue92f'),
        PICI_INTERNET('\ue930'),
        PICI_KEYBOARD('\ue931'),
        PICI_LABEL('\ue932'),
        PICI_LABEL_ADD('\ue933'),
        PICI_LABEL_EDIT('\ue934'),
        PICI_LABEL_REMOVE('\ue935'),
        PICI_LABEL_SECURITY('\ue936'),
        PICI_LEAF('\ue937'),
        PICI_LIGHT('\ue938'),
        PICI_LIGHT_OFF('\ue939'),
        PICI_LINK('\ue93a'),
        PICI_LINK_ADD('\ue93b'),
        PICI_LINK_EDIT('\ue93c'),
        PICI_LINK_REMOVE('\ue93d'),
        PICI_LIST('\ue93e'),
        PICI_LIST_NUMBERED('\ue93f'),
        PICI_LOGIN('\ue940'),
        PICI_LOGOUT('\ue941'),
        PICI_MAIL('\ue942'),
        PICI_MAIL_ACCEPT('\ue943'),
        PICI_MAIL_ADD('\ue944'),
        PICI_MAILBOX('\ue945'),
        PICI_MAILBOX_DOWN('\ue946'),
        PICI_MAILBOX_EJECT('\ue947'),
        PICI_MAILBOX_INCOMING('\ue948'),
        PICI_MAILBOX_OUTGOING('\ue949'),
        PICI_MAILBOX_SETTINGS('\ue94a'),
        PICI_MAIL_CANCEL('\ue94b'),
        PICI_MAIL_EDIT('\ue94c'),
        PICI_MAIL_FWD('\ue94d'),
        PICI_MAIL_REMOVE('\ue94e'),
        PICI_MAIL_RUN('\ue94f'),
        PICI_MAIL_SECURITY('\ue950'),
        PICI_MAINFRAME('\ue951'),
        PICI_MASHUP('\ue952'),
        PICI_MOBILE_PHONE('\ue953'),
        PICI_MOVE('\ue954'),
        PICI_MUSIC('\ue955'),
        PICI_MUSIC_ACCEPT('\ue956'),
        PICI_MUSIC_ADD('\ue957'),
        PICI_MUSIC_CANCEL('\ue958'),
        PICI_MUSIC_EDIT('\ue959'),
        PICI_MUSIC_EJECT('\ue95a'),
        PICI_MUSIC_INFORMATION('\ue95b'),
        PICI_MUSIC_PAUSE('\ue95c'),
        PICI_MUSIC_REMOVE('\ue95d'),
        PICI_MUSIC_RUN('\ue95e'),
        PICI_MUSIC_SECURITY('\ue95f'),
        PICI_MUSIC_SETTINGS('\ue960'),
        PICI_MUSIC_STOP('\ue961'),
        PICI_NETWORK_INTRANET('\ue962'),
        PICI_NETWORK_PROTOCOL('\ue963'),
        PICI_NETWORK_SANS('\ue964'),
        PICI_NETWORK_SANS_ADD('\ue965'),
        PICI_NETWORK_SANS_EDIT('\ue966'),
        PICI_NETWORK_SANS_REMOVE('\ue967'),
        PICI_NETWORK_SANS_SECURITY('\ue968'),
        PICI_NETWORK_WIRELESS('\ue969'),
        PICI_NETWORK_WIRELESS_ADD('\ue96a'),
        PICI_NETWORK_WIRELESS_EDIT('\ue96b'),
        PICI_NETWORK_WIRELESS_SECURITY('\ue96c'),
        PICI_NEWS('\ue96d'),
        PICI_NOTES('\ue96e'),
        PICI_NOTES_ACCEPT('\ue96f'),
        PICI_NOTES_ADD('\ue970'),
        PICI_NOTES_CANCEL('\ue971'),
        PICI_NOTES_DOWN('\ue972'),
        PICI_NOTES_EDIT('\ue973'),
        PICI_NOTES_REMOVE('\ue974'),
        PICI_NOTES_SETTINGS('\ue975'),
        PICI_NOTES_UP('\ue976'),
        PICI_ONTOLOGY('\ue977'),
        PICI_OWL_DL('\ue978'),
        PICI_OWL_DL_DOCUMENT('\ue979'),
        PICI_OWL_FULL('\ue97a'),
        PICI_OWL_FULL_DOCUMENT('\ue97b'),
        PICI_OWL_LITE('\ue97c'),
        PICI_OWL_LITE_DOCUMENT('\ue97d'),
        PICI_PARAGRAPH('\ue97e'),
        PICI_PASTE('\ue97f'),
        PICI_PATH('\ue980'),
        PICI_PDA('\ue981'),
        PICI_PEAR('\ue982'),
        PICI_PHONE_HOME('\ue983'),
        PICI_PHONE_OFF('\ue984'),
        PICI_PHONE_ON('\ue985'),
        PICI_PIN('\ue986'),
        PICI_PIN_FILLED('\ue987'),
        PICI_PLUS('\ue988'),
        PICI_POINT_OF_INTEREST('\ue989'),
        PICI_PRINTER('\ue98a'),
        PICI_PRINTER_ADD('\ue98b'),
        PICI_PRINTER_CANCEL('\ue98c'),
        PICI_PRINTER_INFORMATION('\ue98d'),
        PICI_PRINTER_PAUSE('\ue98e'),
        PICI_PRINTER_REMOVE('\ue98f'),
        PICI_PRINTER_RUN('\ue990'),
        PICI_PRINTER_SETTINGS('\ue991'),
        PICI_PRINTER_STOP('\ue992'),
        PICI_QUESTIONMARK('\ue993'),
        PICI_RDF('\ue994'),
        PICI_RDF_DOCUMENT('\ue995'),
        PICI_RECENT_CHANGES('\ue996'),
        PICI_REFRESH('\ue997'),
        PICI_RELEVANCE('\ue998'),
        PICI_REMIX('\ue999'),
        PICI_ROUTE('\ue99a'),
        PICI_SATELLITE('\ue99b'),
        PICI_SATELLITE_GROUND('\ue99c'),
        PICI_SCREEN_4TO3('\ue99d'),
        PICI_SCREEN_16TO9('\ue99e'),
        PICI_SCRIPT('\ue99f'),
        PICI_SEARCH('\ue9a0'),
        PICI_SECURITY_CLOSED('\ue9a1'),
        PICI_SECURITY_OPEN('\ue9a2'),
        PICI_SEMANTIC_WEB('\ue9a3'),
        PICI_SERVER('\ue9a4'),
        PICI_SERVER_ACCEPT('\ue9a5'),
        PICI_SERVER_ADD('\ue9a6'),
        PICI_SERVER_CANCEL('\ue9a7'),
        PICI_SERVER_EDIT('\ue9a8'),
        PICI_SERVER_EJECT('\ue9a9'),
        PICI_SERVER_INFORMATION('\ue9aa'),
        PICI_SERVER_REMOVE('\ue9ab'),
        PICI_SERVER_RUN('\ue9ac'),
        PICI_SERVER_SECURITY('\ue9ad'),
        PICI_SERVER_SETTINGS('\ue9ae'),
        PICI_SERVER_STOP('\ue9af'),
        PICI_SETTINGS('\ue9b0'),
        PICI_SHOPPING_CART('\ue9b1'),
        PICI_SITEMAP('\ue9b2'),
        PICI_SIZE_BOTH('\ue9b3'),
        PICI_SIZE_BOTH_ACCEPT('\ue9b4'),
        PICI_SIZE_BOTH_ADD('\ue9b5'),
        PICI_SIZE_BOTH_CANCEL('\ue9b6'),
        PICI_SIZE_BOTH_EDIT('\ue9b7'),
        PICI_SIZE_BOTH_REMOVE('\ue9b8'),
        PICI_SIZE_BOTH_SECURITY('\ue9b9'),
        PICI_SIZE_BOTH_SETTINGS('\ue9ba'),
        PICI_SIZE_HEIGHT('\ue9bb'),
        PICI_SIZE_HEIGHT_ACCEPT('\ue9bc'),
        PICI_SIZE_HEIGHT_ADD('\ue9bd'),
        PICI_SIZE_HEIGHT_CANCEL('\ue9be'),
        PICI_SIZE_HEIGHT_EDIT('\ue9bf'),
        PICI_SIZE_HEIGHT_REMOVE('\ue9c0'),
        PICI_SIZE_HEIGHT_SECURITY('\ue9c1'),
        PICI_SIZE_HEIGHT_SETTINGS('\ue9c2'),
        PICI_SIZE_WIDTH('\ue9c3'),
        PICI_SIZE_WIDTH_ACCEPT('\ue9c4'),
        PICI_SIZE_WIDTH_ADD('\ue9c5'),
        PICI_SIZE_WIDTH_CANCEL('\ue9c6'),
        PICI_SIZE_WIDTH_EDIT('\ue9c7'),
        PICI_SIZE_WIDTH_REMOVE('\ue9c8'),
        PICI_SIZE_WIDTH_SECURITY('\ue9c9'),
        PICI_SIZE_WIDTH_SETTINGS('\ue9ca'),
        PICI_SOCCER('\ue9cb'),
        PICI_SOCIAL_NETWORK('\ue9cc'),
        PICI_SOURCE_CODE('\ue9cd'),
        PICI_SPEAKER_LOUDER('\ue9ce'),
        PICI_SPEAKER_OFF('\ue9cf'),
        PICI_SPEAKER_SILENT('\ue9d0'),
        PICI_STAR('\ue9d1'),
        PICI_STAR_OUTLINE('\ue9d2'),
        PICI_STATISTICS('\ue9d3'),
        PICI_SYNCHRONIZE('\ue9d4'),
        PICI_TAB('\ue9d5'),
        PICI_TAB_ADD('\ue9d6'),
        PICI_TAB_CANCEL('\ue9d7'),
        PICI_TABLET('\ue9d8'),
        PICI_TARGET('\ue9d9'),
        PICI_TERMINAL_COMPUTER('\ue9da'),
        PICI_TEXT('\ue9db'),
        PICI_TEXT_ALIGN_CENTER('\ue9dc'),
        PICI_TEXT_ALIGN_FULL('\ue9dd'),
        PICI_TEXT_ALIGN_LEFT('\ue9de'),
        PICI_TEXT_ALIGN_RIGHT('\ue9df'),
        PICI_TEXT_BOLD('\ue9e0'),
        PICI_TEXT_ITALIC('\ue9e1'),
        PICI_TEXT_STRIKETHROUGH('\ue9e2'),
        PICI_TRANSPORTATION_BUS('\ue9e3'),
        PICI_TRANSPORTATION_CAR('\ue9e4'),
        PICI_TRANSPORTATION_PLANE('\ue9e5'),
        PICI_TRANSPORTATION_SHIP('\ue9e6'),
        PICI_TRANSPORTATION_TRAIN('\ue9e7'),
        PICI_TRANSPORTATION_TRUCK('\ue9e8'),
        PICI_TRASH('\ue9e9'),
        PICI_TRASH_FULL('\ue9ea'),
        PICI_TREE('\ue9eb'),
        PICI_UPLOAD('\ue9ec'),
        PICI_UPLOAD_ACCEPT('\ue9ed'),
        PICI_UPLOAD_CANCEL('\ue9ee'),
        PICI_UPLOAD_PAUSE('\ue9ef'),
        PICI_UPLOAD_RUN('\ue9f0'),
        PICI_UPLOAD_SECURITY('\ue9f1'),
        PICI_UPLOAD_SETTINGS('\ue9f2'),
        PICI_UPLOAD_STOP('\ue9f3'),
        PICI_USER_CLOSE('\ue9f4'),
        PICI_USER_CLOSE_ADD('\ue9f5'),
        PICI_USER_CLOSE_EDIT('\ue9f6'),
        PICI_USER_CLOSE_INFORMATION('\ue9f7'),
        PICI_USER_CLOSE_REMOVE('\ue9f8'),
        PICI_USER_CLOSE_SECURITY('\ue9f9'),
        PICI_USER_CLOSE_SETTINGS('\ue9fa'),
        PICI_USER_FULL('\ue9fb'),
        PICI_USER_FULL_ADD('\ue9fc'),
        PICI_USER_FULL_EDIT('\ue9fd'),
        PICI_USER_FULL_INFORMATION('\ue9fe'),
        PICI_USER_FULL_REMOVE('\ue9ff'),
        PICI_USER_FULL_SECURITY('\uea00'),
        PICI_USER_FULL_SETTINGS('\uea01'),
        PICI_USER_HALF('\uea02'),
        PICI_USER_HALF_ADD('\uea03'),
        PICI_USER_HALF_EDIT('\uea04'),
        PICI_USER_HALF_INFORMATION('\uea05'),
        PICI_USER_HALF_REMOVE('\uea06'),
        PICI_USER_HALF_SECURITY('\uea07'),
        PICI_USER_HALF_SETTINGS('\uea08'),
        PICI_USER_PROFILE('\uea09'),
        PICI_USER_PROFILE_ADD('\uea0a'),
        PICI_USER_PROFILE_EDIT('\uea0b'),
        PICI_VIDEO('\uea0c'),
        PICI_VIDEO_ACCEPT('\uea0d'),
        PICI_VIDEO_ADD('\uea0e'),
        PICI_VIDEO_CANCEL('\uea0f'),
        PICI_VIDEO_DOWN('\uea10'),
        PICI_VIDEO_EDIT('\uea11'),
        PICI_VIDEO_INFORMATION('\uea12'),
        PICI_VIDEO_PAUSE('\uea13'),
        PICI_VIDEO_REMOVE('\uea14'),
        PICI_VIDEO_RUN('\uea15'),
        PICI_VIDEO_SECURITY('\uea16'),
        PICI_VIDEO_SETTINGS('\uea17'),
        PICI_VIDEO_STOP('\uea18'),
        PICI_VIDEO_UP('\uea19'),
        PICI_VIEW('\uea1a'),
        PICI_VIEWER_IMAGE('\uea1b'),
        PICI_VIEWER_TEXT('\uea1c'),
        PICI_VIEWER_VIDEO('\uea1d'),
        PICI_VUVUZELA('\uea1e'),
        PICI_WEBSITE('\uea1f'),
        PICI_WEIGHT('\uea20'),
        PICI_XML('\uea21'),
        PICI_XML_DOCUMENT('\uea22'),
        PICI_ZOOM_IN('\uea23'),
        PICI_GLOBE('\ue912');

        char picolIconCharacter;

        Icon(char character) {
            this.picolIconCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return picolIconCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface picolIconTypeface;

        @Override
        public ITypeface getTypeface() {
            if (picolIconTypeface == null) {
                setTypeface(new Picol());
            }
            return picolIconTypeface;
        }

        private static void setTypeface(Picol picolIconTypeface) {
            Icon.picolIconTypeface = picolIconTypeface;
        }
    }
}