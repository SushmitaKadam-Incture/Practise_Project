package com.incture.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.demo.services.SchoolServices;

@RestController
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	private SchoolServices schoolServices;

	@GetMapping("/check")
	public String checking() {
		return schoolServices.checking();

	}

}
