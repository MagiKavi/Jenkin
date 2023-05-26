Feature: Test E-Commerce Website
  
Scenario: Product Search

Given User User Launch the "chrome" Browser
And User Navigate the Url "https://www.flipkart.com/"
And User Type "ipad" in the Search box
And User Will Click One Of Them In Suggestions Lists Are Displayed
And User Filter All Result By The Online Only Filter
And User Select One Of The Results
Then User Checkout The Order
And User Place The Order
And User Enter Random Email"magesh.nomercy@gmail.com" and Phone Number	