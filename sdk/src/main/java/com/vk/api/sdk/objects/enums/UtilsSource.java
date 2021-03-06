package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Source of scope
 */
public enum UtilsSource implements EnumParam {
    @SerializedName("vk_cc")
    VK_CC("vk_cc");

    private final String value;

    UtilsSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
