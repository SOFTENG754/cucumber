package nz.ac.auckland.se754.democucumber;

import static org.junit.Assert.assertEquals;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringCheckerStepsDefinitions {

boolean result;
String input = "";
    @Given("I entered sentence {string}")
    public void i_entered_sentence(String string) {
        input = string;
    }

    @When("I check if is a Palindrome")
    public void i_check_if_is_a_palindrome() {
        result = new Palindrome().check(input);
    }


    @Then("the output should be {string}")
    public void the_output_should_be(String string) {
        assertEquals(Boolean.valueOf(string),result);
    }




}
