package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	
	private ConfigFileReader configFileReader;
	private WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
	
	/*@FindBy*/
	@FindBy(xpath = "//a[@href='register.php']")
	public static WebElement register;
	@FindBy(xpath = "//img[@src='images/mast_register.gif']")
	public static WebElement registerImage;
	
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.NAME, using ="phone")
	public static WebElement phone;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement userName;
	
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	
	@FindBy(xpath = "//option[@value='TUNISIA']")
	public static WebElement TUNISIA;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement email;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how  = How.NAME, using = "submit")
	public static WebElement submit;
	
	@FindBy(xpath = "//b[contains(text(),'Note: Your user name is')]")
	public static WebElement confirmationMessage;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Create Method */
	public void goToURL() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	
	public void registerBtn() {
		WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(register));
		registerBtn.click();
	}

	public void fillFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void fillLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void fillPhone(String phoneNumber) {
		phone.sendKeys(phoneNumber);
	}
	
	public void fillUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void fillAddress(String address) {
		address1.sendKeys(address);
	}
	
	public void fillCity(String cityName) {
		city.sendKeys(cityName);
	}
	
	public void fillState(String stateName) {
		state.sendKeys(stateName);
	}
	
	public void fillPostalCode(String posCode) {
		postalCode.sendKeys(posCode);
	}

	public void selectCountry(String TUNISIA) {
		Select select = new Select(country);
        select.selectByValue(TUNISIA);
	}
	
	public void fillEmail(String mail) {
		email.sendKeys(mail)
;
	}
	
	public void fillPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void fillConfirmPassword(String confPwd) {
		confirmPassword.sendKeys(confPwd);
	}
	
	public void clickOnEnvoyerBtn() {
		submit.click();
	}
	
	public String confirmationRegisterMessage() {
		WebElement confMessage = wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
		return confMessage.getText();
	}
	
}