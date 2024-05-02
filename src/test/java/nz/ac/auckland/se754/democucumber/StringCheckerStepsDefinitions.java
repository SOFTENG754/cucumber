package nz.ac.auckland.se754.democucumber;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringCheckerStepsDefinitions {

  String sentence;
  boolean result;

  @Given("I entered sentence {string}")
  public void i_entered_sentence(String string) {
    sentence = string;
  }

  @When("I check if is a Palindrome")
  public void i_check_if_is_a_palindrome() {
    result = new Palindrome().check(sentence);
  }

  @Then("the output should be {string}")
  public void the_output_should_be(String string) {
    assertEquals(string, String.valueOf(result));
  }


}
