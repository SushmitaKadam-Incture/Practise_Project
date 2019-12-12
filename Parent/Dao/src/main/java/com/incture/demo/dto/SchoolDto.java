package com.incture.demo.dto;

import java.util.List;

import com.incture.demo.entity.ClassDo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SchoolDto extends BaseDto {
	private String schoolId;
	private String schoolName;
	private List<ClassDo> classes;

}
