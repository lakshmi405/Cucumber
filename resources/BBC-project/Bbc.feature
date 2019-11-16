@all
Feature:BBC
    Automating bbc site
@smoke
Scenario Outline: BBC automation
    Given I am on home page
    And I navigate to news page
    When I search for "<search>"
    Then I should see weather related results

    Examples:
    |search|
    |weather report|
   #|politics|
@regression
Scenario: BBC automation
    Given I am on home page
    And I navigate to news page
    When I search for "murari"
    Then I should see weather related results
@sanity
Scenario: BBC automation
    Given I am on home page
    And I navigate to news page
    When I search for "naresh"
    Then I should see weather related results





    #Given I'm on bbc home apge
    #When click on news link
    #Then it should open news page

    #Given I visit the site
    #When I search for weather report
    #Then I should see report
