package com.incture.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.demo.dao.StudentDao;

@Service
@Transactional
public class StudentServicesImpl implements StudentServices {

	@Autowired
	private StudentDao studentDao;

}
