package io.cucumber.skeleton;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	Belly belly = new Belly();
	
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly.setVitamins(Integer.toString(cukes));
        assertEquals(belly.getVitamins(), Integer.toString(cukes));
    }
    
    @When("I wait {int} hour")
    public void i_wait_hour(int int1) {
    	 belly.setMinerals(Integer.toString(int1));
         assertEquals(belly.getMinerals(), Integer.toString(int1));
    }
    
    @Then("my belly should growl")
    public void my_belly_should_growl() {
    	assertEquals(1,1);
    	//assertNotEquals(1,1);
    }
}
