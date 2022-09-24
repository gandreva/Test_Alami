package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChartPage extends BasePage {

		By UbahKurir = By.xpath("//a[@name='deliveryChangePopup']"); // Path Button Ubah Kurir
		By PopUpBatal = By.xpath("//a[normalize-space()='Batal']"); // Path PopUp Ubah Kurir (Button Batal)
		By Hapus = By.xpath("(//a[@class='btnStyle btnS btnWGray'][normalize-space()='Hapus'])[1]"); // Path Button Hapus
		By PopUpHapus = By.xpath("//a[@id='chkDelPopY']"); // Path PopUp Hapus (Button OK)
		
	public ChartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void chart() {

		clickAndWaitByXpath(UbahKurir);
		clickAndWaitByXpath (PopUpBatal);
		clickAndWaitByXpath (Hapus);
		clickAndWaitByXpath (PopUpHapus);
		Utility.hardWait(4);
	}

}