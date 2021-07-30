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

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.ListContainer;
import ohos.agp.components.Text;
import com.rilixtech.materialfancybutton.ListItemProvider;
import com.rilixtech.materialfancybutton.ResourceTable;
import java.util.ArrayList;
import java.util.List;

/**
 * This ability slice displays a list of options that will load the corresponding font-module based MaterialFancyButton
 * example layout buttons.
 */
public class MainAbilitySlice extends AbilitySlice {

    private List<NameLayout> nameLayouts;

    /**
     * A simple class holding a String name value and an Integer id value representing the layoutId.
     */
    public static class NameLayout {
        String name;
        int layoutId;

        NameLayout(String name, int layoutId) {
            this.name = name;
            this.layoutId = layoutId;
        }

        /**
         * Get the name value for this object.
         *
         * @return The name value for this object.
         */
        public String getName() {
            return name;
        }
    }

    private List<NameLayout> getNameAndClasses() {
        List<NameLayout> list = new ArrayList<>();
        list.add(new NameLayout(getString(ResourceTable.String_title_xml_buttons),
                ResourceTable.Layout_ability_xml_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_program_buttons),
                ResourceTable.Layout_ability_program_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_community_material_buttons),
                ResourceTable.Layout_ability_community_material_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_devicon_buttons),
                ResourceTable.Layout_ability_devicon_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_dripicons_buttons),
                ResourceTable.Layout_ability_dripicons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_entypo),
                ResourceTable.Layout_ability_entypo_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_fontawesome),
                ResourceTable.Layout_ability_fontawesome_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_foundation_icons),
                ResourceTable.Layout_ability_foundation_icons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_glyphicons_halflings),
                ResourceTable.Layout_ability_glyphicons_halflings_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_google_material),
                ResourceTable.Layout_ability_google_material_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_ionicons),
                ResourceTable.Layout_ability_ionicons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_mfglabs),
                ResourceTable.Layout_ability_mfglabs_iconset_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_material_design_iconic),
                ResourceTable.Layout_ability_material_design_iconic_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_meteocons),
                ResourceTable.Layout_ability_meteocons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_mobiriseicons),
                ResourceTable.Layout_ability_mobirise_icons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_octicons),
                ResourceTable.Layout_ability_octicons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_openiconic),
                ResourceTable.Layout_ability_openiconic_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_picol),
                ResourceTable.Layout_ability_picol_icons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_pixeden7),
                ResourceTable.Layout_ability_pixeden7stroke_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_themify_icons),
                ResourceTable.Layout_ability_themify_icons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_typicons),
                ResourceTable.Layout_ability_typicons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_vaadin_icons),
                ResourceTable.Layout_ability_vaadin_icons_buttons));
        list.add(new NameLayout(getString(ResourceTable.String_title_weather_icons),
                ResourceTable.Layout_ability_weather_icons_buttons));
        return list;
    }

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        initViews();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    private void initViews() {
        ListContainer listContainer = (ListContainer) findComponentById(ResourceTable.Id_list_container);
        nameLayouts = getNameAndClasses();
        ListItemProvider listItemProvider = new ListItemProvider(nameLayouts, this);
        listContainer.setItemProvider(listItemProvider);
        listContainer.setItemClickedListener((listContainer1, component, i, l) -> onListItemClick(i));

        Text titleTv = (Text) findComponentById(ResourceTable.Id_title_tv);
        titleTv.setText(
                "MaterialFancyButtons example with " + (nameLayouts.size() - 2) + " icon fonts");
    }

    private void onListItemClick(final int position) {
        if (nameLayouts.get(position).layoutId == ResourceTable.Layout_ability_program_buttons) {
            present(new ProgramButtonsSlice(), new Intent());
        } else {
            Intent buttonActivity = new Intent();
            buttonActivity.setParam(IconButtonsSlice.LAYOUT_ID_EXTRA, nameLayouts.get(position).layoutId);
            buttonActivity.setParam(IconButtonsSlice.TITLE_EXTRA, nameLayouts.get(position).name);
            present(new IconButtonsSlice(), buttonActivity);
        }
    }

}
