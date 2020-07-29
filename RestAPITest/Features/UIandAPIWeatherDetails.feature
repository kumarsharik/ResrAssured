Feature: Weather details test

Scenario: Get weather details from UI
		 Given user is on home page
     When  user clicks on weather link
     And user verify the weather details
     Then close the browser 

Scenario: Get weather details from API
		  Given User Set GET weather details api endpoint
     When Send PUT request
     Then verify response body 
  
 Scenario: Compare both UI and API data
		 When USer complare both UI and API weather response
      