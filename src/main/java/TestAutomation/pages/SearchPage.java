package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {
	By Filter = By.xpath("//a[normalize-space()='Produk terlaris']"); // Path Filter Product

	public SearchPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void src() {
		clickAndWaitByXpath(Filter);
		Utility.hardWait(1);
	}

}