package com.rilixtech.materialfancybutton;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Attr;
import ohos.agp.components.AttrSet;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentState;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Image;
import ohos.agp.components.Text;
import ohos.agp.components.element.Element;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.components.element.StateElement;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.utils.TextAlignment;
import ohos.app.AbilityContext;
import ohos.app.Context;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import com.rilixtech.materialfancybutton.typeface.IIcon;
import com.rilixtech.materialfancybutton.typeface.ITypeface;
import com.rilixtech.materialfancybutton.utils.AttrEnumUtil;
import com.rilixtech.materialfancybutton.utils.FontUtil;
import com.rilixtech.materialfancybutton.utils.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This class is used to define a Button-type UI Component that may be customized using a variety of attributes.
 * Apart from button {@link Text}, it may have an associated {@link Element} or {@link ITypeface} style icon that can be
 * positioned beside the text as required. It supports a set of custom attributes that can be used to customize the
 * component. Refer to example code and documentation for the list of supported attributes.
 */
public class MaterialFancyButton extends DirectionalLayout {

    private static final String TAG = MaterialFancyButton.class.getSimpleName();
    private static final int DOMAIN = 0xD000100;
    private static final HiLogLabel LABEL = new HiLogLabel(HiLog.LOG_APP, DOMAIN, TAG);

    // # Background Attributes
    private int mDefaultBackgroundColor = Color.BLACK.getValue();
    private int mFocusBackgroundColor = 0;
    private int mDisabledBackgroundColor = Color.getIntColor("#f6f7f9");
    private int mDisabledTextColor = Color.getIntColor("#bec2c9");
    private int mDisabledBorderColor = Color.getIntColor("#dddfe2");

    // # Text Attributes
    private int mDefaultTextColor = Color.WHITE.getValue();
    private int mDefaultIconColor = Color.WHITE.getValue();
    private int mTextSize = FontUtil.fpToPx(getContext(), 16);
    private int mTextGravity; // Gravity.CENTER
    private String mText = null;

    // # Icon Attributes
    private Element mIconResource = null;
    private int mFontIconSize = FontUtil.fpToPx(getContext(), 16);
    private String mFontIcon = null;
    private int mIconPosition = 1;
    private String mIcon = null;

    private int mIconPaddingLeft = 10;
    private int mIconPaddingRight = 10;
    private int mIconPaddingTop = 0;
    private int mIconPaddingBottom = 0;

    private int mBorderColor = Color.BLACK.getValue();
    private int mBorderWidth = 0;

    private int mRadius = 0;
    private int mRadiusTopLeft = 0;
    private int mRadiusTopRight = 0;
    private int mRadiusBottomLeft = 0;
    private int mRadiusBottomRight = 0;

    private boolean mEnabled;
    private boolean mTextAllCaps;

    private Font mTextTypeFace = null;
    private Font mIconTypeFace = null;

    /**
     * Icon positioned to the left of the button.
     */
    public static final int POSITION_LEFT = 1;
    /**
     * Icon positioned to the right of the button.
     */
    public static final int POSITION_RIGHT = 2;
    /**
     * Icon positioned to the top of the button.
     */
    public static final int POSITION_TOP = 3;
    /**
     * Icon positioned to the bottom of the button.
     */
    public static final int POSITION_BOTTOM = 4;

    private Image mIconView;
    private Text mFontIconView;
    private Text mTextView;

    private boolean mGhost = false; // Default is a solid button !

    /**
     * Indicates whether this component needs an update. Used by refreshComponents() to clear all components and re-add
     * them.
     */
    private boolean needsUpdate = true;

    /**
     * Used to define a MaterialFancyButton Component.
     * This constructor uses the default attributes defined for the MaterialFancyButton.
     * To change the attributes after instantiation, refer to the setter methods of this class.
     *
     * @param context The context in which this Component is being instantiated.
     */
    public MaterialFancyButton(Context context) {
        super(context);
        initializeMaterialFancyButton();
    }

    /**
     * Used to define a MaterialFancyButton Component using the AttrSet provided. This constructor is called
     * when defining the button using XML code.
     *
     * @param context The context in which this Component is being instantiated.
     * @param attrs The set of Attributes, both standard attributes and custom attributes, used to configure this
     *              Button.
     */
    public MaterialFancyButton(Context context, AttrSet attrs) {
        super(context, attrs);

        initAttributes(attrs);
        initializeMaterialFancyButton();
    }

    /**
     * Initialize Button dependencies.
     * <ul>
     * <li>Initialize Button Container : The {@link DirectionalLayout}</li>
     * <li>Initialize Button {@link Text}</li>
     * <li>Initialize Button Icon</li>
     * <li>Initialize Button Font Icon</li>
     * </ul>
     */
    private void initializeMaterialFancyButton() {
        initializeButtonContainer();
        setupTextView();
        setupFontIconView();
        setupIconView();
        if (mIcon != null) {
            setIcon(mIcon);
        }

        setupBackground();
        buildComponentContainer();
    }

