package com.rilixtech.entypotypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Entypo font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Entypo implements MfbTypeface {
    private static final String TTF_FILE = "entypo-font-v1.0.0.1.ttf";
    private static final String ENTYPO_PREFIX = "ENTI";
    public static final String ENTYPO_NAME = "Entypo";
    public static final String ENTYPO_VERSION = "1" + ".0.0.1";
    public static final String ENTYPO_AUTHOR = "Daniel Bruce";
    public static final String ENTYPO_URL = "http://www.entypo.com/";
    public static final String ENTYPO_DESC = "411 carefully crafted premium pictograms by Daniel Bruce";
    public static final String ENTYPO_LICENSE = "CC BY-SA 4.0";
    public static final String ENTYPO_LICENSE_URL = "https://creativecommons.org/licenses/by-sa/4.0/";

    private static Font entypoTypeface = null;

    private static HashMap<String, Character> entypoCharMap;

    /**
     * Entypo MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Entypo MfbIcon is to be retrieved.
     */
    @Override
    public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Entypo icon characters in a HashMap.
     *
     * @return HashMap of all Entypo icon character names mapped to their character values.
     */
    @Override
    public HashMap<String, Character> getCharacters() {
        if (entypoCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(),
                        v.entypoCharacter);
            }
            setChars(characterHashMap);
        }

        return entypoCharMap;
    }

    /**
     * Set the Entypo Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        entypoCharMap = characterHashMap;
    }

    /**
     * Return the Entypo Mapping Prefix.
     *
     * @return Entypo Mapping Prefix, used by all Entypo icons.
     */
    @Override
    public String getMappingPrefix() {
        return ENTYPO_PREFIX;
    }

    @Override
    public String getFontName() {
        return ENTYPO_NAME;
    }

    @Override
    public String getVersion() {
        return ENTYPO_VERSION;
    }

    @Override
    public int getIconCount() {
        return entypoCharMap.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> entypoKeyList = new LinkedList<>();

        for (Icon value : Icon.values()) {
            entypoKeyList.add(value.name());
        }

        return entypoKeyList;
    }

    @Override
    public String getAuthor() {
        return ENTYPO_AUTHOR;
    }

    @Override
    public String getUrl() {
        return ENTYPO_URL;
    }

    @Override
    public String getDescription() {
        return ENTYPO_DESC;
    }

    @Override
    public String getLicense() {
        return ENTYPO_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return ENTYPO_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (entypoTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return entypoTypeface;
    }

    private static void cacheTypeface(Font font) {
        entypoTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Entypo MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        ENTI_ADD_TO_LIST((char) 0xe900),
        ENTI_CLASSIC_COMPUTER((char) 0xe901),
        ENTI_CONTROLLER_FAST_BACKWARD((char) 0xe902),
        ENTI_CREATIVE_COMMONS_ATTRIBUTION((char) 0xe903),
        ENTI_CREATIVE_COMMONS_NODERIVS((char) 0xe904),
        ENTI_CREATIVE_COMMONS_NONCOMMERCIAL_EU((char) 0xe905),
        ENTI_CREATIVE_COMMONS_NONCOMMERCIAL_US((char) 0xe906),
        ENTI_CREATIVE_COMMONS_PUBLIC_DOMAIN((char) 0xe907),
        ENTI_CREATIVE_COMMONS_REMIX((char) 0xe908),
        ENTI_CREATIVE_COMMONS_SHARE((char) 0xe909),
        ENTI_CREATIVE_COMMONS_SHAREALIKE((char) 0xe90a),
        ENTI_CREATIVE_COMMONS((char) 0xe90b),
        ENTI_DOCUMENTI_LANDSCAPE((char) 0xe90c),
        ENTI_REMOVE_USER((char) 0xe90d),
        ENTI_WARNING((char) 0xe90e),
        ENTI_ARROW_BOLD_DOWN((char) 0xe90f),
        ENTI_ARROW_BOLD_LEFT((char) 0xe910),
        ENTI_ARROW_BOLD_RIGHT((char) 0xe911),
        ENTI_ARROW_BOLD_UP((char) 0xe912),
        ENTI_ARROW_DOWN((char) 0xe913),
        ENTI_ARROW_LEFT((char) 0xe914),
        ENTI_ARROW_LONG_DOWN((char) 0xe915),
        ENTI_ARROW_LONG_LEFT((char) 0xe916),
        ENTI_ARROW_LONG_RIGHT((char) 0xe917),
        ENTI_ARROW_LONG_UP((char) 0xe918),
        ENTI_ARROW_RIGHT((char) 0xe919),
        ENTI_ARROW_UP((char) 0xe91a),
        ENTI_ARROW_WITH_CIRCLE_DOWN((char) 0xe91b),
        ENTI_ARROW_WITH_CIRCLE_LEFT((char) 0xe91c),
        ENTI_ARROW_WITH_CIRCLE_RIGHT((char) 0xe91d),
        ENTI_ARROW_WITH_CIRCLE_UP((char) 0xe91e),
        ENTI_BOOKMARK((char) 0xe91f),
        ENTI_BOOKMARKS((char) 0xe920),
        ENTI_CHEVRON_DOWN((char) 0xe921),
        ENTI_CHEVRON_LEFT((char) 0xe922),
        ENTI_CHEVRON_RIGHT((char) 0xe923),
        ENTI_CHEVRON_SMALL_DOWN((char) 0xe924),
        ENTI_CHEVRON_SMALL_LEFT((char) 0xe925),
        ENTI_CHEVRON_SMALL_RIGHT((char) 0xe926),
        ENTI_CHEVRON_SMALL_UP((char) 0xe927),
        ENTI_CHEVRON_THIN_DOWN((char) 0xe928),
        ENTI_CHEVRON_THIN_LEFT((char) 0xe929),
        ENTI_CHEVRON_THIN_RIGHT((char) 0xe92a),
        ENTI_CHEVRON_THIN_UP((char) 0xe92b),
        ENTI_CHEVRON_UP((char) 0xe92c),
        ENTI_CHEVRON_WITH_CIRCLE_DOWN((char) 0xe92d),
        ENTI_CHEVRON_WITH_CIRCLE_LEFT((char) 0xe92e),
        ENTI_CHEVRON_WITH_CIRCLE_RIGHT((char) 0xe92f),
        ENTI_CHEVRON_WITH_CIRCLE_UP((char) 0xe930),
        ENTI_CLOUD((char) 0xe931),
        ENTI_CONTROLLER_FAST_FORWARD((char) 0xe932),
        ENTI_CONTROLLER_JUMP_TO_START((char) 0xe933),
        ENTI_CONTROLLER_NEXT((char) 0xe934),
        ENTI_CONTROLLER_PAUS((char) 0xe935),
        ENTI_CONTROLLER_PLAY((char) 0xe936),
        ENTI_CONTROLLER_RECORD((char) 0xe937),
        ENTI_CONTROLLER_STOP((char) 0xe938),
        ENTI_CONTROLLER_VOLUME((char) 0xe939),
        ENTI_DOT_SINGLE((char) 0xe93a),
        ENTI_DOTS_THREE_HORIZONTAL((char) 0xe93b),
        ENTI_DOTS_THREE_VERTICAL((char) 0xe93c),
        ENTI_DOTS_TWO_HORIZONTAL((char) 0xe93d),
        ENTI_DOTS_TWO_VERTICAL((char) 0xe93e),
        ENTI_DOWNLOAD((char) 0xe93f),
        ENTI_EMOJI_FLIRT((char) 0xe940),
        ENTI_FLOW_BRANCH((char) 0xe941),
        ENTI_FLOW_CASCADE((char) 0xe942),
        ENTI_FLOW_LINE((char) 0xe943),
        ENTI_FLOW_PARALLEL((char) 0xe944),
        ENTI_FLOW_TREE((char) 0xe945),
        ENTI_INSTALL((char) 0xe946),
        ENTI_LAYERS((char) 0xe947),
        ENTI_OPEN_BOOK((char) 0xe948),
        ENTI_RESIZE_100((char) 0xe949),
        ENTI_RESIZE_FULL_SCREEN((char) 0xe94a),
        ENTI_SAVE((char) 0xe94b),
        ENTI_SELECT_ARROWS((char) 0xe94c),
        ENTI_SOUND_MUTE((char) 0xe94d),
        ENTI_SOUND((char) 0xe94e),
        ENTI_TRASH((char) 0xe94f),
        ENTI_TRIANGLE_DOWN((char) 0xe950),
        ENTI_TRIANGLE_LEFT((char) 0xe951),
        ENTI_TRIANGLE_RIGHT((char) 0xe952),
        ENTI_TRIANGLE_UP((char) 0xe953),
        ENTI_UNINSTALL((char) 0xe954),
        ENTI_UPLOAD_TO_CLOUD((char) 0xe955),
        ENTI_UPLOAD((char) 0xe956),
        ENTI_ADD_USER((char) 0xe957),
        ENTI_ADDRESS((char) 0xe958),
        ENTI_ADJUST((char) 0xe959),
        ENTI_AIR((char) 0xe95a),
        ENTI_AIRCRAFT_LANDING((char) 0xe95b),
        ENTI_AIRCRAFT_TAKE_OFF((char) 0xe95c),
        ENTI_AIRCRAFT((char) 0xe95d),
        ENTI_ALIGN_BOTTOM((char) 0xe95e),
        ENTI_ALIGN_HORIZONTAL_MIDDLE((char) 0xe95f),
        ENTI_ALIGN_LEFT((char) 0xe960),
        ENTI_ALIGN_RIGHT((char) 0xe961),
        ENTI_ALIGN_TOP((char) 0xe962),
        ENTI_ALIGN_VERTICAL_MIDDLE((char) 0xe963),
        ENTI_ARCHIVE((char) 0xe964),
        ENTI_AREA_GRAPH((char) 0xe965),
        ENTI_ATTACHMENT((char) 0xe966),
        ENTI_AWARENESS_RIBBON((char) 0xe967),
        ENTI_BACK_IN_TIME((char) 0xe968),
        ENTI_BACK((char) 0xe969),
        ENTI_BAR_GRAPH((char) 0xe96a),
        ENTI_BATTERY((char) 0xe96b),
        ENTI_BEAMED_NOTE((char) 0xe96c),
        ENTI_BELL((char) 0xe96d),
        ENTI_BLACKBOARD((char) 0xe96e),
        ENTI_BLOCK((char) 0xe96f),
        ENTI_BOOK((char) 0xe970),
        ENTI_BOWL((char) 0xe971),
        ENTI_BOX((char) 0xe972),
        ENTI_BRIEFCASE((char) 0xe973),
        ENTI_BROWSER((char) 0xe974),
        ENTI_BRUSH((char) 0xe975),
        ENTI_BUCKET((char) 0xe976),
        ENTI_CAKE((char) 0xe977),
        ENTI_CALCULATOR((char) 0xe978),
        ENTI_CALENDAR((char) 0xe979),
        ENTI_CAMERA((char) 0xe97a),
        ENTI_CCW((char) 0xe97b),
        ENTI_CHAT((char) 0xe97c),
        ENTI_CHECK((char) 0xe97d),
        ENTI_CIRCLE_WITH_CROSS((char) 0xe97e),
        ENTI_CIRCLE_WITH_MINUS((char) 0xe97f),
        ENTI_CIRCLE_WITH_PLUS((char) 0xe980),
        ENTI_CIRCLE((char) 0xe981),
        ENTI_CIRCULAR_GRAPH((char) 0xe982),
        ENTI_CLAPPERBOARD((char) 0xe983),
        ENTI_CLIPBOARD((char) 0xe984),
        ENTI_CLOCK((char) 0xe985),
        ENTI_CODE((char) 0xe986),
        ENTI_COG((char) 0xe987),
        ENTI_COLOURS((char) 0xe988),
        ENTI_COMPASS((char) 0xe989),
        ENTI_COPY((char) 0xe98a),
        ENTI_CREDIT_CARD((char) 0xe98b),
        ENTI_CREDIT((char) 0xe98c),
        ENTI_CROSS((char) 0xe98d),
        ENTI_CUP((char) 0xe98e),
        ENTI_CW((char) 0xe98f),
        ENTI_CYCLE((char) 0xe990),
        ENTI_DATABASE((char) 0xe991),
        ENTI_DIAL_PAD((char) 0xe992),
        ENTI_DIRECTION((char) 0xe993),
        ENTI_DOCUMENT((char) 0xe994),
        ENTI_DOCUMENTS((char) 0xe995),
        ENTI_DRINK((char) 0xe996),
        ENTI_DRIVE((char) 0xe997),
        ENTI_DROP((char) 0xe998),
        ENTI_EDIT((char) 0xe999),
        ENTI_EMAIL((char) 0xe99a),
        ENTI_EMOJI_HAPPY((char) 0xe99b),
        ENTI_EMOJI_NEUTRAL((char) 0xe99c),
        ENTI_EMOJI_SAD((char) 0xe99d),
        ENTI_ERASE((char) 0xe99e),
        ENTI_ERASER((char) 0xe99f),
        ENTI_EXPORT((char) 0xe9a0),
        ENTI_EYE((char) 0xe9a1),
        ENTI_FEATHER((char) 0xe9a2),
        ENTI_FLAG((char) 0xe9a3),
        ENTI_FLASH((char) 0xe9a4),
        ENTI_FLASHLIGHT((char) 0xe9a5),
        ENTI_FLAT_BRUSH((char) 0xe9a6),
        ENTI_FOLDER_IMAGES((char) 0xe9a7),
        ENTI_FOLDER_MUSIC((char) 0xe9a8),
        ENTI_FOLDER_VIDEO((char) 0xe9a9),
        ENTI_FOLDER((char) 0xe9aa),
        ENTI_FORWARD((char) 0xe9ab),
        ENTI_FUNNEL((char) 0xe9ac),
        ENTI_GAME_CONTROLLER((char) 0xe9ad),
        ENTI_GAUGE((char) 0xe9ae),
        ENTI_GLOBE((char) 0xe9af),
        ENTI_GRADUATION_CAP((char) 0xe9b0),
        ENTI_GRID((char) 0xe9b1),
        ENTI_HAIR_CROSS((char) 0xe9b2),
        ENTI_HAND((char) 0xe9b3),
        ENTI_HEART_OUTLINED((char) 0xe9b4),
        ENTI_HEART((char) 0xe9b5),
        ENTI_HELP_WITH_CIRCLE((char) 0xe9b6),
        ENTI_HELP((char) 0xe9b7),
        ENTI_HOME((char) 0xe9b8),
        ENTI_HOUR_GLASS((char) 0xe9b9),
        ENTI_IMAGE_INVERTED((char) 0xe9ba),
        ENTI_IMAGE((char) 0xe9bb),
        ENTI_IMAGES((char) 0xe9bc),
        ENTI_INBOX((char) 0xe9bd),
        ENTI_INFINITY((char) 0xe9be),
        ENTI_INFO_WITH_CIRCLE((char) 0xe9bf),
        ENTI_INFO((char) 0xe9c0),
        ENTI_KEY((char) 0xe9c1),
        ENTI_KEYBOARD((char) 0xe9c2),
        ENTI_LAB_FLASK((char) 0xe9c3),
        ENTI_LANDLINE((char) 0xe9c4),
        ENTI_LANGUAGE((char) 0xe9c5),
        ENTI_LAPTOP((char) 0xe9c6),
        ENTI_LEAF((char) 0xe9c7),
        ENTI_LEVEL_DOWN((char) 0xe9c8),
        ENTI_LEVEL_UP((char) 0xe9c9),
        ENTI_LIFEBUOY((char) 0xe9ca),
        ENTI_LIGHT_BULB((char) 0xe9cb),
        ENTI_LIGHT_DOWN((char) 0xe9cc),
        ENTI_LIGHT_UP((char) 0xe9cd),
        ENTI_LINE_GRAPH((char) 0xe9ce),
        ENTI_LINK((char) 0xe9cf),
        ENTI_LIST((char) 0xe9d0),
        ENTI_LOCATION_PIN((char) 0xe9d1),
        ENTI_LOCATION((char) 0xe9d2),
        ENTI_LOCK_OPEN((char) 0xe9d3),
        ENTI_LOCK((char) 0xe9d4),
        ENTI_LOG_OUT((char) 0xe9d5),
        ENTI_LOGIN((char) 0xe9d6),
        ENTI_LOOP((char) 0xe9d7),
        ENTI_MAGNET((char) 0xe9d8),
        ENTI_MAGNIFYING_GLASS((char) 0xe9d9),
        ENTI_MAIL((char) 0xe9da),
        ENTI_MAN((char) 0xe9db),
        ENTI_MAP((char) 0xe9dc),
        ENTI_MASK((char) 0xe9dd),
        ENTI_MEDAL((char) 0xe9de),
        ENTI_MEGAPHONE((char) 0xe9df),
        ENTI_MENU((char) 0xe9e0),
        ENTI_MESSAGE((char) 0xe9e1),
        ENTI_MIC((char) 0xe9e2),
        ENTI_MINUS((char) 0xe9e3),
        ENTI_MOBILE((char) 0xe9e4),
        ENTI_MODERN_MIC((char) 0xe9e5),
        ENTI_MOON((char) 0xe9e6),
        ENTI_MOUSE((char) 0xe9e7),
        ENTI_MUSIC((char) 0xe9e8),
        ENTI_NETWORK((char) 0xe9e9),
        ENTI_NEW_MESSAGE((char) 0xe9ea),
        ENTI_NEW((char) 0xe9eb),
        ENTI_NEWS((char) 0xe9ec),
        ENTI_NOTE((char) 0xe9ed),
        ENTI_NOTIFICATION((char) 0xe9ee),
        ENTI_OLD_MOBILE((char) 0xe9ef),
        ENTI_OLD_PHONE((char) 0xe9f0),
        ENTI_PALETTE((char) 0xe9f1),
        ENTI_PAPER_PLANE((char) 0xe9f2),
        ENTI_PENCIL((char) 0xe9f3),
        ENTI_PHONE((char) 0xe9f4),
        ENTI_PIE_CHART((char) 0xe9f5),
        ENTI_PIN((char) 0xe9f6),
        ENTI_PLUS((char) 0xe9f7),
        ENTI_POPUP((char) 0xe9f8),
        ENTI_POWER_PLUG((char) 0xe9f9),
        ENTI_PRICE_RIBBON((char) 0xe9fa),
        ENTI_PRICE_TAG((char) 0xe9fb),
        ENTI_PRINT((char) 0xe9fc),
        ENTI_PROGRESS_EMPTY((char) 0xe9fd),
        ENTI_PROGRESS_FULL((char) 0xe9fe),
        ENTI_PROGRESS_ONE((char) 0xe9ff),
        ENTI_PROGRESS_TWO((char) 0xea00),
        ENTI_PUBLISH((char) 0xea01),
        ENTI_QUOTE((char) 0xea02),
        ENTI_RADIO((char) 0xea03),
        ENTI_REPLY_ALL((char) 0xea04),
        ENTI_REPLY((char) 0xea05),
        ENTI_RETWEET((char) 0xea06),
        ENTI_ROCKET((char) 0xea07),
        ENTI_ROUND_BRUSH((char) 0xea08),
        ENTI_RSS((char) 0xea09),
        ENTI_RULER((char) 0xea0a),
        ENTI_SCISSORS((char) 0xea0b),
        ENTI_SHARE_ALTERNITIVE((char) 0xea0c),
        ENTI_SHARE((char) 0xea0d),
        ENTI_SHAREABLE((char) 0xea0e),
        ENTI_SHIELD((char) 0xea0f),
        ENTI_SHOP((char) 0xea10),
        ENTI_SHOPPING_BAG((char) 0xea11),
        ENTI_SHOPPING_BASKET((char) 0xea12),
        ENTI_SHOPPING_CART((char) 0xea13),
        ENTI_SHUFFLE((char) 0xea14),
        ENTI_SIGNAL((char) 0xea15),
        ENTI_SOUND_MIX((char) 0xea16),
        ENTI_SPORTS_CLUB((char) 0xea17),
        ENTI_SPREADSHEET((char) 0xea18),
        ENTI_SQUARED_CROSS((char) 0xea19),
        ENTI_SQUARED_MINUS((char) 0xea1a),
        ENTI_SQUARED_PLUS((char) 0xea1b),
        ENTI_STAR_OUTLINED((char) 0xea1c),
        ENTI_STAR((char) 0xea1d),
        ENTI_STOPWATCH((char) 0xea1e),
        ENTI_SUITCASE((char) 0xea1f),
        ENTI_SWAP((char) 0xea20),
        ENTI_SWEDEN((char) 0xea21),
        ENTI_SWITCH((char) 0xea22),
        ENTI_TABLET((char) 0xea23),
        ENTI_TAG((char) 0xea24),
        ENTI_TEXT_DOCUMENTI_INVERTED((char) 0xea25),
        ENTI_TEXT_DOCUMENT((char) 0xea26),
        ENTI_TEXT((char) 0xea27),
        ENTI_THERMOMETER((char) 0xea28),
        ENTI_THUMBS_DOWN((char) 0xea29),
        ENTI_THUMBS_UP((char) 0xea2a),
        ENTI_THUNDER_CLOUD((char) 0xea2b),
        ENTI_TICKET((char) 0xea2c),
        ENTI_TIME_SLOT((char) 0xea2d),
        ENTI_TOOLS((char) 0xea2e),
        ENTI_TRAFFIC_CONE((char) 0xea2f),
        ENTI_TREE((char) 0xea30),
        ENTI_TROPHY((char) 0xea31),
        ENTI_TV((char) 0xea32),
        ENTI_TYPING((char) 0xea33),
        ENTI_UNREAD((char) 0xea34),
        ENTI_UNTAG((char) 0xea35),
        ENTI_USER((char) 0xea36),
        ENTI_USERS((char) 0xea37),
        ENTI_V_CARD((char) 0xea38),
        ENTI_VIDEO((char) 0xea39),
        ENTI_VINYL((char) 0xea3a),
        ENTI_VOICEMAIL((char) 0xea3b),
        ENTI_WALLET((char) 0xea3c),
        ENTI_WATER((char) 0xea3d),
        ENTI_500PX_WITH_CIRCLE((char) 0xea3e),
        ENTI_500PX((char) 0xea3f),
        ENTI_BASECAMP((char) 0xea40),
        ENTI_BEHANCE((char) 0xea41),
        ENTI_CREATIVE_CLOUD((char) 0xea42),
        ENTI_DROPBOX((char) 0xea43),
        ENTI_EVERNOTE((char) 0xea44),
        ENTI_FLATTR((char) 0xea45),
        ENTI_FOURSQUARE((char) 0xea46),
        ENTI_GOOGLE_DRIVE((char) 0xea47),
        ENTI_GOOGLE_HANGOUTS((char) 0xea48),
        ENTI_GROOVESHARK((char) 0xea49),
        ENTI_ICLOUD((char) 0xea4a),
        ENTI_MIXI((char) 0xea4b),
        ENTI_ONEDRIVE((char) 0xea4c),
        ENTI_PAYPAL((char) 0xea4d),
        ENTI_PICASA((char) 0xea4e),
        ENTI_QQ((char) 0xea4f),
        ENTI_RDIO_WITH_CIRCLE((char) 0xea50),
        ENTI_RENREN((char) 0xea51),
        ENTI_SCRIBD((char) 0xea52),
        ENTI_SINA_WEIBO((char) 0xea53),
        ENTI_SKYPE_WITH_CIRCLE((char) 0xea54),
        ENTI_SKYPE((char) 0xea55),
        ENTI_SLIDESHARE((char) 0xea56),
        ENTI_SMASHING((char) 0xea57),
        ENTI_SOUNDCLOUD((char) 0xea58),
        ENTI_SPOTIFY_WITH_CIRCLE((char) 0xea59),
        ENTI_SPOTIFY((char) 0xea5a),
        ENTI_SWARM((char) 0xea5b),
        ENTI_VINE_WITH_CIRCLE((char) 0xea5c),
        ENTI_VINE((char) 0xea5d),
        ENTI_VK_ALTERNITIVE((char) 0xea5e),
        ENTI_VK_WITH_CIRCLE((char) 0xea5f),
        ENTI_VK((char) 0xea60),
        ENTI_XING_WITH_CIRCLE((char) 0xea61),
        ENTI_XING((char) 0xea62),
        ENTI_YELP((char) 0xea63),
        ENTI_DRIBBBLE_WITH_CIRCLE((char) 0xea64),
        ENTI_DRIBBBLE((char) 0xea65),
        ENTI_FACEBOOK_WITH_CIRCLE((char) 0xea66),
        ENTI_FACEBOOK((char) 0xea67),
        ENTI_FLICKR_WITH_CIRCLE((char) 0xea68),
        ENTI_FLICKR((char) 0xea69),
        ENTI_GITHUB_WITH_CIRCLE((char) 0xea6a),
        ENTI_GITHUB((char) 0xea6b),
        ENTI_GOOGLE_WITH_CIRCLE((char) 0xea6c),
        ENTI_GOOGLE((char) 0xea6d),
        ENTI_INSTAGRAM_WITH_CIRCLE((char) 0xea6e),
        ENTI_INSTAGRAM((char) 0xea6f),
        ENTI_LASTFM_WITH_CIRCLE((char) 0xea70),
        ENTI_LASTFM((char) 0xea71),
        ENTI_LINKEDIN_WITH_CIRCLE((char) 0xea72),
        ENTI_LINKEDIN((char) 0xea73),
        ENTI_PINTEREST_WITH_CIRCLE((char) 0xea74),
        ENTI_PINTEREST((char) 0xea75),
        ENTI_RDIO((char) 0xea76),
        ENTI_STUMBLEUPON_WITH_CIRCLE((char) 0xea77),
        ENTI_STUMBLEUPON((char) 0xea78),
        ENTI_TUMBLR_WITH_CIRCLE((char) 0xea79),
        ENTI_TUMBLR((char) 0xea7a),
        ENTI_TWITTER_WITH_CIRCLE((char) 0xea7b),
        ENTI_TWITTER((char) 0xea7c),
        ENTI_VIMEO_WITH_CIRCLE((char) 0xea7d),
        ENTI_VIMEO((char) 0xea7e),
        ENTI_YOUTUBE_WITH_CIRCLE((char) 0xea7f),
        ENTI_YOUTUBE((char) 0xea80);

        char entypoCharacter;

        Icon(char character) {
            this.entypoCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return entypoCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface entypoTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (entypoTypeface == null) {
                setTypeface(new Entypo());
            }
            return entypoTypeface;
        }

        private static void setTypeface(Entypo entypoTypeface) {
            Icon.entypoTypeface = entypoTypeface;
        }
    }
}
