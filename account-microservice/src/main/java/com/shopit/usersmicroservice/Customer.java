package com.shopit.usersmicroservice;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_customer")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "customer_id")
	private long userId;
	
	@Column(name = "name")
	private String name;
	
    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;
    
    @Column(name="address")
    private String address;
    
    @Column(name="contact_number")
    private String contactNumber;
    
    @Column(name="date_of_birth")
    private Date dateOfBirth;
    
    @Column(name="email")
    private String email;



//	@Transient
//	@OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
//	private Account account;

	public Customer()
	{}

	public Customer(String name, String address, String contactNumber, Date dateOfBirth, String email) {
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
		return "Customer{" +
				"name=" + name +
				", address='" + address + '\'' +
				", contactNumber=" + contactNumber +
				", dateOfBirth='" + dateOfBirth + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
