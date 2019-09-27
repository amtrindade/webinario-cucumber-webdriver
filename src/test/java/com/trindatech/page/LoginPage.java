package com.trindatech.page;

import com.trindatech.core.DriverFactory;

public class LoginPage {

	public String getTitle() {
		return DriverFactory.getDriver().getTitle();
	}

}
