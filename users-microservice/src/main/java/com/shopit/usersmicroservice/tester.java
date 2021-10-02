package com.shopit.usersmicroservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_test")
public class tester {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO )
  @Column(name = "a")
  private long a;
  
  @Column(name="b")
  private String b;

public long getA() {
	return a;
}

public void setA(long a) {
	this.a = a;
}

public String getB() {
	return b;
}

public void setB(String b) {
	this.b = b;
}
}
	
