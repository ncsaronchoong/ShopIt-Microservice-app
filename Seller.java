package com.shopit.usersmicroservice;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_seller")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "seller_id")
	private long userId;
	
	@Column(name = "shopName")
	private String shopName;
	
    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;
    
    @Column(name="address")
    private String address;
    
    @Column(name="contact_number")
    private String contactNumber;
    
    @Column(name="email")
    private String email;



//	@Transient
//	@OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
//	private Account account;

	public Seller()
	{}

	public Seller(String shopName, String address, String contactNumber, String email) {
		this.shopName = shopName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String email() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Seller{" +
				"shopName=" + shopName +
				", address='" + address + '\'' +
				", contactNumber=" + contactNumber +
				", email='" + email + '\'' +
				'}';
	}
}
