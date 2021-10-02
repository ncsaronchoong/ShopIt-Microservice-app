package com.shopit.usersmicroservice;


import javax.persistence.*;

@Entity
@Table(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "account_id")
    private long accountId;


    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;


    @Column(name="password")
    private String password;


    @Column(name="role_id", nullable=false)
    private long role;


    @Column(name="status_id", nullable=false)
    private long status;


    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public long getRole() {
        return role;
    }

    public void setRole(long role) {
        this.role = role;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }
}
