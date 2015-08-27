package com.exposit.sjc.app.repository.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "contract")
public class ContractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContract")
    private Long idContract;


    @Column(name = "idBook")
    private int idBook;



    @Column(name = "numberOfBooks")
    private int numberOfBooks;
    @Column(name = "valuePayments")
    private int valuePayments;
    @Column(name = "dateOfPublication")
    private Date dateOfPublication;
    @Column(name = "isSigned")
    private Boolean isSigned;
    @Column(name = "productionCost")
    private int productionCost;
    @Column(name = "fullPaymentToTheAuthor")
    private Integer fullPaymentToTheAuthor;

    public AuthorEntity getIdAuthorEntity() {
        return idAuthorEntity;
    }

    public void setIdAuthorEntity(AuthorEntity idAuthorEntity) {
        this.idAuthorEntity = idAuthorEntity;
    }

    @JoinColumn(name = "idAuthor", referencedColumnName = "idAuthor")
    @ManyToOne

    private AuthorEntity idAuthorEntity;


    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getValuePayments() {
        return valuePayments;
    }

    public void setValuePayments(int valuePayments) {
        this.valuePayments = valuePayments;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public Boolean getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    public int getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(int productionCost) {
        this.productionCost = productionCost;
    }

    public Integer getFullPaymentToTheAuthor() {
        return fullPaymentToTheAuthor;
    }

    public void setFullPaymentToTheAuthor(Integer fullPaymentToTheAuthor) {
        this.fullPaymentToTheAuthor = fullPaymentToTheAuthor;
    }
}
