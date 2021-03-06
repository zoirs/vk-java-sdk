package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URL;
import java.util.Objects;

/**
 * LinkStatus object
 */
public class LinkStatus {
    /**
     * Reject reason
     */
    @SerializedName("description")
    private String description;

    /**
     * URL
     */
    @SerializedName("redirect_url")
    private URL redirectUrl;

    /**
     * Link status
     */
    @SerializedName("status")
    private String status;

    public String getDescription() {
        return description;
    }

    public LinkStatus setDescription(String description) {
        this.description = description;
        return this;
    }

    public URL getRedirectUrl() {
        return redirectUrl;
    }

    public LinkStatus setRedirectUrl(URL redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public LinkStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl, description, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkStatus linkStatus = (LinkStatus) o;
        return Objects.equals(description, linkStatus.description) &&
                Objects.equals(redirectUrl, linkStatus.redirectUrl) &&
                Objects.equals(status, linkStatus.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkStatus{");
        sb.append("description='").append(description).append("'");
        sb.append(", redirectUrl=").append(redirectUrl);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
