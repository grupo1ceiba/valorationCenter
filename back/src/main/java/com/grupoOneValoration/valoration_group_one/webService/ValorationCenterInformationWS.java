package com.grupoOneValoration.valoration_group_one.webService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/wsValorationCenter")
@CrossOrigin("*")
public class ValorationCenterInformationWS {
	
	@RequestMapping(value="/wsValorationCenter", method=RequestMethod.POST)
	public String wsValorationCenter(){
		
		return "";
	}	
}
