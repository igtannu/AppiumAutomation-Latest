@test  
Feature: Register User
  I want to use this template for my feature file

  Scenario Outline: Register with Valid Data
    Given Opened emulator and app
    When Enter <Name> and <MobileNo>
    And Click on submit button
    And Choose Options
    And Enter <Location> Station
    And click submit
    And Choose Diff Options
    And Choose Age
    And Choose more options after swipe up
    Then Verify Registered Sucessfully

    Examples: 
      | Name       | MobileNo   | Location   |
      | Tanu Gupta | 1234567890 | Nalasopara |

  Scenario Outline: Register with InValid Data
    Given Opened emulator and app
    When Enter <Name> and <MobileNo>
    And Click on submit button
    Then Error should be displayed

    Examples: 
      | Name       | MobileNo |
      | Tanu Gupta |   123450 |
