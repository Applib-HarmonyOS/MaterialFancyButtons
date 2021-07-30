package com.rilixtech.materialfancybutton.typeface;


import ohos.agp.text.Font;
import ohos.app.AbilityContext;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by mikepenz on 01.11.14.
 */
public interface ITypeface {

    IIcon getIcon(String key);

    HashMap<String, Character> getCharacters();

    /**
     * The Mapping Prefix to identify this font.
     * must have a length of {@code CoreIcon.FONT_MAPPING_PREFIX}
     *
     * @return mappingPrefix (length = {@code CoreIcon.FONT_MAPPING_PREFIX})
     */
    String getMappingPrefix();

    String getFontName();

    String getVersion();

    int getIconCount();

    Collection<String> getIcons();

    String getAuthor();

    String getUrl();

    String getDescription();

    String getLicense();

    String getLicenseUrl();

    Font getTypeface(AbilityContext ctx);

}
