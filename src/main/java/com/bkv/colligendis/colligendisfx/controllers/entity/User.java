package com.bkv.colligendis.colligendisfx.controllers.entity;

import java.util.Set;

public class User extends AbstractEntity{
    private String name;
    private String loginName;
    private String passwordSHA;

    private String profilePictureUrl;

    private Set<Role> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPasswordSHA() {
        return passwordSHA;
    }

    public void setPasswordSHA(String passwordSHA) {
        this.passwordSHA = passwordSHA;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
