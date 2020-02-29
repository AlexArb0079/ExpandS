package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.DashboardLogin;
import steps.DiscadorSteps;

@RunWith(SerenityRunner.class)
public class CampanaTest {
	
	@Steps
	DiscadorSteps discador;
	
	@Managed(driver = "chrome")                                                    
    WebDriver driver;
	
	@Test
	public void crearCampana() {
		//discador.navegarADashboard();
		
		
		discador.navegarADashboard();
		
		discador.loginToDashboard();
		
		discador.goToCaller();
		
		discador.createNewCampaign();
		
		discador.configureCampaign();
		
		discador.addContacts();
		
		discador.playCampana();
		
		//debug
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
