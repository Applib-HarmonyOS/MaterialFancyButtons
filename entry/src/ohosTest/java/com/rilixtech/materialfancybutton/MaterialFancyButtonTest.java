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

import ohos.agp.components.Attr;
import ohos.agp.components.AttrSet;
import ohos.agp.components.element.Element;
import ohos.agp.utils.Color;
import ohos.agp.utils.TextAlignment;
import ohos.app.Context;
import com.rilixtech.materialfancybutton.utils.AttrEnumUtil;
import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.*;

public class MaterialFancyButtonTest {

    private final AttrSet dummyAttrSet = new TestAttrSet();
    private final Context context = AbilityDelegatorRegistry.getAbilityDelegator().getAppContext();

    @Test
    public void testInitBasic() {
        MaterialFancyButton defaultMaterialFancyButton = new MaterialFancyButton(context, dummyAttrSet);
        assertNotNull(defaultMaterialFancyButton);
    }

    @Test
    public void testInitWithoutAttrs() {
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(context);
        assertNotNull(materialFancyButton);
    }

    @Test
    public void testColorAttrs() {
        HashMap<String, Color> colorAttrs = new HashMap<>();
        colorAttrs.put("mfb_defaultColor", Color.WHITE);
        colorAttrs.put("mfb_focusColor", Color.BLACK);
        colorAttrs.put("mfb_disabledColor", Color.BLUE);
        colorAttrs.put("mfb_disabledTextColor", Color.CYAN);
        colorAttrs.put("mfb_disabledBorderColor", Color.DKGRAY);
        colorAttrs.put("mfb_textColor", Color.GRAY);
        colorAttrs.put("mfb_iconColor", Color.GREEN);
        colorAttrs.put("mfb_borderColor", Color.RED);

        TestAttrSet attrSet = new TestAttrSet(null, null, null, colorAttrs, null, null);
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(context, attrSet);

        assertEquals(colorAttrs.get("mfb_defaultColor").getValue(), materialFancyButton.getBackgroundColor());
        assertEquals(colorAttrs.get("mfb_focusColor").getValue(), materialFancyButton.getFocusBackgroundColor());
        assertEquals(colorAttrs.get("mfb_disabledColor").getValue(), materialFancyButton.getDisableBackgroundColor());
        assertEquals(colorAttrs.get("mfb_disabledTextColor").getValue(), materialFancyButton.getDisableTextColor());
        assertEquals(colorAttrs.get("mfb_disabledBorderColor").getValue(), materialFancyButton.getDisableBorderColor());
        assertEquals(colorAttrs.get("mfb_textColor").getValue(), materialFancyButton.getTextColor());
        assertEquals(colorAttrs.get("mfb_iconColor").getValue(), materialFancyButton.getIconColor());
        assertEquals(colorAttrs.get("mfb_borderColor").getValue(), materialFancyButton.getBorderColor());
    }

    @Test
    public void testStringAttrs() {
        HashMap<String, String> stringAttrs = new HashMap<>();
        stringAttrs.put("mfb_text", "Test Button Text");

        TestAttrSet attrSet = new TestAttrSet(stringAttrs, null, null, null, null, null);
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(context, attrSet);

        assertEquals(stringAttrs.get("mfb_text"), materialFancyButton.getText());
    }

