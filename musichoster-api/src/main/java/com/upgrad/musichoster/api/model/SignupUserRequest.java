//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.upgrad.musichoster.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class SignupUserRequest {
    @JsonProperty("first_name")
    private String firstName = null;
    @JsonProperty("last_name")
    private String lastName = null;
    @JsonProperty("email_address")
    private String emailAddress = null;
    @JsonProperty("password")
    private String password = null;
    @JsonProperty("mobile_number")
    private String mobileNumber = null;

    public SignupUserRequest() {
    }

    public SignupUserRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "First name of the new user"
    )
    @NotNull
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public SignupUserRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Last name of the new user"
    )
    @NotNull
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SignupUserRequest emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Email address of the new user"
    )
    @NotNull
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public SignupUserRequest password(String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Password of the new user"
    )
    @NotNull
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SignupUserRequest mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Mobile number of the new user"
    )
    @NotNull
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SignupUserRequest signupUserRequest = (SignupUserRequest)o;
            return Objects.equals(this.firstName, signupUserRequest.firstName) && Objects.equals(this.lastName, signupUserRequest.lastName) && Objects.equals(this.emailAddress, signupUserRequest.emailAddress) && Objects.equals(this.password, signupUserRequest.password) && Objects.equals(this.mobileNumber, signupUserRequest.mobileNumber);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName, this.emailAddress, this.password, this.mobileNumber});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignupUserRequest {\n");
        sb.append("    firstName: ").append(this.toIndentedString(this.firstName)).append("\n");
        sb.append("    lastName: ").append(this.toIndentedString(this.lastName)).append("\n");
        sb.append("    emailAddress: ").append(this.toIndentedString(this.emailAddress)).append("\n");
        sb.append("    password: ").append(this.toIndentedString(this.password)).append("\n");
        sb.append("    mobileNumber: ").append(this.toIndentedString(this.mobileNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
