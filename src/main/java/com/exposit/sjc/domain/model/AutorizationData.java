package com.exposit.sjc.domain.model;


public class AutorizationData {
    private Long autorizationDataId;
    private String login;
    private String password;
    private Role role;

    public Long getAutorizationDataId() {
        return autorizationDataId;
    }

    public void setAutorizationDataId(Long autorizationDataId) {
        this.autorizationDataId = autorizationDataId;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
