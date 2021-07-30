package com.rilixtech.materialfancybutton.typeface;

/**
 * Created by mikepenz on 06.11.14.
 */
public interface IIcon {
    String getFormattedName();

    String getName();

    char getCharacter();

    /** Gets the ITypeface corresponding to this IIcon.
     *
     * @return ITypeface object corresponding to this IIcon.
     */
    ITypeface getTypeface();
}
