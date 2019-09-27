package com.trindatech.page;

import static com.trindatech.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DetailProductPage {

	public void addCart() {
		getDriver().findElement(By.xpath("//*[@value='Adicionar ao carrinho']")).click();
	}
	
}
