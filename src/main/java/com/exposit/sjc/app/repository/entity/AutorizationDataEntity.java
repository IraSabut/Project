package com.exposit.sjc.app.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "autorizationdata")
public class AutorizationDataEntity {
    @Id
    @Column(name = "idAutorizationData")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutorizationData;

    @Column(name = "password")
    private String password;
    @Column(name = "login")
    private String login;
    @Column(name = "idRole")
    private int idRole;

    public AutorizationDataEntity() {
    }

    public AutorizationDataEntity(String password, String login, int idRole) {
        this.password = password;
        this.login = login;
        this.idRole = idRole;
    }

    public Long getIdAutorizationData() {
        return idAutorizationData;
    }

    public void setIdAutorizationData(Long idAutorizationData) {
        this.idAutorizationData = idAutorizationData;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
}
