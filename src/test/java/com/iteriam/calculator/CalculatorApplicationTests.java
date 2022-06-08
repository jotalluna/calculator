package com.iteriam.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.iteriam.calculator.dto.DataOperatorsSubtract;
import com.iteriam.calculator.dto.DataOperatorsSum;
import com.iteriam.calculator.dto.Result;
import com.iteriam.calculator.service.CalculatorService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CalculatorApplicationTests {
	
	@Autowired
	CalculatorService calculadoraService;

	@Test
	public void sumTest() {	
		
		DataOperatorsSum d=new DataOperatorsSum();
		d.setDatoA(new BigDecimal(10));
		d.setDatoB(new BigDecimal(11));
		assertEquals(calculadoraService.operation(d), new Result(new BigDecimal(21)));
	}
	
	@Test
	public void subtractTest() {		
		DataOperatorsSubtract d=new DataOperatorsSubtract();
		d.setDatoA(new BigDecimal(10));
		d.setDatoB(new BigDecimal(11));
		assertEquals(calculadoraService.operation(d), new Result(new BigDecimal(-1)));
	}
	
}
