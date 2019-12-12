package com.incture.demo.dao;

import org.springframework.stereotype.Repository;

import com.incture.demo.dto.ClassDto;
import com.incture.demo.entity.ClassDo;

@Repository
public class ClassDaoImpl extends BaseDao<ClassDo, ClassDto> implements ClassDao {

	@Override
	protected ClassDo importDto(ClassDto fromDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ClassDto exportDto(ClassDo entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
