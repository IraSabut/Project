package com.exposit.sjc.app.repository.entity;
import javax.persistence.*;

/**
 * Created by Админ on 21.08.2015.
 */    @Entity
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
        private int idAutorizationData;

        public int getIdAutorizationData() {
            return idAutorizationData;
        }

        public void setIdAutorizationData(int idAutorizationData) {
            this.idAutorizationData = idAutorizationData;
        }

        public UserEntity() {

        }

        public UserEntity(Long userId, String address, int phoneNumber, String email, String lastName, String firstName,
                    String patronymic, int amountOfMoney, int authorizationData) {
            this.idUser = userId;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.amountOfMoney = amountOfMoney;
            this.idAutorizationData = authorizationData;
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
}
