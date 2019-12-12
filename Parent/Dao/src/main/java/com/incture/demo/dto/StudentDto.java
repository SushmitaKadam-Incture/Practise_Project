package com.incture.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.incture.demo.entity.ClassDo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentDto extends BaseDto {

	private String studentId;
	private String studentName;
	private BigDecimal studentMarks;
	private Date joiningDate;
	private ClassDo parent;

}
