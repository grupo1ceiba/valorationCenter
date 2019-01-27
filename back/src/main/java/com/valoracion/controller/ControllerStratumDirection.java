package com.valoracion.controller;

import com.valoracion.dto.DTOAddress;

public interface ControllerStratumDirection {
	
	public boolean stratumByDirection(DTOAddress address, String stratum) throws Exception;
}