    private void buildComponentContainer() {
        if (!needsUpdate) {
            return;
        }
        List<Component> views = new ArrayList<>();

        if (mIconPosition == POSITION_LEFT || mIconPosition == POSITION_TOP) {
            addToListIfNotNull(views, mIconView);
            addToListIfNotNull(views, mFontIconView);
            addToListIfNotNull(views, mTextView);
        } else {
            addToListIfNotNull(views, mTextView);
            addToListIfNotNull(views, mIconView);
            addToListIfNotNull(views, mFontIconView);
        }

        for (Component view : views) {
            addComponent(view);
        }
        needsUpdate = false;
    }

    private void addToListIfNotNull(List<Component> views, Component component) {
        if (component != null) {
            views.add(component);
        }
    }

    private void refreshComponents() {
        if (needsUpdate) {
            removeAllComponents();
            buildComponentContainer();
        }
    }

    /**
     * Setup Text View.
     *
     */
    private void setupTextView() {
        if (mText == null) {
            mText = "BUTTON";
        }
        if (mTextView == null) {
            mTextView = new Text(getContext());
            needsUpdate = true;
        }

        mTextView.setText(mText);
        mTextView.setTextAlignment(mTextGravity);
        mTextView.setTextColor(new Color(mEnabled ? mDefaultTextColor : mDisabledTextColor));
        mTextView.setTextSize(FontUtil.pxToFp(getContext(), mTextSize), Text.TextSizeType.FP);
        mTextView.setLayoutConfig(new LayoutConfig(MATCH_CONTENT, MATCH_CONTENT));
        mTextView.setFont(mTextView.getFont());
    }

    /**
     * Setup Font Icon View.
     */
    private void setupFontIconView() {
        HiLog.debug(LABEL, "setupFontIconView mFontIcon = %{public}s", mFontIcon);
        if (mFontIcon == null) {
            return;
        }
        if (mFontIconView == null) {
            mFontIconView = new Text(getContext());
            needsUpdate = true;
        }
        mFontIconView.setTextColor(new Color(mEnabled ? mDefaultIconColor : mDisabledTextColor));
        LayoutConfig params = new LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        params.setMarginRight(mIconPaddingRight);
        params.setMarginLeft(mIconPaddingLeft);
        params.setMarginTop(mIconPaddingTop);
        params.setMarginBottom(mIconPaddingBottom);

        if (mTextView == null) {
            params.alignment = LayoutAlignment.CENTER;
            mFontIconView.setTextAlignment(TextAlignment.VERTICAL_CENTER);
        } else {
            if (mIconPosition == POSITION_TOP || mIconPosition == POSITION_BOTTOM) {
                params.alignment = LayoutAlignment.CENTER;
                mFontIconView.setTextAlignment(TextAlignment.CENTER);
            } else {
                mFontIconView.setTextAlignment(TextAlignment.VERTICAL_CENTER);
                params.alignment = LayoutAlignment.VERTICAL_CENTER;
            }
        }

        mFontIconView.setLayoutConfig(params);
        mFontIconView.setTextSize(FontUtil.pxToFp(getContext(), mFontIconSize), Text.TextSizeType.FP);
        mFontIconView.setText(mFontIcon);
        mFontIconView.setFont(mIconTypeFace);
        HiLog.debug(LABEL, "setupFontIconView mIconTypeFace  =  %{public}s", mIconTypeFace.toString());
    }

    /**
     * Text Icon resource view.
     *
     */
    private void setupIconView() {
        if (mIconView == null) {
            mIconView = new Image(getContext());
            needsUpdate = true;
        }
        mIconView.setPadding(mIconPaddingLeft, mIconPaddingTop, mIconPaddingRight, mIconPaddingBottom);
        LayoutConfig params = new LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        if (TextUtils.isEmpty(mText)) {
            params.alignment = LayoutAlignment.VERTICAL_CENTER;
        } else {
            if (mIconPosition == POSITION_TOP || mIconPosition == POSITION_BOTTOM) {
                params.alignment = LayoutAlignment.CENTER;
            } else {
                params.alignment = LayoutAlignment.START;

            }
        }
        mIconView.setLayoutConfig(params);

        if (mIconResource == null) {
            HiLog.debug(LABEL, "mIconResource is null");
        } else {
            mIconView.setImageElement(mIconResource);
            HiLog.debug(LABEL, "mIconResource is not null");
        }
    }

