package com.example.ebanking.entity;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "mobilewithdraw")
public class MobileWithdraw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "accountno")
    public BigInteger accountNo;

    @Column(name = "type")
    public String type;

    @Column(name = "withdrawtype")
    public String withdrawType;

    @Column(name = "phone")
    public String phone;

    @Column(name = "amount")
    public BigInteger amount;

    @Column(name = "datetime")
    @CreatedDate
    public Date dateTime;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "MobileWithdraw [id=" + id + ", accountNo=" + accountNo + ", type=" + type + ", withdrawType="
				+ withdrawType + ", phone=" + phone + ", amount=" + amount + ", dateTime=" + dateTime + "]";
	}
    
    
}
