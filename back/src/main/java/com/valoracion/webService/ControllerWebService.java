package com.valoracion.webService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/wsValorationCenter")
@CrossOrigin("*")
public class ControllerWebService {
	
	@RequestMapping(value="/wsValorationCenter", method=RequestMethod.POST)
	public String wsValorationCenter(){
		
		return "";
	}	
}
