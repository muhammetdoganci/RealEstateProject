@register
Feature: Giriş işlemleri


  Scenario: Giris islemleri
    Given kullanici "strongUrl" adresine gider
    And kullanici 2 saniye bekler
    And kullanici login e tiklar
    And kullanici 2 saniye bekler
    And kullanici registere tiklar
    And kullanici bilgileri doldurur
    Then kullanici register butonuna tiklar
    And kullanici kayit oludugunu dugrular

    Scenario: kiralik ev arama
      Given kullanici "strongUrl" adresine gider
      And kullanici 2 saniye bekler
      And kullanici login e tiklar
      And kullanici 2 saniye bekler
      And kullanici register butonuna tiklar
      And kullanici mail adresini ve parolayi girer
      And kullanici login butonuna tiklar
      Then kullanici kiralık aramaya tiklar
      And kullanici katagorilerden villa aramasi yapar
      And kullanici villalarin goruntulendigini dogrular
