package com.incture.demo.dao;

import org.springframework.stereotype.Repository;

import com.incture.demo.dto.StudentDto;
import com.incture.demo.entity.StudentDo;

@Repository
public class StudentDaoImpl extends BaseDao<StudentDo, StudentDto> implements StudentDao {

	@Override
	protected StudentDo importDto(StudentDto fromDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StudentDto exportDto(StudentDo entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
