package com.example.ebanking.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "bankaccount")
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;
	
	@Column(name = "name")
	public String name;

	@Column(name = "accountno")
	public BigInteger accountNo;

	@Column(name = "oaccountno")
	public BigInteger oAccountNo;

	@Column(name = "phone")
	public String phone;

	@Column(name = "birthdate")
	public Date dateOfBirth;

	@Column(name = "status")
	public int status;

	@Column(name = "nid")
	public String nid;

	@Column(name = "address")
	public String address;

	@Column(name = "openingdate")
    @CreationTimestamp
	public Date openingDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="balancedetails")
	public Balance balanceDetails;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "carddetails")
	public CardAccount cardDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(BigInteger accountNo) {
		this.accountNo = accountNo;
	}

	public BigInteger getoAccountNo() {
		return oAccountNo;
	}

	public void setoAccountNo(BigInteger oAccountNo) {
		this.oAccountNo = oAccountNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Balance getBalanceDetails() {
		return balanceDetails;
	}

	public void setBalanceDetails(Balance balanceDetails) {
		this.balanceDetails = balanceDetails;
	}

	public CardAccount getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(CardAccount cardDetails) {
		this.cardDetails = cardDetails;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", accountNo=" + accountNo + ", oAccountNo=" + oAccountNo
				+ ", phone=" + phone + ", dateOfBirth=" + dateOfBirth + ", status=" + status + ", nid=" + nid
				+ ", address=" + address + ", openingDate=" + openingDate + ", balanceDetails=" + balanceDetails
				+ ", cardDetails=" + cardDetails + "]";
	}
	
	
	
	
}
