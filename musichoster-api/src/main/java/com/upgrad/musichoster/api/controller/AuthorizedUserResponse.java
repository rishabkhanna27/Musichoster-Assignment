package com.upgrad.musichoster.api.controller;



        import com.fasterxml.jackson.annotation.JsonProperty;
        import io.swagger.annotations.ApiModel;
        import io.swagger.annotations.ApiModelProperty;
        import java.util.Objects;
        import java.util.UUID;
        import javax.validation.Valid;
        import javax.validation.constraints.NotNull;
        import org.springframework.validation.annotation.Validated;

@ApiModel(
        description = "Object, which describes the successfully authenticated user details"
)
@Validated
public class AuthorizedUserResponse {
    @JsonProperty("id")
    private UUID id = null;
    @JsonProperty("first_name")
    private String firstName = null;
    @JsonProperty("last_name")
    private String lastName = null;
    @JsonProperty("email_address")
    private String emailAddress = null;
    @JsonProperty("mobile_phone")
    private String mobilePhone = null;
    @JsonProperty("last_login_time")
    private Object lastLoginTime = null;
    @JsonProperty("role")
    private String role = null;

    public AuthorizedUserResponse() {
    }

    public AuthorizedUserResponse id(UUID id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Unique identifier of the authorized user in a standard UUID format"
    )
    @NotNull
    @Valid
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public AuthorizedUserResponse firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "first name of user"
    )
    @NotNull
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public AuthorizedUserResponse lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "last name of user"
    )
    @NotNull
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AuthorizedUserResponse emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "email address of member"
    )
    @NotNull
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public AuthorizedUserResponse mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "mobile phone number of user"
    )
    @NotNull
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public AuthorizedUserResponse lastLoginTime(Object lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "The last login time of authorized user (time in milliseconds)"
    )
    @NotNull
    public Object getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Object lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public AuthorizedUserResponse role(String role) {
        this.role = role;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    @NotNull
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            AuthorizedUserResponse authorizedUserResponse = (AuthorizedUserResponse)o;
            return Objects.equals(this.id, authorizedUserResponse.id) && Objects.equals(this.firstName, authorizedUserResponse.firstName) && Objects.equals(this.lastName, authorizedUserResponse.lastName) && Objects.equals(this.emailAddress, authorizedUserResponse.emailAddress) && Objects.equals(this.mobilePhone, authorizedUserResponse.mobilePhone) && Objects.equals(this.lastLoginTime, authorizedUserResponse.lastLoginTime) && Objects.equals(this.role, authorizedUserResponse.role);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.firstName, this.lastName, this.emailAddress, this.mobilePhone, this.lastLoginTime, this.role});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizedUserResponse {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    firstName: ").append(this.toIndentedString(this.firstName)).append("\n");
        sb.append("    lastName: ").append(this.toIndentedString(this.lastName)).append("\n");
        sb.append("    emailAddress: ").append(this.toIndentedString(this.emailAddress)).append("\n");
        sb.append("    mobilePhone: ").append(this.toIndentedString(this.mobilePhone)).append("\n");
        sb.append("    lastLoginTime: ").append(this.toIndentedString(this.lastLoginTime)).append("\n");
        sb.append("    role: ").append(this.toIndentedString(this.role)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
