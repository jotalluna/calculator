package com.iteriam.calculator.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = As.PROPERTY, property = "type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DataOperatorsSum.class, name = "sum"),
	@JsonSubTypes.Type(value = DataOperatorsSubtract.class, name = "subtract")
})
public abstract class DataOperators {
	
	
	@Schema(description = "The first operator of operation", example = "10", required = true)
	private BigDecimal datoA;
	
	@Schema(description = "The second operator of operation", example = "20", required = true)
	private BigDecimal datoB;
	
	public abstract Result operation();
	
}
