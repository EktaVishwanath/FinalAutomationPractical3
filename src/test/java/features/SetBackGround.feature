@SetBackGroundFeature @Regression
Feature: Set Background Fuctionality Validation
  
  Background:
  Given User is on techfios test page
  
  @Scenario1
  Scenario: User should be able to set Sky Blue Background; 
    When Set skyblue background button exists
    When  I click on skyblue background button
    Then The background color will change to sky blue
    
  @Scenario2
  Scenario: User should be able to set white Background; 
  #	Given User is on techfios test page
		Given Set white background button exists 
		When  I click on white background button
		Then the background color will change to white     