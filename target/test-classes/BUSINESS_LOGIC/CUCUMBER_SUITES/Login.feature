#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
@Login
Feature: Login Feature

  Background: user is successfully logged in
  When user opens the "chrome" browser with "src\\test\\resources\\DRIVERS\\chromedriver.exe"
  And user enters the url "http://localhost:90/finsys"
  
  @SmokeTest @EndToEnd
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top

 
  