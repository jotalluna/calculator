package com.iteriam.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iteriam.calculator.dto.DataOperators;
import com.iteriam.calculator.dto.Result;
import com.iteriam.calculator.service.CalculatorService;

import io.corp.calculator.TracerAPI;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorService calculadoraService;
	
	@Autowired
	TracerAPI tracerApi;
	
    @Operation(summary = "Calculator Sum/Subtract ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Result of operation selected",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Result.class)))),
            @ApiResponse(responseCode = "400", description = "Error Bad Request",
                    content = @Content(schema = @Schema(implementation = Exception.class)))})
	@PatchMapping("/calculadora")
	public ResponseEntity<Result> calculator(@RequestBody DataOperators data) throws Exception{
    	   	
		tracerApi.trace("DEBUG:CalculatorController: OperatorA:"+data.getDatoA()+" OperatorB"+data.getDatoB()+" Class:"+data.getClass());		
		return new ResponseEntity<Result>(calculadoraService.operation(data),HttpStatus.OK);
	}
	
}
