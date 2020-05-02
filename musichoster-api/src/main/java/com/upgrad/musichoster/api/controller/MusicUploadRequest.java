package com.upgrad.musichoster.api.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MusicUploadRequest {

    @JsonProperty("music")
    private String music = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("description")
    private String description = null;
//    private Object music;

    public MusicUploadRequest() {
    }

    public MusicUploadRequest music(String music) {
        this.music = music;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "This is music url"
    )
    @NotNull
    public String getMusic() {
        return this.music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public MusicUploadRequest name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "The name of the music"
    )
    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusicUploadRequest description(String description) {
        this.description = description;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Description of the musiic"
    )
    @NotNull
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            MusicUploadRequest musicUploadRequest = (MusicUploadRequest)o;
            return Objects.equals(this.music, musicUploadRequest.music) && Objects.equals(this.name, musicUploadRequest.name) && Objects.equals(this.description, musicUploadRequest.description);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.music, this.name, this.description});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicUploadRequest {\n");
        sb.append("    music: ").append(this.toIndentedString(this.music)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    description: ").append(this.toIndentedString(this.description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
