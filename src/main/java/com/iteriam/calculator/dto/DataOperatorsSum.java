package com.iteriam.calculator.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@JsonTypeName("sum")
public class DataOperatorsSum extends DataOperators{	
	
	public Result operation() {
		Result result=new Result(getDatoA().add(getDatoB()));
		return result;
	}

}
