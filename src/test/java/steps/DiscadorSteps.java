package steps;

import net.thucydides.core.annotations.Step;
import pages.CampanaInfo;
import pages.CrearCampana1;
import pages.CrearCampana2;
import pages.Dashboard;
import pages.DashboardLogin;
import pages.Discador;

public class DiscadorSteps {

	DashboardLogin dashboardLogin;
	Dashboard dashboard;
	Discador discador;
	CrearCampana1 crearCampana1;
	CrearCampana2 crearCampana2;
	CampanaInfo campanaInfo;
	
	@Step("Navegar a expand") //TODO:
	public void navegarADashboard() {
		dashboardLogin.navigateTo();
	}

	@Step("Logear")
	public void loginToDashboard() {
		dashboardLogin.login("alexis.colman", "alexis.colman");
	}
	
	@Step("Ir al discador")
	public void goToCaller() {
		dashboard.goToDiscador();
	}
	
	@Step("Crear una nueva campana")
	public void createNewCampaign() {
		discador.crearCampana();
	}
	
	@Step("Ingresar informacion de la campana")
	public void configureCampaign(){
		crearCampana1.crearCampana();
	}
	
	@Step("Ingresar contactos")
	public void addContacts(){
		crearCampana2.agregarContactosManuales();
		crearCampana2.agregarContacto("alexis", "098356565", "algo1", "algo2");
		crearCampana2.agregarContacto("fernando", "09771217", "otroAlgo1", "otroAlgo2");
		crearCampana2.finalizar();
	}
	
	@Step("Inicia campana")
	public void playCampana() {
		campanaInfo.startCampana();
	}
	
	
	//put assert here
	
	
}
