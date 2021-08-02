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

package com.rilixtech.materialfancybutton;

import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.BaseItemProvider;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.LayoutScatter;
import ohos.agp.components.Text;
import com.rilixtech.materialfancybutton.slice.MainAbilitySlice;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple implementation of the BaseItemProvider class to handle {@link MainAbilitySlice.NameLayout} items.
 */
public class ListItemProvider extends BaseItemProvider {

    private final List<String> itemNames;
    private final int itemCount;
    private final List<MainAbilitySlice.NameLayout> list;
    private final AbilitySlice slice;

    /** Default constructor for the ListItemProvider class.
     *
     * @param list The List of {@link MainAbilitySlice.NameLayout} items that are to be displayed.
     * @param slice The AbliitySlice utilizing this object.
     */
    public ListItemProvider(List<MainAbilitySlice.NameLayout> list, AbilitySlice slice) {
        this.list = list;
        this.slice = slice;

        if (slice instanceof MainAbilitySlice) {
            List<String> nameLayoutNames = new ArrayList<>();
            for (MainAbilitySlice.NameLayout nameLayoutObj : list) {
                String name = nameLayoutObj.getName();
                nameLayoutNames.add(name);
            }
            itemNames = nameLayoutNames;
        } else {
            itemNames = new ArrayList<>();
        }
        itemCount = itemNames.size();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        if (position < itemCount) {
            return list.get(position);
        } else {
            return list.get(list.size() - 1);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Component getComponent(int position, Component convertComponent, ComponentContainer componentContainer) {
        final Component cpt;
        if (convertComponent == null) {
            cpt = LayoutScatter.getInstance(slice).parse(ResourceTable.Layout_list_item, null, false);
        } else {
            cpt = convertComponent;
        }
        Text text = (Text) cpt.findComponentById(ResourceTable.Id_tv_item);
        text.setText(itemNames.get(position));
        return cpt;
    }
}
