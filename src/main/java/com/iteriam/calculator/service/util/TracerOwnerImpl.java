package com.iteriam.calculator.service.util;

import io.corp.calculator.TracerAPI;
import io.corp.calculator.TracerImpl;


public class TracerOwnerImpl extends TracerImpl implements TracerAPI {

	@Override
	public <T> void trace(T arg0) {
		super.trace(arg0);		
	}

}
