@n11
Feature: n11 Mobil Uygulamasi
  Scenario: n11 Mobil Uygulamasiyla Telefon Alma Otomasyonu
    When user kategorilere tiklar
    And user elektronik secenegine tiklar
    And user telefon ve aksesuarlari secer
    And user cep telefonu secer
    And user marka secer
    And user filtrelemeye tiklar
    And user filtreleme yapar
    And user sonuclari gostere tiklar
    And user urunu sepete ekler
    And user sepetim secenegine gider
    Then user sepette urunun gorundugunu dogrular