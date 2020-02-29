package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.pages.PageObject;

public class CampanaInfo extends PageObject {
	
	WebDriverWait wait;
	
	private By start;
	
	public CampanaInfo(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 10);
		
		
		start = By.id("main_moduleContent_current_view_active_module_status_campaign");
	
	}
	
	public void startCampana() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(start));
		getDriver().findElement(start).click();
	}
	
	public void pauseCampana() {
		WebElement boton = wait.until(ExpectedConditions.visibilityOfElementLocated(start));
		if (boton.getAttribute("src").equals("http://canalesdigitales.expand/frontEnd/assets/dialer/images/Play.png")) {
			getDriver().findElement(start).click();
		}
		

		
	}

}
