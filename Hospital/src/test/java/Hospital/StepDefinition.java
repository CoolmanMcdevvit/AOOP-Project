package Hospital;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	Patient P;
	Search search;
	Registration reg;
	
	@Given("^that I want to register a patient$")
	public void that_I_want_to_register_a_patient() {
	     P = new Patient();
	}

	@Given("^with firstname \"([^\"]*)\"$")
	public void with_firstname(String firstname) throws Throwable {
	    P.setFirstname(firstname);
	}

	@Given("^a lastname \"([^\"]*)\"$")
	public void a_lastname(String lastname) {
	    P.setLastname(lastname);
	}

	@Given("^an address \"([^\"]*)\"$")
	public void an_address(String address){
	   P.setAddress(address);
	}

	@Given("^a phonenumber (\\d+)$")
	public void a_phonenumber(int phonenumber) {
	    P.setPhonenumber(phonenumber);
	}

	@Given("^a birthday (\\d+)$")
	public void a_birthday(int birthday) {
	    P.setBirthday(birthday);
	}

	@Given("^a birthmonth (\\d+)$")
	public void a_birthmonth(int birthmonth) {
		P.setBirthmonth(birthmonth);
	}

	@Given("^a birthyear (\\d+)$")
	public void a_birthyear(int birthyear){
		P.setBirthyear(birthyear);
	}

	@Given("^a tribe \"([^\"]*)\"$")
	public void a_tribe(String tribe) {
		P.setTribe(tribe);
	}

	@Given("^alivestatus (true|false)$")
	public void alivestatus_true(boolean isAlive) {
		P.setAlivestatus(isAlive);
	}

	@When("^patient is registered$")
	public void patient_is_registered() {
	  reg.registerPatient(P);;
	}

	@Then("^a unique patientID is created$")
	public void a_unique_patientID_is_created()  {
	    assertEquals(P.getPatientID(), 1);
	}
	

	@Given("^that I want to find a patient$")
	public void that_I_want_to_find_a_patient() {
	    search = new Search();
	}
	
	@Given("^I provide an ID$")
	public void i_provide_an_ID() {
	    
	}
	
	@Given("^the ID is in the system$")
	public void the_ID_is_in_the_system() {
		assertEquals(search.validpID, true);
	}
	
	
	@When("^the search is done$")
	public void the_search_is_done(int ID) {
		search.SearchpID(ID);
	}
	
	@Then("^displays the information on the patient with that patientID$")
	public void displays_the_information_on_the_patient_with_that_patientID() throws Throwable {
	    
	}
	
	@Given("^the ID is not in the system$")
	public void the_ID_is_not_in_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^displays errormessage$")
	public void displays_errormessage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	
}
