package com.absmis.domain.authority;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;
    @javax.persistence.Column(nullable = false)
    protected String username;
    @javax.persistence.Column(nullable = false)
    protected String password;
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date lastLogin;
    @javax.persistence.Column(nullable = false)
    protected int loginCounter;
    @javax.persistence.ManyToOne
    protected Role role;
    public User() {
        super();
    }
    public User(User user) {
        this.id = user.id;
        this.username = user.username;
        this.password = user.password;
        this.role = user.role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getLoginCounter() {
        return loginCounter;
    }

    public void setLoginCounter(int loginCounter) {
        this.loginCounter = loginCounter;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

