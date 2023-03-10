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
      | AAademmmmm12     | AAademmmmm12@gmail.com  | 12345 |
      | AAmademmmmm12    | AAmademmmmm12@gmail.com | 12345 |
      | AAsademmmmm12    | AAsademmmmm12@gmail.com | 12345 |
      | AAhademmmmm12    | AAhademmmmm12@gmail.com | 12345 |
      | AAyademmmmm12    | AAyademmmmm12@gmail.com | 12345 |
      | AAtademmmmm12    | AAtademmmmm12@gmail.com | 12345 |
      | AAeademmmmm12    | AAeademmmmm12@gmail.com | 12345 |
      | AApademmmmm12    | AApademmmmm12@gmail.com | 12345 |
      | AAdademmmmm12    | AAdademmmmm12@gmail.com | 12345 |