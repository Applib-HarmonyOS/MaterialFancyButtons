package com.rilixtech.foundation_icons_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the FoundationIcons font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class FoundationIcons implements ITypeface {
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
     * FoundationIcons IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which FoundationIcons IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by FoundationIcons ITypeface.
     */
    public enum Icon implements IIcon {
        FOUI_ADDRESS_BOOK('\uf100'),
        FOUI_ALERT('\uf101'),
        FOUI_ALIGN_CENTER('\uf102'),
        FOUI_ALIGN_JUSTIFY('\uf103'),
        FOUI_ALIGN_LEFT('\uf104'),
        FOUI_ALIGN_RIGHT('\uf105'),
        FOUI_ANCHOR('\uf106'),
        FOUI_ANNOTATE('\uf107'),
        FOUI_ARCHIVE('\uf108'),
        FOUI_ARROW_DOWN('\uf109'),
        FOUI_ARROW_LEFT('\uf10a'),
        FOUI_ARROW_RIGHT('\uf10b'),
        FOUI_ARROW_UP('\uf10c'),
        FOUI_ARROWS_COMPRESS('\uf10d'),
        FOUI_ARROWS_EXPAND('\uf10e'),
        FOUI_ARROWS_IN('\uf10f'),
        FOUI_ARROWS_OUT('\uf110'),
        FOUI_ASL('\uf111'),
        FOUI_ASTERISK('\uf112'),
        FOUI_AT_SIGN('\uf113'),
        FOUI_BACKGROUND_COLOR('\uf114'),
        FOUI_BATTERY_EMPTY('\uf115'),
        FOUI_BATTERY_FULL('\uf116'),
        FOUI_BATTERY_HALF('\uf117'),
        FOUI_BITCOIN_CIRCLE('\uf118'),
        FOUI_BITCOIN('\uf119'),
        FOUI_BLIND('\uf11a'),
        FOUI_BLUETOOTH('\uf11b'),
        FOUI_BOLD('\uf11c'),
        FOUI_BOOK_BOOKMARK('\uf11d'),
        FOUI_BOOK('\uf11e'),
        FOUI_BOOKMARK('\uf11f'),
        FOUI_BRAILLE('\uf120'),
        FOUI_BURST_NEW('\uf121'),
        FOUI_BURST_SALE('\uf122'),
        FOUI_BURST('\uf123'),
        FOUI_CALENDAR('\uf124'),
        FOUI_CAMERA('\uf125'),
        FOUI_CHECK('\uf126'),
        FOUI_CHECKBOX('\uf127'),
        FOUI_CLIPBOARD_NOTES('\uf128'),
        FOUI_CLIPBOARD_PENCIL('\uf129'),
        FOUI_CLIPBOARD('\uf12a'),
        FOUI_CLOCK('\uf12b'),
        FOUI_CLOSED_CAPTION('\uf12c'),
        FOUI_CLOUD('\uf12d'),
        FOUI_COMMENTI_MINUS('\uf12e'),
        FOUI_COMMENTI_QUOTES('\uf12f'),
        FOUI_COMMENTI_VIDEO('\uf130'),
        FOUI_COMMENT('\uf131'),
        FOUI_COMMENTS('\uf132'),
        FOUI_COMPASS('\uf133'),
        FOUI_CONTRAST('\uf134'),
        FOUI_CREDIT_CARD('\uf135'),
        FOUI_CROP('\uf136'),
        FOUI_CROWN('\uf137'),
        FOUI_CSS3('\uf138'),
        FOUI_DATABASE('\uf139'),
        FOUI_DIE_FIVE('\uf13a'),
        FOUI_DIE_FOUR('\uf13b'),
        FOUI_DIE_ONE('\uf13c'),
        FOUI_DIE_SIX('\uf13d'),
        FOUI_DIE_THREE('\uf13e'),
        FOUI_DIE_TWO('\uf13f'),
        FOUI_DISLIKE('\uf140'),
        FOUI_DOLLAR_BILL('\uf141'),
        FOUI_DOLLAR('\uf142'),
        FOUI_DOWNLOAD('\uf143'),
        FOUI_EJECT('\uf144'),
        FOUI_ELEVATOR('\uf145'),
        FOUI_EURO('\uf146'),
        FOUI_EYE('\uf147'),
        FOUI_FAST_FORWARD('\uf148'),
        FOUI_FEMALE_SYMBOL('\uf149'),
        FOUI_FEMALE('\uf14a'),
        FOUI_FILTER('\uf14b'),
        FOUI_FIRST_AID('\uf14c'),
        FOUI_FLAG('\uf14d'),
        FOUI_FOLDER_ADD('\uf14e'),
        FOUI_FOLDER_LOCK('\uf14f'),
        FOUI_FOLDER('\uf150'),
        FOUI_FOOT('\uf151'),
        FOUI_FOUNDATION('\uf152'),
        FOUI_GRAPH_BAR('\uf153'),
        FOUI_GRAPH_HORIZONTAL('\uf154'),
        FOUI_GRAPH_PIE('\uf155'),
        FOUI_GRAPH_TREND('\uf156'),
        FOUI_GUIDE_DOG('\uf157'),
        FOUI_HEARING_AID('\uf158'),
        FOUI_HEART('\uf159'),
        FOUI_HOME('\uf15a'),
        FOUI_HTML5('\uf15b'),
        FOUI_INDENTI_LESS('\uf15c'),
        FOUI_INDENTI_MORE('\uf15d'),
        FOUI_INFO('\uf15e'),
        FOUI_ITALIC('\uf15f'),
        FOUI_KEY('\uf160'),
        FOUI_LAPTOP('\uf161'),
        FOUI_LAYOUT('\uf162'),
        FOUI_LIGHTBULB('\uf163'),
        FOUI_LIKE('\uf164'),
        FOUI_LINK('\uf165'),
        FOUI_LIST_BULLET('\uf166'),
        FOUI_LIST_NUMBER('\uf167'),
        FOUI_LIST_THUMBNAILS('\uf168'),
        FOUI_LIST('\uf169'),
        FOUI_LOCK('\uf16a'),
        FOUI_LOOP('\uf16b'),
        FOUI_MAGNIFYING_GLASS('\uf16c'),
        FOUI_MAIL('\uf16d'),
        FOUI_MALE_FEMALE('\uf16e'),
        FOUI_MALE_SYMBOL('\uf16f'),
        FOUI_MALE('\uf170'),
        FOUI_MAP('\uf171'),
        FOUI_MARKER('\uf172'),
        FOUI_MEGAPHONE('\uf173'),
        FOUI_MICROPHONE('\uf174'),
        FOUI_MINUS_CIRCLE('\uf175'),
        FOUI_MINUS('\uf176'),
        FOUI_MOBILE_SIGNAL('\uf177'),
        FOUI_MOBILE('\uf178'),
        FOUI_MONITOR('\uf179'),
        FOUI_MOUNTAINS('\uf17a'),
        FOUI_MUSIC('\uf17b'),
        FOUI_NEXT('\uf17c'),
        FOUI_NO_DOGS('\uf17d'),
        FOUI_NO_SMOKING('\uf17e'),
        FOUI_PAGE_ADD('\uf17f'),
        FOUI_PAGE_COPY('\uf180'),
        FOUI_PAGE_CSV('\uf181'),
        FOUI_PAGE_DELETE('\uf182'),
        FOUI_PAGE_DOC('\uf183'),
        FOUI_PAGE_EDIT('\uf184'),
        FOUI_PAGE_EXPORT_CSV('\uf185'),
        FOUI_PAGE_EXPORT_DOC('\uf186'),
        FOUI_PAGE_EXPORT_PDF('\uf187'),
        FOUI_PAGE_EXPORT('\uf188'),
        FOUI_PAGE_FILLED('\uf189'),
        FOUI_PAGE_MULTIPLE('\uf18a'),
        FOUI_PAGE_PDF('\uf18b'),
        FOUI_PAGE_REMOVE('\uf18c'),
        FOUI_PAGE_SEARCH('\uf18d'),
        FOUI_PAGE('\uf18e'),
        FOUI_PAINT_BUCKET('\uf18f'),
        FOUI_PAPERCLIP('\uf190'),
        FOUI_PAUSE('\uf191'),
        FOUI_PAW('\uf192'),
        FOUI_PAYPAL('\uf193'),
        FOUI_PENCIL('\uf194'),
        FOUI_PHOTO('\uf195'),
        FOUI_PLAY_CIRCLE('\uf196'),
        FOUI_PLAY_VIDEO('\uf197'),
        FOUI_PLAY('\uf198'),
        FOUI_PLUS('\uf199'),
        FOUI_POUND('\uf19a'),
        FOUI_POWER('\uf19b'),
        FOUI_PREVIOUS('\uf19c'),
        FOUI_PRICE_TAG('\uf19d'),
        FOUI_PRICETAG_MULTIPLE('\uf19e'),
        FOUI_PRINT('\uf19f'),
        FOUI_PROHIBITED('\uf1a0'),
        FOUI_PROJECTION_SCREEN('\uf1a1'),
        FOUI_PUZZLE('\uf1a2'),
        FOUI_QUOTE('\uf1a3'),
        FOUI_RECORD('\uf1a4'),
        FOUI_REFRESH('\uf1a5'),
        FOUI_RESULTS_DEMOGRAPHICS('\uf1a6'),
        FOUI_RESULTS('\uf1a7'),
        FOUI_REWIND_TEN('\uf1a8'),
        FOUI_REWIND('\uf1a9'),
        FOUI_RSS('\uf1aa'),
        FOUI_SAFETY_CONE('\uf1ab'),
        FOUI_SAVE('\uf1ac'),
        FOUI_SHARE('\uf1ad'),
        FOUI_SHERIFF_BADGE('\uf1ae'),
        FOUI_SHIELD('\uf1af'),
        FOUI_SHOPPING_BAG('\uf1b0'),
        FOUI_SHOPPING_CART('\uf1b1'),
        FOUI_SHUFFLE('\uf1b2'),
        FOUI_SKULL('\uf1b3'),
        FOUI_SOCIAL_500PX('\uf1b4'),
        FOUI_SOCIAL_ADOBE('\uf1b5'),
        FOUI_SOCIAL_AMAZON('\uf1b6'),
        FOUI_SOCIAL_APPLE('\uf1b8'),
        FOUI_SOCIAL_BEHANCE('\uf1b9'),
        FOUI_SOCIAL_BING('\uf1ba'),
        FOUI_SOCIAL_BLOGGER('\uf1bb'),
        FOUI_SOCIAL_DELICIOUS('\uf1bc'),
        FOUI_SOCIAL_DESIGNER_NEWS('\uf1bd'),
        FOUI_SOCIAL_DEVIANT_ART('\uf1be'),
        FOUI_SOCIAL_DIGG('\uf1bf'),
        FOUI_SOCIAL_DRIBBBLE('\uf1c0'),
        FOUI_SOCIAL_DRIVE('\uf1c1'),
        FOUI_SOCIAL_DROPBOX('\uf1c2'),
        FOUI_SOCIAL_EVERNOTE('\uf1c3'),
        FOUI_SOCIAL_FACEBOOK('\uf1c4'),
        FOUI_SOCIAL_FLICKR('\uf1c5'),
        FOUI_SOCIAL_FORRST('\uf1c6'),
        FOUI_SOCIAL_FOURSQUARE('\uf1c7'),
        FOUI_SOCIAL_GAME_CENTER('\uf1c8'),
        FOUI_SOCIAL_GITHUB('\uf1c9'),
        FOUI_SOCIAL_GOOGLE_PLUS('\uf1ca'),
        FOUI_SOCIAL_HACKER_NEWS('\uf1cb'),
        FOUI_SOCIAL_HI5('\uf1cc'),
        FOUI_SOCIAL_INSTAGRAM('\uf1cd'),
        FOUI_SOCIAL_JOOMLA('\uf1ce'),
        FOUI_SOCIAL_LASTFM('\uf1cf'),
        FOUI_SOCIAL_LINKEDIN('\uf1d0'),
        FOUI_SOCIAL_MEDIUM('\uf1d1'),
        FOUI_SOCIAL_MYSPACE('\uf1d2'),
        FOUI_SOCIAL_ORKUT('\uf1d3'),
        FOUI_SOCIAL_PATH('\uf1d4'),
        FOUI_SOCIAL_PICASA('\uf1d5'),
        FOUI_SOCIAL_PINTEREST('\uf1d6'),
        FOUI_SOCIAL_RDIO('\uf1d7'),
        FOUI_SOCIAL_REDDIT('\uf1d8'),
        FOUI_SOCIAL_SKILLSHARE('\uf1d9'),
        FOUI_SOCIAL_SKYPE('\uf1da'),
        FOUI_SOCIAL_SMASHING_MAG('\uf1db'),
        FOUI_SOCIAL_SNAPCHAT('\uf1dc'),
        FOUI_SOCIAL_SPOTIFY('\uf1dd'),
        FOUI_SOCIAL_SQUIDOO('\uf1de'),
        FOUI_SOCIAL_STACK_OVERFLOW('\uf1df'),
        FOUI_SOCIAL_STEAM('\uf1e0'),
        FOUI_SOCIAL_STUMBLEUPON('\uf1e1'),
        FOUI_SOCIAL_TREEHOUSE('\uf1e2'),
        FOUI_SOCIAL_TUMBLR('\uf1e3'),
        FOUI_SOCIAL_TWITTER('\uf1e4'),
        FOUI_SOCIAL_VIMEO('\uf1e5'),
        FOUI_SOCIAL_WINDOWS('\uf1e6'),
        FOUI_SOCIAL_XBOX('\uf1e7'),
        FOUI_SOCIAL_YAHOO('\uf1e8'),
        FOUI_SOCIAL_YELP('\uf1e9'),
        FOUI_SOCIAL_YOUTUBE('\uf1ea'),
        FOUI_SOCIAL_ZERPLY('\uf1eb'),
        FOUI_SOCIAL_ZURB('\uf1ec'),
        FOUI_SOUND('\uf1ed'),
        FOUI_STAR('\uf1ee'),
        FOUI_STOP('\uf1ef'),
        FOUI_STRIKETHROUGH('\uf1f0'),
        FOUI_SUBSCRIPT('\uf1f1'),
        FOUI_SUPERSCRIPT('\uf1f2'),
        FOUI_TABLET_LANDSCAPE('\uf1f3'),
        FOUI_TABLET_PORTRAIT('\uf1f4'),
        FOUI_TARGET_TWO('\uf1f5'),
        FOUI_TARGET('\uf1f6'),
        FOUI_TELEPHONE_ACCESSIBLE('\uf1f7'),
        FOUI_TELEPHONE('\uf1f8'),
        FOUI_TEXT_COLOR('\uf1f9'),
        FOUI_THUMBNAILS('\uf1fa'),
        FOUI_TICKET('\uf1fb'),
        FOUI_TORSO_BUSINESS('\uf1fc'),
        FOUI_TORSO_FEMALE('\uf1fd'),
        FOUI_TORSO('\uf1fe'),
        FOUI_TORSOS_ALL_FEMALE('\uf1ff'),
        FOUI_TORSOS_ALL('\uf200'),
        FOUI_TORSOS_FEMALE_MALE('\uf201'),
        FOUI_TORSOS_MALE_FEMALE('\uf202'),
        FOUI_TORSOS('\uf203'),
        FOUI_TRASH('\uf204'),
        FOUI_TREES('\uf205'),
        FOUI_TROPHY('\uf206'),
        FOUI_UNDERLINE('\uf207'),
        FOUI_UNIVERSAL_ACCESS('\uf208'),
        FOUI_UNLINK('\uf209'),
        FOUI_UNLOCK('\uf20a'),
        FOUI_UPLOAD_CLOUD('\uf20b'),
        FOUI_UPLOAD('\uf20c'),
        FOUI_USB('\uf20d'),
        FOUI_VIDEO('\uf20e'),
        FOUI_VOLUME_NONE('\uf20f'),
        FOUI_VOLUME_STRIKE('\uf210'),
        FOUI_VOLUME('\uf211'),
        FOUI_WEB('\uf212'),
        FOUI_WHEELCHAIR('\uf213'),
        FOUI_WIDGET('\uf214'),
        FOUI_WRENCH('\uf215'),
        FOUI_X_CIRCLE('\uf216'),
        FOUI_X('\uf217'),
        FOUI_YEN('\uf218'),
        FOUI_ZOOM_IN('\uf219'),
        FOUI_ZOOM_OUT('\uf21a');

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
        private static ITypeface foundationIconsTypeface;

        @Override
        public ITypeface getTypeface() {
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
