package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.DenemeScenarioOutlinePage;
import utilities.Driver;

public class İkinciStepDefinitions {
    DenemeScenarioOutlinePage denemeScenarioOutlinePage=new DenemeScenarioOutlinePage();

    @Given("kullanici {string} adrese gider")
    public void kullaniciAdreseGider(String string) {
        Driver.getDriver().get(string);
    }

    @Then("kullanici register butona tiklar")
    public void kullaniciRegisterButonaTiklar() {
        denemeScenarioOutlinePage.register.click();
    }

    @And("kullanici kullanici adini {string} girer")
    public void kullaniciKullaniciAdiniGirer(String string) {
        denemeScenarioOutlinePage.username.sendKeys(string);
    }

    @And("kullanici e posta olarak {string} girer")
    public void kullaniciEPostaOlarakGirer(String string) {
        denemeScenarioOutlinePage.email.sendKeys(string);
    }

    @And("kullanici sifre olarak {string} girer")
    public void kullaniciSifreOlarakGirer(String string) {
        denemeScenarioOutlinePage.password.sendKeys(string);
    }

    @And("kullanici cheksbox isaretler")
    public void kullaniciCheksboxIsaretler() {
        denemeScenarioOutlinePage.checkBox.click();
    }

    @And("kullanici sig up butona tiklar")
    public void kullaniciSigUpButonaTiklar() {
        denemeScenarioOutlinePage.signup.click();
    }

    @And("kullanici sign out butona tiklar")
    public void kullaniciSignOutButonaTiklar() {
        denemeScenarioOutlinePage.signout.click();
    }
    @And("kullanici adres butonuna tiklar")
    public void kullaniciAdresButonunaTiklar() {
        denemeScenarioOutlinePage.adressesButon.click();
    }

    @And("kullanici add butonuna tiklar")
    public void kullaniciAddButonunaTiklar() {
        denemeScenarioOutlinePage.billingAddButon.click();
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
        Select select=new Select(denemeScenarioOutlinePage.billingCountry);
        select.selectByVisibleText("Turkey");
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
        Select select1=new Select(denemeScenarioOutlinePage.billingProvince);
        select1.selectByVisibleText("Samsun");
    }

    @And("kullanici  phone {string} girer")
    public void kullaniciPhoneGirer(String string) {
        denemeScenarioOutlinePage.billingPhone.sendKeys(string);
    }

    @And("kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        denemeScenarioOutlinePage.billingSaveButon.click();
    }

    @And("kullanici sign out buttona tiklar")
    public void kullaniciSignOutButtonaTiklar() {
        denemeScenarioOutlinePage.signout.click();
    }

    @And("kullanici log out butona tiklar")
    public void kullaniciLogOutButonaTiklar() {
        denemeScenarioOutlinePage.logout.click();
    }

    @Then("kullanici sayfayi  kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
