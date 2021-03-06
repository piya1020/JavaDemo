package com.teksystems.myproject;

public class Accout {
	private String number;
	private double balance;
	private String customername;
	private String customerEmail;
	private String phonenumber;
	
	@Override
	public String toString() {
		return "Accout [number=" + number + ", balance=" + balance + ", customername=" + customername
				+ ", customerEmail=" + customerEmail + ", phonenumber=" + phonenumber + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Accout(String number, double balance, String customername, String customerEmail, String phonenumber) {
		super();
		this.number = number;
		this.balance = balance;
		this.customername = customername;
		this.customerEmail = customerEmail;
		this.phonenumber = phonenumber;
	}

}
