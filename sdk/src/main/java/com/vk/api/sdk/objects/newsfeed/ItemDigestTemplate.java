package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * type of digest
 */
public enum ItemDigestTemplate implements EnumParam {
    @SerializedName("list")
    LIST("list"),

    @SerializedName("grid")
    GRID("grid");

    private final String value;

    ItemDigestTemplate(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