    @Test
    public void testBoolAttrs() {
        HashMap<String, Boolean> boolAttrs = new HashMap<>();
        boolAttrs.put("enabled", true);
        boolAttrs.put("mfb_textAllCaps", true);
        boolAttrs.put("mfb_ghost", true);

        TestAttrSet attrSet = new TestAttrSet(null, null, boolAttrs, null, null, null);
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(context, attrSet);

        assertEquals(boolAttrs.get("enabled"), materialFancyButton.isEnabled());
        assertEquals(boolAttrs.get("mfb_textAllCaps"), materialFancyButton.isTextAllCaps());
        assertEquals(boolAttrs.get("mfb_ghost"), materialFancyButton.isGhost());
    }
    @Test
    public void testDimensionAttrs() {
        HashMap<String, String> dimensionAttrs = new HashMap<>();
        int textSize = 16;
        dimensionAttrs.put("mfb_textSize", textSize + "fp");
        int borderWidth = 8;
        dimensionAttrs.put("mfb_borderWidth", borderWidth + "vp");
        int radiusTopLeft = 4;
        dimensionAttrs.put("mfb_radiusTopLeft", radiusTopLeft + "px");
        int radiusTopRight = 6;
        dimensionAttrs.put("mfb_radiusTopRight", radiusTopRight + "px");
        int radiusBottomLeft = 9;
        dimensionAttrs.put("mfb_radiusBottomLeft", radiusBottomLeft + "px");
        int radiusBottomRight = 20;
        dimensionAttrs.put("mfb_radiusBottomRight",  radiusBottomRight + "px");
        int fontIconSize = 4;
        dimensionAttrs.put("mfb_fontIconSize", fontIconSize + "fp");
        int iconPaddingLeft = 30;
        dimensionAttrs.put("mfb_iconPaddingLeft", iconPaddingLeft + "vp");
        int iconPaddingRight = 80;
        dimensionAttrs.put("mfb_iconPaddingRight", iconPaddingRight + "vp");
        int iconPaddingTop = 40;
        dimensionAttrs.put("mfb_iconPaddingTop", iconPaddingTop + "vp");
        int iconPaddingBottom = 64;
        dimensionAttrs.put("mfb_iconPaddingBottom", iconPaddingBottom + "vp");

        TestAttrSet attrSet = new TestAttrSet(null, dimensionAttrs, null, null, null, null);
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(context, attrSet);

        assertEquals(textSize, materialFancyButton.getTextSize());
        assertEquals(borderWidth, materialFancyButton.getBorderWidth());
        assertEquals(radiusTopLeft, materialFancyButton.getRadiusTopLeft());
        assertEquals(radiusTopRight, materialFancyButton.getRadiusTopRight());
        assertEquals(radiusBottomLeft, materialFancyButton.getRadiusBottomLeft());
        assertEquals(radiusBottomRight, materialFancyButton.getRadiusBottomRight());
        assertEquals(fontIconSize, materialFancyButton.getFontIconSize());
        assertEquals(iconPaddingLeft, materialFancyButton.getIconPaddingLeft());
        assertEquals(iconPaddingRight, materialFancyButton.getIconPaddingRight());
        assertEquals(iconPaddingTop, materialFancyButton.getIconPaddingTop());
        assertEquals(iconPaddingBottom, materialFancyButton.getIconPaddingBottom());
    }

    @Test
    public void testEnumAttrs() {
        HashMap<String, String> enumAttrs = new HashMap<>();
        AttrEnumUtil.MfbTextGravity textGravityStart = AttrEnumUtil.MfbTextGravity.START;
        enumAttrs.put("mfb_textGravity", textGravityStart.name());
        AttrEnumUtil.MfbIconPosition iconPositionRight = AttrEnumUtil.MfbIconPosition.RIGHT;
        enumAttrs.put("mfb_iconPosition", iconPositionRight.name());

        TestAttrSet attrSet = new TestAttrSet(null, null, null, null, enumAttrs, null);
        MaterialFancyButton materialFancyButton = new MaterialFancyButton(context, attrSet);

        assertEquals(textGravityStart.getValue(), materialFancyButton.getTextGravity());
        assertEquals(iconPositionRight.value, materialFancyButton.getIconPosition());
    }

