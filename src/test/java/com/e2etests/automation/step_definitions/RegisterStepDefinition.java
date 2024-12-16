package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	private RegisterPage registerPage;
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("Je me connecte à l application Mercury")
	public void jeMeConnectÀLApplicationMercury() {
	    registerPage.goToURL();
	}
	
	@When("Je clique sur le bouton REGISTER")
	public void jeCliqueSurLeBoutonREGISTER() {
	    registerPage.registerBtn();
	}
	
	@Then("Je me redirige vers le fomulaire d enregistrement {string}")
	public void jeMeRedirigeVersLeFomulaireDEnregistrement(String text) {
	   String srcImageText = registerPage.registerImage.getAttribute("src");
	   Assert.assertEquals(srcImageText, text);
	}
	
	@Then("Je saisie le First Name {string}")
	public void jeSaisieLeFirstName(String fName) {
	    registerPage.fillFirstName(fName);
	}
	
	@Then("Je saisie le Last Name {string}")
	public void jeSaisieLeLastName(String lName) {
	    registerPage.fillLastName(lName);
	}
	
	@Then("Je saisie le Phone {string}")
	public void jeSaisieLePhone(String phone) {
	    registerPage.fillPhone(phone)
;
	}
	
	@Then("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
	    registerPage.fillUserName(email)
;
	}
	
	@Then("Je saisie l adresse {string}")
	public void jeSaisieLAdresse(String adress) {
	    registerPage.fillAddress(adress);
	}
	
	@Then("Je saisie City {string}")
	public void jeSaisieCity(String city) {
	    registerPage.fillCity(city);
	}
	@Then("Je saisie State\\/Province {string}")
	public void jeSaisieStateProvince(String state) {
	    registerPage.fillState(state);
	}
	
	@Then("Je saisie Postal Code {string}")
	public void jeSaisiePostalCode(String pCode) {
	   registerPage.fillPostalCode(pCode);
	}
	
	@Then("Je selectionne Country {string}")
	public void jeSelectionneCountry(String country) {
	    registerPage.selectCountry(country);
	}
	
	@Then("Je saisie User Name {string}")
	public void jeSaisieUserName(String userName) {
	   registerPage.fillEmail(userName);
	}
	
	@Then("Je saisie Password {string}")
	public void jeSaisiePassword(String password) {
	    registerPage.fillPassword(password);
	}
	
	@Then("Je confirme Password {string}")
	public void jeConfirmePassword(String confPwd) {
	    registerPage.fillConfirmPassword(confPwd);
	}
	
	@Then("Je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
	    registerPage.clickOnEnvoyerBtn();
	}
	
	@Then("Je me redirige vers la page de confirmation {string}")
	public void jeMeRedirigeVersLaPageDeConfirmation(String text) {
		String ConfRegisterMsg = registerPage.confirmationRegisterMessage();
		Assert.assertTrue(ConfRegisterMsg.contains(text));
	}
	
}	