package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DenemeScenarioOutlinePage;
import utilities.Driver;

public class İkinciStepDefinitions {

    DenemeScenarioOutlinePage denemeScenarioOutlinePage=new DenemeScenarioOutlinePage();
    Faker faker=new Faker();





    @Given("kullanici {string} adrese gider")
    public void kullaniciAdreseGider(String string) {
        Driver.getDriver().get(string);
    }

    @Then("kullanici register butona tiklar")
    public void kullaniciRegisterButonaTiklar() {
        Driver.clickWithJS(denemeScenarioOutlinePage.register);
    }

    @And("kullanici kullanici adini {string} girer")
    public void kullaniciKullaniciAdiniGirer(String string) {
        denemeScenarioOutlinePage.username.sendKeys(faker.name().firstName());
    }

    @And("kullanici e posta olarak {string} girer")
    public void kullaniciEPostaOlarakGirer(String string) {
        denemeScenarioOutlinePage.email.sendKeys(faker.internet().emailAddress());
    }

    @And("kullanici sifre olarak {string} girer")
    public void kullaniciSifreOlarakGirer(String string) {
        denemeScenarioOutlinePage.password.sendKeys(faker.internet().password());
    }

    @And("kullanici cheksbox isaretler")
    public void kullaniciCheksboxIsaretler() {
        Driver.clickWithJS(denemeScenarioOutlinePage.checkBox);
    }

    @And("kullanici sig up butona tiklar")
    public void kullaniciSigUpButonaTiklar() {
       Driver.clickWithJS(denemeScenarioOutlinePage.signup);
    }

    @And("kullanici sign out butona tiklar")
    public void kullaniciSignOutButonaTiklar() {
        Driver.clickWithJS(denemeScenarioOutlinePage.signout);
    }
    @And("kullanici adres butonuna tiklar")
    public void kullaniciAdresButonunaTiklar() {

        Driver.clickWithJS(denemeScenarioOutlinePage.adressesButon);
    }

    @And("kullanici add butonuna tiklar")
    public void kullaniciAddButonunaTiklar() {

        Driver.clickWithJS(denemeScenarioOutlinePage.billingAddButon);
    }

    @And("kullanici firstname {string} girer")
    public void kullaniciFirstnameGirer(String string) {

        denemeScenarioOutlinePage.billingFirstName.sendKeys(string);
    }

    @And("kullanici lastname {string} girer")
    public void kullaniciLastnameGirer(String string) {

        denemeScenarioOutlinePage.billingLastName.sendKeys(string);
    }

    @And("kullanici  companyname {string} girer")
    public void kullaniciCompanynameGirer(String string) {

        denemeScenarioOutlinePage.billingCompany.sendKeys(string);
    }

    @And("kullanici ülke adi girer")
    public void kullaniciÜlkeAdiGirer() {

            try {
                denemeScenarioOutlinePage.bilingCountry1.click();
                denemeScenarioOutlinePage.bilingCountry2.sendKeys("Turkey",Keys.ENTER);
            } catch (Exception e) {

            }
            try {
                denemeScenarioOutlinePage.bilingCountry3.click();
                denemeScenarioOutlinePage.bilingCountry4.sendKeys("Turkey",Keys.ENTER);
            } catch (Exception e) {
            }
        }

    @And("kullanici  stret adress {string} girer")
    public void kullaniciStretAdressGirer(String string) {

        denemeScenarioOutlinePage.billingStret.sendKeys(string);
    }

    @And("kullanici  apartman {string} girer")
    public void kullaniciApartmanGirer(String string) {

        denemeScenarioOutlinePage.billingApartman.sendKeys(string);
    }

    @And("kullanici  postcode {string} girer")
    public void kullaniciPostcodeGirer(String string) {

        denemeScenarioOutlinePage.billingPostcode.sendKeys(string);
    }

    @And("kullanici  TownCity {string} girer")
    public void kullaniciTownCityGirer(String string) {
        denemeScenarioOutlinePage.billingCity.sendKeys(string);
    }

    @And("kullanici sehir adi girer")
    public void kullaniciSehirAdiGirer() {

        try {
            denemeScenarioOutlinePage.bilingCountry1.click();
            denemeScenarioOutlinePage.bilingCountry2.sendKeys("Turkey", Keys.ENTER);
        } catch (Exception e) {

        }
        try {
            denemeScenarioOutlinePage.bilingCountry3.click();
            denemeScenarioOutlinePage.bilingCountry4.sendKeys("Turkey",Keys.ENTER);
        } catch (Exception e) {
        }
    }

    @And("kullanici  phone {string} girer")
    public void kullaniciPhoneGirer(String string) {
        denemeScenarioOutlinePage.billingPhone.sendKeys(string);
    }

    @And("kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        Driver.clickWithJS(denemeScenarioOutlinePage.billingSaveButon);
    }

    @And("kullanici sign out buttona tiklar")
    public void kullaniciSignOutButtonaTiklar() {
        Driver.clickWithJS(denemeScenarioOutlinePage.signout);
    }

    @And("kullanici log out butona tiklar")
    public void kullaniciLogOutButonaTiklar() {
        Driver.clickWithJS(denemeScenarioOutlinePage.logout);
    }

    @Then("kullanici sayfayi  kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
