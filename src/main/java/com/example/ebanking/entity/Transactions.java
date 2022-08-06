package com.example.ebanking.entity;


import org.springframework.data.annotation.CreatedDate;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long id;

	@Column(name = "accountno")
	public BigInteger accountNo;

	@Column(name = "amount")
	public BigInteger amount;
	
	@Column(name = "description")
	public String description;

	@Column(name = "status")
	public int status;

	@Column(name = "type")
	public String type;

	@Column(name = "date")
	@CreatedDate
	public Date date;

	@Column(name = "transactiontype")
	public String transactionType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(BigInteger accountNo) {
		this.accountNo = accountNo;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Transactions [id=" + id + ", accountNo=" + accountNo + ", amount=" + amount + ", description="
				+ description + ", status=" + status + ", type=" + type + ", date=" + date + ", transactionType="
				+ transactionType + "]";
	}
	
	
	
	
	
}