    /**
     * Initialize Attributes from the AttrSet.
     *
     * @param attrSet : Attribute set containing the custom and regular attributes of the button.
     */
    private void initAttributes(AttrSet attrSet) {
        // COLOR ATTRIBUTES
        mDefaultBackgroundColor = getColorAttribute(attrSet, "mfb_defaultColor", mDefaultBackgroundColor);
        mFocusBackgroundColor = getColorAttribute(attrSet, "mfb_focusColor", mFocusBackgroundColor);
        mDisabledBackgroundColor = getColorAttribute(attrSet, "mfb_disabledColor", mDisabledBackgroundColor);
        mDisabledTextColor = getColorAttribute(attrSet, "mfb_disabledTextColor", mDisabledTextColor);
        mDisabledBorderColor = getColorAttribute(attrSet, "mfb_disabledBorderColor", mDisabledBorderColor);
        mDefaultTextColor = getColorAttribute(attrSet, "mfb_textColor", mDefaultTextColor);
        // Text color is the default color for the icon
        mDefaultIconColor = getColorAttribute(attrSet, "mfb_iconColor", mDefaultTextColor);
        mBorderColor = getColorAttribute(attrSet, "mfb_borderColor", mBorderColor);

        // BOOLEAN ATTRIBUTES
        mEnabled = getBoolAttribute(attrSet, "enabled", true);
        // // mTextAllCaps
        mTextAllCaps = getBoolAttribute(attrSet, "mfb_textAllCaps", false);
        // //
        mGhost = getBoolAttribute(attrSet, "mfb_ghost", mGhost);

        // DIMENSION ATTRIBUTES
        // // mTextSize
        mTextSize = getDimensionAttribute(attrSet, "mfb_textSize", mTextSize);
        mTextSize = getDimensionAttribute(attrSet, "text_size", mTextSize);
        // //
        mBorderWidth = getDimensionAttribute(attrSet, "mfb_borderWidth", mBorderWidth);
        mRadius = getDimensionAttribute(attrSet, "mfb_radius", mRadius);
        mRadiusTopLeft = getDimensionAttribute(attrSet, "mfb_radiusTopLeft", mRadius);
        mRadiusTopRight = getDimensionAttribute(attrSet, "mfb_radiusTopRight", mRadius);
        mRadiusBottomLeft = getDimensionAttribute(attrSet, "mfb_radiusBottomLeft", mRadius);
        mRadiusBottomRight = getDimensionAttribute(attrSet, "mfb_radiusBottomRight", mRadius);
        mFontIconSize = getDimensionAttribute(attrSet, "mfb_fontIconSize", mFontIconSize);
        mIconPaddingLeft = getDimensionAttribute(attrSet, "mfb_iconPaddingLeft", mIconPaddingLeft);
        mIconPaddingRight = getDimensionAttribute(attrSet, "mfb_iconPaddingRight", mIconPaddingRight);
        mIconPaddingTop = getDimensionAttribute(attrSet, "mfb_iconPaddingTop", mIconPaddingTop);
        mIconPaddingBottom = getDimensionAttribute(attrSet, "mfb_iconPaddingBottom", mIconPaddingBottom);


        // ENUM ATTRIBUTES
        mTextGravity = getEnumAttribute(
                attrSet, "mfb_textGravity", AttrEnumUtil.MfbTextGravity.class,
                AttrEnumUtil.MfbTextGravity.CENTER).getValue();
        mIconPosition = getEnumAttribute(
                attrSet, "mfb_iconPosition", AttrEnumUtil.MfbIconPosition.class,
                AttrEnumUtil.MfbIconPosition.labelOfValue(mIconPosition)).value;

        // STRING ATTRIBUTES
        // // mText
        String text = getStringAttribute(attrSet, "mfb_text");
        if (text == null) {
            text = getStringAttribute(attrSet, "text");
        }
        if (text != null) {
            mText = mTextAllCaps ? text.toUpperCase() : text;
        }
        // //
        // // String Attribute Temporary Variables
        final String fontIcon = getStringAttribute(attrSet, "mfb_fontIconResource");
        String iconFontFamily = getStringAttribute(attrSet, "mfb_iconFont");
        String textFontFamily = getStringAttribute(attrSet, "mfb_textFont");
        // //
        mIcon = getStringAttribute(attrSet, "mfb_icon");
        HiLog.debug(LABEL, "mIcon = %{public}s", mIcon);

        // ELEMENT ATTRIBUTE
        Optional<Attr> iconResourceAttr = attrSet.getAttr("mfb_iconResource");
        iconResourceAttr.ifPresent(attr -> mIconResource = attr.getElement());

        // Resolve Temporary Attribute Variables
        if (fontIcon != null) {
            mFontIcon = fontIcon;
        }

        Context callerContext = getContext();
        if (mIcon == null && callerContext instanceof AbilityContext) {
            AbilityContext abilityContext = (AbilityContext) callerContext;
            if (iconFontFamily == null) {
                mIconTypeFace = FontUtil.findFont(abilityContext, null, null);
            } else {
                mIconTypeFace = FontUtil.findFont(abilityContext, iconFontFamily, null);
            }

            if (textFontFamily == null) {
                mTextTypeFace = FontUtil.findFont(abilityContext, null, null);
            } else {
                mTextTypeFace = FontUtil.findFont(abilityContext, textFontFamily, null);
            }
        }

    }

