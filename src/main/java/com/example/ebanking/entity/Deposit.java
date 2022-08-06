package com.example.ebanking.entity;



import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "deposit")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "accountno")
    public BigInteger accountNo;

    @Column(name = "saccountno")
    public BigInteger sendAccountNo;

    @Column(name = "raccountno")
    public BigInteger receiveAccountNo;

    @Column(name = "amount")
    public BigInteger amount;

    @Column(name = "receivedate")
    public Date receiveDate;

    @Column(name = "status")
    public int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(BigInteger accountNo) {
		this.accountNo = accountNo;
	}

	public BigInteger getSendAccountNo() {
		return sendAccountNo;
	}

	public void setSendAccountNo(BigInteger sendAccountNo) {
		this.sendAccountNo = sendAccountNo;
	}

	public BigInteger getReceiveAccountNo() {
		return receiveAccountNo;
	}

	public void setReceiveAccountNo(BigInteger receiveAccountNo) {
		this.receiveAccountNo = receiveAccountNo;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Deposit [id=" + id + ", accountNo=" + accountNo + ", sendAccountNo=" + sendAccountNo
				+ ", receiveAccountNo=" + receiveAccountNo + ", amount=" + amount + ", receiveDate=" + receiveDate
				+ ", status=" + status + "]";
	}
    
    
}
