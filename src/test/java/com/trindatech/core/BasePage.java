package com.trindatech.core;

import static com.trindatech.core.DriverFactory.getDriver;

public class BasePage {

	public String getTitle() {
		return getDriver().getTitle();
	}
	
}
