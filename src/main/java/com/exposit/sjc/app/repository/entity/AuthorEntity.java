package com.exposit.sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class AuthorEntity {
    @Id
    @Column(name = "idAuthor")
    private Long idAuthor;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Column(name = "idUser")
    private int idUser;

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAutor) {
        this.idAuthor = idAutor;
    }


}
