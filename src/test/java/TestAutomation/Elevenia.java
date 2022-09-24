package TestAutomation;

import org.testng.annotations.Test;

import TestAutomation.pages.HomePage;
import TestAutomation.pages.SearchPage;
import TestAutomation.pages.ProductPage;
import TestAutomation.pages.DetailProductPage;
import TestAutomation.pages.ChartPage;


public class Elevenia extends BaseWebTest {
	HomePage homePage = new HomePage(driver, explicitWait);
	SearchPage searchPage = new SearchPage(driver, explicitWait);
	ProductPage productPage = new ProductPage(driver, explicitWait);
	DetailProductPage detailproductPage = new DetailProductPage(driver, explicitWait);
	ChartPage chartPage = new ChartPage(driver, explicitWait);

	@Test(testName = "success", description = "Testing Done")
	public void testAutomasi() {
		String search = "komputer";
		String qty = "3";
		
		homePage.home(search);
		searchPage.src();
		productPage.pd();
		detailproductPage.dpd(qty);
		chartPage.chart();

	}
}
