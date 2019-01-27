package com.valoracion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valoracion.controller.impl.ImplMockupController;

@RestController
@RequestMapping("/introduction")
@CrossOrigin("*")
public class MockupController implements ImplMockupController{

	@Override
	@RequestMapping(value="/ping", method=RequestMethod.GET)
	public String ping(){
		
		return ("::::+> Si hay comunicación.");
	}
}
