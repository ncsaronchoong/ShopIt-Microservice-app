package com.shopit.usersmicroservice;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "name")
	private String name;



	@Transient
	@OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
	private Account account;


	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;


	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name ="date_registered")
	private Date dateRegistered;

	@Column(name ="contact_no")
	private String contactNo;

	@Transient
	private String password;


	public User()
	{}

	public User(String name, String username, String email, Date dateRegistered, String contactNo) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.dateRegistered = dateRegistered;
		this.contactNo = contactNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", name='" + name + '\'' +
				", account=" + account +
				", username='" + username + '\'' +
				", email='" + email + '\'' +
				", dateRegistered=" + dateRegistered +
				", contactNo='" + contactNo + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
