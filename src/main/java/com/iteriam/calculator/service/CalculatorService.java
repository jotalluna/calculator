package com.iteriam.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.iteriam.calculator.dto.DataOperators;
import com.iteriam.calculator.dto.Result;

import io.corp.calculator.TracerAPI;


public interface CalculatorService {
	
	public Result operation(DataOperators d);
	

}
