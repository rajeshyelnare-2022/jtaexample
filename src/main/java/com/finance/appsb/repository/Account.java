package com.finance.appsb.repository;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "ACCOUNT")
public class Account {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="ID")
	  private Long id;
	  
	  @Column(name="NAME",length=256)
	  private String name;
		  
	 @Column(name="BALANCE",length=128)
	 private int balance;
	  
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
