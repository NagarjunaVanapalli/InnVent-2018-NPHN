package com.nphn.innvent.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CropController {

	@RequestMapping("/getcropName")
	public String getCropName() {
		return "Success";
	}
}
