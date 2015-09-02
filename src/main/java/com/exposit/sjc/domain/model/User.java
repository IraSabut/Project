package com.exposit.sjc.domain.model;

public class User {

	private Long userId;

	private String address;

	private int phoneNumber;

	private String email;

	private String lastName;

	private String firstName;

	private String patronymic;

	private int amountOfMoney;
	private Role idRole;
	private AutorizationData idAutorizationData;

	public AutorizationData getIdAutorizationData() {
		return idAutorizationData;
	}

	public void setIdAutorizationData(AutorizationData idAutorizationData) {
		this.idAutorizationData = idAutorizationData;
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
