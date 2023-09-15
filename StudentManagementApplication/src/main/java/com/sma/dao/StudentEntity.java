package com.sma.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name="STUDENT_DETAILS")
public class StudentEntity {	
	@Id
	@Column(name="STD_ID")
	private Integer stdId;
	@Column(name="STD_NAME",length =30)
	private String name;
	@Column(name ="STD_GENDER",length =30)
	private String gender;
	@Column(name="STD_MAIL",length=30)
	private String mail;
	@Column(name="STD_MOBILE_NO",length=30)
	private String phn;
	@Column(name="STD_ADDRESS",length=30)
	private String address;
	@Column(name="STD_COURSE",length=30)
	private String course;
	@Column(name="STD_FEE")
	private float fee;
	@Column(name="STD_DOJ")
	private String doj;
	@Column(name="STD_DOL")
	private String dol;

}
