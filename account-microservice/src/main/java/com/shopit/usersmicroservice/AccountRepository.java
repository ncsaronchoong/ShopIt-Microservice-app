package com.shopit.usersmicroservice;

//import net.javaguides.springbootcrudrestfulwebservices.User.Entity.Account;
//import net.javaguides.springbootcrudrestfulwebservices.User.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Long> {
}