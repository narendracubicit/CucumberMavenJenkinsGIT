Feature: FaceBook login
 
  @1234 @login
  Scenario: FaceBook login
    Given I open browser
    And I navigate to facebook page
    Then I login to fb with user "hello@gmail.com" and password "1234"
    