    private int getColorAttribute(AttrSet attrSet, String attrName, int defaultValue) {
        Optional<Attr> optionalAttribute = attrSet.getAttr(attrName);
        if (optionalAttribute.isPresent()) {
            Color color = optionalAttribute.get().getColorValue();
            if (color != null) {
                return color.getValue();
            } else {
                return defaultValue;
            }
        } else {
            return defaultValue;
        }
    }

    private boolean getBoolAttribute(AttrSet attrSet, String attrName, boolean defaultValue) {
        Optional<Attr> optionalAttribute = attrSet.getAttr(attrName);
        return optionalAttribute.map(Attr::getBoolValue).orElse(defaultValue);
    }

    private int getDimensionAttribute(AttrSet attrSet, String attrName, int defaultValue) {
        Optional<Attr> optionalAttribute = attrSet.getAttr(attrName);
        return optionalAttribute.map(Attr::getDimensionValue).orElse(defaultValue);
    }

    private String getStringAttribute(AttrSet attrSet, String attrName) {
        Optional<Attr> optionalAttribute = attrSet.getAttr(attrName);
        return optionalAttribute.map(Attr::getStringValue).orElse(null);
    }

    private <E extends java.lang.Enum<E>> E getEnumAttribute(
            AttrSet attrSet, String attrName, Class<E> enumType, E defaultValue) {
        Optional<Attr> optionalAttribute = attrSet.getAttr(attrName);
        if (optionalAttribute.isPresent()) {
            String stringValue = optionalAttribute.get().getStringValue();
            try {
                return E.valueOf(enumType, stringValue);
            } catch (IllegalArgumentException e) {
                return defaultValue;
            }
        } else {
            return defaultValue;
        }
    }

    private void setupBackground() {
        ShapeElement defaultDrawable = new ShapeElement();
        defaultDrawable.setCornerRadius(mRadius);
        defaultDrawable.setCornerRadiiArray(new float[] { mRadiusTopLeft, mRadiusTopLeft,
            mRadiusTopRight, mRadiusTopRight,
            mRadiusBottomRight, mRadiusBottomRight,
            mRadiusBottomLeft, mRadiusBottomLeft
        });

        if (mGhost) {
            // Hollow Background
            defaultDrawable.setRgbColor(RgbColor.fromArgbInt(Color.TRANSPARENT.getValue()));

        } else {

            defaultDrawable.setRgbColor(RgbColor.fromArgbInt(mDefaultBackgroundColor));
        }

        ShapeElement focusDrawable = new ShapeElement();

        focusDrawable.setCornerRadius(mRadius);
        focusDrawable.setCornerRadiiArray(new float[] {
            mRadiusTopLeft, mRadiusTopLeft, mRadiusTopRight, mRadiusTopRight, mRadiusBottomRight, mRadiusBottomRight,
            mRadiusBottomLeft, mRadiusBottomLeft
        });
        focusDrawable.setRgbColor(RgbColor.fromArgbInt(mFocusBackgroundColor));

        ShapeElement disabledDrawable = new ShapeElement();
        disabledDrawable.setCornerRadius(mRadius);
        focusDrawable.setCornerRadiiArray(new float[] {
            mRadiusTopLeft, mRadiusTopLeft, mRadiusTopRight, mRadiusTopRight, mRadiusBottomRight, mRadiusBottomRight,
            mRadiusBottomLeft, mRadiusBottomLeft
        });
        disabledDrawable.setRgbColor(RgbColor.fromArgbInt(mDisabledBackgroundColor));
        disabledDrawable.setStroke(mBorderWidth, RgbColor.fromArgbInt(mDisabledBorderColor));

        // Handle Border
        if (mBorderColor != 0) {
            defaultDrawable.setStroke(mBorderWidth, RgbColor.fromArgbInt(mBorderColor));
        }

        // Handle disabled border color
        if (!mEnabled) {
            defaultDrawable.setStroke(mBorderWidth, RgbColor.fromArgbInt(mDisabledBorderColor));
            if (mGhost) {
                disabledDrawable.setRgbColor(RgbColor.fromArgbInt(Color.TRANSPARENT.getValue()));
            }
        }

        setupRippleEffect(defaultDrawable, focusDrawable, disabledDrawable);
    }

