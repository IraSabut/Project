package com.exposit.sjc.app.repository.entity;

import com.exposit.sjc.domain.model.User;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class AuthorEntity {
    @Id
    @Column(name = "idAuthor")
    private Long idAuthor;
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    @ManyToOne
    private UserEntity idUser;

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAutor) {
        this.idAuthor = idAutor;
    }


}
