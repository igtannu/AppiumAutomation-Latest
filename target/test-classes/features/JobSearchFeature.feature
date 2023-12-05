@test 
Feature: Search for job and To Apply click on call
  I want to use this template for my feature file

  Scenario Outline: Search for job and call
    Given Opened emulator and app
    When Enter <Name> and <MobileNo>
    And Click on submit button
    And Choose Options
    And Enter <Location> Station
    And click submit
    And Choose Diff Options
    And Choose more options after swipe up
    And User Enter Keyboard of <JobName> and Apply
    Then User sucessfully apply for job

    Examples: 
      | Name       | MobileNo   | Location   | JobName |
      | Tanu Gupta | 1234567890 | Nalasopara | graphic |
 