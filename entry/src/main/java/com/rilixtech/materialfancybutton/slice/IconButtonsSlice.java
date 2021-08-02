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

/**
 * This class displays the layout as specified by the intent parameter "layoutIdExtra".
 * It is used to display buttons of different font modules from the corresponding layout files.
 * Refer to the various supported layouts in resources->base->layout directory.
 */
public class IconButtonsSlice extends AbilitySlice {

    public static final String LAYOUT_ID_EXTRA = "layoutIdExtra";
    public static final String TITLE_EXTRA = "titleExtra";

    @Override protected void onStart(Intent intent) {
        super.onStart(intent);

        int layoutId = intent.getIntParam(LAYOUT_ID_EXTRA, 0);

        super.setUIContent(layoutId);
    }
}
