package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DenemeScenarioOutlinePage {
    public DenemeScenarioOutlinePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[.='Register'])[2]") public WebElement register;
    @FindBy(id = "reg_username") public WebElement username;
    @FindBy(id = "reg_email") public WebElement email;
    @FindBy(id = "reg_password") public WebElement password;
    @FindBy(id = "register-policy") public WebElement checkBox;
    @FindBy(name = "register") public WebElement signup;

    @FindBy(xpath = "(//*[.='Addresses'])[1]") public WebElement adressesButon;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingAddButon;
    @FindBy(xpath = "//*[@id='billing_first_name']") public WebElement billingFirstName;
    @FindBy(xpath = "//*[@id='billing_last_name']") public WebElement billingLastName;
    @FindBy(xpath = "//*[@id='billing_company']") public WebElement billingCompany;
    @FindBy(xpath = "//*[@id='select2-billing_country-container']") public WebElement billingCountry;
    @FindBy(xpath = "//*[@id='billing_address_1']") public WebElement billingStret;
    @FindBy(xpath = "//*[@id='billing_address_2']") public WebElement billingApartman;
    @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement billingPostcode;
    @FindBy(xpath = "//*[@id='billing_city']") public WebElement billingCity;
    @FindBy(xpath = "//*[@id='select2-billing_state-container']") public WebElement billingProvince;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement billingPhone;
    @FindBy(xpath = "//*[@name='save_address']") public WebElement billingSaveButon;



    @FindBy(xpath = "(//*[.='Sign Out'])[3]") public WebElement signout;
    @FindBy(xpath = "//*[.='Log out']") public WebElement logout;
}
