@bilingAdress
Feature:biling Adres
  Scenario Outline:biling Adres

    Given kullanici "https://hubcomfy.com/" adrese gider
    Then kullanici register butona tiklar
    And kullanici kullanici adini "hatemoglu" girer
    And kullanici e posta olarak "hatemoglu52@gmail.com" girer
    And kullanici sifre olarak "123456" girer
    And kullanici cheksbox isaretler
    And kullanici sig up butona tiklar
    And kullanici sign out butona tiklar
    And kullanici adres butonuna tiklar
    And kullanici add butonuna tiklar
    And kullanici firstname "<firstname>" girer
    And kullanici lastname "<lastname>" girer
    And kullanici  companyname "<companyname>" girer
    And kullanici ülke adi girer
    And kullanici  stret adress "<stret adress>" girer
    And kullanici  apartman "<apartman>" girer
    And kullanici  postcode "<postcode>" girer
    And kullanici  TownCity "<TownCity>" girer
    And kullanici sehir adi girer
    And kullanici  phone "<phone>" girer
    And kullanici save butonuna tiklar
    And kullanici sign out buttona tiklar
    And kullanici log out butona tiklar
    Then kullanici sayfayi  kapatir


    Examples:
      | firstname | lastname | companyname | stret adress | apartman | postcode | TownCity | phone
      | goksel    | celik    | sabanci     | fatsa        | beyzade  | 555      | samsun   | 0545  |
      | ahmet     | celik    | sa          | camas        | celik    | 52430    | ordu     | 542   |
      | mehmet    | celik    | sa          | unye         | koc      | 52430    | tokat    | 530   |
      | mahmut    | celik    | sa          | terme        | al       | 52430    | samsun   | 546   |
      | sedat     | celik    | sa          | carsamba     | giden    | 52430    | ordu     | 547   |
      | mustafa   | celik    | sa          | ilkadim      | mülk     | 52430    | samsun   | 545   |
      | nuri      | celik    | sa          | atakum       | saf      | 52430    | ordu     | 549   |
      | furkan    | celik    | sa          | atakent      | sakin    | 52430    | urfa     | 536   |
      | hasan     | celik    | sa          | salipazari   | sahaf    | 52430    | tunceli  | 532   |

