package com.incture.demo.dao;

import org.springframework.stereotype.Repository;

import com.incture.demo.dto.SchoolDto;
import com.incture.demo.entity.SchoolDo;

@Repository
public class SchoolDaoImpl extends BaseDao<SchoolDo, SchoolDto> implements SchoolDao {

	@Override
	protected SchoolDo importDto(SchoolDto fromDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected SchoolDto exportDto(SchoolDo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public String checking() {

		return getSession().toString();
	}

}
