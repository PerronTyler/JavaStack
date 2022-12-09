package com.tyler.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 1, max = 255, message="expense must include a name with at least 1 letters")
	private String name;
	@NotNull
	@Size(min = 1, max = 255, message="vendor must include a name with at least 1 letters")
	private String vendor;
	@NotNull
	@Min(value = 0, message="price needs to be more than 1 cent")
	private long price;
	@NotNull
	@Size(min = 1, max = 255)
	private String description;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}


	public Expense(
			@NotNull @Size(min = 5, max = 255, message = "expense must include a name with at least 5 letters") String name,
			@NotNull @Size(min = 5, max = 255, message = "vendor must include a name with at least 5 letters") String vendor,
			@NotNull @Min(value = 0, message = "price needs to be more than 1 cent") long price,
			@NotNull @Size(min = 5, max = 255) String description) {
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.description = description;
	}
	
	


	public Expense(Long id,
			@NotNull @Size(min = 5, max = 255, message = "expense must include a name with at least 5 letters") String name,
			@NotNull @Size(min = 5, max = 255, message = "vendor must include a name with at least 5 letters") String vendor,
			@NotNull @Min(value = 0, message = "price needs to be more than 1 cent") long price,
			@NotNull @Size(min = 5, max = 255) String description) {
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
