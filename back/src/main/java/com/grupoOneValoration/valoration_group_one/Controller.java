package com.grupoOneValoration.valoration_group_one;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/introduction")
@CrossOrigin("*")
public class Controller {

	@RequestMapping(value="/ping", method=RequestMethod.POST)
	public String ping(){
		
		return ("::::+> Si hay comunicación.");
	}
}
