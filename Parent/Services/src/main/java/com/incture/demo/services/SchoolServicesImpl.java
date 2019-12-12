package com.incture.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.demo.dao.SchoolDao;

@Service
@Transactional
public class SchoolServicesImpl implements SchoolServices {

	@Autowired
	private SchoolDao schoolDao;

	public String checking() {
		try {
			return schoolDao.checking();

		} catch (Exception e) {
			return e.getMessage();

		}
	}

}
