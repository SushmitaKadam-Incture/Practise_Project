package com.incture.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.demo.dao.ClassDao;

@Service
@Transactional
public class ClassServicesImpl implements ClassServices {

	@Autowired
	private ClassDao classDao;

}
