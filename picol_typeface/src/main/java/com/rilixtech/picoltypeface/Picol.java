package com.rilixtech.picoltypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Picol Icon font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Picol implements MfbTypeface {
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
     * Picol Icon MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Picol Icon MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Picol Icon MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        PICI_ACCEPT((char) 0xe800),
        PICI_ZOOM_OUT((char) 0xea24),
        PICI_AGENT((char) 0xe802),
        PICI_API((char) 0xe803),
        PICI_APPLE((char) 0xe804),
        PICI_APPLICATION((char) 0xe805),
        PICI_ARROW_FULL_DOWN((char) 0xe806),
        PICI_ARROW_FULL_LEFT((char) 0xe807),
        PICI_ARROW_FULL_LOWERLEFT((char) 0xe808),
        PICI_ARROW_FULL_LOWERRIGHT((char) 0xe809),
        PICI_ARROW_FULL_RIGHT((char) 0xe80a),
        PICI_ARROW_FULL_UP((char) 0xe80b),
        PICI_ARROW_FULL_UPPERLEFT((char) 0xe80c),
        PICI_ARROW_FULL_UPPERRIGHT((char) 0xe80d),
        PICI_ARROW_SANS_DOWN((char) 0xe80e),
        PICI_ARROW_SANS_LEFT((char) 0xe80f),
        PICI_ARROW_SANS_LOWERLEFT((char) 0xe810),
        PICI_ARROW_SANS_LOWERRIGHT((char) 0xe811),
        PICI_ARROW_SANS_RIGHT((char) 0xe812),
        PICI_ARROW_SANS_UP((char) 0xe813),
        PICI_ARROW_SANS_UPPERLEFT((char) 0xe814),
        PICI_ARROW_SANS_UPPERRIGHT((char) 0xe815),
        PICI_ATTACHMENT((char) 0xe816),
        PICI_ATTACHMENT_ADD((char) 0xe817),
        PICI_ATTACHMENT_DOWN((char) 0xe818),
        PICI_AVATAR((char) 0xe819),
        PICI_AVATAR_EDIT((char) 0xe81a),
        PICI_AVATAR_INFORMATION((char) 0xe81b),
        PICI_BACKUP((char) 0xe81c),
        PICI_BACKUP_PAUSE((char) 0xe81d),
        PICI_BACKUP_RUN((char) 0xe81e),
        PICI_BACKUP_SETTINGS((char) 0xe81f),
        PICI_BACKUP_STOP((char) 0xe820),
        PICI_BADGE_ACCEPT((char) 0xe821),
        PICI_BADGE_CANCEL((char) 0xe822),
        PICI_BADGE_DOWN((char) 0xe823),
        PICI_BADGE_EDIT((char) 0xe824),
        PICI_BADGE_EJECT((char) 0xe825),
        PICI_BADGE_INFORMATION((char) 0xe826),
        PICI_BADGE_MINUS((char) 0xe827),
        PICI_BADGE_PAUSE((char) 0xe828),
        PICI_BADGE_PLUS((char) 0xe829),
        PICI_BADGE_RUN((char) 0xe82a),
        PICI_BADGE_SECURITY((char) 0xe82b),
        PICI_BADGE_SETTINGS((char) 0xe82c),
        PICI_BADGE_STOP((char) 0xe82d),
        PICI_BADGE_UP((char) 0xe82e),
        PICI_BASEBALL((char) 0xe82f),
        PICI_BASKETBALL((char) 0xe830),
        PICI_BATTERY_1((char) 0xe831),
        PICI_BATTERY_2((char) 0xe832),
        PICI_BATTERY_3((char) 0xe833),
        PICI_BATTERY_4((char) 0xe834),
        PICI_BATTERY_EMPTY((char) 0xe835),
        PICI_BATTERY_FULL((char) 0xe836),
        PICI_BATTERY_PLUGGED((char) 0xe837),
        PICI_BED((char) 0xe838),
        PICI_BOOK_AUDIO((char) 0xe839),
        PICI_BOOK_AUDIO_ADD((char) 0xe83a),
        PICI_BOOK_AUDIO_EJECT((char) 0xe83b),
        PICI_BOOK_AUDIO_INFORMATION((char) 0xe83c),
        PICI_BOOK_AUDIO_PAUSE((char) 0xe83d),
        PICI_BOOK_AUDIO_REMOVE((char) 0xe83e),
        PICI_BOOK_AUDIO_RUN((char) 0xe83f),
        PICI_BOOK_AUDIO_SECURITY((char) 0xe840),
        PICI_BOOK_AUDIO_SETTINGS((char) 0xe841),
        PICI_BOOK_AUDIO_STOP((char) 0xe842),
        PICI_BOOK_IMAGE((char) 0xe843),
        PICI_BOOK_IMAGE_ADD((char) 0xe844),
        PICI_BOOK_IMAGE_INFORMATION((char) 0xe845),
        PICI_BOOK_IMAGE_PAUSE((char) 0xe846),
        PICI_BOOK_IMAGE_REMOVE((char) 0xe847),
        PICI_BOOK_IMAGE_RUN((char) 0xe848),
        PICI_BOOK_IMAGE_SECURITY((char) 0xe849),
        PICI_BOOK_IMAGE_SETTINGS((char) 0xe84a),
        PICI_BOOK_IMAGE_STOP((char) 0xe84b),
        PICI_BOOKMARK((char) 0xe84c),
        PICI_BOOKMARK_SETTINGS((char) 0xe84d),
        PICI_BOOK_SANS((char) 0xe84e),
        PICI_BOOK_SANS_ADD((char) 0xe84f),
        PICI_BOOK_SANS_DOWN((char) 0xe850),
        PICI_BOOK_SANS_INFORMATION((char) 0xe851),
        PICI_BOOK_SANS_REMOVE((char) 0xe852),
        PICI_BOOK_SANS_RUN((char) 0xe853),
        PICI_BOOK_SANS_SECURITY((char) 0xe854),
        PICI_BOOK_SANS_UP((char) 0xe855),
        PICI_BOOK_TEXT((char) 0xe856),
        PICI_BOOK_TEXT_ADD((char) 0xe857),
        PICI_BOOK_TEXT_DOWN((char) 0xe858),
        PICI_BOOK_TEXT_INFORMATION((char) 0xe859),
        PICI_BOOK_TEXT_REMOVE((char) 0xe85a),
        PICI_BOOK_TEXT_RUN((char) 0xe85b),
        PICI_BOOK_TEXT_SECURITY((char) 0xe85c),
        PICI_BOOK_TEXT_SETTINGS((char) 0xe85d),
        PICI_BOOK_TEXT_STOP((char) 0xe85e),
        PICI_BOOK_TEXT_UP((char) 0xe85f),
        PICI_BRIGHTNESS_BRIGHTEN((char) 0xe860),
        PICI_BRIGHTNESS_DARKEN((char) 0xe861),
        PICI_BROWSER_WINDOW((char) 0xe862),
        PICI_BROWSER_WINDOW_ADD((char) 0xe863),
        PICI_BROWSER_WINDOW_CANCEL((char) 0xe864),
        PICI_BROWSER_WINDOW_REMOVE((char) 0xe865),
        PICI_BROWSER_WINDOW_SECURITY((char) 0xe866),
        PICI_BROWSER_WINDOW_SETTINGS((char) 0xe867),
        PICI_BUY((char) 0xe868),
        PICI_CALCULATOR((char) 0xe869),
        PICI_CALENDAR((char) 0xe86a),
        PICI_CANCEL((char) 0xe86b),
        PICI_CATEGORY((char) 0xe86c),
        PICI_CATEGORY_ADD((char) 0xe86d),
        PICI_CATEGORY_EDIT((char) 0xe86e),
        PICI_CATEGORY_REMOVE((char) 0xe86f),
        PICI_CATEGORY_SETTINGS((char) 0xe870),
        PICI_CD((char) 0xe871),
        PICI_CD_EJECT((char) 0xe872),
        PICI_CD_PAUSE((char) 0xe873),
        PICI_CD_RUN((char) 0xe874),
        PICI_CD_SECURITY((char) 0xe875),
        PICI_CD_STOP((char) 0xe876),
        PICI_CD_WRITE((char) 0xe877),
        PICI_CHAT((char) 0xe878),
        PICI_CHAT_PAUSE((char) 0xe879),
        PICI_CHAT_RUN((char) 0xe87a),
        PICI_CHAT_SECURITY((char) 0xe87b),
        PICI_CHAT_SETTINGS((char) 0xe87c),
        PICI_CHAT_STOP((char) 0xe87d),
        PICI_CLOCK((char) 0xe87e),
        PICI_CLOCK_MINI((char) 0xe87f),
        PICI_CLOUD((char) 0xe880),
        PICI_CODEC_IMAGE((char) 0xe881),
        PICI_CODEC_VIDEO((char) 0xe882),
        PICI_COMBINE((char) 0xe883),
        PICI_COMMENT((char) 0xe884),
        PICI_COMMENT_ACCEPT((char) 0xe885),
        PICI_COMMENT_ADD((char) 0xe886),
        PICI_COMMENT_CANCEL((char) 0xe887),
        PICI_COMMENT_EDIT((char) 0xe888),
        PICI_COMMENT_REMOVE((char) 0xe889),
        PICI_COMMENT_SETTINGS((char) 0xe88a),
        PICI_COMPUTER((char) 0xe88b),
        PICI_COMPUTER_ACCEPT((char) 0xe88c),
        PICI_COMPUTER_ADD((char) 0xe88d),
        PICI_COMPUTER_CANCEL((char) 0xe88e),
        PICI_COMPUTER_REMOVE((char) 0xe88f),
        PICI_COMPUTER_SETTINGS((char) 0xe890),
        PICI_CONTROLS_CHAPTER_NEXT((char) 0xe891),
        PICI_CONTROLS_CHAPTER_PREVIOUS((char) 0xe892),
        PICI_CONTROLS_EJECT((char) 0xe893),
        PICI_CONTROLS_FAST_FORWARD((char) 0xe894),
        PICI_CONTROLS_PAUSE((char) 0xe895),
        PICI_CONTROLS_PLAY((char) 0xe896),
        PICI_CONTROLS_PLAY_BACK((char) 0xe897),
        PICI_CONTROLS_REWIND((char) 0xe898),
        PICI_CONTROLS_STOP((char) 0xe899),
        PICI_COOLER((char) 0xe89a),
        PICI_COPY((char) 0xe89b),
        PICI_CREDIT_CARD((char) 0xe89c),
        PICI_CROWN((char) 0xe89d),
        PICI_CUT((char) 0xe89e),
        PICI_DATABASE((char) 0xe89f),
        PICI_DATABASE_ADD((char) 0xe8a0),
        PICI_DATABASE_EDIT((char) 0xe8a1),
        PICI_DATABASE_INFORMATION((char) 0xe8a2),
        PICI_DATABASE_REMOVE((char) 0xe8a3),
        PICI_DATABASE_RUN((char) 0xe8a4),
        PICI_DATABASE_SECURITY((char) 0xe8a5),
        PICI_DATA_PRIVACY((char) 0xe8a6),
        PICI_DOCUMENT_IMAGE((char) 0xe8a7),
        PICI_DOCUMENT_IMAGE_ACCEPT((char) 0xe8a8),
        PICI_DOCUMENT_IMAGE_ADD((char) 0xe8a9),
        PICI_DOCUMENT_IMAGE_CANCEL((char) 0xe8aa),
        PICI_DOCUMENT_IMAGE_DOWN((char) 0xe8ab),
        PICI_DOCUMENT_IMAGE_EDIT((char) 0xe8ac),
        PICI_DOCUMENT_IMAGE_INFORMATION((char) 0xe8ad),
        PICI_DOCUMENT_IMAGE_REMOVE((char) 0xe8ae),
        PICI_DOCUMENT_IMAGE_RUN((char) 0xe8af),
        PICI_DOCUMENT_IMAGE_SECURITY((char) 0xe8b0),
        PICI_DOCUMENT_IMAGE_SETTINGS((char) 0xe8b1),
        PICI_DOCUMENT_IMAGE_UP((char) 0xe8b2),
        PICI_DOCUMENT_MUSIC((char) 0xe8b3),
        PICI_DOCUMENT_MUSIC_ACCEPT((char) 0xe8b4),
        PICI_DOCUMENT_MUSIC_ADD((char) 0xe8b5),
        PICI_DOCUMENT_MUSIC_CANCEL((char) 0xe8b6),
        PICI_DOCUMENT_MUSIC_DOWN((char) 0xe8b7),
        PICI_DOCUMENT_MUSIC_EDIT((char) 0xe8b8),
        PICI_DOCUMENT_MUSIC_INFORMATION((char) 0xe8b9),
        PICI_DOCUMENT_MUSIC_REMOVE((char) 0xe8ba),
        PICI_DOCUMENT_MUSIC_RUN((char) 0xe8bb),
        PICI_DOCUMENT_MUSIC_SECURITY((char) 0xe8bc),
        PICI_DOCUMENT_MUSIC_SETTINGS((char) 0xe8bd),
        PICI_DOCUMENT_MUSIC_UP((char) 0xe8be),
        PICI_DOCUMENT_SANS((char) 0xe8bf),
        PICI_DOCUMENT_SANS_ACCEPT((char) 0xe8c0),
        PICI_DOCUMENT_SANS_ADD((char) 0xe8c1),
        PICI_DOCUMENT_SANS_CANCEL((char) 0xe8c2),
        PICI_DOCUMENT_SANS_DOWN((char) 0xe8c3),
        PICI_DOCUMENT_SANS_EDIT((char) 0xe8c4),
        PICI_DOCUMENT_SANS_INFORMATION((char) 0xe8c5),
        PICI_DOCUMENT_SANS_REMOVE((char) 0xe8c6),
        PICI_DOCUMENT_SANS_RUN((char) 0xe8c7),
        PICI_DOCUMENT_SANS_SECURITY((char) 0xe8c8),
        PICI_DOCUMENT_SANS_SETTINGS((char) 0xe8c9),
        PICI_DOCUMENT_SANS_UP((char) 0xe8ca),
        PICI_DOCUMENT_TEXT((char) 0xe8cb),
        PICI_DOCUMENT_TEXT_ACCEPT((char) 0xe8cc),
        PICI_DOCUMENT_TEXT_ADD((char) 0xe8cd),
        PICI_DOCUMENT_TEXT_CANCEL((char) 0xe8ce),
        PICI_DOCUMENT_TEXT_DOWN((char) 0xe8cf),
        PICI_DOCUMENT_TEXT_EDIT((char) 0xe8d0),
        PICI_DOCUMENT_TEXT_INFORMATION((char) 0xe8d1),
        PICI_DOCUMENT_TEXT_REMOVE((char) 0xe8d2),
        PICI_DOCUMENT_TEXT_RUN((char) 0xe8d3),
        PICI_DOCUMENT_TEXT_SECURITY((char) 0xe8d4),
        PICI_DOCUMENT_TEXT_SETTINGS((char) 0xe8d5),
        PICI_DOCUMENT_TEXT_UP((char) 0xe8d6),
        PICI_DOCUMENT_VIDEO((char) 0xe8d7),
        PICI_DOCUMENT_VIDEO_ACCEPT((char) 0xe8d8),
        PICI_DOCUMENT_VIDEO_ADD((char) 0xe8d9),
        PICI_DOCUMENT_VIDEO_CANCEL((char) 0xe8da),
        PICI_DOCUMENT_VIDEO_DOWN((char) 0xe8db),
        PICI_DOCUMENT_VIDEO_EDIT((char) 0xe8dc),
        PICI_DOCUMENT_VIDEO_INFORMATION((char) 0xe8dd),
        PICI_DOCUMENT_VIDEO_REMOVE((char) 0xe8de),
        PICI_DOCUMENT_VIDEO_RUN((char) 0xe8df),
        PICI_DOCUMENT_VIDEO_SECURITY((char) 0xe8e0),
        PICI_DOCUMENT_VIDEO_SETTINGS((char) 0xe8e1),
        PICI_DOCUMENT_VIDEO_UP((char) 0xe8e2),
        PICI_DONATE((char) 0xe8e3),
        PICI_DOWNLOAD((char) 0xe8e4),
        PICI_DOWNLOAD_ACCEPT((char) 0xe8e5),
        PICI_DOWNLOAD_CANCEL((char) 0xe8e6),
        PICI_DOWNLOAD_INFORMATION((char) 0xe8e7),
        PICI_DOWNLOAD_PAUSE((char) 0xe8e8),
        PICI_DOWNLOAD_RUN((char) 0xe8e9),
        PICI_DOWNLOAD_SECURITY((char) 0xe8ea),
        PICI_DOWNLOAD_SETTINGS((char) 0xe8eb),
        PICI_DOWNLOAD_STOP((char) 0xe8ec),
        PICI_DROPBOX((char) 0xe8ed),
        PICI_EDIT((char) 0xe8ee),
        PICI_ENTRANCE((char) 0xe8ef),
        PICI_EQUAL((char) 0xe8f0),
        PICI_FILEPATH((char) 0xe8f1),
        PICI_FILTER((char) 0xe8f2),
        PICI_FILTER_SETTINGS((char) 0xe8f3),
        PICI_FIREWALL((char) 0xe8f4),
        PICI_FIREWALL_PAUSE((char) 0xe8f5),
        PICI_FIREWALL_RUN((char) 0xe8f6),
        PICI_FIREWALL_SETTINGS((char) 0xe8f7),
        PICI_FIREWALL_STOP((char) 0xe8f8),
        PICI_FLAG((char) 0xe8f9),
        PICI_FLASH((char) 0xe8fa),
        PICI_FLASH_OFF((char) 0xe8fb),
        PICI_FLOPPY_DISK((char) 0xe8fc),
        PICI_FOLDER_DOWNLOADS((char) 0xe8fd),
        PICI_FOLDER_IMAGE((char) 0xe8fe),
        PICI_FOLDER_MUSIC((char) 0xe8ff),
        PICI_FOLDER_SANS((char) 0xe900),
        PICI_FOLDER_SANS_ACCEPT((char) 0xe901),
        PICI_FOLDER_SANS_ADD((char) 0xe902),
        PICI_FOLDER_SANS_CANCEL((char) 0xe903),
        PICI_FOLDER_SANS_DOWN((char) 0xe904),
        PICI_FOLDER_SANS_EDIT((char) 0xe905),
        PICI_FOLDER_SANS_INFORMATION((char) 0xe906),
        PICI_FOLDER_SANS_REMOVE((char) 0xe907),
        PICI_FOLDER_SANS_RUN((char) 0xe908),
        PICI_FOLDER_SANS_SECURITY((char) 0xe909),
        PICI_FOLDER_SANS_SETTINGS((char) 0xe90a),
        PICI_FOLDER_SANS_UP((char) 0xe90b),
        PICI_FOLDER_TEXT((char) 0xe90c),
        PICI_FOLDER_VIDEO((char) 0xe90d),
        PICI_FOOTBALL((char) 0xe90e),
        PICI_FULLSCREEN((char) 0xe90f),
        PICI_FULLSCREEN_CANCEL((char) 0xe910),
        PICI_GAME_CONTROLLER((char) 0xe911),
        PICI_ADRESSBOOK((char) 0xe801),
        PICI_GOLF((char) 0xe913),
        PICI_GROUP_FULL((char) 0xe914),
        PICI_GROUP_FULL_ADD((char) 0xe915),
        PICI_GROUP_FULL_EDIT((char) 0xe916),
        PICI_GROUP_FULL_REMOVE((char) 0xe917),
        PICI_GROUP_FULL_SECURITY((char) 0xe918),
        PICI_GROUP_HALF((char) 0xe919),
        PICI_GROUP_HALF_ADD((char) 0xe91a),
        PICI_GROUP_HALF_EDIT((char) 0xe91b),
        PICI_GROUP_HALF_REMOVE((char) 0xe91c),
        PICI_GROUP_HALF_SECURITY((char) 0xe91d),
        PICI_HARDDISK_SANS((char) 0xe91e),
        PICI_HARDDISK_SANS_EJECT((char) 0xe91f),
        PICI_HARDDISK_SANS_SECURITY((char) 0xe920),
        PICI_HARDDISK_SANS_SETTINGS((char) 0xe921),
        PICI_HIERARCHY((char) 0xe922),
        PICI_HOME((char) 0xe923),
        PICI_IMAGE((char) 0xe924),
        PICI_IMAGE_ACCEPT((char) 0xe925),
        PICI_IMAGE_ADD((char) 0xe926),
        PICI_IMAGE_CANCEL((char) 0xe927),
        PICI_IMAGE_EDIT((char) 0xe928),
        PICI_IMAGE_PAUSE((char) 0xe929),
        PICI_IMAGE_REMOVE((char) 0xe92a),
        PICI_IMAGE_RUN((char) 0xe92b),
        PICI_IMAGE_SECURITY((char) 0xe92c),
        PICI_IMAGE_SETTINGS((char) 0xe92d),
        PICI_IMPRINT((char) 0xe92e),
        PICI_INFORMATION((char) 0xe92f),
        PICI_INTERNET((char) 0xe930),
        PICI_KEYBOARD((char) 0xe931),
        PICI_LABEL((char) 0xe932),
        PICI_LABEL_ADD((char) 0xe933),
        PICI_LABEL_EDIT((char) 0xe934),
        PICI_LABEL_REMOVE((char) 0xe935),
        PICI_LABEL_SECURITY((char) 0xe936),
        PICI_LEAF((char) 0xe937),
        PICI_LIGHT((char) 0xe938),
        PICI_LIGHT_OFF((char) 0xe939),
        PICI_LINK((char) 0xe93a),
        PICI_LINK_ADD((char) 0xe93b),
        PICI_LINK_EDIT((char) 0xe93c),
        PICI_LINK_REMOVE((char) 0xe93d),
        PICI_LIST((char) 0xe93e),
        PICI_LIST_NUMBERED((char) 0xe93f),
        PICI_LOGIN((char) 0xe940),
        PICI_LOGOUT((char) 0xe941),
        PICI_MAIL((char) 0xe942),
        PICI_MAIL_ACCEPT((char) 0xe943),
        PICI_MAIL_ADD((char) 0xe944),
        PICI_MAILBOX((char) 0xe945),
        PICI_MAILBOX_DOWN((char) 0xe946),
        PICI_MAILBOX_EJECT((char) 0xe947),
        PICI_MAILBOX_INCOMING((char) 0xe948),
        PICI_MAILBOX_OUTGOING((char) 0xe949),
        PICI_MAILBOX_SETTINGS((char) 0xe94a),
        PICI_MAIL_CANCEL((char) 0xe94b),
        PICI_MAIL_EDIT((char) 0xe94c),
        PICI_MAIL_FWD((char) 0xe94d),
        PICI_MAIL_REMOVE((char) 0xe94e),
        PICI_MAIL_RUN((char) 0xe94f),
        PICI_MAIL_SECURITY((char) 0xe950),
        PICI_MAINFRAME((char) 0xe951),
        PICI_MASHUP((char) 0xe952),
        PICI_MOBILE_PHONE((char) 0xe953),
        PICI_MOVE((char) 0xe954),
        PICI_MUSIC((char) 0xe955),
        PICI_MUSIC_ACCEPT((char) 0xe956),
        PICI_MUSIC_ADD((char) 0xe957),
        PICI_MUSIC_CANCEL((char) 0xe958),
        PICI_MUSIC_EDIT((char) 0xe959),
        PICI_MUSIC_EJECT((char) 0xe95a),
        PICI_MUSIC_INFORMATION((char) 0xe95b),
        PICI_MUSIC_PAUSE((char) 0xe95c),
        PICI_MUSIC_REMOVE((char) 0xe95d),
        PICI_MUSIC_RUN((char) 0xe95e),
        PICI_MUSIC_SECURITY((char) 0xe95f),
        PICI_MUSIC_SETTINGS((char) 0xe960),
        PICI_MUSIC_STOP((char) 0xe961),
        PICI_NETWORK_INTRANET((char) 0xe962),
        PICI_NETWORK_PROTOCOL((char) 0xe963),
        PICI_NETWORK_SANS((char) 0xe964),
        PICI_NETWORK_SANS_ADD((char) 0xe965),
        PICI_NETWORK_SANS_EDIT((char) 0xe966),
        PICI_NETWORK_SANS_REMOVE((char) 0xe967),
        PICI_NETWORK_SANS_SECURITY((char) 0xe968),
        PICI_NETWORK_WIRELESS((char) 0xe969),
        PICI_NETWORK_WIRELESS_ADD((char) 0xe96a),
        PICI_NETWORK_WIRELESS_EDIT((char) 0xe96b),
        PICI_NETWORK_WIRELESS_SECURITY((char) 0xe96c),
        PICI_NEWS((char) 0xe96d),
        PICI_NOTES((char) 0xe96e),
        PICI_NOTES_ACCEPT((char) 0xe96f),
        PICI_NOTES_ADD((char) 0xe970),
        PICI_NOTES_CANCEL((char) 0xe971),
        PICI_NOTES_DOWN((char) 0xe972),
        PICI_NOTES_EDIT((char) 0xe973),
        PICI_NOTES_REMOVE((char) 0xe974),
        PICI_NOTES_SETTINGS((char) 0xe975),
        PICI_NOTES_UP((char) 0xe976),
        PICI_ONTOLOGY((char) 0xe977),
        PICI_OWL_DL((char) 0xe978),
        PICI_OWL_DL_DOCUMENT((char) 0xe979),
        PICI_OWL_FULL((char) 0xe97a),
        PICI_OWL_FULL_DOCUMENT((char) 0xe97b),
        PICI_OWL_LITE((char) 0xe97c),
        PICI_OWL_LITE_DOCUMENT((char) 0xe97d),
        PICI_PARAGRAPH((char) 0xe97e),
        PICI_PASTE((char) 0xe97f),
        PICI_PATH((char) 0xe980),
        PICI_PDA((char) 0xe981),
        PICI_PEAR((char) 0xe982),
        PICI_PHONE_HOME((char) 0xe983),
        PICI_PHONE_OFF((char) 0xe984),
        PICI_PHONE_ON((char) 0xe985),
        PICI_PIN((char) 0xe986),
        PICI_PIN_FILLED((char) 0xe987),
        PICI_PLUS((char) 0xe988),
        PICI_POINT_OF_INTEREST((char) 0xe989),
        PICI_PRINTER((char) 0xe98a),
        PICI_PRINTER_ADD((char) 0xe98b),
        PICI_PRINTER_CANCEL((char) 0xe98c),
        PICI_PRINTER_INFORMATION((char) 0xe98d),
        PICI_PRINTER_PAUSE((char) 0xe98e),
        PICI_PRINTER_REMOVE((char) 0xe98f),
        PICI_PRINTER_RUN((char) 0xe990),
        PICI_PRINTER_SETTINGS((char) 0xe991),
        PICI_PRINTER_STOP((char) 0xe992),
        PICI_QUESTIONMARK((char) 0xe993),
        PICI_RDF((char) 0xe994),
        PICI_RDF_DOCUMENT((char) 0xe995),
        PICI_RECENT_CHANGES((char) 0xe996),
        PICI_REFRESH((char) 0xe997),
        PICI_RELEVANCE((char) 0xe998),
        PICI_REMIX((char) 0xe999),
        PICI_ROUTE((char) 0xe99a),
        PICI_SATELLITE((char) 0xe99b),
        PICI_SATELLITE_GROUND((char) 0xe99c),
        PICI_SCREEN_4TO3((char) 0xe99d),
        PICI_SCREEN_16TO9((char) 0xe99e),
        PICI_SCRIPT((char) 0xe99f),
        PICI_SEARCH((char) 0xe9a0),
        PICI_SECURITY_CLOSED((char) 0xe9a1),
        PICI_SECURITY_OPEN((char) 0xe9a2),
        PICI_SEMANTIC_WEB((char) 0xe9a3),
        PICI_SERVER((char) 0xe9a4),
        PICI_SERVER_ACCEPT((char) 0xe9a5),
        PICI_SERVER_ADD((char) 0xe9a6),
        PICI_SERVER_CANCEL((char) 0xe9a7),
        PICI_SERVER_EDIT((char) 0xe9a8),
        PICI_SERVER_EJECT((char) 0xe9a9),
        PICI_SERVER_INFORMATION((char) 0xe9aa),
        PICI_SERVER_REMOVE((char) 0xe9ab),
        PICI_SERVER_RUN((char) 0xe9ac),
        PICI_SERVER_SECURITY((char) 0xe9ad),
        PICI_SERVER_SETTINGS((char) 0xe9ae),
        PICI_SERVER_STOP((char) 0xe9af),
        PICI_SETTINGS((char) 0xe9b0),
        PICI_SHOPPING_CART((char) 0xe9b1),
        PICI_SITEMAP((char) 0xe9b2),
        PICI_SIZE_BOTH((char) 0xe9b3),
        PICI_SIZE_BOTH_ACCEPT((char) 0xe9b4),
        PICI_SIZE_BOTH_ADD((char) 0xe9b5),
        PICI_SIZE_BOTH_CANCEL((char) 0xe9b6),
        PICI_SIZE_BOTH_EDIT((char) 0xe9b7),
        PICI_SIZE_BOTH_REMOVE((char) 0xe9b8),
        PICI_SIZE_BOTH_SECURITY((char) 0xe9b9),
        PICI_SIZE_BOTH_SETTINGS((char) 0xe9ba),
        PICI_SIZE_HEIGHT((char) 0xe9bb),
        PICI_SIZE_HEIGHT_ACCEPT((char) 0xe9bc),
        PICI_SIZE_HEIGHT_ADD((char) 0xe9bd),
        PICI_SIZE_HEIGHT_CANCEL((char) 0xe9be),
        PICI_SIZE_HEIGHT_EDIT((char) 0xe9bf),
        PICI_SIZE_HEIGHT_REMOVE((char) 0xe9c0),
        PICI_SIZE_HEIGHT_SECURITY((char) 0xe9c1),
        PICI_SIZE_HEIGHT_SETTINGS((char) 0xe9c2),
        PICI_SIZE_WIDTH((char) 0xe9c3),
        PICI_SIZE_WIDTH_ACCEPT((char) 0xe9c4),
        PICI_SIZE_WIDTH_ADD((char) 0xe9c5),
        PICI_SIZE_WIDTH_CANCEL((char) 0xe9c6),
        PICI_SIZE_WIDTH_EDIT((char) 0xe9c7),
        PICI_SIZE_WIDTH_REMOVE((char) 0xe9c8),
        PICI_SIZE_WIDTH_SECURITY((char) 0xe9c9),
        PICI_SIZE_WIDTH_SETTINGS((char) 0xe9ca),
        PICI_SOCCER((char) 0xe9cb),
        PICI_SOCIAL_NETWORK((char) 0xe9cc),
        PICI_SOURCE_CODE((char) 0xe9cd),
        PICI_SPEAKER_LOUDER((char) 0xe9ce),
        PICI_SPEAKER_OFF((char) 0xe9cf),
        PICI_SPEAKER_SILENT((char) 0xe9d0),
        PICI_STAR((char) 0xe9d1),
        PICI_STAR_OUTLINE((char) 0xe9d2),
        PICI_STATISTICS((char) 0xe9d3),
        PICI_SYNCHRONIZE((char) 0xe9d4),
        PICI_TAB((char) 0xe9d5),
        PICI_TAB_ADD((char) 0xe9d6),
        PICI_TAB_CANCEL((char) 0xe9d7),
        PICI_TABLET((char) 0xe9d8),
        PICI_TARGET((char) 0xe9d9),
        PICI_TERMINAL_COMPUTER((char) 0xe9da),
        PICI_TEXT((char) 0xe9db),
        PICI_TEXT_ALIGN_CENTER((char) 0xe9dc),
        PICI_TEXT_ALIGN_FULL((char) 0xe9dd),
        PICI_TEXT_ALIGN_LEFT((char) 0xe9de),
        PICI_TEXT_ALIGN_RIGHT((char) 0xe9df),
        PICI_TEXT_BOLD((char) 0xe9e0),
        PICI_TEXT_ITALIC((char) 0xe9e1),
        PICI_TEXT_STRIKETHROUGH((char) 0xe9e2),
        PICI_TRANSPORTATION_BUS((char) 0xe9e3),
        PICI_TRANSPORTATION_CAR((char) 0xe9e4),
        PICI_TRANSPORTATION_PLANE((char) 0xe9e5),
        PICI_TRANSPORTATION_SHIP((char) 0xe9e6),
        PICI_TRANSPORTATION_TRAIN((char) 0xe9e7),
        PICI_TRANSPORTATION_TRUCK((char) 0xe9e8),
        PICI_TRASH((char) 0xe9e9),
        PICI_TRASH_FULL((char) 0xe9ea),
        PICI_TREE((char) 0xe9eb),
        PICI_UPLOAD((char) 0xe9ec),
        PICI_UPLOAD_ACCEPT((char) 0xe9ed),
        PICI_UPLOAD_CANCEL((char) 0xe9ee),
        PICI_UPLOAD_PAUSE((char) 0xe9ef),
        PICI_UPLOAD_RUN((char) 0xe9f0),
        PICI_UPLOAD_SECURITY((char) 0xe9f1),
        PICI_UPLOAD_SETTINGS((char) 0xe9f2),
        PICI_UPLOAD_STOP((char) 0xe9f3),
        PICI_USER_CLOSE((char) 0xe9f4),
        PICI_USER_CLOSE_ADD((char) 0xe9f5),
        PICI_USER_CLOSE_EDIT((char) 0xe9f6),
        PICI_USER_CLOSE_INFORMATION((char) 0xe9f7),
        PICI_USER_CLOSE_REMOVE((char) 0xe9f8),
        PICI_USER_CLOSE_SECURITY((char) 0xe9f9),
        PICI_USER_CLOSE_SETTINGS((char) 0xe9fa),
        PICI_USER_FULL((char) 0xe9fb),
        PICI_USER_FULL_ADD((char) 0xe9fc),
        PICI_USER_FULL_EDIT((char) 0xe9fd),
        PICI_USER_FULL_INFORMATION((char) 0xe9fe),
        PICI_USER_FULL_REMOVE((char) 0xe9ff),
        PICI_USER_FULL_SECURITY((char) 0xea00),
        PICI_USER_FULL_SETTINGS((char) 0xea01),
        PICI_USER_HALF((char) 0xea02),
        PICI_USER_HALF_ADD((char) 0xea03),
        PICI_USER_HALF_EDIT((char) 0xea04),
        PICI_USER_HALF_INFORMATION((char) 0xea05),
        PICI_USER_HALF_REMOVE((char) 0xea06),
        PICI_USER_HALF_SECURITY((char) 0xea07),
        PICI_USER_HALF_SETTINGS((char) 0xea08),
        PICI_USER_PROFILE((char) 0xea09),
        PICI_USER_PROFILE_ADD((char) 0xea0a),
        PICI_USER_PROFILE_EDIT((char) 0xea0b),
        PICI_VIDEO((char) 0xea0c),
        PICI_VIDEO_ACCEPT((char) 0xea0d),
        PICI_VIDEO_ADD((char) 0xea0e),
        PICI_VIDEO_CANCEL((char) 0xea0f),
        PICI_VIDEO_DOWN((char) 0xea10),
        PICI_VIDEO_EDIT((char) 0xea11),
        PICI_VIDEO_INFORMATION((char) 0xea12),
        PICI_VIDEO_PAUSE((char) 0xea13),
        PICI_VIDEO_REMOVE((char) 0xea14),
        PICI_VIDEO_RUN((char) 0xea15),
        PICI_VIDEO_SECURITY((char) 0xea16),
        PICI_VIDEO_SETTINGS((char) 0xea17),
        PICI_VIDEO_STOP((char) 0xea18),
        PICI_VIDEO_UP((char) 0xea19),
        PICI_VIEW((char) 0xea1a),
        PICI_VIEWER_IMAGE((char) 0xea1b),
        PICI_VIEWER_TEXT((char) 0xea1c),
        PICI_VIEWER_VIDEO((char) 0xea1d),
        PICI_VUVUZELA((char) 0xea1e),
        PICI_WEBSITE((char) 0xea1f),
        PICI_WEIGHT((char) 0xea20),
        PICI_XML((char) 0xea21),
        PICI_XML_DOCUMENT((char) 0xea22),
        PICI_ZOOM_IN((char) 0xea23),
        PICI_GLOBE((char) 0xe912);

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
        private static MfbTypeface picolIconTypeface;

        @Override
        public MfbTypeface getTypeface() {
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
