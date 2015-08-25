
package com.exposit.sjc.domain.model;

import javax.persistence.*;
import java.util.Date;


public class Contract {

    private Integer idContract;

    private int idBook;

    public int getIdBook() {
        return idBook;
    }

    public Contract(Integer idContract, int idBook, int numberOfBooks, int valuePayments, Date dateOfPublication,
                    Boolean isSigned, int productionCost, Integer fullPaymentToTheAuthor) {
        super();
        this.idContract = idContract;
        this.idBook = idBook;
        this.numberOfBooks = numberOfBooks;
        this.valuePayments = valuePayments;
        this.dateOfPublication = dateOfPublication;
        this.isSigned = isSigned;
        this.productionCost = productionCost;
        this.fullPaymentToTheAuthor = fullPaymentToTheAuthor;
    }

    public Contract() {

    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

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

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
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
