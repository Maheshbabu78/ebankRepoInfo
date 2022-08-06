package com.example.ebanking.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "bankwithdraw")
public class BankWithdraw {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long id;

	@Column(name = "accountno")
	public BigInteger accountNo;

	@Column(name = "receivername")
	public String receiverName;

	@Column(name = "receivernid")
	public String receiverNID;

	@Column(name = "receivermobile")
	public String receiverPhone;

	@Column(name = "amount")
	public BigInteger amount;

	@Column(name = "type")
	public String type;

	@Column(name = "withdrawdate")
	@UpdateTimestamp
	public Date withdrawDate;

	@Column(name = "status")
	public int status;

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

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverNID() {
		return receiverNID;
	}

	public void setReceiverNID(String receiverNID) {
		this.receiverNID = receiverNID;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getWithdrawDate() {
		return withdrawDate;
	}

	public void setWithdrawDate(Date withdrawDate) {
		this.withdrawDate = withdrawDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BankWithdraw [id=" + id + ", accountNo=" + accountNo + ", receiverName=" + receiverName
				+ ", receiverNID=" + receiverNID + ", receiverPhone=" + receiverPhone + ", amount=" + amount + ", type="
				+ type + ", withdrawDate=" + withdrawDate + ", status=" + status + "]";
	}
	
	
	
	
}
