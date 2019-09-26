package com.trindatech.core;

import cucumber.api.java.After;

public class Hooks {
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}

}
