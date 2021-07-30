/*
 * Copyright (C) 2020-21 Application Library Engineering Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rilixtech.materialfancybutton.slice;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.ComponentContainer;
import com.rilixtech.community_material_typeface.CommunityMaterial;
import com.rilixtech.devicon_typeface.Devicon;
import com.rilixtech.dripicons_typeface.Dripicons;
import com.rilixtech.entypo_typeface.Entypo;
import com.rilixtech.fontawesome_typeface.FontAwesome;
import com.rilixtech.foundation_icons_typeface.FoundationIcons;
import com.rilixtech.glyphicons_halflings_typeface.GlyphiconsHalflings;
import com.rilixtech.google_material_typeface.GoogleMaterial;
import com.rilixtech.ionicons_typeface.Ionicons;
import com.rilixtech.material_design_iconic_typeface.MaterialDesignIconic;
import com.rilixtech.materialfancybutton.MaterialFancyButton;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.ResourceTable;
import com.rilixtech.meteocons_typeface.Meteocons;
import com.rilixtech.mfglabs_iconset_typeface.MFGLabsIconset;
import com.rilixtech.mobirise_icons_typeface.MobiriseIcons;
import com.rilixtech.octicons_typeface.Octicons;
import com.rilixtech.open_iconic_typeface.OpenIconic;
import com.rilixtech.picol_typeface.Picol;
import com.rilixtech.pixeden_7_stroke_typeface.Pixeden7Stroke;
import com.rilixtech.themify_icons_typeface.ThemifyIcons;
import com.rilixtech.typicons_typeface.Typicons;
import com.rilixtech.vaadin_icons_typeface.VaadinIcons;
import com.rilixtech.weather_icons_typeface.WeatherIcons;

/**
 * This AbilitySlice displays a set of {@link MaterialFancyButton} Components instantiated using Java code
 * on a blank layout.
 */
public class ProgramButtonsSlice extends AbilitySlice {

    private static final String BUTTON_TEXT_FORMAT = "%s Button";

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_program_buttons);

        addAllModuleButtons();
    }

    private void addAllModuleButtons() {
        addButtonToLayout(CommunityMaterial.Icon.CMDI_LIGHTBULB);
        addButtonToLayout(Devicon.Icon.DEVI_UBUNTU_PLAIN);
        addButtonToLayout(Dripicons.Icon.DRPI_ARCHIVE);
        addButtonToLayout(Entypo.Icon.ENTI_MESSAGE);
        addButtonToLayout(FontAwesome.Icon.FAWI_ADDRESS_BOOK);
        addButtonToLayout(FoundationIcons.Icon.FOUI_ALERT);
        addButtonToLayout(GlyphiconsHalflings.Icon.GLYI_CAMERA);
        addButtonToLayout(GoogleMaterial.Icon.GMDI_LOCATION_ON);
        addButtonToLayout(Ionicons.Icon.IONI_IOS_INFINITE);
        addButtonToLayout(MaterialDesignIconic.Icon.MDII_AIRPLAY);
        addButtonToLayout(Meteocons.Icon.METI_SNOW);
        addButtonToLayout(MFGLabsIconset.Icon.MFGI_ICON_GLOBE);
        addButtonToLayout(MobiriseIcons.Icon.MBRI_DESKTOP);
        addButtonToLayout(Octicons.Icon.OCTI_LINK);
        addButtonToLayout(OpenIconic.Icon.OPIC_VIDEO);
        addButtonToLayout(Picol.Icon.PICI_INTERNET);
        addButtonToLayout(Pixeden7Stroke.Icon.PE7I_7S_FLAG);
        addButtonToLayout(ThemifyIcons.Icon.THEI_PAINT_BUCKET);
        addButtonToLayout(Typicons.Icon.TYPI_EJECT);
        addButtonToLayout(VaadinIcons.Icon.VAAI_FOLDER);
        addButtonToLayout(WeatherIcons.Icon.WICI_EARTHQUAKE);
    }

    private void addButtonToLayout(IIcon icon) {
        String buttonText = String.format(BUTTON_TEXT_FORMAT, icon.getTypeface().getFontName());
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(this);
        materialFancyButton.setIcon(icon);
        materialFancyButton.setIconPosition(MaterialFancyButton.POSITION_RIGHT);
        materialFancyButton.setText(buttonText);
        materialFancyButton.setRadius(30);
        materialFancyButton.setTextSize(12);
        materialFancyButton.setFontIconSize(12);
        materialFancyButton.setIconPadding(4, 8, 4, 8);
        ComponentContainer.LayoutConfig layoutConfig =
                new ComponentContainer.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        layoutConfig.setMarginBottom(12);
        ComponentContainer container = (ComponentContainer)
                findComponentById(ResourceTable.Id_programbuttons_container);
        container.addComponent(materialFancyButton, layoutConfig);
    }

    @Override
    protected void onActive() {
        super.onActive();
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
