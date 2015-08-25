
package com.exposit.sjc.domain.model;

import javax.persistence.*;
import com.exposit.sjc.domain.model.User;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "idAuthor")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorId;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
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
