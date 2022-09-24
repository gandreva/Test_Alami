package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailProductPage extends BasePage {
	By Qty = By.xpath("(//input[@id='optionStock0'])[1]"); // Path Input Jumlah
	By AddChart = By.xpath("//a[@class='btnStyle btnFlat btnL btnOrangeW']"); // Path Tambah ke Cart
	By PopUpChart = By.xpath("//a[@href='http://www.elevenia.co.id/cart/CartAction/getCartList.do']"); // Path Pop Up Tambah Chart (Button YA)

	public DetailProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void dpd(String qty) {
		
		clickAndWaitByXpath(Qty);
		setText(Qty, qty);
		
		clickAndWaitByXpath(AddChart);
		clickAndWaitByXpath(PopUpChart);
		Utility.hardWait(3);
	}

}