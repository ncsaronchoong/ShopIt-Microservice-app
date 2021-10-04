package com.shopit.usersmicroservice;


import javax.persistence.*;

@Entity
@Table(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "account_id")
    private long accountId;


//    @OneToOne
//    @JoinColumn(name = "user_name", referencedColumnName = "user_name")
//    private User user;
    
    @Column(name="user_name")
    private String username;

    @Column(name="password")
    private String password;
    
    @Column(name="account_type")
    private String accountType;
    
    @Column(name='account_creation_date')
    private Date accountCreationDate;
   
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name='last_login_date')
    private Date lastLogindate;
	
	public Account(){
		
	}
	
	public Account(String username, String password, String accountType, Date accountCreationDate, Date lastLogindate) {
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.accountCreationDate = accountCreationDate;
		this.lastLogindate = lastLogindate;
	}
    
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
    
    public Date getLastLoginDate() {
        return lastLogindate;
    }

    public void setLastLoginDate(Date lastLogindate) {
        this.lastLogindate = lastLogindate;
    }
}
