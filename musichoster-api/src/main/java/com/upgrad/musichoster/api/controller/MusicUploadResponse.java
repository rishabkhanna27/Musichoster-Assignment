package com.upgrad.musichoster.api.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MusicUploadResponse {



    @JsonProperty("id")
    private String id = null;
    @JsonProperty("status")
    private String status = null;

    public MusicUploadResponse() {
    }

    public MusicUploadResponse id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "User identifier in a standard UUID format generated by API backend"
    )
    @NotNull
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  MusicUploadResponse status(String status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    @NotNull
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            MusicUploadResponse musicUploadResponse = (MusicUploadResponse)o;
            return Objects.equals(this.id, musicUploadResponse.id) && Objects.equals(this.status, musicUploadResponse.status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.status});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicUploadResponse {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
