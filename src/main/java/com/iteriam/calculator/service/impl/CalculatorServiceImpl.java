package com.iteriam.calculator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteriam.calculator.dto.DataOperators;
import com.iteriam.calculator.dto.Result;
import com.iteriam.calculator.service.CalculatorService;

import io.corp.calculator.TracerAPI;
import io.corp.calculator.TracerImpl;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	
	@Autowired
	TracerAPI tracerApi;
	
	public Result operation(DataOperators d) {
		
		Result result=d.operation();
		tracerApi.trace("DEBUG: Result of operation with "+d.getClass()+":"+result.getResult());		
		return result; 
	}

}
