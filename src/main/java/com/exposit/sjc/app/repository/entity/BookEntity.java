
package com.exposit.sjc.app.repository.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "book")
public class BookEntity  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBook")

    private Integer idBook;

    @Size(max = 500)
    @Column(name = "annotation")
    private String annotation;

    @Column(name = "dateOfWriting")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfWriting;


    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nameBook")
    private String nameBook;


    @NotNull
    @Column(name = "numberOfPages")
    private int numberOfPages;


    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Date getDateOfWriting() {
        return dateOfWriting;
    }

    public void setDateOfWriting(Date dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }





}
