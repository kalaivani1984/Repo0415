#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature:  Chase Home Mortgage Search Test Feature
Scenario: Home Loan Search Scenario
Given user is already on  chase Home Page
When title of Home Page is Chase Bank
Then user clicks on Home Loans Icon
When title of Home Page is Home Lending
Then user clicks on link estimate your rate and payment
 

Scenario: Mortgage Calculator search Scenario
Given Window focus switched to new window
And user is already on Mortgage Calculator
When title of Home Page is Mortgage Calculator
Then  get header type loan
And select home purchase option from type of loan dropdown
And enter the home price in home price textbox
And enter down payment in down payment textbox
And enter zip code in property zip code textbox
And select Excellent (740 and above) from credit score dropdown
And select low interest from choosing loan dropbox
Then click on advanced text
And  select single family from type of property dropdown
And select primary residence from plan to use the home dropdown
And click on I am us citizen redio button
And click on get my options button
Then Verify the user get result of the mortgage calculation of the home loan
Then close the browser

   