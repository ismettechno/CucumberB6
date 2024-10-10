#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "is11m12CS121" shortKod as "ic112sk121"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter Negatif
    When Create a CitizenShip name as "is11m12CS121" shortKod as "ic112sk121"
    Then Already exist message should be displayed

  Scenario: Delete Citizenship
    When user delete name as "is11m12CS121"
    Then Success message should be displayed