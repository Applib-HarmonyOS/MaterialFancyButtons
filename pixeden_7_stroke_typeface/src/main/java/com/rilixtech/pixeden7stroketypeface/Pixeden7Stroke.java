package com.rilixtech.pixeden7stroketypeface;

import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.materialfancybutton.typeface.MfbTypeface;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * MfbTypeface implementation using the Pixeden7Stroke font. It hosts a variety of icons that can be used by
 * the MaterialFancyButton Components.
 */
public class Pixeden7Stroke implements MfbTypeface {
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
     * Pixeden7Stroke MfbIcon object corresponding to this typeface for the given key.
     *
     * @param key Key for which Pixeden7Stroke MfbIcon is to be retrieved.
     */
    @Override public MfbIcon getIcon(String key) {
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
     * Enumerates all the supported Custom Icon Unicode characters by Pixeden7Stroke MfbTypeface.
     */
    public enum Icon implements MfbIcon {
        PE7I_7S_ALBUM((char) 0xe6aa),
        PE7I_7S_ARC((char) 0xe6ab),
        PE7I_7S_BACK_2((char) 0xe6ac),
        PE7I_7S_BANDAID((char) 0xe6ad),
        PE7I_7S_CAR((char) 0xe6ae),
        PE7I_7S_DIAMOND((char) 0xe6af),
        PE7I_7S_DOOR_LOCK((char) 0xe6b0),
        PE7I_7S_EYEDROPPER((char) 0xe6b1),
        PE7I_7S_FEMALE((char) 0xe6b2),
        PE7I_7S_GYM((char) 0xe6b3),
        PE7I_7S_HAMMER((char) 0xe6b4),
        PE7I_7S_HEADPHONES((char) 0xe6b5),
        PE7I_7S_HELM((char) 0xe6b6),
        PE7I_7S_HOURGLASS((char) 0xe6b7),
        PE7I_7S_LEAF((char) 0xe6b8),
        PE7I_7S_MAGIC_WAND((char) 0xe6b9),
        PE7I_7S_MALE((char) 0xe6ba),
        PE7I_7S_MAP_2((char) 0xe6bb),
        PE7I_7S_NEXT_2((char) 0xe6bc),
        PE7I_7S_PAINT_BUCKET((char) 0xe6bd),
        PE7I_7S_PENDRIVE((char) 0xe6be),
        PE7I_7S_PHOTO((char) 0xe6bf),
        PE7I_7S_PIGGY((char) 0xe6c0),
        PE7I_7S_PLUGIN((char) 0xe6c1),
        PE7I_7S_REFRESH_2((char) 0xe6c2),
        PE7I_7S_ROCKET((char) 0xe6c3),
        PE7I_7S_SETTINGS((char) 0xe6c4),
        PE7I_7S_SHIELD((char) 0xe6c5),
        PE7I_7S_SMILE((char) 0xe6c6),
        PE7I_7S_USB((char) 0xe6c7),
        PE7I_7S_VECTOR((char) 0xe6c8),
        PE7I_7S_WINE((char) 0xe6c9),
        PE7I_7S_CLOUD_UPLOAD((char) 0xe68a),
        PE7I_7S_CASH((char) 0xe68c),
        PE7I_7S_CLOSE((char) 0xe680),
        PE7I_7S_BLUETOOTH((char) 0xe68d),
        PE7I_7S_CLOUD_DOWNLOAD((char) 0xe68b),
        PE7I_7S_WAY((char) 0xe68e),
        PE7I_7S_CLOSE_CIRCLE((char) 0xe681),
        PE7I_7S_ID((char) 0xe68f),
        PE7I_7S_ANGLE_UP((char) 0xe682),
        PE7I_7S_WRISTWATCH((char) 0xe690),
        PE7I_7S_ANGLE_UP_CIRCLE((char) 0xe683),
        PE7I_7S_WORLD((char) 0xe691),
        PE7I_7S_ANGLE_RIGHT((char) 0xe684),
        PE7I_7S_VOLUME((char) 0xe692),
        PE7I_7S_ANGLE_RIGHT_CIRCLE((char) 0xe685),
        PE7I_7S_USERS((char) 0xe693),
        PE7I_7S_ANGLE_LEFT((char) 0xe686),
        PE7I_7S_USER_FEMALE((char) 0xe694),
        PE7I_7S_ANGLE_LEFT_CIRCLE((char) 0xe687),
        PE7I_7S_UP_ARROW((char) 0xe695),
        PE7I_7S_ANGLE_DOWN((char) 0xe688),
        PE7I_7S_SWITCH((char) 0xe696),
        PE7I_7S_ANGLE_DOWN_CIRCLE((char) 0xe689),
        PE7I_7S_SCISSORS((char) 0xe697),
        PE7I_7S_WALLET((char) 0xe600),
        PE7I_7S_SAFE((char) 0xe698),
        PE7I_7S_VOLUME2((char) 0xe601),
        PE7I_7S_VOLUME1((char) 0xe602),
        PE7I_7S_VOICEMAIL((char) 0xe603),
        PE7I_7S_VIDEO((char) 0xe604),
        PE7I_7S_USER((char) 0xe605),
        PE7I_7S_UPLOAD((char) 0xe606),
        PE7I_7S_UNLOCK((char) 0xe607),
        PE7I_7S_UMBRELLA((char) 0xe608),
        PE7I_7S_TRASH((char) 0xe609),
        PE7I_7S_TOOLS((char) 0xe60a),
        PE7I_7S_TIMER((char) 0xe60b),
        PE7I_7S_TICKET((char) 0xe60c),
        PE7I_7S_TARGET((char) 0xe60d),
        PE7I_7S_SUN((char) 0xe60e),
        PE7I_7S_STUDY((char) 0xe60f),
        PE7I_7S_STOPWATCH((char) 0xe610),
        PE7I_7S_STAR((char) 0xe611),
        PE7I_7S_SPEAKER((char) 0xe612),
        PE7I_7S_SIGNAL((char) 0xe613),
        PE7I_7S_SHUFFLE((char) 0xe614),
        PE7I_7S_SHOPBAG((char) 0xe615),
        PE7I_7S_SHARE((char) 0xe616),
        PE7I_7S_SERVER((char) 0xe617),
        PE7I_7S_SEARCH((char) 0xe618),
        PE7I_7S_FILM((char) 0xe6a5),
        PE7I_7S_SCIENCE((char) 0xe619),
        PE7I_7S_DISK((char) 0xe6a6),
        PE7I_7S_RIBBON((char) 0xe61a),
        PE7I_7S_REPEAT((char) 0xe61b),
        PE7I_7S_REFRESH((char) 0xe61c),
        PE7I_7S_ADD_USER((char) 0xe6a9),
        PE7I_7S_REFRESH_CLOUD((char) 0xe61d),
        PE7I_7S_PAPERCLIP((char) 0xe69c),
        PE7I_7S_RADIO((char) 0xe61e),
        PE7I_7S_NOTE2((char) 0xe69d),
        PE7I_7S_PRINT((char) 0xe61f),
        PE7I_7S_NETWORK((char) 0xe69e),
        PE7I_7S_PREV((char) 0xe620),
        PE7I_7S_MUTE((char) 0xe69f),
        PE7I_7S_POWER((char) 0xe621),
        PE7I_7S_MEDAL((char) 0xe6a0),
        PE7I_7S_PORTFOLIO((char) 0xe622),
        PE7I_7S_LIKE2((char) 0xe6a1),
        PE7I_7S_PLUS((char) 0xe623),
        PE7I_7S_LEFT_ARROW((char) 0xe6a2),
        PE7I_7S_PLAY((char) 0xe624),
        PE7I_7S_KEY((char) 0xe6a3),
        PE7I_7S_PLANE((char) 0xe625),
        PE7I_7S_JOY((char) 0xe6a4),
        PE7I_7S_PHOTO_GALLERY((char) 0xe626),
        PE7I_7S_PIN((char) 0xe69b),
        PE7I_7S_PHONE((char) 0xe627),
        PE7I_7S_PLUG((char) 0xe69a),
        PE7I_7S_PEN((char) 0xe628),
        PE7I_7S_RIGHT_ARROW((char) 0xe699),
        PE7I_7S_PAPER_PLANE((char) 0xe629),
        PE7I_7S_DELETE_USER((char) 0xe6a7),
        PE7I_7S_PAINT((char) 0xe62a),
        PE7I_7S_BOTTOM_ARROW((char) 0xe6a8),
        PE7I_7S_NOTEBOOK((char) 0xe62b),
        PE7I_7S_NOTE((char) 0xe62c),
        PE7I_7S_NEXT((char) 0xe62d),
        PE7I_7S_NEWS_PAPER((char) 0xe62e),
        PE7I_7S_MUSICLIST((char) 0xe62f),
        PE7I_7S_MUSIC((char) 0xe630),
        PE7I_7S_MOUSE((char) 0xe631),
        PE7I_7S_MORE((char) 0xe632),
        PE7I_7S_MOON((char) 0xe633),
        PE7I_7S_MONITOR((char) 0xe634),
        PE7I_7S_MICRO((char) 0xe635),
        PE7I_7S_MENU((char) 0xe636),
        PE7I_7S_MAP((char) 0xe637),
        PE7I_7S_MAP_MARKER((char) 0xe638),
        PE7I_7S_MAIL((char) 0xe639),
        PE7I_7S_MAIL_OPEN((char) 0xe63a),
        PE7I_7S_MAIL_OPEN_FILE((char) 0xe63b),
        PE7I_7S_MAGNET((char) 0xe63c),
        PE7I_7S_LOOP((char) 0xe63d),
        PE7I_7S_LOOK((char) 0xe63e),
        PE7I_7S_LOCK((char) 0xe63f),
        PE7I_7S_LINTERN((char) 0xe640),
        PE7I_7S_LINK((char) 0xe641),
        PE7I_7S_LIKE((char) 0xe642),
        PE7I_7S_LIGHT((char) 0xe643),
        PE7I_7S_LESS((char) 0xe644),
        PE7I_7S_KEYPAD((char) 0xe645),
        PE7I_7S_JUNK((char) 0xe646),
        PE7I_7S_INFO((char) 0xe647),
        PE7I_7S_HOME((char) 0xe648),
        PE7I_7S_HELP2((char) 0xe649),
        PE7I_7S_HELP1((char) 0xe64a),
        PE7I_7S_GRAPH3((char) 0xe64b),
        PE7I_7S_GRAPH2((char) 0xe64c),
        PE7I_7S_GRAPH1((char) 0xe64d),
        PE7I_7S_GRAPH((char) 0xe64e),
        PE7I_7S_GLOBAL((char) 0xe64f),
        PE7I_7S_GLEAM((char) 0xe650),
        PE7I_7S_GLASSES((char) 0xe651),
        PE7I_7S_GIFT((char) 0xe652),
        PE7I_7S_FOLDER((char) 0xe653),
        PE7I_7S_FLAG((char) 0xe654),
        PE7I_7S_FILTER((char) 0xe655),
        PE7I_7S_FILE((char) 0xe656),
        PE7I_7S_EXPAND1((char) 0xe657),
        PE7I_7S_EXAPND2((char) 0xe658),
        PE7I_7S_EDIT((char) 0xe659),
        PE7I_7S_DROP((char) 0xe65a),
        PE7I_7S_DRAWER((char) 0xe65b),
        PE7I_7S_DOWNLOAD((char) 0xe65c),
        PE7I_7S_DISPLAY2((char) 0xe65d),
        PE7I_7S_DISPLAY1((char) 0xe65e),
        PE7I_7S_DISKETTE((char) 0xe65f),
        PE7I_7S_DATE((char) 0xe660),
        PE7I_7S_CUP((char) 0xe661),
        PE7I_7S_CULTURE((char) 0xe662),
        PE7I_7S_CROP((char) 0xe663),
        PE7I_7S_CREDIT((char) 0xe664),
        PE7I_7S_COPY_FILE((char) 0xe665),
        PE7I_7S_CONFIG((char) 0xe666),
        PE7I_7S_COMPASS((char) 0xe667),
        PE7I_7S_COMMENT((char) 0xe668),
        PE7I_7S_COFFEE((char) 0xe669),
        PE7I_7S_CLOUD((char) 0xe66a),
        PE7I_7S_CLOCK((char) 0xe66b),
        PE7I_7S_CHECK((char) 0xe66c),
        PE7I_7S_CHAT((char) 0xe66d),
        PE7I_7S_CART((char) 0xe66e),
        PE7I_7S_CAMERA((char) 0xe66f),
        PE7I_7S_CALL((char) 0xe670),
        PE7I_7S_CALCULATOR((char) 0xe671),
        PE7I_7S_BROWSER((char) 0xe672),
        PE7I_7S_BOX2((char) 0xe673),
        PE7I_7S_BOX1((char) 0xe674),
        PE7I_7S_BOOKMARKS((char) 0xe675),
        PE7I_7S_BICYCLE((char) 0xe676),
        PE7I_7S_BELL((char) 0xe677),
        PE7I_7S_BATTERY((char) 0xe678),
        PE7I_7S_BALL((char) 0xe679),
        PE7I_7S_BACK((char) 0xe67a),
        PE7I_7S_ATTENTION((char) 0xe67b),
        PE7I_7S_ANCHOR((char) 0xe67c),
        PE7I_7S_ALBUMS((char) 0xe67d),
        PE7I_7S_ALARM((char) 0xe67e),
        PE7I_7S_AIRPLAY((char) 0xe67f);

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
        private static MfbTypeface pixeden7StrokeTypeface;

        @Override
        public MfbTypeface getTypeface() {
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