    @Test
    public void testSetText() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        String testSetText = "Test Set Text";
        mfb.setText(testSetText);
        assertEquals(testSetText, mfb.getText());
    }

    @Test
    public void testSetText2() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int textId = ResourceTable.String_app_name;
        mfb.setText(textId);
        assertEquals(context.getString(textId), mfb.getText());
    }

    @Test
    public void testSetTextAllCaps() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        mfb.setTextAllCaps(true);
        assertTrue(mfb.isTextAllCaps());
    }

    @Test
    public void testSetTextColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setTextColor(newColor);
        assertEquals(newColor, mfb.getTextColor());
    }

    @Test
    public void testSetIconColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setIconColor(newColor);
        assertEquals(newColor, mfb.getIconColor());
    }

    @Test
    public void testSetBackgroundColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setBackgroundColor(newColor);
        assertEquals(newColor, mfb.getBackgroundColor());

    }

    @Test
    public void testSetFocusBackgroundColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setFocusBackgroundColor(newColor);
        assertEquals(newColor, mfb.getFocusBackgroundColor());
    }

    @Test
    public void testSetDisableBackgroundColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setDisableBackgroundColor(newColor);
        assertEquals(newColor, mfb.getDisableBackgroundColor());
    }

    @Test
    public void testSetDisableTextColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setDisableTextColor(newColor);
        assertEquals(newColor, mfb.getDisableTextColor());
    }

    @Test
    public void testSetDisableBorderColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setDisableBorderColor(newColor);
        assertEquals(newColor, mfb.getDisableBorderColor());
    }

    @Test
    public void testSetTextSize() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newTextSize = 24;
        mfb.setTextSize(newTextSize);
        assertEquals(newTextSize, mfb.getTextSize());
    }

    @Test
    public void testSetTextGravity() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newTextGravity = TextAlignment.CENTER;
        mfb.setTextGravity(newTextGravity);
        assertEquals(newTextGravity, mfb.getTextGravity());
    }

    @Test
    public void testSetIconPadding() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newPaddingLeft = 8;
        int newPaddingTop = 24;
        int newPaddingRight = 16;
        int newPaddingBottom = 32;
        mfb.setIconPadding(newPaddingLeft, newPaddingTop, newPaddingRight, newPaddingBottom);
        assertEquals(newPaddingLeft, mfb.getIconPaddingLeft());
        assertEquals(newPaddingTop, mfb.getIconPaddingTop());
        assertEquals(newPaddingRight, mfb.getIconPaddingRight());
        assertEquals(newPaddingBottom, mfb.getIconPaddingBottom());
    }

    @Test
    public void testSetIconResource() {
        // The "tst" string is not a valid key for an icon, because it fails the 4-length prefix requirement.
        // Therefore, setting of the icon will fail and the fontIconResource value is not updated and remains null.
        // Cannot test with valid key as it requires loading of Font which cannot be done in testing environment.
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        String iconResourceValue = "tst";
        assertThrows(IllegalArgumentException.class, () -> mfb.setIconResource(iconResourceValue));
    }

    @Test
    public void testSetIcon() {
        // SetIcon has 3 method definitions. Only the setIcon(String) method can be tested as it doesn't require
        // font loading.
        // The "tst" string is not a valid key for an icon, because it fails the 4-length prefix requirement.
        // Therefore, setting of the icon will fail and the fontIconResource value is not updated and remains null.
        // Cannot test with valid key as it requires loading of Font which cannot be done in testing environment.
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        String iconResourceValue = "tst";
        mfb.setIcon(iconResourceValue);
        assertNull(mfb.getFontIconResource());
    }

    @Test
    public void testSetFontIconSize() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int iconSize = 16;
        mfb.setFontIconSize(iconSize);
        assertEquals(iconSize, mfb.getFontIconSize());
    }

    @Test
    public void testSetIconPosition() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int iconPosition = MaterialFancyButton.POSITION_RIGHT;
        mfb.setIconPosition(iconPosition);
        assertEquals(iconPosition, mfb.getIconPosition());
    }

    @Test
    public void testSetBorderColor() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int newColor = Color.BLUE.getValue();
        mfb.setBorderColor(newColor);
        assertEquals(newColor, mfb.getBorderColor());
    }

    @Test
    public void testSetBorderWidth() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int borderWidth = 16;
        mfb.setBorderWidth(borderWidth);
        assertEquals(borderWidth, mfb.getBorderWidth());
    }

    @Test
    public void testSetRadius() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int radius = 32;
        mfb.setRadius(radius);
        assertEquals(radius ,mfb.getRadiusTopLeft());
        assertEquals(radius ,mfb.getRadiusTopRight());
        assertEquals(radius ,mfb.getRadiusBottomLeft());
        assertEquals(radius ,mfb.getRadiusBottomRight());
    }

    @Test
    public void testSetRadius2() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int topLeftRadius = 8;
        int topRightRadius = 16;
        int bottomLeftRadius = 24;
        int bottomRightRadius = 32;
        mfb.setRadius(topLeftRadius, topRightRadius, bottomLeftRadius, bottomRightRadius);
        assertEquals(topLeftRadius ,mfb.getRadiusTopLeft());
        assertEquals(topRightRadius ,mfb.getRadiusTopRight());
        assertEquals(bottomLeftRadius ,mfb.getRadiusBottomLeft());
        assertEquals(bottomRightRadius ,mfb.getRadiusBottomRight());
    }

    @Test
    public void testSetRadiusTopLeft() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int topLeftRadius = 8;
        mfb.setRadiusTopLeft(topLeftRadius);
        assertEquals(topLeftRadius ,mfb.getRadiusTopLeft());
    }

    @Test
    public void testSetRadiusTopRight() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int topRightRadius = 16;
        mfb.setRadiusTopRight(topRightRadius);
        assertEquals(topRightRadius ,mfb.getRadiusTopRight());
    }

    @Test
    public void testSetRadiusBottomLeft() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int bottomLeftRadius = 24;
        mfb.setRadiusBottomLeft(bottomLeftRadius);
        assertEquals(bottomLeftRadius ,mfb.getRadiusBottomLeft());
    }

    @Test
    public void testSetRadiusBottomRight() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        int bottomRightRadius = 32;
        mfb.setRadiusBottomRight(bottomRightRadius);
        assertEquals(bottomRightRadius ,mfb.getRadiusBottomRight());
    }

    @Test
    public void testSetEnabled() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        mfb.setEnabled(false);
        assertFalse(mfb.isEnabled());
    }

    @Test
    public void testSetGhost() {
        MaterialFancyButton mfb = new MaterialFancyButton(context);
        mfb.setGhost(true);
        assertTrue(mfb.isGhost());
    }

    /**
     * Basic implementation of AttrSet for use in testing.
     */
    private static class TestAttrSet implements AttrSet {

        Map<String, Optional<Attr>> attrMap= new HashMap<>();

        /**
         * Empty AttrSet holding no attribute values, for use in testing.
         */
        public TestAttrSet() {
            super();
        }

        /**
         * AttrSet holding the specified attributes. null parameter implies no attributes of that particular type.
         * @param stringAttrs Key-value pairs used for String Attributes.
         * @param dimensionAttrs Key-value pairs used for Dimension Attributes.
         * @param boolAttrs Key-value pairs used for Boolean Attributes.
         * @param colorAttrs Key-value pairs used for color Attributes.
         * @param enumAttrs Key-value pairs used for enum Attributes (identical to String Attributes).
         * @param elementAttrs Key-value pairs used for Element Attributes.
         */
        public TestAttrSet(Map<String, String> stringAttrs,
                           Map<String, String> dimensionAttrs,
                           Map<String, Boolean> boolAttrs,
                           Map<String, Color> colorAttrs,
                           Map<String, String> enumAttrs,
                           Map<String, Element> elementAttrs) {
            super();
            if (stringAttrs != null)
                stringAttrs.keySet().forEach(
                        strKey -> attrMap.put(strKey, Optional.of(new TestAttr(strKey, stringAttrs.get(strKey)))));
            if (dimensionAttrs != null)
                dimensionAttrs.keySet().forEach(strKey -> {
                    TestAttr dimensionAttr = TestAttr.createDimensionAttr(strKey, dimensionAttrs.get(strKey));
                    if (dimensionAttr != null) {
                        attrMap.put(strKey, Optional.of(dimensionAttr));
                    }
                });
            if (boolAttrs != null)
                boolAttrs.keySet().forEach(
                        strKey -> attrMap.put(strKey, Optional.of(new TestAttr(strKey, boolAttrs.get(strKey)))));
            if (colorAttrs != null)
                colorAttrs.keySet().forEach(
                        strKey -> attrMap.put(strKey, Optional.of(new TestAttr(strKey, colorAttrs.get(strKey)))));
            if (enumAttrs != null)
                enumAttrs.keySet().forEach(
                        strKey -> attrMap.put(strKey, Optional.of(new TestAttr(strKey, enumAttrs.get(strKey)))));
            if (elementAttrs != null)
                elementAttrs.keySet().forEach(
                        strKey -> attrMap.put(strKey, Optional.of(new TestAttr(strKey, elementAttrs.get(strKey)))));
        }

        @Override
        public Optional<String> getStyle() {
            return Optional.empty();
        }

        @Override
        public int getLength() {
            return 0;
        }

        @Override
        public Optional<Attr> getAttr(int i) {
            return Optional.empty();
        }

        @Override
        public Optional<Attr> getAttr(String s) {
            if (attrMap.containsKey(s))
                return attrMap.get(s);
            return Optional.empty();
        }
    }

    /**
     * Basic implementation of Attr for use in testing.
     */
    private static class TestAttr implements Attr {

        private final String name;
        private String stringValue = null;
        private int dimensionValue = 0;
        private boolean boolValue = false;
        private Color colorValue = null;
        private Element elementValue = null;

        public TestAttr(String name) {
            this.name = name;
        }

        public TestAttr(String name, String value) {
            this(name);
            this.stringValue = value;
        }

        public TestAttr(String name, boolean value) {
            this(name);
            this.boolValue = value;
        }
        public TestAttr(String name, Color value) {
            this(name);
            this.colorValue = value;
        }
        public TestAttr(String name, Element value) {
            this(name);
            this.elementValue = value;
        }

        /**
         * Initializer for an Attr variable holding a dimension value.
         * @param name Name of the attribute.
         * @param dimensionValue A String containing an integer value ending with "px", "vp" or "fp". Any String not
         *                       conforming to this format will result in a null attribute.
         * @return An Attr object holding a dimension value, or null if the parameter wasn't passed as per format.
         */
        public static TestAttr createDimensionAttr(String name, String dimensionValue) {
            TestAttr testAttr = new TestAttr(name);
            try {
                if (dimensionValue.endsWith("fp") || dimensionValue.endsWith("vp") || dimensionValue.endsWith("px")) {
                    String integerPortionOfString = dimensionValue.split("[^0-9]")[0];
                    testAttr.dimensionValue = Integer.parseInt(integerPortionOfString);
                    return testAttr;
                }
                else {
                    return null;
                }
            } catch (IllegalArgumentException | IndexOutOfBoundsException ex) {
                return null;
            }
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getStringValue() {
            return stringValue;
        }

        @Override
        public int getIntegerValue() {
            return 0;
        }

        @Override
        public boolean getBoolValue() {
            return boolValue;
        }

        @Override
        public float getFloatValue() {
            return 0;
        }

        @Override
        public long getLongValue() {
            return 0;
        }

        @Override
        public Element getElement() {
            return elementValue;
        }

        @Override
        public int getDimensionValue() {
            return dimensionValue;
        }

        @Override
        public Color getColorValue() {
            return colorValue;
        }

        @Override
        public Context getContext() {
            return null;
        }
    }
}
