package com.trindatech.page;

import static com.trindatech.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class ListProductPage {

	public String getQuantityResult() {
		return getDriver().findElement(By.className("quantity-results")).getText();
	}
}
