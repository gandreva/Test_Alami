package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
	By Product = By.xpath("//a[contains(text(),'JOYSEUS Wireless Mouse 1800DPI USB Computer 2.4GHz')]"); // Path Pilih Product

	public ProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void pd() {
		clickAndWaitByXpath(Product);
		Utility.hardWait(1);
	}

}