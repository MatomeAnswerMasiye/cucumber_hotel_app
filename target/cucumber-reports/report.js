$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#A feature that books and deletes a booking using three browsers"
    }
  ],
  "line": 2,
  "name": "Book and delete hotel",
  "description": "",
  "id": "book-and-delete-hotel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7435768100,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#A background that contains the common steps across the scenarios"
    }
  ],
  "line": 5,
  "name": "Book and delete hotel",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user enters a username and password clicks login",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.a_user_is_on_the_login_page()"
});
formatter.result({
  "duration": 68896200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_enters_a_username_and_password_clicks_login()"
});
formatter.result({
  "duration": 5259226300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#A scenario for booking a hotel successfully"
    }
  ],
  "line": 11,
  "name": "Book hotel successfully",
  "description": "",
  "id": "book-and-delete-hotel;book-hotel-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@BookSuccessfully"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "the user populates fields in the search page and clicks search",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user selects a hotel from hotel selection page and clicks continue",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user populates fields in the book hotel page and clicks book now",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "an order number is generated and the booking was successful",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.the_user_populates_fields_in_the_search_page_and_clicks_search()"
});
formatter.result({
  "duration": 2087588600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_selects_a_hotel_from_hotel_selection_page_and_clicks_continue()"
});
formatter.result({
  "duration": 1226621500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_populates_fields_in_the_book_hotel_page_and_clicks_book_now()"
});
formatter.result({
  "duration": 657656500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.an_order_number_is_generated_and_the_booking_was_successful()"
});
formatter.result({
  "duration": 6217827500,
  "status": "passed"
});
formatter.after({
  "duration": 9304732800,
  "status": "passed"
});
formatter.before({
  "duration": 4248556500,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#A background that contains the common steps across the scenarios"
    }
  ],
  "line": 5,
  "name": "Book and delete hotel",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user enters a username and password clicks login",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.a_user_is_on_the_login_page()"
});
formatter.result({
  "duration": 46200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_enters_a_username_and_password_clicks_login()"
});
formatter.result({
  "duration": 4426820400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#A scenario for deleting a booking"
    }
  ],
  "line": 19,
  "name": "Delete itinerary successfully",
  "description": "",
  "id": "book-and-delete-hotel;delete-itinerary-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@DeleteItinerary"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the user navigates to the booked itinerary page by clicking on the Booked Itinerary link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user enters an order number into the search box and clicks on the go button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user deletes the itinerary by clicking on the checkbox and then clicking on the cancel selected button and confirm on the popup alert box",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the user searches for the order number again",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The itinerary is not found",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.the_user_navigates_to_the_booked_itinerary_page_by_clicking_on_the_Booked_Itinerary_link()"
});
formatter.result({
  "duration": 2482601000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_enters_an_order_number_into_the_search_box_and_clicks_on_the_go_button()"
});
formatter.result({
  "duration": 1650209300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_deletes_the_itinerary_by_clicking_on_the_checkbox_and_then_clicking_on_the_cancel_selected_button_and_confirm_on_the_popup_alert_box()"
});
formatter.result({
  "duration": 3131235100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_user_searches_for_the_order_number_again()"
});
formatter.result({
  "duration": 5016083500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.the_itinerary_is_not_found()"
});
formatter.result({
  "duration": 20370500,
  "status": "passed"
});
formatter.after({
  "duration": 9332190900,
  "status": "passed"
});
});