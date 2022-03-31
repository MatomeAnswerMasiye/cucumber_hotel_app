#A feature that books and deletes a booking using three browsers
Feature: Book and delete hotel

  #A background that contains the common steps across the scenarios
  Background: Book and delete hotel
    Given a user is on the login page
    When the user enters a username and password clicks login

  #A scenario for booking a hotel successfully
  @BookSuccessfully
  Scenario: Book hotel successfully
    And the user populates fields in the search page and clicks search
    And the user selects a hotel from hotel selection page and clicks continue
    And the user populates fields in the book hotel page and clicks book now
    Then an order number is generated and the booking was successful

  #A scenario for deleting a booking
  @DeleteItinerary
  Scenario: Delete itinerary successfully
    And the user navigates to the booked itinerary page by clicking on the Booked Itinerary link
    And the user enters an order number into the search box and clicks on the go button
    And the user deletes the itinerary by clicking on the checkbox and then clicking on the cancel selected button and confirm on the popup alert box
    And the user searches for the order number again
    Then The itinerary is not found
