package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: , 'name' — by name (enabled only if the 'fields' parameter is used), 'hints' — by rating, similar to how friends are sorted in My friends section, , This parameter is available only for [vk.com/dev/standalone|desktop applications].
 */
public enum FriendsOrder implements EnumParam {
    @SerializedName("name")
    NAME("name"),

    @SerializedName("hints")
    HINTS("hints");

    private final String value;

    FriendsOrder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
