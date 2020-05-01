//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.upgrad.musichoster.api.exception;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class ErrorResponse {
    @JsonProperty("code")
    private String code = null;
    @JsonProperty("message")
    private String message = null;
    @JsonProperty("root_cause")
    private String rootCause = null;

    public ErrorResponse() {
    }

    public ErrorResponse code(String code) {
        this.code = code;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Application specific standard error code"
    )
    @NotNull
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ErrorResponse message(String message) {
        this.message = message;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Error message stating the reason"
    )
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse rootCause(String rootCause) {
        this.rootCause = rootCause;
        return this;
    }

    @ApiModelProperty("Root cause of the Error")
    public String getRootCause() {
        return this.rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ErrorResponse errorResponse = (ErrorResponse)o;
            return Objects.equals(this.code, errorResponse.code) && Objects.equals(this.message, errorResponse.message) && Objects.equals(this.rootCause, errorResponse.rootCause);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.code, this.message, this.rootCause});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");
        sb.append("    code: ").append(this.toIndentedString(this.code)).append("\n");
        sb.append("    message: ").append(this.toIndentedString(this.message)).append("\n");
        sb.append("    rootCause: ").append(this.toIndentedString(this.rootCause)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
