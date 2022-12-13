package br.com.alura.leilao.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectPageBase {

	public ObjectPageBase() {
		
	}
	
	protected void esperaElemento (By identificadorelemento, WebDriver driver) {
		
		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(identificadorelemento));
		
	}



}
