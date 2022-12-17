package com.saurav.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	private Integer totalBill;
	
	private Integer customerid;
	
	private Integer productid;
	
	private Integer quantity;
	
	private String productName;
	
	@PastOrPresent
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate orderdate;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;

}
