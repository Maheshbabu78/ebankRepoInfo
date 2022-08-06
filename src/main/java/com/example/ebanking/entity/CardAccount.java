package com.example.ebanking.entity;

import java.math.BigInteger;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;


import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "cardaccount")
public class CardAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long id;

	@Column(name = "name")
	public String name;

	@Column(name = "accountno")
	public BigInteger accountNo;

	@Column(name = "nid")
	public String nid;

	@Column(name = "cardno")
	public char[] cardNo;

	@Column(name = "carddate")
	public String cardDate;
	
	@Column(name = "cardpin")
	public char[] cardPin;
	
	@Column(name = "type")
	public String type;

	@Column(name = "status")
	public int status;
	
	@Column(name = "datetime")
	@CreatedDate
	public Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public char[] getCardNo() {
		return cardNo;
	}

	public void setCardNo(char[] cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardDate() {
		return cardDate;
	}

	public void setCardDate(String cardDate) {
		this.cardDate = cardDate;
	}

	public char[] getCardPin() {
		return cardPin;
	}

	public void setCardPin(char[] cardPin) {
		this.cardPin = cardPin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "CardAccount [id=" + id + ", name=" + name + ", accountNo=" + accountNo + ", nid=" + nid + ", cardNo="
				+ Arrays.toString(cardNo) + ", cardDate=" + cardDate + ", cardPin=" + Arrays.toString(cardPin)
				+ ", type=" + type + ", status=" + status + ", createDate=" + createDate + "]";
	} 
	
	
	
}
