package com.valoracion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valoracion.controller.impl.ControllerMockupImpl;

@RestController
@RequestMapping("/introduction")
@CrossOrigin("*")
public class ControllerMockup implements ControllerMockupImpl{

	@Override
	@RequestMapping(value="/ping", method=RequestMethod.GET)
	public String ping(){
		
		return ("::::+> Si hay comunicación.");
	}
}
