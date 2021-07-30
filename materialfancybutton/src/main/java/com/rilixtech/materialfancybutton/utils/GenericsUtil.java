package com.rilixtech.materialfancybutton.utils;

import com.rilixtech.materialfancybutton.typeface.MfbTypeface;

/**
 * Utility class containing methods to handle the different {@link MfbTypeface}
 * implementations existing in the various loaded modules.
 */
public class GenericsUtil {

    private GenericsUtil() {}

    // If a new font module is to be added, its name should be appended in the below array
    private static final String[] SUPPORTED_FONT_CLASSES = new String[]{
        "com.rilixtech.communitymaterialtypeface.CommunityMaterial",
        "com.rilixtech.devicontypeface.Devicon",
        "com.rilixtech.dripiconstypeface.Dripicons",
        "com.rilixtech.entypotypeface.Entypo",
        "com.rilixtech.fontawesometypeface.FontAwesome",
        "com.rilixtech.foundationiconstypeface.FoundationIcons",
        "com.rilixtech.glyphiconshalflingstypeface.GlyphiconsHalflings",
        "com.rilixtech.googlematerialtypeface.GoogleMaterial",
        "com.rilixtech.ioniconstypeface.Ionicons",
        "com.rilixtech.materialdesigniconictypeface.MaterialDesignIconic",
        "com.rilixtech.meteoconstypeface.Meteocons",
        "com.rilixtech.mfglabsiconsettypeface.MfgLabsIconset",
        "com.rilixtech.mobiriseiconstypeface.MobiriseIcons",
        "com.rilixtech.octiconstypeface.Octicons",
        "com.rilixtech.openiconictypeface.OpenIconic",
        "com.rilixtech.picoltypeface.Picol",
        "com.rilixtech.pixeden7stroketypeface.Pixeden7Stroke",
        "com.rilixtech.themifyiconstypeface.ThemifyIcons",
        "com.rilixtech.typiconstypeface.Typicons",
        "com.rilixtech.vaadiniconstypeface.VaadinIcons",
        "com.rilixtech.weathericonstypeface.WeatherIcons"
    };

    /**
     * Find the full class names for each of the MfbTypeface classes defined in each typeface module.
     */
    public static String[] getFields() {
        return SUPPORTED_FONT_CLASSES;
    }
}
