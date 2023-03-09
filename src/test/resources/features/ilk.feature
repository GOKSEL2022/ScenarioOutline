@ScenarioOutline
Feature:ilk sayfa
  Scenario Outline:ilk sayfa

    Given kullanici "https://hubcomfy.com/" adresine gider
    Then kullanici register butonuna tiklar
    And kullanici kullanici adi "<kullanici adi>" girer
    And kullanici e posta "<e posta>" girer
    And kullanici sifre "<sifre>" girer
    And kullanici cheksbox i isaretler
    And kullanici sig up butonuna tiklar
    And kullanici sign out butonuna tiklar
    And kullanici log out butonuna tiklar
    Then kullanici sayfayi kapatir
    Examples:
      | kullanici adi | e posta              | sifre |
      | ademmmmm12     | ademmmmm12@gmail.com  | 12345 |
      | mademmmmm12    | mademmmmm12@gmail.com | 12345 |
      | sademmmmm12    | sademmmmm12@gmail.com | 12345 |
      | hademmmmm12    | hademmmmm12@gmail.com | 12345 |
      | yademmmmm12    | yademmmmm12@gmail.com | 12345 |
      | tademmmmm12    | tademmmmm12@gmail.com | 12345 |
      | eademmmmm12    | eademmmmm12@gmail.com | 12345 |
      | pademmmmm12    | pademmmmm12@gmail.com | 12345 |
      | dademmmmm12    | dademmmmm12@gmail.com | 12345 |