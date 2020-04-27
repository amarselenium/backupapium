#Search Product
@loginTest
Feature: addtocartandcheckout Scenario
  
  Scenario: add product to the cart
  Given User already search the product
  When click on addto cart button
  Then Product added to the cart successfully
  Then added product matches with the selected product
  
