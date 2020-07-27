Feature: Etsy add favorite function

  Scenario: Add item in the Favorite

    Given Navigate to etsy website
    And Search for "teddy bear" and click on the any item
    When Add item to favorite
    Then Item should be added in the favorite page

  Scenario: Remove item in the Favorite

    Given Navigate to etsy website
    And Search for "teddy bear" and click on the any item
    When Add item to favorite
    Then Item should be added in the favorite page
    When Click on the remove button for the "teddy bear"
    Then Item should be remove from the item page

