
package com.exposit.sjc.domain.model;

import javax.persistence.*;
import com.exposit.sjc.domain.model.User;


public class Author {

    private Long authorId;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }


    private User idUser;

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Author() {

    }

    public Author(Long authorId, User user) {
        this.authorId = authorId;
        this.idUser = user;
    }
}
