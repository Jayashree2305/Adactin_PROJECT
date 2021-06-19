Feature: Hotel Booking In Adactin Application
@SmokeTest
Scenario Outline:
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The  "<password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|abb|567|
|ioj|098|
|JayashreeJ|1LTSKF|
@ab
Scenario:
When user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The  "<password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page
@bh
Scenario:
When user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The  "<password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

@SanityTest
Scenario:
When user Select The Location In Select Location Field
And user Select The Hotel In Select Hotel Field
And user Select The Room Type In Select Room Type Field
And user Select The Number Of Rooms In The Number Of Rooms Field
And user Select The Number Of Adults In The Adults Per Room Field
And user Select The Number of Children In The Children Per Room Field
Then user Click On The Search Button And It Navigates To The Select Hotel Page

@ui
Scenario:
When user Click On The Select Button In The Select Hotel Page
Then user Click On The Continue Button And It Navigates To The Book A Hotel Page


Scenario:
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card Number In The Credit Card Number Field
And user Select The Credit Card Type In The Credit Card Type Field
And user Select The Month In The Expiry Date Field
And user Select The Year In The Expiry Date Field
And user Enter The Cvv Number In The Cvv Field
Then user Click On The Book Now Button In The Book Now Field And It Navigates To The Booking Confirmation Page

@op
Scenario:
Then user Click On The My Itinarary Button And It Navigates To The Booked Itenarary Page


@pl
Scenario:
When user Click On The Order Id In The Order Id Checkbox Field
Then user Click On The Logout Button And It Navigates To The Logout Page












