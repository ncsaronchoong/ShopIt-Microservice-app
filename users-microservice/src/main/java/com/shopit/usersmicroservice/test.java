package com.shopit.usersmicroservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class test {
	
@Autowired
private UserRepository userRepository;	


    @GetMapping("/test")
    public String getUserById()
    {

      return "String";
    }
    
    
    @PostMapping("/create")
    public String create()
    {
        tester tmp = new tester();
        tmp.setB("AAA");
        this.userRepository.save(tmp);
        return "DONE";
        }
    
	/*
	 * @PostMapping("/create") public String createUser(@RequestBody User user)
	 * throws Throwable { System.out.println(user.toString());
	 * user.setDateRegistered(new Date());
	 * 
	 * 
	 * 
	 * Account account = new Account(); account.setPassword(user.getPassword());
	 * account.setUser(user); account.setRole(1); account.setStatus(1);
	 * 
	 * this.userRepository.save(user); this.accountRepository.save(account);
	 * 
	 * return "success"; }
	 */

}