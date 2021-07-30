package com.rilixtech.materialfancybutton.utils;

import ohos.agp.utils.TextAlignment;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class encapsulating Enum classes used for Attributes of the MaterialFancyButton Components.
 */
public class AttrEnumUtil {

    private AttrEnumUtil() {}

    /**
     * Encapsulates the different positions that the Icon of a MaterialFancyButton.
     */
    public enum MfbIconPosition {
        LEFT(1),
        RIGHT(2),
        TOP(3),
        BOTTOM(4);

        private static final Map<Integer, MfbIconPosition> BY_VALUE = new HashMap<>();

        static {
            for (MfbIconPosition e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        public final int value;

        MfbIconPosition(int value) {
            this.value = value;
        }

        public static MfbIconPosition labelOfValue(int value) {
            return BY_VALUE.get(value);
        }
    }

    /**
     * Encapsulates the alignment values that the Text component of the MaterialFancyButton can take.
     */
    public enum MfbTextGravity {
        TOP(TextAlignment.TOP),
        BOTTOM(TextAlignment.BOTTOM),
        LEFT(TextAlignment.LEFT),
        RIGHT(TextAlignment.RIGHT),
        HORIZONTAL_CENTER(TextAlignment.HORIZONTAL_CENTER),
        VERTICAL_CENTER(TextAlignment.VERTICAL_CENTER),
        START(TextAlignment.START),
        END(TextAlignment.END),
        CENTER(TextAlignment.CENTER);

        private int value;

        MfbTextGravity(int value) {
            this.setValue(value);
        }

        public int getValue() {
            return value;
        }

        private void setValue(int value) {
            this.value = value;
        }
    }
}
