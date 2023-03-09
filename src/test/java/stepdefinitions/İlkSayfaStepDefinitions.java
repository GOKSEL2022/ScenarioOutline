package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DenemeScenarioOutlinePage;
import utilities.Driver;

public class İlkSayfaStepDefinitions {

    DenemeScenarioOutlinePage denemeScenarioOutlinePage=new DenemeScenarioOutlinePage();
    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String string) {
        Driver.getDriver().get(string);
    }

    @Then("kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        denemeScenarioOutlinePage.register.click();
    }

    @And("kullanici kullanici adi {string} girer")
    public void kullaniciKullaniciAdiGirer(String string) {
        denemeScenarioOutlinePage.username.sendKeys(string);
    }

    @And("kullanici e posta {string} girer")
    public void kullaniciEPostaGirer(String string) {
        denemeScenarioOutlinePage.email.sendKeys(string);
    }

    @And("kullanici sifre {string} girer")
    public void kullaniciSifreGirer(String string) {
        denemeScenarioOutlinePage.password.sendKeys(string);
    }

    @And("kullanici cheksbox i isaretler")
    public void kullaniciCheksboxIIsaretler() {
        denemeScenarioOutlinePage.checkBox.click();
    }

    @And("kullanici sig up butonuna tiklar")
    public void kullaniciSigUpButonunaTiklar() {
        denemeScenarioOutlinePage.signup.click();
    }

    @And("kullanici sign out butonuna tiklar")
    public void kullaniciSignOutButonunaTiklar() {
        denemeScenarioOutlinePage.signout.click();
    }

    @And("kullanici log out butonuna tiklar")
    public void kullaniciLogOutButonunaTiklar() {
        denemeScenarioOutlinePage.logout.click();
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
