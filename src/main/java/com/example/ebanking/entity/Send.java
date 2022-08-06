package com.example.ebanking.entity;



import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "send")
public class Send {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name = "accountno")
    public BigInteger accountNo;

    @Column(name = "saccountno")
    public BigInteger sendAccountNo;

    @Column(name = "raccountno")
    public BigInteger receiveAccountNo;

    @Column(name = "amount")
    public BigInteger amount;

    @Column(name = "sendingdate")
    public Date sendingDate;

    @Column(name = "status")
    public int status;

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

	public Date getSendingDate() {
		return sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		this.sendingDate = sendingDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Send [id=" + id + ", name=" + name + ", accountNo=" + accountNo + ", sendAccountNo=" + sendAccountNo
				+ ", receiveAccountNo=" + receiveAccountNo + ", amount=" + amount + ", sendingDate=" + sendingDate
				+ ", status=" + status + "]";
	}
    
    
}
