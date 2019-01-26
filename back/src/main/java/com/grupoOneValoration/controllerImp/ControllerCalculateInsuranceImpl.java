package com.grupoOneValoration.controllerImp;

import com.grupoOneValoration.controller.ControllerCalculateInsurance;

public class ControllerCalculateInsuranceImpl implements ControllerCalculateInsurance{

	@Override
	public Double calculateInsuranceToPay(Double propertyValue) throws Exception {
		return propertyValue*0.05/12*1.01;
	}
	
	
}
