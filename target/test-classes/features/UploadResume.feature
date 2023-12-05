@test
Feature: Upload Resume
  I want to use this template for my feature file

  Scenario Outline: Upload Resume after login
    Given Opened emulator and app
    When Enter <Name> and <MobileNo>
    And Click on submit button
    And Choose Options
    And Enter <Location> Station
    And click submit
    And Choose Diff Options
    And Choose more options after swipe up
    And Click on uploadResume Ui
    Then Nodata is present should be shown

    Examples: 
      | Name       | MobileNo   | Location   |
      | Tanu Gupta | 1234567890 | Nalasopara |
