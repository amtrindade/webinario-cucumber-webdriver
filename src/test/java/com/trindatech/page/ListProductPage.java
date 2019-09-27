package com.trindatech.page;

import static com.trindatech.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListProductPage {

	public String getQuantityResult() {
		return getDriver().findElement(By.className("quantity-results")).getText();
	}

	public void selectFirstProduct() {
		WebElement listProduct = getDriver().findElement(By.id("searchResults"));
		List<WebElement> products = listProduct.findElements(By.className("image-content"));
		products.get(0).click();
	}
}
