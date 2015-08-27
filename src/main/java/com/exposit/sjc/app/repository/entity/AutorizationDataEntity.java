package com.exposit.sjc.app.repository.entity;

import com.exposit.sjc.domain.model.Role;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Table(name = "autorizationdata")
@Inheritance(strategy = InheritanceType.JOINED)
public class AutorizationDataEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAutorizationData")
    private Integer idAutorizationData;
    @Basic(optional = false)
    @javax.validation.constraints.NotNull
    @Size(min = 1, max = 20)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @javax.validation.constraints.NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    @Column(name = "idRole")
    @Enumerated(EnumType.STRING)
    private Role role;

    public AutorizationDataEntity() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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



    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
