package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;



public class N11Page {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By kategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    //By kategorilerbutonu2 = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text("Kategoriler")");
    By elektronikButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Elektronik\")");
    By telefonAksesuar = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Telefon & Aksesuarları\")");
    By cepTelefonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Cep Telefonu\")");
    By markaApple = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");
    By filtreleme = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By dahiliHafizalama = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By dahiliHafizaSecimi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By uygulaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\")");
    By modelSecimi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
    By Iphone13 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Iphone 13\")");
   // @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiScrollable().text(\"Renk\").instance(0))")
    By renkSecimi = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().text(\"Renk\").instance(0))");
    //scrollTextIntoView
    //By renkSecimi = MobileBy.AndroidUIAutomator("scrollTextIntoView((new UiSelector().text(\"Renk\"))");
    By mavi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mavi\")");
    By sonuclariGosterButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By addToBasket = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
    By sepeteEkleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepetimButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By sepetKontrol = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\")");
    public N11Page(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }

    public void kategoriTiklama() {
        driver.findElement(kategorilerButonu).click();

    }

    public void elektronikTiklama() {
        driver.findElement(elektronikButonu).click();
    }

    public void telefonVeAksesuarSecimi() {
        driver.findElement(telefonAksesuar).click();
    }

    public void telefonSecimi() {
        driver.findElement(cepTelefonu).click();
    }

    public void markaSecimi() {
        driver.findElement(markaApple).click();
    }

    public void filtrelemeTiklama() {
        driver.findElement(filtreleme).click();
    }

    public void filtrelemeYap() {
        driver.findElement(dahiliHafizalama).click();
        driver.findElement(dahiliHafizaSecimi).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(modelSecimi).click();
        driver.findElement(Iphone13).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(renkSecimi).click();
        driver.findElement(mavi).click();
        driver.findElement(uygulaButonu).click();
    }

    public void SonuclariGosterTiklama() {
        driver.findElement(sonuclariGosterButonu).click();
    }

    public void urunSepeteEkleme() {
        driver.findElement(addToBasket).click();
        driver.findElement(dahiliHafizaSecimi).click();
        driver.findElement(mavi).click();
        driver.findElement(sepeteEkleButonu).click();
    }

    public void sepeteGit() {
        driver.findElement(sepetimButonu).click();
    }

    public void sepetKontrol() {
        elementHelper.checkVisible(sepetKontrol);
    }
}
