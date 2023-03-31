package com.kanghoshin.lis.dto.test;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TestReceptDto {
	
	private int specimenNo;
	
	private String prescriptionCode;
	
	private int staffNo;
	
	private Date receptionDate;
	
	
}