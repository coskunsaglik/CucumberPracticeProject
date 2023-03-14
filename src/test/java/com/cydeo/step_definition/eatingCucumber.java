package com.cydeo.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eatingCucumber {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");
    }
    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {

        System.out.println("It is from When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }


    @Given("{string} is hungry")
    public void is_hungry(String name) {
        System.out.println("it is from string name param");
    }

    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(int int1) {
        System.out.println("he eats 3 cucumbers");
    }


}
