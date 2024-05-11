package com.edu.demo.safari.entities;

import com.edu.demo.safari.types.MultiLanguage;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "_user")
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userID;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage firstname;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage lastname;
    private String mobile;
    private String email;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date modifiedDate;

    public User() {
    }

    public User(UUID userID, MultiLanguage firstname, MultiLanguage lastname, String mobile, String email, Date createdDate, Date modifiedDate) {
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

    public MultiLanguage getFirstname() {
        return firstname;
    }

    public void setFirstname(MultiLanguage firstname) {
        this.firstname = firstname;
    }

    public MultiLanguage getLastname() {
        return lastname;
    }

    public void setLastname(MultiLanguage lastname) {
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
        User user = (User) o;
        return Objects.equals(userID, user.userID) && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(mobile, user.mobile) && Objects.equals(email, user.email) && Objects.equals(createdDate, user.createdDate) && Objects.equals(modifiedDate, user.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, firstname, lastname, mobile, email, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstname=" + firstname +
                ", lastname=" + lastname +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
