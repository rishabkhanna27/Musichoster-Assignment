package com.upgrad.musichoster.api.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


@Validated
public class UpdateMusicRequest {

    @JsonProperty("music")
    private String music = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("description")
    private String description = null;
    @JsonProperty("status")
    private String status = null;

    public UpdateMusicRequest() {
    }

    public UpdateMusicRequest music(String music) {
        this.music = music;
        return this;
    }

    @ApiModelProperty("This is music url")
    public String getMusic() {
        return this.music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public UpdateMusicRequest name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty("Name of the music")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateMusicRequest description(String description) {
        this.description = description;
        return this;
    }

    @ApiModelProperty("Description of the music")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateMusicRequest status(String status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty("Status of the music")
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
            UpdateMusicRequest updateMusicRequest = (UpdateMusicRequest)o;
            return Objects.equals(this.music, updateMusicRequest.music) && Objects.equals(this.name, updateMusicRequest.name) && Objects.equals(this.description, updateMusicRequest.description) && Objects.equals(this.status, updateMusicRequest.status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.music, this.name, this.description, this.status});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMusicRequest {\n");
        sb.append("    music: ").append(this.toIndentedString(this.music)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    description: ").append(this.toIndentedString(this.description)).append("\n");
        sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
