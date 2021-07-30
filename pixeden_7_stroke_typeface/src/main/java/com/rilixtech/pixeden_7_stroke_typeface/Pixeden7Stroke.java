package com.rilixtech.pixeden_7_stroke_typeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ITypeface implementation using the Pixeden7Stroke font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Pixeden7Stroke implements ITypeface {
    private static final String TTF_FILE = "pixeden-7-stroke-font-v1.2.0.ttf";
    private static final String PIXEDEN_7_STROKE_PREFIX = "PE7I";
    public static final String PIXEDEN_7_STROKE_NAME = "Pixeden 7 Stroke";
    public static final String PIXEDEN_7_STROKE_VERSION = "1" + ".2.0.0";
    public static final String PIXEDEN_7_STROKE_AUTHOR = "Riccardo Montagnin";
    public static final String PIXEDEN_7_STROKE_URL = "http://themes-pixeden.com/font-demos/7-stroke/";
    public static final String PIXEDEN_7_STROKE_DESC = "A series of iOS 7 inspired vector icons";
    public static final String PIXEDEN_7_STROKE_LICENSE =
            "Royalty free for use in both personal and commercial projects";
    public static final String PIXEDEN_7_STROKE_LICENSE_URL = "http://themes-pixeden.com/font-demos/7-stroke/";

    private static Font pixeden7StrokeTypeface = null;
    private static HashMap<String, Character> pixeden7StrokeCharMap;

    /**
     * Pixeden7Stroke IIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Pixeden7Stroke IIcon is to be retrieved.
     */
    @Override public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    /**
     * Get all the Pixeden7Stroke icon characters in a HashMap.
     *
     * @return HashMap of all Pixeden7Stroke icon character names mapped to their character values.
     */
    @Override public HashMap<String, Character> getCharacters() {
        if (pixeden7StrokeCharMap == null) {
            HashMap<String, Character> characterHashMap = new HashMap<>();
            for (Icon v : Icon.values()) {
                characterHashMap.put(v.name(), v.pixeden7StrokeCharacter);
            }
            setChars(characterHashMap);
        }
        return pixeden7StrokeCharMap;
    }

    /**
     * Set the Pixeden7Stroke Characters into a HashMap.
     */
    private static void setChars(HashMap<String, Character> characterHashMap) {
        pixeden7StrokeCharMap = characterHashMap;
    }

    /**
     * Return the Pixeden7Stroke Mapping Prefix.
     *
     * @return Pixeden7Stroke Mapping Prefix, used by all Pixeden7Stroke icons.
     */
    @Override public String getMappingPrefix() {
        return PIXEDEN_7_STROKE_PREFIX;
    }

    @Override public String getFontName() {
        return PIXEDEN_7_STROKE_NAME;
    }

    @Override public String getVersion() {
        return PIXEDEN_7_STROKE_VERSION;
    }

    @Override public int getIconCount() {
        return pixeden7StrokeCharMap.size();
    }

    @Override public Collection<String> getIcons() {
        Collection<String> pixeden7StrokeKeyList = new LinkedList<>();
        for (Icon value : Icon.values()) {
            pixeden7StrokeKeyList.add(value.name());
        }
        return pixeden7StrokeKeyList;
    }

    @Override
    public String getAuthor() {
        return PIXEDEN_7_STROKE_AUTHOR;
    }

    @Override
    public String getUrl() {
        return PIXEDEN_7_STROKE_URL;
    }

    @Override
    public String getDescription() {
        return PIXEDEN_7_STROKE_DESC;
    }

    @Override
    public String getLicense() {
        return PIXEDEN_7_STROKE_LICENSE;
    }

    @Override
    public String getLicenseUrl() {
        return PIXEDEN_7_STROKE_LICENSE_URL;
    }

    @Override
    public Font getTypeface(AbilityContext context) {
        if (pixeden7StrokeTypeface == null) {
            try {
                cacheTypeface(FontUtil.getFontFromRawFile(context, TTF_FILE));
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            }
        }
        return pixeden7StrokeTypeface;
    }

    private static void cacheTypeface(Font font) {
        pixeden7StrokeTypeface = font;
    }

    /**
     * Enumerates all the supported Custom Icon Unicode characters by Pixeden7Stroke ITypeface.
     */
    public enum Icon implements IIcon {
        PE7I_7S_ALBUM('\ue6aa'),
        PE7I_7S_ARC('\ue6ab'),
        PE7I_7S_BACK_2('\ue6ac'),
        PE7I_7S_BANDAID('\ue6ad'),
        PE7I_7S_CAR('\ue6ae'),
        PE7I_7S_DIAMOND('\ue6af'),
        PE7I_7S_DOOR_LOCK('\ue6b0'),
        PE7I_7S_EYEDROPPER('\ue6b1'),
        PE7I_7S_FEMALE('\ue6b2'),
        PE7I_7S_GYM('\ue6b3'),
        PE7I_7S_HAMMER('\ue6b4'),
        PE7I_7S_HEADPHONES('\ue6b5'),
        PE7I_7S_HELM('\ue6b6'),
        PE7I_7S_HOURGLASS('\ue6b7'),
        PE7I_7S_LEAF('\ue6b8'),
        PE7I_7S_MAGIC_WAND('\ue6b9'),
        PE7I_7S_MALE('\ue6ba'),
        PE7I_7S_MAP_2('\ue6bb'),
        PE7I_7S_NEXT_2('\ue6bc'),
        PE7I_7S_PAINT_BUCKET('\ue6bd'),
        PE7I_7S_PENDRIVE('\ue6be'),
        PE7I_7S_PHOTO('\ue6bf'),
        PE7I_7S_PIGGY('\ue6c0'),
        PE7I_7S_PLUGIN('\ue6c1'),
        PE7I_7S_REFRESH_2('\ue6c2'),
        PE7I_7S_ROCKET('\ue6c3'),
        PE7I_7S_SETTINGS('\ue6c4'),
        PE7I_7S_SHIELD('\ue6c5'),
        PE7I_7S_SMILE('\ue6c6'),
        PE7I_7S_USB('\ue6c7'),
        PE7I_7S_VECTOR('\ue6c8'),
        PE7I_7S_WINE('\ue6c9'),
        PE7I_7S_CLOUD_UPLOAD('\ue68a'),
        PE7I_7S_CASH('\ue68c'),
        PE7I_7S_CLOSE('\ue680'),
        PE7I_7S_BLUETOOTH('\ue68d'),
        PE7I_7S_CLOUD_DOWNLOAD('\ue68b'),
        PE7I_7S_WAY('\ue68e'),
        PE7I_7S_CLOSE_CIRCLE('\ue681'),
        PE7I_7S_ID('\ue68f'),
        PE7I_7S_ANGLE_UP('\ue682'),
        PE7I_7S_WRISTWATCH('\ue690'),
        PE7I_7S_ANGLE_UP_CIRCLE('\ue683'),
        PE7I_7S_WORLD('\ue691'),
        PE7I_7S_ANGLE_RIGHT('\ue684'),
        PE7I_7S_VOLUME('\ue692'),
        PE7I_7S_ANGLE_RIGHT_CIRCLE('\ue685'),
        PE7I_7S_USERS('\ue693'),
        PE7I_7S_ANGLE_LEFT('\ue686'),
        PE7I_7S_USER_FEMALE('\ue694'),
        PE7I_7S_ANGLE_LEFT_CIRCLE('\ue687'),
        PE7I_7S_UP_ARROW('\ue695'),
        PE7I_7S_ANGLE_DOWN('\ue688'),
        PE7I_7S_SWITCH('\ue696'),
        PE7I_7S_ANGLE_DOWN_CIRCLE('\ue689'),
        PE7I_7S_SCISSORS('\ue697'),
        PE7I_7S_WALLET('\ue600'),
        PE7I_7S_SAFE('\ue698'),
        PE7I_7S_VOLUME2('\ue601'),
        PE7I_7S_VOLUME1('\ue602'),
        PE7I_7S_VOICEMAIL('\ue603'),
        PE7I_7S_VIDEO('\ue604'),
        PE7I_7S_USER('\ue605'),
        PE7I_7S_UPLOAD('\ue606'),
        PE7I_7S_UNLOCK('\ue607'),
        PE7I_7S_UMBRELLA('\ue608'),
        PE7I_7S_TRASH('\ue609'),
        PE7I_7S_TOOLS('\ue60a'),
        PE7I_7S_TIMER('\ue60b'),
        PE7I_7S_TICKET('\ue60c'),
        PE7I_7S_TARGET('\ue60d'),
        PE7I_7S_SUN('\ue60e'),
        PE7I_7S_STUDY('\ue60f'),
        PE7I_7S_STOPWATCH('\ue610'),
        PE7I_7S_STAR('\ue611'),
        PE7I_7S_SPEAKER('\ue612'),
        PE7I_7S_SIGNAL('\ue613'),
        PE7I_7S_SHUFFLE('\ue614'),
        PE7I_7S_SHOPBAG('\ue615'),
        PE7I_7S_SHARE('\ue616'),
        PE7I_7S_SERVER('\ue617'),
        PE7I_7S_SEARCH('\ue618'),
        PE7I_7S_FILM('\ue6a5'),
        PE7I_7S_SCIENCE('\ue619'),
        PE7I_7S_DISK('\ue6a6'),
        PE7I_7S_RIBBON('\ue61a'),
        PE7I_7S_REPEAT('\ue61b'),
        PE7I_7S_REFRESH('\ue61c'),
        PE7I_7S_ADD_USER('\ue6a9'),
        PE7I_7S_REFRESH_CLOUD('\ue61d'),
        PE7I_7S_PAPERCLIP('\ue69c'),
        PE7I_7S_RADIO('\ue61e'),
        PE7I_7S_NOTE2('\ue69d'),
        PE7I_7S_PRINT('\ue61f'),
        PE7I_7S_NETWORK('\ue69e'),
        PE7I_7S_PREV('\ue620'),
        PE7I_7S_MUTE('\ue69f'),
        PE7I_7S_POWER('\ue621'),
        PE7I_7S_MEDAL('\ue6a0'),
        PE7I_7S_PORTFOLIO('\ue622'),
        PE7I_7S_LIKE2('\ue6a1'),
        PE7I_7S_PLUS('\ue623'),
        PE7I_7S_LEFT_ARROW('\ue6a2'),
        PE7I_7S_PLAY('\ue624'),
        PE7I_7S_KEY('\ue6a3'),
        PE7I_7S_PLANE('\ue625'),
        PE7I_7S_JOY('\ue6a4'),
        PE7I_7S_PHOTO_GALLERY('\ue626'),
        PE7I_7S_PIN('\ue69b'),
        PE7I_7S_PHONE('\ue627'),
        PE7I_7S_PLUG('\ue69a'),
        PE7I_7S_PEN('\ue628'),
        PE7I_7S_RIGHT_ARROW('\ue699'),
        PE7I_7S_PAPER_PLANE('\ue629'),
        PE7I_7S_DELETE_USER('\ue6a7'),
        PE7I_7S_PAINT('\ue62a'),
        PE7I_7S_BOTTOM_ARROW('\ue6a8'),
        PE7I_7S_NOTEBOOK('\ue62b'),
        PE7I_7S_NOTE('\ue62c'),
        PE7I_7S_NEXT('\ue62d'),
        PE7I_7S_NEWS_PAPER('\ue62e'),
        PE7I_7S_MUSICLIST('\ue62f'),
        PE7I_7S_MUSIC('\ue630'),
        PE7I_7S_MOUSE('\ue631'),
        PE7I_7S_MORE('\ue632'),
        PE7I_7S_MOON('\ue633'),
        PE7I_7S_MONITOR('\ue634'),
        PE7I_7S_MICRO('\ue635'),
        PE7I_7S_MENU('\ue636'),
        PE7I_7S_MAP('\ue637'),
        PE7I_7S_MAP_MARKER('\ue638'),
        PE7I_7S_MAIL('\ue639'),
        PE7I_7S_MAIL_OPEN('\ue63a'),
        PE7I_7S_MAIL_OPEN_FILE('\ue63b'),
        PE7I_7S_MAGNET('\ue63c'),
        PE7I_7S_LOOP('\ue63d'),
        PE7I_7S_LOOK('\ue63e'),
        PE7I_7S_LOCK('\ue63f'),
        PE7I_7S_LINTERN('\ue640'),
        PE7I_7S_LINK('\ue641'),
        PE7I_7S_LIKE('\ue642'),
        PE7I_7S_LIGHT('\ue643'),
        PE7I_7S_LESS('\ue644'),
        PE7I_7S_KEYPAD('\ue645'),
        PE7I_7S_JUNK('\ue646'),
        PE7I_7S_INFO('\ue647'),
        PE7I_7S_HOME('\ue648'),
        PE7I_7S_HELP2('\ue649'),
        PE7I_7S_HELP1('\ue64a'),
        PE7I_7S_GRAPH3('\ue64b'),
        PE7I_7S_GRAPH2('\ue64c'),
        PE7I_7S_GRAPH1('\ue64d'),
        PE7I_7S_GRAPH('\ue64e'),
        PE7I_7S_GLOBAL('\ue64f'),
        PE7I_7S_GLEAM('\ue650'),
        PE7I_7S_GLASSES('\ue651'),
        PE7I_7S_GIFT('\ue652'),
        PE7I_7S_FOLDER('\ue653'),
        PE7I_7S_FLAG('\ue654'),
        PE7I_7S_FILTER('\ue655'),
        PE7I_7S_FILE('\ue656'),
        PE7I_7S_EXPAND1('\ue657'),
        PE7I_7S_EXAPND2('\ue658'),
        PE7I_7S_EDIT('\ue659'),
        PE7I_7S_DROP('\ue65a'),
        PE7I_7S_DRAWER('\ue65b'),
        PE7I_7S_DOWNLOAD('\ue65c'),
        PE7I_7S_DISPLAY2('\ue65d'),
        PE7I_7S_DISPLAY1('\ue65e'),
        PE7I_7S_DISKETTE('\ue65f'),
        PE7I_7S_DATE('\ue660'),
        PE7I_7S_CUP('\ue661'),
        PE7I_7S_CULTURE('\ue662'),
        PE7I_7S_CROP('\ue663'),
        PE7I_7S_CREDIT('\ue664'),
        PE7I_7S_COPY_FILE('\ue665'),
        PE7I_7S_CONFIG('\ue666'),
        PE7I_7S_COMPASS('\ue667'),
        PE7I_7S_COMMENT('\ue668'),
        PE7I_7S_COFFEE('\ue669'),
        PE7I_7S_CLOUD('\ue66a'),
        PE7I_7S_CLOCK('\ue66b'),
        PE7I_7S_CHECK('\ue66c'),
        PE7I_7S_CHAT('\ue66d'),
        PE7I_7S_CART('\ue66e'),
        PE7I_7S_CAMERA('\ue66f'),
        PE7I_7S_CALL('\ue670'),
        PE7I_7S_CALCULATOR('\ue671'),
        PE7I_7S_BROWSER('\ue672'),
        PE7I_7S_BOX2('\ue673'),
        PE7I_7S_BOX1('\ue674'),
        PE7I_7S_BOOKMARKS('\ue675'),
        PE7I_7S_BICYCLE('\ue676'),
        PE7I_7S_BELL('\ue677'),
        PE7I_7S_BATTERY('\ue678'),
        PE7I_7S_BALL('\ue679'),
        PE7I_7S_BACK('\ue67a'),
        PE7I_7S_ATTENTION('\ue67b'),
        PE7I_7S_ANCHOR('\ue67c'),
        PE7I_7S_ALBUMS('\ue67d'),
        PE7I_7S_ALARM('\ue67e'),
        PE7I_7S_AIRPLAY('\ue67f');

        char pixeden7StrokeCharacter;

        Icon(char character) {
            this.pixeden7StrokeCharacter = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return pixeden7StrokeCharacter;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface pixeden7StrokeTypeface;

        @Override
        public ITypeface getTypeface() {
            if (pixeden7StrokeTypeface == null) {
                setTypeface(new Pixeden7Stroke());
            }
            return pixeden7StrokeTypeface;
        }

        private static void setTypeface(Pixeden7Stroke pixeden7StrokeTypeface) {
            Icon.pixeden7StrokeTypeface = pixeden7StrokeTypeface;
        }
    }
}