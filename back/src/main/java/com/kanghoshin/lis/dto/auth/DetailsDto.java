package com.kanghoshin.lis.dto.auth;


import java.util.Date;

import com.kanghoshin.lis.constraints.RrnConstraints;
import com.kanghoshin.lis.constraints.PhoneConstraints;
import com.kanghoshin.lis.constraints.ImageConstraints;
import com.kanghoshin.lis.constraints.NameConstraints;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsDto {

	@NameConstraints
	private String staffName;

	private Date staffBirth;

	private boolean staffMale;

	@PhoneConstraints
	private String staffPhone;

	@ImageConstraints
	private String staffImage;

	@RrnConstraints
	private String staffRrn;
}
