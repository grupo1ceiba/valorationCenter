package com.valoracion.webService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.valoracion.controller.impl.ControllerCalculateInsuranceImpl;
import com.valoracion.dto.DTOProperty;
import com.valoracion.dto.DTOValue;


@RestController
@RequestMapping("/wsValorationCenter")
@CrossOrigin("*")
public class ControllerWebService {
	
	@ResponseBody
	@RequestMapping(value="/valorationCenterInformationWS", method=RequestMethod.POST)
	public Object valorationCenterInformationWS(@RequestBody DTOProperty property) throws Exception{
		
		DTOValue valueInsurance = new DTOValue();
		ControllerCalculateInsuranceImpl calculateInsuranceImpl = new ControllerCalculateInsuranceImpl();
		valueInsurance.setAmount(calculateInsuranceImpl.calculateInsuranceToPay(property.getValue().getAmount()));
		valueInsurance.setCurrency(property.getValue().getCurrency());
		return valueInsurance;
	}	
}
