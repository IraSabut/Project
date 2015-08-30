package com.exposit.sjc.app.repository.entity;
import com.exposit.sjc.domain.model.AuthorizationData;

import javax.persistence.*;

    @Entity
       @Table(name = "user")
public class UserEntity {


        @Id
        @Column(name = "idUser")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long idUser;
        @Column(name = "address")
        private String address;
        @Column(name = "phoneNumber")
        private int phoneNumber;
        @Column(name = "email")
        private String email;
        @Column(name = "lastName")
        private String lastName;
        @Column(name = "firstName")
        private String firstName;
        @Column(name = "patronymic")
        private String patronymic;
        @Column(name = "amountOfMoney")
        private int amountOfMoney;
        @JoinColumn(name = "idAutorizationData", referencedColumnName = "idAutorizationData")
        @ManyToOne
        private AutorizationDataEntity idAutorizationData;

    public AutorizationDataEntity getIdAutorizationData() {
        return idAutorizationData;
    }

    public void setIdAutorizationData(AutorizationDataEntity idAutorizationData) {
        this.idAutorizationData = idAutorizationData;
    }

    public Long getIdUser() {
            return idUser;
        }

        public void setIdUser(Long userId) {
            this.idUser = userId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public int getAmountOfMoney() {
            return amountOfMoney;
        }

        public void setAmountOfMoney(int amountOfMoney) {
            this.amountOfMoney = amountOfMoney;
        }

    public void setIdAutorizationData(AuthorizationData authorizationData) {

    }
}
