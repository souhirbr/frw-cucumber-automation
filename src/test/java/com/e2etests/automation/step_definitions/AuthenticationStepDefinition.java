package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authentificationPage;

	public AuthenticationStepDefinition() {
		this.authentificationPage = new AuthenticationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentificationPage.goToURL();
	}

	@When("Je saisie le User name {string}")
	public void jeSaisieLeUserName(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je saisie le Password {string}")
	public void jeSaisieLePassword(String passWord) {
		authentificationPage.fillPassword(passWord);
	}

	@When("Je clique sur le bouton Submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnSubmitButton();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {

		String message = authentificationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);

	}

}