    private void setupRippleEffect(ShapeElement defaultDrawable, ShapeElement focusDrawable,
                                   ShapeElement disabledDrawable) {
        StateElement states = new StateElement();
        ShapeElement drawable2 = new ShapeElement();
        drawable2.setCornerRadius(mRadius);
        focusDrawable.setCornerRadiiArray(new float[] {
            mRadiusTopLeft, mRadiusTopLeft, mRadiusTopRight, mRadiusTopRight, mRadiusBottomRight, mRadiusBottomRight,
            mRadiusBottomLeft, mRadiusBottomLeft
        });
        if (mGhost) {
            drawable2.setRgbColor(RgbColor.fromArgbInt(Color.TRANSPARENT.getValue())); // No focus color
        } else {
            drawable2.setRgbColor(RgbColor.fromArgbInt(mFocusBackgroundColor));
        }

        // Handle Button Border
        if (mBorderColor != 0) {
            if (mGhost) {
                // Border is the main part of button now
                drawable2.setStroke(mBorderWidth, RgbColor.fromArgbInt(mFocusBackgroundColor));
            } else {
                drawable2.setStroke(mBorderWidth, RgbColor.fromArgbInt(mBorderColor));
            }
        }

        if (!mEnabled) {
            drawable2.setStroke(mBorderWidth, RgbColor.fromArgbInt(mDisabledBorderColor));
        }

        if (mFocusBackgroundColor != 0) {
            states.addState(new int[] { ComponentState.COMPONENT_STATE_PRESSED }, drawable2);
            states.addState(new int[] { ComponentState.COMPONENT_STATE_FOCUSED }, drawable2);
            states.addState(new int[] { ComponentState.COMPONENT_STATE_DISABLED }, disabledDrawable);
        }

        states.addState(new int[] {}, defaultDrawable);
        setBackground(states);
    }

    private void initializeButtonContainer() {
        if (mIconPosition == POSITION_TOP || mIconPosition == POSITION_BOTTOM) {
            setOrientation(VERTICAL);
        } else {
            setOrientation(HORIZONTAL);
        }

        if (getLayoutConfig() == null) {
            LayoutConfig params = new LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
            setLayoutConfig(params);
        }

        setAlignment(LayoutAlignment.CENTER);
        setClickable(true);
        setFocusable(FOCUS_ENABLE);
        if (mIconResource == null
                && mFontIcon == null
                && getPaddingLeft() == 0
                && getPaddingRight() == 0
                && getPaddingTop() == 0
                && getPaddingBottom() == 0) {

            // fix for all version of devices and screens
            setPadding(20, 0, 20, 0);
        }
    }

    /**
     * Used by the Attribute setter functions to refresh the button Components after changes.
     * In case a new Component is to be added (eg. Icon-Font Text Component), the Components of this ComponentContainer
     * are rebuilt.
     */
    private void setupView() {
        setupFontIconView();
        setupTextView();
        setupBackground();
        refreshComponents();
    }

    /**
     * Set Text of the button.
     *
     * @param text : Text
     */
    public void setText(String text) {
        text = mTextAllCaps ? text.toUpperCase() : text;
        mText = text;
        if (mTextView == null) {
            setupView();
        }
        mTextView.setText(text);
    }

    /**
     * Set text of the button by string resource id.
     *
     * @param resId Resource id for the string
     */
    @SuppressWarnings("unused")
    public void setText(int resId) {
        String text = getContext().getString(resId);
        text = mTextAllCaps ? text.toUpperCase() : text;
        mText = text;
        if (mTextView == null) {
            setupTextView();
        }
        mTextView.setText(text);
    }

    /**
     * Return the Text of the button as it is displayed on the UI.
     *
     * @return {@code String} containing the button Text, or an empty {@code String} if it doesn't contain any text.
     */
    @SuppressWarnings("unused")
    public CharSequence getText() {
        return mTextView != null ? mTextView.getText() : "";
    }

    /**
     * Set the capitalization of text.
     *
     * @param textAllCaps : is text to be capitalized
     */
    @SuppressWarnings("unused")
    public void setTextAllCaps(boolean textAllCaps) {
        mTextAllCaps = textAllCaps;
        setText(mText);
    }

    /**
     * Get the capitalization of text.
     *
     * @return If text is capitalized or not
     */
    public boolean isTextAllCaps() {
        return mTextAllCaps;
    }

    /**
     * Set the color of text.
     *
     * @param color : Color use Color.getIntColor('#code')
     */
    @SuppressWarnings("unused")
    public void setTextColor(int color) {
        mDefaultTextColor = color;
        if (mTextView == null) {
            setupTextView();
        }
        mTextView.setTextColor(new Color(color));
    }

    /**
     * Get the color of text.
     *
     * @return The integer value of the color.
     */
    public int getTextColor() {
        return mDefaultTextColor;
    }

    /**
     * Setting the icon's color independent of the text color.
     *
     * @param color : Color
     */
    @SuppressWarnings("unused")
    public void setIconColor(int color) {
        mDefaultIconColor = color;
        if (mFontIconView != null) {
            mFontIconView.setTextColor(new Color(color));
        }
    }

    /**
     * Get the Color of the icon-font.
     *
     * @return The integer value of the color.
     */
    public int getIconColor() {
        return mDefaultIconColor;
    }

    /**
     * Set Background color of the button.
     *
     * @param color : use Color.getIntColor('#code')
     */
    public void setBackgroundColor(int color) {
        mDefaultBackgroundColor = color;
        setupView();
    }

    /**
     * Get the Background color of the button.
     *
     * @return The integer value of the color.
     */
    public int getBackgroundColor() {
        return mDefaultBackgroundColor;
    }

