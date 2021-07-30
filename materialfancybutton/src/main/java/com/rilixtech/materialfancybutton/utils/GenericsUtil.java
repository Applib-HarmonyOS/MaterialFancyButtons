package com.rilixtech.materialfancybutton.utils;

/**
 * Utility class containing methods to handle the different {@link com.rilixtech.materialfancybutton.typeface.ITypeface}
 * implementations existing in the various loaded modules.
 */
public class GenericsUtil {

    private GenericsUtil() {}

    // If a new font module is to be added, its name should be appended in the below array
    private static final String[] SUPPORTED_FONT_CLASSES = new String[]{
        "com.rilixtech.community_material_typeface.CommunityMaterial",
        "com.rilixtech.devicon_typeface.Devicon",
        "com.rilixtech.dripicons_typeface.Dripicons",
        "com.rilixtech.entypo_typeface.Entypo",
        "com.rilixtech.fontawesome_typeface.FontAwesome",
        "com.rilixtech.foundation_icons_typeface.FoundationIcons",
        "com.rilixtech.glyphicons_halflings_typeface.GlyphiconsHalflings",
        "com.rilixtech.google_material_typeface.GoogleMaterial",
        "com.rilixtech.ionicons_typeface.Ionicons",
        "com.rilixtech.material_design_iconic_typeface.MaterialDesignIconic",
        "com.rilixtech.meteocons_typeface.Meteocons",
        "com.rilixtech.mfglabs_iconset_typeface.MFGLabsIconset",
        "com.rilixtech.mobirise_icons_typeface.MobiriseIcons",
        "com.rilixtech.octicons_typeface.Octicons",
        "com.rilixtech.open_iconic_typeface.OpenIconic",
        "com.rilixtech.picol_typeface.Picol",
        "com.rilixtech.pixeden_7_stroke_typeface.Pixeden7Stroke",
        "com.rilixtech.themify_icons_typeface.ThemifyIcons",
        "com.rilixtech.typicons_typeface.Typicons",
        "com.rilixtech.vaadin_icons_typeface.VaadinIcons",
        "com.rilixtech.weather_icons_typeface.WeatherIcons"
    };

    /**
     * Find the full class names for each of the ITypeface classes defined in each typeface module.
     */
    public static String[] getFields() {
        return SUPPORTED_FONT_CLASSES;
    }
}
