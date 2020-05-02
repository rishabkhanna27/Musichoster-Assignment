//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.upgrad.musichoster.api.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class MusicDetailsResponse {
    @JsonProperty("music")
    private String music = null;
    @JsonProperty("id")
    private Integer id = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("description")
    private String description = null;
    @JsonProperty("status")
    private String status = null;

    public MusicDetailsResponse () {
    }

    public MusicDetailsResponse  music(String music) {
        this.music = music;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "This is url of music"
    )
    @NotNull
    public String getMusic() {
        return this.music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public MusicDetailsResponse  id(Integer id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Unique identifier of the user in a standard UUID format"
    )
    @NotNull
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MusicDetailsResponse  name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Name of the music"
    )
    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusicDetailsResponse  description(String description) {
        this.description = description;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Description of the music"
    )
    @NotNull
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MusicDetailsResponse  status(String status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "music is active"
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
            MusicDetailsResponse  MusicDetailsResponse   = (MusicDetailsResponse )o;
            return Objects.equals(this.music, MusicDetailsResponse.music) && Objects.equals(this.id, MusicDetailsResponse  .id) && Objects.equals(this.name, MusicDetailsResponse  .name) && Objects.equals(this.description, MusicDetailsResponse  .description) && Objects.equals(this.status, MusicDetailsResponse  .status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.music, this.id, this.name, this.description, this.status});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicDetailsResponse   {\n");
        sb.append("    music: ").append(this.toIndentedString(this.music)).append("\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
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