    /**
     * Set Focus color of the button.
     *
     * @param color : use Color.getIntColor('#code')
     */
    public void setFocusBackgroundColor(int color) {
        mFocusBackgroundColor = color;
        setupView();
    }

    /**
     * Get the Focus color of the button.
     *
     * @return The integer value of the color.
     */
    public int getFocusBackgroundColor() {
        return mFocusBackgroundColor;
    }

    /**
     * Set Disabled state color of the button.
     *
     * @param color : use Color.getIntColor('#code')
     */
    @SuppressWarnings("unused")
    public void setDisableBackgroundColor(int color) {
        mDisabledBackgroundColor = color;
        setupView();
    }

    /**
     * Get the Disabled state color of the button.
     *
     * @return The integer value of the color.
     */
    public int getDisableBackgroundColor() {
        return mDisabledBackgroundColor;
    }

    /**
     * Set Disabled state color of the button text.
     *
     * @param color : use Color.getIntColor('#code')
     */
    @SuppressWarnings("unused")
    public void setDisableTextColor(int color) {
        mDisabledTextColor = color;
        setupTextView();
        if (!mEnabled) {
            mTextView.setTextColor(new Color(color));
        }
    }

    /**
     * Get the Disabled state color of the button text.
     *
     * @return The integer value of the color.
     */
    public int getDisableTextColor() {
        return mDisabledTextColor;
    }

    /**
     * Set Disabled state color of the button border.
     *
     * @param color : use Color.getIntColor('#code')
     */
    @SuppressWarnings("unused")
    public void setDisableBorderColor(int color) {
        mDisabledBorderColor = color;
        if (mIconView != null || mFontIconView != null || mTextView != null) {
            setupBackground();
        }
    }

    /**
     * Get the Disabled state color of the button border.
     *
     * @return The integer value of the color.
     */
    public int getDisableBorderColor() {
        return mDisabledBorderColor;
    }


    /**
     * Set the size of Text in fp.
     *
     * @param textSize : Text Size
     */
    public void setTextSize(int textSize) {
        mTextSize = FontUtil.fpToPx(getContext(), textSize);
        if (mTextView != null) {
            mTextView.setTextSize(textSize, Text.TextSizeType.FP);
        }
    }

    /**
     * Get the the size of Text in px.
     *
     * @return Text Size
     */
    public int getTextSize() {
        return mTextSize;
    }

    /**
     * Set the alignment of the Text.
     *
     * @param gravity : Text Alignment
     */
    @SuppressWarnings("unused")
    public void setTextGravity(int gravity) {
        mTextGravity = gravity;
        if (mTextView != null) {
            mTextView.setTextAlignment(gravity);
        }
    }

    /**
     * Get the alignment of the Text.
     *
     * @return {@link TextAlignment} integer value
     */
    public int getTextGravity() {
        return mTextView.getTextAlignment();
    }

    /**
     * Set Padding for mIconView and mFontIconSize.
     *
     * @param paddingLeft : Padding Left.
     * @param paddingTop : Padding Top.
     * @param paddingRight : Padding Right.
     * @param paddingBottom : Padding Bottom.
     */
    public void setIconPadding(int paddingLeft, int paddingTop, int paddingRight, int paddingBottom) {

        this.mIconPaddingLeft = paddingLeft;
        this.mIconPaddingTop = paddingTop;
        this.mIconPaddingRight = paddingRight;
        this.mIconPaddingBottom = paddingBottom;

        if (mIconView != null) {
            mIconView.setPadding(this.mIconPaddingLeft, this.mIconPaddingTop, this.mIconPaddingRight,
                    this.mIconPaddingBottom);
        }
        if (mFontIconView != null) {
            mFontIconView.setPadding(mIconPaddingLeft, mIconPaddingTop, mIconPaddingRight, mIconPaddingBottom);
        }
    }

    /**
     * Gets the left padding of the icon.
     *
     * @return The left padding of the icon.
     */
    public int getIconPaddingLeft() {
        return mIconPaddingLeft;
    }

    /**
     * Gets the top padding of the icon.
     *
     * @return The top padding of the icon.
     */
    public int getIconPaddingTop() {
        return mIconPaddingTop;
    }

    /**
     * Gets the right padding of the icon.
     *
     * @return The right padding of the icon.
     */
    public int getIconPaddingRight() {
        return mIconPaddingRight;
    }

    /**
     * Gets the bottom padding of the icon.
     *
     * @return The bottom padding of the icon.
     */
    public int getIconPaddingBottom() {
        return mIconPaddingBottom;
    }

    /**
     * Set a drawable-icon to the button.
     *
     * @param drawable : Element resource to be used as the icon
     */
    @SuppressWarnings("unused")
    public void setIconResource(Element drawable) {
        mIconResource = drawable;
        if (mIconView == null) {
            setupIconView();
        }
        if (mFontIconView == null) {
            setupFontIconView();
        }
        mIconView.setImageElement(mIconResource);
    }

