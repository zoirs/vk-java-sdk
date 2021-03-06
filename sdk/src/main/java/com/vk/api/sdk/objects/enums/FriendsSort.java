package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: '1' — by number of mutual friends, '0' — by date
 */
public enum FriendsSort implements EnumParam {
    @SerializedName("0")
    DATE(0),

    @SerializedName("1")
    MUTUAL(1);

    private final Integer value;

    FriendsSort(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }
}
