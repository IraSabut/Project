
package com.exposit.sjc.domain.model;

import com.exposit.sjc.app.repository.entity.UserEntity;


import java.util.Collection;

public class AuthorizationData {
    private Integer idAutorizationData;

    private String login;

    private String password;
     private Collection<UserEntity> userEntityCollection;

    private Role role;

    public AuthorizationData() {
    }



    public Integer getIdAutorizationData() {
        return idAutorizationData;
    }

    public void setIdAutorizationData(Integer idAutorizationData) {
        this.idAutorizationData = idAutorizationData;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<UserEntity> getUserEntityCollection() {
        return userEntityCollection;
    }

    public void setUserEntityCollection(Collection<UserEntity> userEntityCollection) {
        this.userEntityCollection = userEntityCollection;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
