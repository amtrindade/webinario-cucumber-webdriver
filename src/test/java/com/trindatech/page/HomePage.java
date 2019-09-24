package com.trindatech.page;

import static com.trindatech.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class HomePage {

	public void open() {
		getDriver().get("http://www.mercadolivre.com.br");
	}

	public void searchProduct(String search) {
		getDriver().findElement(By.name("as_word")).sendKeys(search);
		getDriver().findElement(By.className("nav-search-btn")).click();
	}

}
