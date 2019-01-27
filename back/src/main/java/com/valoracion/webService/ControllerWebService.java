package com.valoracion.webService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.valoracion.controller.impl.ControllerStratumDirectionImpl;
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
		
		boolean stratumOK = false;
		DTOValue valueInsurance = null;
		if(null!=property){
		
			stratumOK = this.verifyStratum(property);
			
			if(stratumOK){
				
				valueInsurance = new DTOValue();
				valueInsurance.setAmount(this.calculateInsurence(property));
				valueInsurance.setCurrency(property.getValue().getCurrency());
			}
		}
		
		return valueInsurance;
	}	
	
	private Double calculateInsurence(DTOProperty property) throws Exception{
		
		Double amountInsurance = (double) 0;
		ControllerCalculateInsuranceImpl calculateInsuranceImpl = new ControllerCalculateInsuranceImpl();
		amountInsurance = calculateInsuranceImpl.calculateInsuranceToPay(property.getValue().getAmount());
		
		return amountInsurance;		
		
	}
	
	private boolean verifyStratum(DTOProperty property) throws Exception{
		
		ControllerStratumDirectionImpl stratumDirection = new ControllerStratumDirectionImpl();
		
		return stratumDirection.stratumByDirection(property.getAddress(), property.getStratum());
	}
}