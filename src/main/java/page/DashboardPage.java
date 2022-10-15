package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement dashBoardHeaderElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement customersElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement addCustomerElement;
	
	public void validateDashboardPage(String expectedText) {
		Assert.assertEquals(dashBoardHeaderElement.getText(), expectedText, "Page not found!!!");
	}
	
	public void clickCustomersButton() {
		customersElement.click();
	}
	
	public void clickAddCustomersButton() {
		addCustomerElement.click();
	}
	

}
