package com.grupoOneValoration.controllerImp;

import com.grupoOneValoration.controller.ControllerStratumDirection;
import com.grupoOneValoration.dto.DTOAddress;
import com.grupoOneValoration.dto.constants.Orientation;
import com.grupoOneValoration.dto.constants.StreetTypes;

public class ControllerStratumDirectionImpl implements ControllerStratumDirection{

	@Override
	public boolean stratumByDirection(DTOAddress address, String stratum) throws Exception {
		String stratumGenerated;
		if(address.getStreet() != null && address.getCardinal() != null){
			if(address.getCardinal().equals(Orientation.N.toString())){
				if(address.getStreetValue() > 100){
					stratumGenerated = "6";
				}else if(address.getStreetValue() < 30){
					stratumGenerated = "4";
				} else{
					stratumGenerated = "5";
				}
			}else{
				if(address.getStreetValue() > 100){
					stratumGenerated = "1";
				}else if(address.getStreetValue() < 30){
					stratumGenerated = "3";
				} else{
					stratumGenerated = "2";
				}
			}
		}else{
			stratumGenerated = "7";
		}

		return stratumGenerated.equals(stratum);
	}

}
