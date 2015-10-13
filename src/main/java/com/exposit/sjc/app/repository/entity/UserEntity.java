package com.exposit.sjc.app.repository.entity;
<<<<<<< HEAD
<<<<<<< HEAD

import com.exposit.sjc.domain.model.Role;

import javax.persistence.*;

    @Entity
       @Table(name = "users")
=======
import javax.persistence.*;

=======
import javax.persistence.*;

>>>>>>> parent of 873aa4a... add form for registration user
/**
 * Created by Админ on 21.08.2015.
 */    @Entity
       @Table(name = "user")
>>>>>>> parent of 873aa4a... add form for registration user
public class UserEntity {


        @Id
        @Column(name = "idUser")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        @Column(name = "password")
        private String password;
        @Column(name = "username")
        private String username;
        @Column(name = "idRole")
        @Enumerated(EnumType.STRING)
        private Role idRole;

        public Role getIdRole() {
            return idRole;
        }

        public void setIdRole(Role idRole) {
            this.idRole = idRole;
        }

        public UserEntity(String address, int phoneNumber, String email, String lastName, String firstName, String patronymic, int amountOfMoney, String password, String username, Role idRole) {
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.amountOfMoney = amountOfMoney;
            this.password = password;
            this.username = username;
            this.idRole = idRole;

        }

        public UserEntity(String address, int phoneNumber, String email, String lastName, String firstName, String patronymic, int amountOfMoney, String password, String username) {
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.amountOfMoney = amountOfMoney;
            this.password = password;
            this.username = username;
        }
        public UserEntity( String username,String password) {
            this.username = username;
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String login) {
            this.username = login;
        }

        public AutorizationDataEntity getIdAutorizationData() {
            return idAutorizationData;
        }

        public void setIdAutorizationData(AutorizationDataEntity idAutorizationData) {
            this.idAutorizationData = idAutorizationData;
        }

        @JoinColumn(name = "idAutorizationData", referencedColumnName = "idAutorizationData")
        @ManyToOne
        private AutorizationDataEntity idAutorizationData;
        public UserEntity(String address, int phoneNumber, String email, String lastName, String firstName, String patronymic, int amountOfMoney, AutorizationDataEntity idAutorizationData) {
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.amountOfMoney = amountOfMoney;
            this.idAutorizationData = idAutorizationData;
        }

        public UserEntity() {

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
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> parent of 873aa4a... add form for registration user
=======
>>>>>>> parent of 873aa4a... add form for registration user
}
