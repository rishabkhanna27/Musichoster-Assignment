//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

//
package com.upgrad.musichoster.api.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

@Validated
public class UpdateMusicResponse {
    @JsonProperty("id")
    private Integer id = null;
    @JsonProperty("status")
    private String status = null;

    public UpdateMusicResponse() {
    }

    public UpdateMusicResponse id(Integer id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty("id of the music")
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateMusicResponse status(String status) {
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
            UpdateMusicResponse updateMusicResponse = (UpdateMusicResponse)o;
            return Objects.equals(this.id, updateMusicResponse.id) && Objects.equals(this.status, updateMusicResponse.status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.status});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMusicResponse {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

//    public String getMusic() {
//        return music;
//    }
}
