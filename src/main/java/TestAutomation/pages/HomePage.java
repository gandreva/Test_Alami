package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	By Search = By.xpath("//input[@id='AKCKwd']"); // Path Input Pencarian
	By SrcBtn = By.xpath("//button[@class='btn-search']"); // Path Search


	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void home(String search) {

		clickAndWaitByXpath(Search);
		setText(Search, search);

		clickAndWaitByXpath(SrcBtn);
		Utility.hardWait(2);
	}

}
