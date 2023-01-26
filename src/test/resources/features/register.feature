Feature: Giriş işlemleri

  Background:
    Given kullanici "url" adresine gider
    And kullanici login e tiklar
    And kullanici registere tiklar
    And kullanici bilgileri dolduru
    Then kullanici register butonuna tiklar
    And kullanici kayıt oludugunu dugrular
