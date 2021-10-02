package com.shopit.productmicroservice.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue
	private int product_id;
	private String product_name;
	private String product_description;
	private float price;
	private Date expiry_date;
	}
	
	
	
	

}
