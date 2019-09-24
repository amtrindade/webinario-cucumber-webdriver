package com.trindatech.page;

import org.openqa.selenium.By;

import com.trindatech.core.DriverFactory;

public class ListProductPage {

	public String getQuantityResult() {
		return DriverFactory.getDriver().findElement(By.className("quantity-results")).getText();
	}

}
