package nz.ac.auckland.se754.democucumber;

import static org.junit.Assert.assertEquals;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CalculatorStepDefinitions {

    int num1;
    int num2;

    int result;

    @Given("I entered {int} as first number")
    public void i_entered_as_first_number(Integer int1) {
       num1 = int1;
    }

    @Given("I entered {int} as second number")
    public void i_entered_as_second_number(Integer int1) {
        num2 = int1;
    }

    @When("I press add")
    public void i_press_add() {
       result = Calculator.add(num1,num2);
    }


    @When("I press multiply")
    public void i_press_multiply() {
        result = Calculator.multiply(num1, num2);
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
      assertEquals((int) int1, result);

    }



}
