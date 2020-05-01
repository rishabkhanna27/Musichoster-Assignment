package com.upgrad.musichoster.service.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "USERS")
@NamedQueries({
        @NamedQuery(name = "userByEmail", query = "select u from UserEntity u where u.email = :email")
})
public class UserEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "UUID")
    @Size(max = 64)
    private String uuid;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "EMAIL")
    @NotNull
    @Size(max = 200)
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FIRST_NAME")
    @NotNull
    @Size(max = 200)
    private String firstName;

    @Column(name = "LAST_NAME")
    @NotNull
    @Size(max = 200)
    private String lastName;

    @Column(name = "MOBILE_PHONE")
    @NotNull
    @Size(max = 50)
    private String mobilePhone;

    @Column(name = "LAST_LOGIN_AT")
    private ZonedDateTime lastLoginAt;

    @Column(name = "SALT")
    @NotNull
    @Size(max = 200)
    private String salt;

    @Override
    public boolean equals(Object obj) {
        return new EqualsBuilder().append(this, obj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this).hashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
