package com.rilixtech.foundationiconstypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the FoundationIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class FoundationIcons implements MfbTypeface {
    private static final String TTF_FILE = "foundation-icons-font-v3.0.0.1.ttf";
    private static final String FOUNDATION_ICONS_PREFIX = "FOUI";
    public static final String FOUNDATION_ICONS_NAME = "Foundation Icons";
    public static final String FOUNDATION_ICONS_VERSION = "3" + ".0.0.1";
    public static final String FOUNDATION_ICONS_AUTHOR = "ZURB Inc.";
    public static final String FOUNDATION_ICONS_URL = "http://zurb.com/playground/foundation-icon-fonts-3";
    public static final String FOUNDATION_ICONS_DESC = "Customize your icons to be any size, color, style in CSS";
    public static final String FOUNDATION_ICONS_LICENSE = "MIT Open Source License";
    public static final String FOUNDATION_ICONS_LICENSE_URL = "https://github.com/zurb/foundation-icons/blob/master/MIT-LICENSE.txt";

    private static Font foundationIconsTypeface = null;
    private static HashMap<String, Character> foundationIconsCharMap;

    /**
     * FoundationIcons MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which FoundationIcons MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the FoundationIcons icon characters in a HashMap.
     *
     * @return HashMap of all FoundationIcons icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (foundationIconsCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.foundationIconsCharacter);
            }
            setChars(characterHashMap);
        }
        return foundationIconsCharMap;
    }

    /**
     * Set the FoundationIcons Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        foundationIconsCharMap = characterHashMap;
    }

    /**
     * Return the FoundationIcons Mapping Prefix.
     *
     * @return FoundationIcons Mapping Prefix, used by all FoundationIcons icons.
     */
    @Override public String getMappingPrefix() {
        return FOUNDATION_ICONS_PREFIX;
    }

    @Override public String getFontName() {
        return FOUNDATION_ICONS_NAME;
    }

    @Override public String getVersion() {
        return FOUNDATION_ICONS_VERSION;
    }

    @Override public int getIconCount() {
        return foundationIconsCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> foundationIconsKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            foundationIconsKeyList.add(value.name());
        }
        return foundationIconsKeyList;
    }

    @Override public String getAuthor() {
        return FOUNDATION_ICONS_AUTHOR;
    }

    @Override public String getUrl() {
        return FOUNDATION_ICONS_URL;
    }

    @Override public String getDescription() {
        return FOUNDATION_ICONS_DESC;
    }

    @Override public String getLicense() {
        return FOUNDATION_ICONS_LICENSE;
    }

    @Override public String getLicenseUrl() {
        return FOUNDATION_ICONS_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (foundationIconsTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return foundationIconsTypeface;
    }

    private static void cacheTypeface(Font font) {
        foundationIconsTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by FoundationIcons MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        FOUI_ADDRESS_BOOK((char) 0xf100),
        FOUI_ALERT((char) 0xf101),
        FOUI_ALIGN_CENTER((char) 0xf102),
        FOUI_ALIGN_JUSTIFY((char) 0xf103),
        FOUI_ALIGN_LEFT((char) 0xf104),
        FOUI_ALIGN_RIGHT((char) 0xf105),
        FOUI_ANCHOR((char) 0xf106),
        FOUI_ANNOTATE((char) 0xf107),
        FOUI_ARCHIVE((char) 0xf108),
        FOUI_ARROW_DOWN((char) 0xf109),
        FOUI_ARROW_LEFT((char) 0xf10a),
        FOUI_ARROW_RIGHT((char) 0xf10b),
        FOUI_ARROW_UP((char) 0xf10c),
        FOUI_ARROWS_COMPRESS((char) 0xf10d),
        FOUI_ARROWS_EXPAND((char) 0xf10e),
        FOUI_ARROWS_IN((char) 0xf10f),
        FOUI_ARROWS_OUT((char) 0xf110),
        FOUI_ASL((char) 0xf111),
        FOUI_ASTERISK((char) 0xf112),
        FOUI_AT_SIGN((char) 0xf113),
        FOUI_BACKGROUND_COLOR((char) 0xf114),
        FOUI_BATTERY_EMPTY((char) 0xf115),
        FOUI_BATTERY_FULL((char) 0xf116),
        FOUI_BATTERY_HALF((char) 0xf117),
        FOUI_BITCOIN_CIRCLE((char) 0xf118),
        FOUI_BITCOIN((char) 0xf119),
        FOUI_BLIND((char) 0xf11a),
        FOUI_BLUETOOTH((char) 0xf11b),
        FOUI_BOLD((char) 0xf11c),
        FOUI_BOOK_BOOKMARK((char) 0xf11d),
        FOUI_BOOK((char) 0xf11e),
        FOUI_BOOKMARK((char) 0xf11f),
        FOUI_BRAILLE((char) 0xf120),
        FOUI_BURST_NEW((char) 0xf121),
        FOUI_BURST_SALE((char) 0xf122),
        FOUI_BURST((char) 0xf123),
        FOUI_CALENDAR((char) 0xf124),
        FOUI_CAMERA((char) 0xf125),
        FOUI_CHECK((char) 0xf126),
        FOUI_CHECKBOX((char) 0xf127),
        FOUI_CLIPBOARD_NOTES((char) 0xf128),
        FOUI_CLIPBOARD_PENCIL((char) 0xf129),
        FOUI_CLIPBOARD((char) 0xf12a),
        FOUI_CLOCK((char) 0xf12b),
        FOUI_CLOSED_CAPTION((char) 0xf12c),
        FOUI_CLOUD((char) 0xf12d),
        FOUI_COMMENTI_MINUS((char) 0xf12e),
        FOUI_COMMENTI_QUOTES((char) 0xf12f),
        FOUI_COMMENTI_VIDEO((char) 0xf130),
        FOUI_COMMENT((char) 0xf131),
        FOUI_COMMENTS((char) 0xf132),
        FOUI_COMPASS((char) 0xf133),
        FOUI_CONTRAST((char) 0xf134),
        FOUI_CREDIT_CARD((char) 0xf135),
        FOUI_CROP((char) 0xf136),
        FOUI_CROWN((char) 0xf137),
        FOUI_CSS3((char) 0xf138),
        FOUI_DATABASE((char) 0xf139),
        FOUI_DIE_FIVE((char) 0xf13a),
        FOUI_DIE_FOUR((char) 0xf13b),
        FOUI_DIE_ONE((char) 0xf13c),
        FOUI_DIE_SIX((char) 0xf13d),
        FOUI_DIE_THREE((char) 0xf13e),
        FOUI_DIE_TWO((char) 0xf13f),
        FOUI_DISLIKE((char) 0xf140),
        FOUI_DOLLAR_BILL((char) 0xf141),
        FOUI_DOLLAR((char) 0xf142),
        FOUI_DOWNLOAD((char) 0xf143),
        FOUI_EJECT((char) 0xf144),
        FOUI_ELEVATOR((char) 0xf145),
        FOUI_EURO((char) 0xf146),
        FOUI_EYE((char) 0xf147),
        FOUI_FAST_FORWARD((char) 0xf148),
        FOUI_FEMALE_SYMBOL((char) 0xf149),
        FOUI_FEMALE((char) 0xf14a),
        FOUI_FILTER((char) 0xf14b),
        FOUI_FIRST_AID((char) 0xf14c),
        FOUI_FLAG((char) 0xf14d),
        FOUI_FOLDER_ADD((char) 0xf14e),
        FOUI_FOLDER_LOCK((char) 0xf14f),
        FOUI_FOLDER((char) 0xf150),
        FOUI_FOOT((char) 0xf151),
        FOUI_FOUNDATION((char) 0xf152),
        FOUI_GRAPH_BAR((char) 0xf153),
        FOUI_GRAPH_HORIZONTAL((char) 0xf154),
        FOUI_GRAPH_PIE((char) 0xf155),
        FOUI_GRAPH_TREND((char) 0xf156),
        FOUI_GUIDE_DOG((char) 0xf157),
        FOUI_HEARING_AID((char) 0xf158),
        FOUI_HEART((char) 0xf159),
        FOUI_HOME((char) 0xf15a),
        FOUI_HTML5((char) 0xf15b),
        FOUI_INDENTI_LESS((char) 0xf15c),
        FOUI_INDENTI_MORE((char) 0xf15d),
        FOUI_INFO((char) 0xf15e),
        FOUI_ITALIC((char) 0xf15f),
        FOUI_KEY((char) 0xf160),
        FOUI_LAPTOP((char) 0xf161),
        FOUI_LAYOUT((char) 0xf162),
        FOUI_LIGHTBULB((char) 0xf163),
        FOUI_LIKE((char) 0xf164),
        FOUI_LINK((char) 0xf165),
        FOUI_LIST_BULLET((char) 0xf166),
        FOUI_LIST_NUMBER((char) 0xf167),
        FOUI_LIST_THUMBNAILS((char) 0xf168),
        FOUI_LIST((char) 0xf169),
        FOUI_LOCK((char) 0xf16a),
        FOUI_LOOP((char) 0xf16b),
        FOUI_MAGNIFYING_GLASS((char) 0xf16c),
        FOUI_MAIL((char) 0xf16d),
        FOUI_MALE_FEMALE((char) 0xf16e),
        FOUI_MALE_SYMBOL((char) 0xf16f),
        FOUI_MALE((char) 0xf170),
        FOUI_MAP((char) 0xf171),
        FOUI_MARKER((char) 0xf172),
        FOUI_MEGAPHONE((char) 0xf173),
        FOUI_MICROPHONE((char) 0xf174),
        FOUI_MINUS_CIRCLE((char) 0xf175),
        FOUI_MINUS((char) 0xf176),
        FOUI_MOBILE_SIGNAL((char) 0xf177),
        FOUI_MOBILE((char) 0xf178),
        FOUI_MONITOR((char) 0xf179),
        FOUI_MOUNTAINS((char) 0xf17a),
        FOUI_MUSIC((char) 0xf17b),
        FOUI_NEXT((char) 0xf17c),
        FOUI_NO_DOGS((char) 0xf17d),
        FOUI_NO_SMOKING((char) 0xf17e),
        FOUI_PAGE_ADD((char) 0xf17f),
        FOUI_PAGE_COPY((char) 0xf180),
        FOUI_PAGE_CSV((char) 0xf181),
        FOUI_PAGE_DELETE((char) 0xf182),
        FOUI_PAGE_DOC((char) 0xf183),
        FOUI_PAGE_EDIT((char) 0xf184),
        FOUI_PAGE_EXPORT_CSV((char) 0xf185),
        FOUI_PAGE_EXPORT_DOC((char) 0xf186),
        FOUI_PAGE_EXPORT_PDF((char) 0xf187),
        FOUI_PAGE_EXPORT((char) 0xf188),
        FOUI_PAGE_FILLED((char) 0xf189),
        FOUI_PAGE_MULTIPLE((char) 0xf18a),
        FOUI_PAGE_PDF((char) 0xf18b),
        FOUI_PAGE_REMOVE((char) 0xf18c),
        FOUI_PAGE_SEARCH((char) 0xf18d),
        FOUI_PAGE((char) 0xf18e),
        FOUI_PAINT_BUCKET((char) 0xf18f),
        FOUI_PAPERCLIP((char) 0xf190),
        FOUI_PAUSE((char) 0xf191),
        FOUI_PAW((char) 0xf192),
        FOUI_PAYPAL((char) 0xf193),
        FOUI_PENCIL((char) 0xf194),
        FOUI_PHOTO((char) 0xf195),
        FOUI_PLAY_CIRCLE((char) 0xf196),
        FOUI_PLAY_VIDEO((char) 0xf197),
        FOUI_PLAY((char) 0xf198),
        FOUI_PLUS((char) 0xf199),
        FOUI_POUND((char) 0xf19a),
        FOUI_POWER((char) 0xf19b),
        FOUI_PREVIOUS((char) 0xf19c),
        FOUI_PRICE_TAG((char) 0xf19d),
        FOUI_PRICETAG_MULTIPLE((char) 0xf19e),
        FOUI_PRINT((char) 0xf19f),
        FOUI_PROHIBITED((char) 0xf1a0),
        FOUI_PROJECTION_SCREEN((char) 0xf1a1),
        FOUI_PUZZLE((char) 0xf1a2),
        FOUI_QUOTE((char) 0xf1a3),
        FOUI_RECORD((char) 0xf1a4),
        FOUI_REFRESH((char) 0xf1a5),
        FOUI_RESULTS_DEMOGRAPHICS((char) 0xf1a6),
        FOUI_RESULTS((char) 0xf1a7),
        FOUI_REWIND_TEN((char) 0xf1a8),
        FOUI_REWIND((char) 0xf1a9),
        FOUI_RSS((char) 0xf1aa),
        FOUI_SAFETY_CONE((char) 0xf1ab),
        FOUI_SAVE((char) 0xf1ac),
        FOUI_SHARE((char) 0xf1ad),
        FOUI_SHERIFF_BADGE((char) 0xf1ae),
        FOUI_SHIELD((char) 0xf1af),
        FOUI_SHOPPING_BAG((char) 0xf1b0),
        FOUI_SHOPPING_CART((char) 0xf1b1),
        FOUI_SHUFFLE((char) 0xf1b2),
        FOUI_SKULL((char) 0xf1b3),
        FOUI_SOCIAL_500PX((char) 0xf1b4),
        FOUI_SOCIAL_ADOBE((char) 0xf1b5),
        FOUI_SOCIAL_AMAZON((char) 0xf1b6),
        FOUI_SOCIAL_APPLE((char) 0xf1b8),
        FOUI_SOCIAL_BEHANCE((char) 0xf1b9),
        FOUI_SOCIAL_BING((char) 0xf1ba),
        FOUI_SOCIAL_BLOGGER((char) 0xf1bb),
        FOUI_SOCIAL_DELICIOUS((char) 0xf1bc),
        FOUI_SOCIAL_DESIGNER_NEWS((char) 0xf1bd),
        FOUI_SOCIAL_DEVIANT_ART((char) 0xf1be),
        FOUI_SOCIAL_DIGG((char) 0xf1bf),
        FOUI_SOCIAL_DRIBBBLE((char) 0xf1c0),
        FOUI_SOCIAL_DRIVE((char) 0xf1c1),
        FOUI_SOCIAL_DROPBOX((char) 0xf1c2),
        FOUI_SOCIAL_EVERNOTE((char) 0xf1c3),
        FOUI_SOCIAL_FACEBOOK((char) 0xf1c4),
        FOUI_SOCIAL_FLICKR((char) 0xf1c5),
        FOUI_SOCIAL_FORRST((char) 0xf1c6),
        FOUI_SOCIAL_FOURSQUARE((char) 0xf1c7),
        FOUI_SOCIAL_GAME_CENTER((char) 0xf1c8),
        FOUI_SOCIAL_GITHUB((char) 0xf1c9),
        FOUI_SOCIAL_GOOGLE_PLUS((char) 0xf1ca),
        FOUI_SOCIAL_HACKER_NEWS((char) 0xf1cb),
        FOUI_SOCIAL_HI5((char) 0xf1cc),
        FOUI_SOCIAL_INSTAGRAM((char) 0xf1cd),
        FOUI_SOCIAL_JOOMLA((char) 0xf1ce),
        FOUI_SOCIAL_LASTFM((char) 0xf1cf),
        FOUI_SOCIAL_LINKEDIN((char) 0xf1d0),
        FOUI_SOCIAL_MEDIUM((char) 0xf1d1),
        FOUI_SOCIAL_MYSPACE((char) 0xf1d2),
        FOUI_SOCIAL_ORKUT((char) 0xf1d3),
        FOUI_SOCIAL_PATH((char) 0xf1d4),
        FOUI_SOCIAL_PICASA((char) 0xf1d5),
        FOUI_SOCIAL_PINTEREST((char) 0xf1d6),
        FOUI_SOCIAL_RDIO((char) 0xf1d7),
        FOUI_SOCIAL_REDDIT((char) 0xf1d8),
        FOUI_SOCIAL_SKILLSHARE((char) 0xf1d9),
        FOUI_SOCIAL_SKYPE((char) 0xf1da),
        FOUI_SOCIAL_SMASHING_MAG((char) 0xf1db),
        FOUI_SOCIAL_SNAPCHAT((char) 0xf1dc),
        FOUI_SOCIAL_SPOTIFY((char) 0xf1dd),
        FOUI_SOCIAL_SQUIDOO((char) 0xf1de),
        FOUI_SOCIAL_STACK_OVERFLOW((char) 0xf1df),
        FOUI_SOCIAL_STEAM((char) 0xf1e0),
        FOUI_SOCIAL_STUMBLEUPON((char) 0xf1e1),
        FOUI_SOCIAL_TREEHOUSE((char) 0xf1e2),
        FOUI_SOCIAL_TUMBLR((char) 0xf1e3),
        FOUI_SOCIAL_TWITTER((char) 0xf1e4),
        FOUI_SOCIAL_VIMEO((char) 0xf1e5),
        FOUI_SOCIAL_WINDOWS((char) 0xf1e6),
        FOUI_SOCIAL_XBOX((char) 0xf1e7),
        FOUI_SOCIAL_YAHOO((char) 0xf1e8),
        FOUI_SOCIAL_YELP((char) 0xf1e9),
        FOUI_SOCIAL_YOUTUBE((char) 0xf1ea),
        FOUI_SOCIAL_ZERPLY((char) 0xf1eb),
        FOUI_SOCIAL_ZURB((char) 0xf1ec),
        FOUI_SOUND((char) 0xf1ed),
        FOUI_STAR((char) 0xf1ee),
        FOUI_STOP((char) 0xf1ef),
        FOUI_STRIKETHROUGH((char) 0xf1f0),
        FOUI_SUBSCRIPT((char) 0xf1f1),
        FOUI_SUPERSCRIPT((char) 0xf1f2),
        FOUI_TABLET_LANDSCAPE((char) 0xf1f3),
        FOUI_TABLET_PORTRAIT((char) 0xf1f4),
        FOUI_TARGET_TWO((char) 0xf1f5),
        FOUI_TARGET((char) 0xf1f6),
        FOUI_TELEPHONE_ACCESSIBLE((char) 0xf1f7),
        FOUI_TELEPHONE((char) 0xf1f8),
        FOUI_TEXT_COLOR((char) 0xf1f9),
        FOUI_THUMBNAILS((char) 0xf1fa),
        FOUI_TICKET((char) 0xf1fb),
        FOUI_TORSO_BUSINESS((char) 0xf1fc),
        FOUI_TORSO_FEMALE((char) 0xf1fd),
        FOUI_TORSO((char) 0xf1fe),
        FOUI_TORSOS_ALL_FEMALE((char) 0xf1ff),
        FOUI_TORSOS_ALL((char) 0xf200),
        FOUI_TORSOS_FEMALE_MALE((char) 0xf201),
        FOUI_TORSOS_MALE_FEMALE((char) 0xf202),
        FOUI_TORSOS((char) 0xf203),
        FOUI_TRASH((char) 0xf204),
        FOUI_TREES((char) 0xf205),
        FOUI_TROPHY((char) 0xf206),
        FOUI_UNDERLINE((char) 0xf207),
        FOUI_UNIVERSAL_ACCESS((char) 0xf208),
        FOUI_UNLINK((char) 0xf209),
        FOUI_UNLOCK((char) 0xf20a),
        FOUI_UPLOAD_CLOUD((char) 0xf20b),
        FOUI_UPLOAD((char) 0xf20c),
        FOUI_USB((char) 0xf20d),
        FOUI_VIDEO((char) 0xf20e),
        FOUI_VOLUME_NONE((char) 0xf20f),
        FOUI_VOLUME_STRIKE((char) 0xf210),
        FOUI_VOLUME((char) 0xf211),
        FOUI_WEB((char) 0xf212),
        FOUI_WHEELCHAIR((char) 0xf213),
        FOUI_WIDGET((char) 0xf214),
        FOUI_WRENCH((char) 0xf215),
        FOUI_X_CIRCLE((char) 0xf216),
        FOUI_X((char) 0xf217),
        FOUI_YEN((char) 0xf218),
        FOUI_ZOOM_IN((char) 0xf219),
        FOUI_ZOOM_OUT((char) 0xf21a);

        char foundationIconsCharacter;

        Icon(char character) {
            this.foundationIconsCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return foundationIconsCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static MfbTypeface foundationIconsTypeface;

        @Override
        public MfbTypeface getTypeface() {
            if (foundationIconsTypeface == null) {
                setTypeface(new FoundationIcons());
            }
            return foundationIconsTypeface;
        }

        private static void setTypeface(FoundationIcons foundationIconsTypeface) {
            Icon.foundationIconsTypeface = foundationIconsTypeface;
        }
    }
}
