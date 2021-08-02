package com.rilixtech.materialfancybutton.typeface;

/**
 * Created by mikepenz on 06.11.14.
 */
public interface MfbIcon {
    String getFormattedName();

    String getName();

    char getCharacter();

    /** Gets the MfbTypeface corresponding to this MfbIcon.
     *
     * @return MfbTypeface object corresponding to this MfbIcon.
     */
    MfbTypeface getTypeface();
}
