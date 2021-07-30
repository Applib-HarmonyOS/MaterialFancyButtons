package com.rilixtech.entypo_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Entypo font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Entypo implements ITypeface {
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
     * Entypo IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Entypo IIcon is to be retrieved.
     */
    @Override
    public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Entypo ITypeface.
     */
    public enum Icon implements IIcon {
        ENTI_ADD_TO_LIST('\ue900'),
        ENTI_CLASSIC_COMPUTER('\ue901'),
        ENTI_CONTROLLER_FAST_BACKWARD('\ue902'),
        ENTI_CREATIVE_COMMONS_ATTRIBUTION('\ue903'),
        ENTI_CREATIVE_COMMONS_NODERIVS('\ue904'),
        ENTI_CREATIVE_COMMONS_NONCOMMERCIAL_EU('\ue905'),
        ENTI_CREATIVE_COMMONS_NONCOMMERCIAL_US('\ue906'),
        ENTI_CREATIVE_COMMONS_PUBLIC_DOMAIN('\ue907'),
        ENTI_CREATIVE_COMMONS_REMIX('\ue908'),
        ENTI_CREATIVE_COMMONS_SHARE('\ue909'),
        ENTI_CREATIVE_COMMONS_SHAREALIKE('\ue90a'),
        ENTI_CREATIVE_COMMONS('\ue90b'),
        ENTI_DOCUMENTI_LANDSCAPE('\ue90c'),
        ENTI_REMOVE_USER('\ue90d'),
        ENTI_WARNING('\ue90e'),
        ENTI_ARROW_BOLD_DOWN('\ue90f'),
        ENTI_ARROW_BOLD_LEFT('\ue910'),
        ENTI_ARROW_BOLD_RIGHT('\ue911'),
        ENTI_ARROW_BOLD_UP('\ue912'),
        ENTI_ARROW_DOWN('\ue913'),
        ENTI_ARROW_LEFT('\ue914'),
        ENTI_ARROW_LONG_DOWN('\ue915'),
        ENTI_ARROW_LONG_LEFT('\ue916'),
        ENTI_ARROW_LONG_RIGHT('\ue917'),
        ENTI_ARROW_LONG_UP('\ue918'),
        ENTI_ARROW_RIGHT('\ue919'),
        ENTI_ARROW_UP('\ue91a'),
        ENTI_ARROW_WITH_CIRCLE_DOWN('\ue91b'),
        ENTI_ARROW_WITH_CIRCLE_LEFT('\ue91c'),
        ENTI_ARROW_WITH_CIRCLE_RIGHT('\ue91d'),
        ENTI_ARROW_WITH_CIRCLE_UP('\ue91e'),
        ENTI_BOOKMARK('\ue91f'),
        ENTI_BOOKMARKS('\ue920'),
        ENTI_CHEVRON_DOWN('\ue921'),
        ENTI_CHEVRON_LEFT('\ue922'),
        ENTI_CHEVRON_RIGHT('\ue923'),
        ENTI_CHEVRON_SMALL_DOWN('\ue924'),
        ENTI_CHEVRON_SMALL_LEFT('\ue925'),
        ENTI_CHEVRON_SMALL_RIGHT('\ue926'),
        ENTI_CHEVRON_SMALL_UP('\ue927'),
        ENTI_CHEVRON_THIN_DOWN('\ue928'),
        ENTI_CHEVRON_THIN_LEFT('\ue929'),
        ENTI_CHEVRON_THIN_RIGHT('\ue92a'),
        ENTI_CHEVRON_THIN_UP('\ue92b'),
        ENTI_CHEVRON_UP('\ue92c'),
        ENTI_CHEVRON_WITH_CIRCLE_DOWN('\ue92d'),
        ENTI_CHEVRON_WITH_CIRCLE_LEFT('\ue92e'),
        ENTI_CHEVRON_WITH_CIRCLE_RIGHT('\ue92f'),
        ENTI_CHEVRON_WITH_CIRCLE_UP('\ue930'),
        ENTI_CLOUD('\ue931'),
        ENTI_CONTROLLER_FAST_FORWARD('\ue932'),
        ENTI_CONTROLLER_JUMP_TO_START('\ue933'),
        ENTI_CONTROLLER_NEXT('\ue934'),
        ENTI_CONTROLLER_PAUS('\ue935'),
        ENTI_CONTROLLER_PLAY('\ue936'),
        ENTI_CONTROLLER_RECORD('\ue937'),
        ENTI_CONTROLLER_STOP('\ue938'),
        ENTI_CONTROLLER_VOLUME('\ue939'),
        ENTI_DOT_SINGLE('\ue93a'),
        ENTI_DOTS_THREE_HORIZONTAL('\ue93b'),
        ENTI_DOTS_THREE_VERTICAL('\ue93c'),
        ENTI_DOTS_TWO_HORIZONTAL('\ue93d'),
        ENTI_DOTS_TWO_VERTICAL('\ue93e'),
        ENTI_DOWNLOAD('\ue93f'),
        ENTI_EMOJI_FLIRT('\ue940'),
        ENTI_FLOW_BRANCH('\ue941'),
        ENTI_FLOW_CASCADE('\ue942'),
        ENTI_FLOW_LINE('\ue943'),
        ENTI_FLOW_PARALLEL('\ue944'),
        ENTI_FLOW_TREE('\ue945'),
        ENTI_INSTALL('\ue946'),
        ENTI_LAYERS('\ue947'),
        ENTI_OPEN_BOOK('\ue948'),
        ENTI_RESIZE_100('\ue949'),
        ENTI_RESIZE_FULL_SCREEN('\ue94a'),
        ENTI_SAVE('\ue94b'),
        ENTI_SELECT_ARROWS('\ue94c'),
        ENTI_SOUND_MUTE('\ue94d'),
        ENTI_SOUND('\ue94e'),
        ENTI_TRASH('\ue94f'),
        ENTI_TRIANGLE_DOWN('\ue950'),
        ENTI_TRIANGLE_LEFT('\ue951'),
        ENTI_TRIANGLE_RIGHT('\ue952'),
        ENTI_TRIANGLE_UP('\ue953'),
        ENTI_UNINSTALL('\ue954'),
        ENTI_UPLOAD_TO_CLOUD('\ue955'),
        ENTI_UPLOAD('\ue956'),
        ENTI_ADD_USER('\ue957'),
        ENTI_ADDRESS('\ue958'),
        ENTI_ADJUST('\ue959'),
        ENTI_AIR('\ue95a'),
        ENTI_AIRCRAFT_LANDING('\ue95b'),
        ENTI_AIRCRAFT_TAKE_OFF('\ue95c'),
        ENTI_AIRCRAFT('\ue95d'),
        ENTI_ALIGN_BOTTOM('\ue95e'),
        ENTI_ALIGN_HORIZONTAL_MIDDLE('\ue95f'),
        ENTI_ALIGN_LEFT('\ue960'),
        ENTI_ALIGN_RIGHT('\ue961'),
        ENTI_ALIGN_TOP('\ue962'),
        ENTI_ALIGN_VERTICAL_MIDDLE('\ue963'),
        ENTI_ARCHIVE('\ue964'),
        ENTI_AREA_GRAPH('\ue965'),
        ENTI_ATTACHMENT('\ue966'),
        ENTI_AWARENESS_RIBBON('\ue967'),
        ENTI_BACK_IN_TIME('\ue968'),
        ENTI_BACK('\ue969'),
        ENTI_BAR_GRAPH('\ue96a'),
        ENTI_BATTERY('\ue96b'),
        ENTI_BEAMED_NOTE('\ue96c'),
        ENTI_BELL('\ue96d'),
        ENTI_BLACKBOARD('\ue96e'),
        ENTI_BLOCK('\ue96f'),
        ENTI_BOOK('\ue970'),
        ENTI_BOWL('\ue971'),
        ENTI_BOX('\ue972'),
        ENTI_BRIEFCASE('\ue973'),
        ENTI_BROWSER('\ue974'),
        ENTI_BRUSH('\ue975'),
        ENTI_BUCKET('\ue976'),
        ENTI_CAKE('\ue977'),
        ENTI_CALCULATOR('\ue978'),
        ENTI_CALENDAR('\ue979'),
        ENTI_CAMERA('\ue97a'),
        ENTI_CCW('\ue97b'),
        ENTI_CHAT('\ue97c'),
        ENTI_CHECK('\ue97d'),
        ENTI_CIRCLE_WITH_CROSS('\ue97e'),
        ENTI_CIRCLE_WITH_MINUS('\ue97f'),
        ENTI_CIRCLE_WITH_PLUS('\ue980'),
        ENTI_CIRCLE('\ue981'),
        ENTI_CIRCULAR_GRAPH('\ue982'),
        ENTI_CLAPPERBOARD('\ue983'),
        ENTI_CLIPBOARD('\ue984'),
        ENTI_CLOCK('\ue985'),
        ENTI_CODE('\ue986'),
        ENTI_COG('\ue987'),
        ENTI_COLOURS('\ue988'),
        ENTI_COMPASS('\ue989'),
        ENTI_COPY('\ue98a'),
        ENTI_CREDIT_CARD('\ue98b'),
        ENTI_CREDIT('\ue98c'),
        ENTI_CROSS('\ue98d'),
        ENTI_CUP('\ue98e'),
        ENTI_CW('\ue98f'),
        ENTI_CYCLE('\ue990'),
        ENTI_DATABASE('\ue991'),
        ENTI_DIAL_PAD('\ue992'),
        ENTI_DIRECTION('\ue993'),
        ENTI_DOCUMENT('\ue994'),
        ENTI_DOCUMENTS('\ue995'),
        ENTI_DRINK('\ue996'),
        ENTI_DRIVE('\ue997'),
        ENTI_DROP('\ue998'),
        ENTI_EDIT('\ue999'),
        ENTI_EMAIL('\ue99a'),
        ENTI_EMOJI_HAPPY('\ue99b'),
        ENTI_EMOJI_NEUTRAL('\ue99c'),
        ENTI_EMOJI_SAD('\ue99d'),
        ENTI_ERASE('\ue99e'),
        ENTI_ERASER('\ue99f'),
        ENTI_EXPORT('\ue9a0'),
        ENTI_EYE('\ue9a1'),
        ENTI_FEATHER('\ue9a2'),
        ENTI_FLAG('\ue9a3'),
        ENTI_FLASH('\ue9a4'),
        ENTI_FLASHLIGHT('\ue9a5'),
        ENTI_FLAT_BRUSH('\ue9a6'),
        ENTI_FOLDER_IMAGES('\ue9a7'),
        ENTI_FOLDER_MUSIC('\ue9a8'),
        ENTI_FOLDER_VIDEO('\ue9a9'),
        ENTI_FOLDER('\ue9aa'),
        ENTI_FORWARD('\ue9ab'),
        ENTI_FUNNEL('\ue9ac'),
        ENTI_GAME_CONTROLLER('\ue9ad'),
        ENTI_GAUGE('\ue9ae'),
        ENTI_GLOBE('\ue9af'),
        ENTI_GRADUATION_CAP('\ue9b0'),
        ENTI_GRID('\ue9b1'),
        ENTI_HAIR_CROSS('\ue9b2'),
        ENTI_HAND('\ue9b3'),
        ENTI_HEART_OUTLINED('\ue9b4'),
        ENTI_HEART('\ue9b5'),
        ENTI_HELP_WITH_CIRCLE('\ue9b6'),
        ENTI_HELP('\ue9b7'),
        ENTI_HOME('\ue9b8'),
        ENTI_HOUR_GLASS('\ue9b9'),
        ENTI_IMAGE_INVERTED('\ue9ba'),
        ENTI_IMAGE('\ue9bb'),
        ENTI_IMAGES('\ue9bc'),
        ENTI_INBOX('\ue9bd'),
        ENTI_INFINITY('\ue9be'),
        ENTI_INFO_WITH_CIRCLE('\ue9bf'),
        ENTI_INFO('\ue9c0'),
        ENTI_KEY('\ue9c1'),
        ENTI_KEYBOARD('\ue9c2'),
        ENTI_LAB_FLASK('\ue9c3'),
        ENTI_LANDLINE('\ue9c4'),
        ENTI_LANGUAGE('\ue9c5'),
        ENTI_LAPTOP('\ue9c6'),
        ENTI_LEAF('\ue9c7'),
        ENTI_LEVEL_DOWN('\ue9c8'),
        ENTI_LEVEL_UP('\ue9c9'),
        ENTI_LIFEBUOY('\ue9ca'),
        ENTI_LIGHT_BULB('\ue9cb'),
        ENTI_LIGHT_DOWN('\ue9cc'),
        ENTI_LIGHT_UP('\ue9cd'),
        ENTI_LINE_GRAPH('\ue9ce'),
        ENTI_LINK('\ue9cf'),
        ENTI_LIST('\ue9d0'),
        ENTI_LOCATION_PIN('\ue9d1'),
        ENTI_LOCATION('\ue9d2'),
        ENTI_LOCK_OPEN('\ue9d3'),
        ENTI_LOCK('\ue9d4'),
        ENTI_LOG_OUT('\ue9d5'),
        ENTI_LOGIN('\ue9d6'),
        ENTI_LOOP('\ue9d7'),
        ENTI_MAGNET('\ue9d8'),
        ENTI_MAGNIFYING_GLASS('\ue9d9'),
        ENTI_MAIL('\ue9da'),
        ENTI_MAN('\ue9db'),
        ENTI_MAP('\ue9dc'),
        ENTI_MASK('\ue9dd'),
        ENTI_MEDAL('\ue9de'),
        ENTI_MEGAPHONE('\ue9df'),
        ENTI_MENU('\ue9e0'),
        ENTI_MESSAGE('\ue9e1'),
        ENTI_MIC('\ue9e2'),
        ENTI_MINUS('\ue9e3'),
        ENTI_MOBILE('\ue9e4'),
        ENTI_MODERN_MIC('\ue9e5'),
        ENTI_MOON('\ue9e6'),
        ENTI_MOUSE('\ue9e7'),
        ENTI_MUSIC('\ue9e8'),
        ENTI_NETWORK('\ue9e9'),
        ENTI_NEW_MESSAGE('\ue9ea'),
        ENTI_NEW('\ue9eb'),
        ENTI_NEWS('\ue9ec'),
        ENTI_NOTE('\ue9ed'),
        ENTI_NOTIFICATION('\ue9ee'),
        ENTI_OLD_MOBILE('\ue9ef'),
        ENTI_OLD_PHONE('\ue9f0'),
        ENTI_PALETTE('\ue9f1'),
        ENTI_PAPER_PLANE('\ue9f2'),
        ENTI_PENCIL('\ue9f3'),
        ENTI_PHONE('\ue9f4'),
        ENTI_PIE_CHART('\ue9f5'),
        ENTI_PIN('\ue9f6'),
        ENTI_PLUS('\ue9f7'),
        ENTI_POPUP('\ue9f8'),
        ENTI_POWER_PLUG('\ue9f9'),
        ENTI_PRICE_RIBBON('\ue9fa'),
        ENTI_PRICE_TAG('\ue9fb'),
        ENTI_PRINT('\ue9fc'),
        ENTI_PROGRESS_EMPTY('\ue9fd'),
        ENTI_PROGRESS_FULL('\ue9fe'),
        ENTI_PROGRESS_ONE('\ue9ff'),
        ENTI_PROGRESS_TWO('\uea00'),
        ENTI_PUBLISH('\uea01'),
        ENTI_QUOTE('\uea02'),
        ENTI_RADIO('\uea03'),
        ENTI_REPLY_ALL('\uea04'),
        ENTI_REPLY('\uea05'),
        ENTI_RETWEET('\uea06'),
        ENTI_ROCKET('\uea07'),
        ENTI_ROUND_BRUSH('\uea08'),
        ENTI_RSS('\uea09'),
        ENTI_RULER('\uea0a'),
        ENTI_SCISSORS('\uea0b'),
        ENTI_SHARE_ALTERNITIVE('\uea0c'),
        ENTI_SHARE('\uea0d'),
        ENTI_SHAREABLE('\uea0e'),
        ENTI_SHIELD('\uea0f'),
        ENTI_SHOP('\uea10'),
        ENTI_SHOPPING_BAG('\uea11'),
        ENTI_SHOPPING_BASKET('\uea12'),
        ENTI_SHOPPING_CART('\uea13'),
        ENTI_SHUFFLE('\uea14'),
        ENTI_SIGNAL('\uea15'),
        ENTI_SOUND_MIX('\uea16'),
        ENTI_SPORTS_CLUB('\uea17'),
        ENTI_SPREADSHEET('\uea18'),
        ENTI_SQUARED_CROSS('\uea19'),
        ENTI_SQUARED_MINUS('\uea1a'),
        ENTI_SQUARED_PLUS('\uea1b'),
        ENTI_STAR_OUTLINED('\uea1c'),
        ENTI_STAR('\uea1d'),
        ENTI_STOPWATCH('\uea1e'),
        ENTI_SUITCASE('\uea1f'),
        ENTI_SWAP('\uea20'),
        ENTI_SWEDEN('\uea21'),
        ENTI_SWITCH('\uea22'),
        ENTI_TABLET('\uea23'),
        ENTI_TAG('\uea24'),
        ENTI_TEXT_DOCUMENTI_INVERTED('\uea25'),
        ENTI_TEXT_DOCUMENT('\uea26'),
        ENTI_TEXT('\uea27'),
        ENTI_THERMOMETER('\uea28'),
        ENTI_THUMBS_DOWN('\uea29'),
        ENTI_THUMBS_UP('\uea2a'),
        ENTI_THUNDER_CLOUD('\uea2b'),
        ENTI_TICKET('\uea2c'),
        ENTI_TIME_SLOT('\uea2d'),
        ENTI_TOOLS('\uea2e'),
        ENTI_TRAFFIC_CONE('\uea2f'),
        ENTI_TREE('\uea30'),
        ENTI_TROPHY('\uea31'),
        ENTI_TV('\uea32'),
        ENTI_TYPING('\uea33'),
        ENTI_UNREAD('\uea34'),
        ENTI_UNTAG('\uea35'),
        ENTI_USER('\uea36'),
        ENTI_USERS('\uea37'),
        ENTI_V_CARD('\uea38'),
        ENTI_VIDEO('\uea39'),
        ENTI_VINYL('\uea3a'),
        ENTI_VOICEMAIL('\uea3b'),
        ENTI_WALLET('\uea3c'),
        ENTI_WATER('\uea3d'),
        ENTI_500PX_WITH_CIRCLE('\uea3e'),
        ENTI_500PX('\uea3f'),
        ENTI_BASECAMP('\uea40'),
        ENTI_BEHANCE('\uea41'),
        ENTI_CREATIVE_CLOUD('\uea42'),
        ENTI_DROPBOX('\uea43'),
        ENTI_EVERNOTE('\uea44'),
        ENTI_FLATTR('\uea45'),
        ENTI_FOURSQUARE('\uea46'),
        ENTI_GOOGLE_DRIVE('\uea47'),
        ENTI_GOOGLE_HANGOUTS('\uea48'),
        ENTI_GROOVESHARK('\uea49'),
        ENTI_ICLOUD('\uea4a'),
        ENTI_MIXI('\uea4b'),
        ENTI_ONEDRIVE('\uea4c'),
        ENTI_PAYPAL('\uea4d'),
        ENTI_PICASA('\uea4e'),
        ENTI_QQ('\uea4f'),
        ENTI_RDIO_WITH_CIRCLE('\uea50'),
        ENTI_RENREN('\uea51'),
        ENTI_SCRIBD('\uea52'),
        ENTI_SINA_WEIBO('\uea53'),
        ENTI_SKYPE_WITH_CIRCLE('\uea54'),
        ENTI_SKYPE('\uea55'),
        ENTI_SLIDESHARE('\uea56'),
        ENTI_SMASHING('\uea57'),
        ENTI_SOUNDCLOUD('\uea58'),
        ENTI_SPOTIFY_WITH_CIRCLE('\uea59'),
        ENTI_SPOTIFY('\uea5a'),
        ENTI_SWARM('\uea5b'),
        ENTI_VINE_WITH_CIRCLE('\uea5c'),
        ENTI_VINE('\uea5d'),
        ENTI_VK_ALTERNITIVE('\uea5e'),
        ENTI_VK_WITH_CIRCLE('\uea5f'),
        ENTI_VK('\uea60'),
        ENTI_XING_WITH_CIRCLE('\uea61'),
        ENTI_XING('\uea62'),
        ENTI_YELP('\uea63'),
        ENTI_DRIBBBLE_WITH_CIRCLE('\uea64'),
        ENTI_DRIBBBLE('\uea65'),
        ENTI_FACEBOOK_WITH_CIRCLE('\uea66'),
        ENTI_FACEBOOK('\uea67'),
        ENTI_FLICKR_WITH_CIRCLE('\uea68'),
        ENTI_FLICKR('\uea69'),
        ENTI_GITHUB_WITH_CIRCLE('\uea6a'),
        ENTI_GITHUB('\uea6b'),
        ENTI_GOOGLE_WITH_CIRCLE('\uea6c'),
        ENTI_GOOGLE('\uea6d'),
        ENTI_INSTAGRAM_WITH_CIRCLE('\uea6e'),
        ENTI_INSTAGRAM('\uea6f'),
        ENTI_LASTFM_WITH_CIRCLE('\uea70'),
        ENTI_LASTFM('\uea71'),
        ENTI_LINKEDIN_WITH_CIRCLE('\uea72'),
        ENTI_LINKEDIN('\uea73'),
        ENTI_PINTEREST_WITH_CIRCLE('\uea74'),
        ENTI_PINTEREST('\uea75'),
        ENTI_RDIO('\uea76'),
        ENTI_STUMBLEUPON_WITH_CIRCLE('\uea77'),
        ENTI_STUMBLEUPON('\uea78'),
        ENTI_TUMBLR_WITH_CIRCLE('\uea79'),
        ENTI_TUMBLR('\uea7a'),
        ENTI_TWITTER_WITH_CIRCLE('\uea7b'),
        ENTI_TWITTER('\uea7c'),
        ENTI_VIMEO_WITH_CIRCLE('\uea7d'),
        ENTI_VIMEO('\uea7e'),
        ENTI_YOUTUBE_WITH_CIRCLE('\uea7f'),
        ENTI_YOUTUBE('\uea80');

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
        private static ITypeface entypoTypeface;

        @Override
        public ITypeface getTypeface() {
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
