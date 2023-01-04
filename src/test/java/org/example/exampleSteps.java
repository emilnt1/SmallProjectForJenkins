package org.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class exampleSteps {
    private final Adder adder = new Adder();
    private int result;

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        result = adder.add(arg0, arg1);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        assertEquals(arg0, result);
    }
}
