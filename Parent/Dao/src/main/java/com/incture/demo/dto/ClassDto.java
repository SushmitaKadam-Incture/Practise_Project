package com.incture.demo.dto;

import java.util.List;

import com.incture.demo.entity.SchoolDo;
import com.incture.demo.entity.StudentDo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClassDto extends BaseDto {

	private String classId;
	private String className;
	private List<StudentDo> students;
	private SchoolDo parent;

}
