package com.iteriam.calculator.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@JsonTypeName("subtract")
public class DataOperatorsSubtract extends DataOperators{	
	
	public Result operation() {
		Result result=new Result(getDatoA().subtract(getDatoB()));
		return result;
	}

}
