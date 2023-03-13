package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.N11Page;
import util.DriverFactory;
import util.ElementHelper;

public class N11StepDefinitions {
    N11Page n11Page = new N11Page(DriverFactory.getDriver());


    @When("user kategorilere tiklar")
    public void userKategorilereTiklar() {
        n11Page.kategoriTiklama();
    }

    @And("user elektronik secenegine tiklar")
    public void userElektronikSecenegineTiklar() {
        n11Page.elektronikTiklama();
    }

    @And("user telefon ve aksesuarlari secer")
    public void userTelefonVeAksesuarlariSecer() {
        n11Page.telefonVeAksesuarSecimi();
    }

    @And("user cep telefonu secer")
    public void userCepTelefonuSecer() {
        n11Page.telefonSecimi();
    }

    @And("user marka secer")
    public void userMarkaSecer() {
        n11Page.markaSecimi();
    }

    @And("user filtrelemeye tiklar")
    public void userFiltrelemeyeTiklar() {
        n11Page.filtrelemeTiklama();
    }

    @And("user filtreleme yapar")
    public void userFiltrelemeYapar() {
        n11Page.filtrelemeYap();
    }

    @And("user sonuclari gostere tiklar")
    public void userSonuclariGostereTiklar() {
        n11Page.SonuclariGosterTiklama();
    }

    @And("user urunu sepete ekler")
    public void userUrunuSepeteEkler() {
        n11Page.urunSepeteEkleme();
    }

    @And("user sepetim secenegine gider")
    public void userSepetimSecenegineGider() {
        n11Page.sepeteGit();
    }

    @Then("user sepette urunun gorundugunu dogrular")
    public void userSepetteUrununGorundugunuDogrular() {
        n11Page.sepetKontrol();
    }
}
