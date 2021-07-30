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
import ohos.agp.utils.Color;
import com.rilixtech.communitymaterialtypeface.CommunityMaterial;
import com.rilixtech.devicontypeface.Devicon;
import com.rilixtech.dripiconstypeface.Dripicons;
import com.rilixtech.entypotypeface.Entypo;
import com.rilixtech.fontawesometypeface.FontAwesome;
import com.rilixtech.foundationiconstypeface.FoundationIcons;
import com.rilixtech.glyphiconshalflingstypeface.GlyphiconsHalflings;
import com.rilixtech.googlematerialtypeface.GoogleMaterial;
import com.rilixtech.ioniconstypeface.Ionicons;
import com.rilixtech.materialdesigniconictypeface.MaterialDesignIconic;
import com.rilixtech.materialfancybutton.MaterialFancyButton;
import com.rilixtech.materialfancybutton.ResourceTable;
import com.rilixtech.materialfancybutton.typeface.MfbIcon;
import com.rilixtech.meteoconstypeface.Meteocons;
import com.rilixtech.mfglabsiconsettypeface.MfgLabsIconset;
import com.rilixtech.mobiriseiconstypeface.MobiriseIcons;
import com.rilixtech.octiconstypeface.Octicons;
import com.rilixtech.openiconictypeface.OpenIconic;
import com.rilixtech.picoltypeface.Picol;
import com.rilixtech.pixeden7stroketypeface.Pixeden7Stroke;
import com.rilixtech.themifyiconstypeface.ThemifyIcons;
import com.rilixtech.typiconstypeface.Typicons;
import com.rilixtech.vaadiniconstypeface.VaadinIcons;
import com.rilixtech.weathericonstypeface.WeatherIcons;

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

        addFacebookButton();
        addAllModuleButtons();
    }

    private void addFacebookButton() {
        // Adds the Facebook Login Button as displayed in the README
        MaterialFancyButton facebookLoginBtn = new MaterialFancyButton(this);
        facebookLoginBtn.setText("Login with Facebook");
        facebookLoginBtn.setBackgroundColor(Color.getIntColor("#3b5998"));
        facebookLoginBtn.setFocusBackgroundColor(Color.getIntColor("#5474b8"));
        facebookLoginBtn.setTextSize(17);
        facebookLoginBtn.setRadius(16);
        facebookLoginBtn.setIconPadding(16, 32, 16, 32);
        facebookLoginBtn.setIconFont("fontawesome-font-v4.7.ttf");
        char facebookIconUnicodeId = (char) 0xf082;
        facebookLoginBtn.setIcon(facebookIconUnicodeId);
        facebookLoginBtn.setIconPosition(MaterialFancyButton.POSITION_LEFT);
        facebookLoginBtn.setFontIconSize(30);

        ComponentContainer.LayoutConfig layoutConfig =
                new ComponentContainer.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        layoutConfig.setMarginBottom(12);
        ComponentContainer container = (ComponentContainer)
                findComponentById(ResourceTable.Id_programbuttons_container);
        container.addComponent(facebookLoginBtn, layoutConfig);
    }

    private void addAllModuleButtons() {
        // Adds one button with an Icon corresponding to each Module
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
        addButtonToLayout(MfgLabsIconset.Icon.MFGI_ICON_GLOBE);
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

    private void addButtonToLayout(MfbIcon icon) {
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