    /**
     * Set a icon-font to the button (eg FontAwesome or Entypo...)
     *
     * @param icon : Icon value eg : \uf082
     */
    public void setIconResource(String icon) {
        mIcon = icon;
        mFontIcon = icon;
        setupView();
    }

    /**
     * Gets the Element resource being used as the drawable-icon for this button.
     *
     * @return The Element used as the drawable-icon, {@code null} if no drawable-icon is being used.
     */
    @SuppressWarnings("unused")
    public Element getElementIconResource() {
        return mIconResource;
    }

    /**
     * Gets the String value being used as the icon-font for this button.
     *
     * @return The String used for the icon-font, {@code null} if no icon-font is being used.
     */

    public String getFontIconResource() {
        return mFontIcon;
    }

    /**
     * Sets the icon-font of the button to the specified Character.
     * Note that the Font of the icon-font remains unchanged.
     *
     * @param icon The Character to set the icon to.
     */
    public void setIcon(Character icon) {
        setIconResource(String.valueOf(icon));
    }

    /**
     * Sets the icon-font of the button by finding an icon-font with the given key.
     *
     * @param icon The key of the button icon to be set. Must correspond to a {@link IIcon} field, and the prefix of
     *             the {@link IIcon} should match with the prefix of the icon key.
     */
    public void setIcon(String icon) {
        String modifiedIconKey;
        try {
            ITypeface font =
                    CoreIcon.findFont(icon.substring(0, CoreIcon.FONT_MAPPING_PREFIX));
            modifiedIconKey = icon.replace("-", "_");
            setIcon(font.getIcon(modifiedIconKey));
        } catch (Exception ex) {
            HiLog.error(LABEL, "Wrong icon name: %{public}s", icon);
        }
    }

    /**
     * Sets the icon-font of the button to the given {@link IIcon}.
     *
     * @param icon The {@link IIcon} to be used as the icon of the button.
     */
    public void setIcon(IIcon icon) {
        ITypeface typeface = icon.getTypeface();
        HiLog.debug(LABEL, "Typeface = %{public}s", icon.getTypeface().getFontName());

        Context callerContext = getContext();
        if (callerContext instanceof AbilityContext) {
            mIconTypeFace = typeface.getTypeface((AbilityContext) callerContext);
        }
        setIconResource(String.valueOf(icon.getCharacter()));
    }

    /**
     * Set Icon size of the button (for only icon-fonts) in fp.
     *
     * @param iconSize : Icon Size
     */
    public void setFontIconSize(int iconSize) {
        mFontIconSize = FontUtil.fpToPx(getContext(), iconSize);
        if (mFontIconView != null) {
            mFontIconView.setTextSize(iconSize, Text.TextSizeType.FP);
        }
    }

    /**
     * Get Icon size of the button (for only icon-fonts) in fp.
     *
     * @return Icon size of the icon-font
     */
    public int getFontIconSize() {
        return mFontIconSize;
    }

    /**
     * Set Icon Position.
     * Use the global variables:
     * <ul>
     *     <li>MaterialFancyButton.POSITION_LEFT</li>
     *     <li>MaterialFancyButton.POSITION_RIGHT</li>
     *     <li>MaterialFancyButton.POSITION_TOP</li>
     *     <li>MaterialFancyButton.POSITION_BOTTOM</li>
     * </ul>
     *
     * @param position : Icon Position.
     */
    public void setIconPosition(int position) {
        if (position > 0 && position < 5) {
            mIconPosition = position;
        } else {
            mIconPosition = POSITION_LEFT;
        }
        setupView();
    }

    /**
     * Get Icon Position.
     * Can be any of the global variables:
     * <ul>
     *     <li>MaterialFancyButton.POSITION_LEFT</li>
     *     <li>MaterialFancyButton.POSITION_RIGHT</li>
     *     <li>MaterialFancyButton.POSITION_TOP</li>
     *     <li>MaterialFancyButton.POSITION_BOTTOM</li>
     * </ul>
     *
     * @return Icon Position.
     */
    public int getIconPosition() {
        return mIconPosition;
    }

    /**
     * Set color of the button border.
     *
     * @param color : use Color.getIntColor('#code')
     */
    @SuppressWarnings("unused")
    public void setBorderColor(int color) {
        mBorderColor = color;
        setupView();
    }

    /**
     * Get color of the button border.
     *
     * @return The integer value of the color.
     */
    public int getBorderColor() {
        return mBorderColor;
    }

    /**
     * Set Width of the button border.
     *
     * @param width : Width in px.
     */
    @SuppressWarnings("unused")
    public void setBorderWidth(int width) {
        mBorderWidth = width;
        setupView();
    }

    /**
     * Get Width of the button border.
     *
     * @return Border Width in px
     */
    public int getBorderWidth() {
        return mBorderWidth;
    }

