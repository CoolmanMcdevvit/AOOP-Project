#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Register Patient

    @tag1
  Scenario: Successful Patient Registration
  
 		  Given that I want to register a patient
			And with firstname "Solvi"
      And a lastname "Palsson"
      And an address "Manalind19"
      And a phonenumber 91193366
      And a birthday 15
      And a birthmonth 10
      And a birthyear 1996
      And a tribe "shilganji"
      And alivestatus true      
      When patient is registered
      Then a unique patientID is created
      
   
   Scenario: Successful search based on patientID
        
      Given that I want to find a patient
      And I provide an ID
      And the ID is in the system
      When the search is done
      Then displays the information on the patient with that patientID
 
   Scenario: Unsuccessful search based on patientID
        
      Given that I want to find a patient
      And I provide an ID
      And the ID is not in the system
      When the search is done
      Then displays errormessage
      
   
      
      

		
		
		