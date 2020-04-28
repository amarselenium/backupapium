
#Login to Amazon
@loginTest
Feature: Login Scenario
  
  Scenario: change screen resolution and screen rotation
  Given User login to Amazon app
  When rotate the screen
  When reolution changed
  Then screen rotated and resolution changed
  