    /**
     * Set Border Radius of the button.
     *
     * @param radius : Radius in pixels.
     */
    public void setRadius(int radius) {
        mRadius = radius;
        mRadiusTopLeft = radius;
        mRadiusTopRight = radius;
        mRadiusBottomLeft = radius;
        mRadiusBottomRight = radius;

        setupView();
    }

    /**
     * Set Border Radius of the button in pixels.
     *
     * @param radiusTopLeft Top left radius.
     * @param radiusTopRight Top right radius.
     * @param radiusBottomLeft Bottom left radius.
     * @param radiusBottomRight Bottom right radius.
     */
    public void setRadius(int radiusTopLeft, int radiusTopRight, int radiusBottomLeft, int radiusBottomRight) {
        mRadiusTopLeft = radiusTopLeft;
        mRadiusTopRight = radiusTopRight;
        mRadiusBottomLeft = radiusBottomLeft;
        mRadiusBottomRight = radiusBottomRight;
        setupView();
    }

    /**
     * Set border radius top left of the button.
     *
     * @param radiusTopLeft radius top left of the button
     */
    public void setRadiusTopLeft(int radiusTopLeft) {
        mRadiusTopLeft = radiusTopLeft;
        setupView();
    }

    /**
     * Get border radius top left of the button.
     *
     * @return radius top left of the button
     */
    public int getRadiusTopLeft() {
        return mRadiusTopLeft;
    }

    /**
     * Set border radius top right of the button.
     *
     * @param radiusTopRight radius top right of the button
     */
    public void setRadiusTopRight(int radiusTopRight) {
        mRadiusTopRight = radiusTopRight;
        setupView();
    }

    /**
     * Get border radius top right of the button.
     *
     * @return radius top right of the button
     */
    public int getRadiusTopRight() {
        return mRadiusTopRight;
    }

    /**
     * Set border radius bottom left of the button.
     *
     * @param radiusBottomLeft radius bottom left of the button
     */
    public void setRadiusBottomLeft(int radiusBottomLeft) {
        mRadiusBottomLeft = radiusBottomLeft;
        setupView();
    }

    /**
     * Get border radius bottom left of the button.
     *
     * @return radius bottom left of the button
     */
    public int getRadiusBottomLeft() {
        return mRadiusBottomLeft;
    }

    /**
     * Set border radius bottom right of the button.
     *
     * @param radiusBottomRight radius bottom right of the button
     */
    public void setRadiusBottomRight(int radiusBottomRight) {
        mRadiusBottomRight = radiusBottomRight;
        setupView();
    }

    /**
     * Get border radius bottom right of the button.
     *
     * @return radius bottom right of the button
     */
    public int getRadiusBottomRight() {
        return mRadiusBottomRight;
    }

    /**
     * Set custom font for button Text from a font file.
     *
     * @param fontName : Name of the font file. It should be placed in the rawfile directory of the HAP using the font.
     */
    @SuppressWarnings("unused")
    public void setCustomTextFont(String fontName) {
        Context callerContext = getContext();
        if (callerContext instanceof AbilityContext) {
            mTextTypeFace = FontUtil.findFont((AbilityContext) callerContext, fontName, null);
            setupTextView();
            mTextView.setFont(mTextTypeFace);
        }
    }

    /**
     * Set Custom font for button icon from a font file.
     *
     * @param fontName : Name of the font file. It should be placed in the rawfile directory of the HAP using the font.
     */
    @SuppressWarnings("unused")
    public void setIconFont(String fontName) {
        Context callerContext = getContext();
        if (callerContext instanceof AbilityContext) {
            mIconTypeFace = FontUtil.findFont((AbilityContext) callerContext, fontName, null);
            setupFontIconView();
            mFontIconView.setFont(mIconTypeFace);
        }
    }

    /**
     * Override setEnabled and rebuild the MaterialFancyButton Component.
     * To redraw the button according to the state : enabled or disabled
     */
    @Override public void setEnabled(boolean value) {
        super.setEnabled(value);
        mEnabled = value;
        setupView();
    }

    /**
     * Setting the button to have hollow or solid shape.
     *
     * @param ghost If the button is to be hollow or not.
     */
    @SuppressWarnings("unused")
    public void setGhost(boolean ghost) {
        mGhost = ghost;
        setupView();
    }

    /**
     * Whether the button is hollow (ghost) or solid.
     *
     * @return {@code true} if the button is hollow.
     */
    public boolean isGhost() {
        return mGhost;
    }

    /**
     * Return Text Object of the FancyButton.
     *
     * @return Text Object
     */
    @SuppressWarnings("unused")
    public Text getTextViewObject() {
        return mTextView;
    }

    /**
     * Return Icon Text Object of the FancyButton.
     *
     * @return Text Object
     */
    @SuppressWarnings("unused")
    public Text getIconFontObject() {
        return mFontIconView;
    }

    /**
     * Return Image Icon of the FancyButton.
     *
     * @return Image Object
     */
    @SuppressWarnings("unused")
    public Image getIconImageObject() {
        return mIconView;
    }

}