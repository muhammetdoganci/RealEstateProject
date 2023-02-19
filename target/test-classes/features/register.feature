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
