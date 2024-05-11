package com.edu.demo.safari.dto;

import com.edu.demo.safari.types.MultiLanguage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the {@link com.edu.demo.safari.entities.User} entity
 */
@Builder
public class UserDto implements Serializable {
    private UUID userID;
    private String firstname;
    private String lastname;
    private String mobile;
    private String email;
    private Date createdDate;
    private Date modifiedDate;

    public UserDto() {
    }

    public UserDto(UUID userID, String firstname, String lastname, String mobile, String email, Date createdDate, Date modifiedDate) {
        this.userID = userID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.email = email;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(userID, userDto.userID) && Objects.equals(firstname, userDto.firstname) && Objects.equals(lastname, userDto.lastname) && Objects.equals(mobile, userDto.mobile) && Objects.equals(email, userDto.email) && Objects.equals(createdDate, userDto.createdDate) && Objects.equals(modifiedDate, userDto.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, firstname, lastname, mobile, email, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userID=" + userID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}