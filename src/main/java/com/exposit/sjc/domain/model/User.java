package com.exposit.sjc.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

public class User {

	private Long userId;

	private String address;

	private int phoneNumber;

	private String email;

	private String lastName;

	private String firstName;

	private String patronymic;

	private int amountOfMoney;
	private AuthorizationData idAutorizationData;

	public AuthorizationData getIdAutorizationData() {
		return idAutorizationData;
	}

	public void setIdAutorizationData(AuthorizationData idAutorizationData) {
		this.idAutorizationData = idAutorizationData;
	}




	public User() {

	}

	public User(Long userId, String address, int phoneNumber, String email, String lastName, String firstName,
			String patronymic, int amountOfMoney, AuthorizationData authorizationData) {
		this.userId = userId;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.amountOfMoney = amountOfMoney;
		this.idAutorizationData = authorizationData;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
