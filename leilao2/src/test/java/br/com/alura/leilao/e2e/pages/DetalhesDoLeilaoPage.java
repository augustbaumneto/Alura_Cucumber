package br.com.alura.leilao.e2e.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DetalhesDoLeilaoPage extends ObjectPageBase{

	private WebDriver driver;
	private WebDriverWait wait;

	public DetalhesDoLeilaoPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public void darLance(String valor) {
		
		By localizador = By.id("valor");
		
		esperaElemento(localizador, driver);
		
		WebElement txtValor = driver.findElement(localizador);
		txtValor.sendKeys(valor);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("btnDarLance")).submit();
	}

	public boolean existeLance(String valor) {
		By locator = By.xpath("//table[@id='lancesDados']//td[contains(.,'" + valor + "')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement td = driver.findElement(locator);
		String result = td.getText();
		
		return result != null;
	}
	
	public boolean temApenasUmLance() {
		List<WebElement> trs = driver.findElements(By.tagName("tr"));
		return trs.size() == 2;

	}


}