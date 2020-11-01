package com.it;


import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.model.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.test.TestBuilder;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Path;
import java.nio.file.Paths;

import static  org.junit.jupiter.api.Assertions.assertEquals;

/*
Covered 1 scenario

Scenario: Send application with valid values
  Given user is on application page
  And user selects valid education option
  And user selects gender
  And user types first name
  And user types last name
  And user types personal number
  And user types post number
  And user types postaddress
  And user types email address
  And user types telefonNumber
  When user clicks on Submit button
  Then successful message is displayed



@GraphWalker(start = "e_OpenAnsokanPage")
public class sendapplicationNew extends ExecutionContext implements sendapplication {
    public final static Path MODEL_PATH = Paths.get("com/it/sendapplication.graphml");

    @Override
    public void v_ConfirmationMessageShown() {

    }

    @Override
    public void e_ChooseGender() {

    }

    @Override
    public void e_FillUserDetails() {

    }

    @Override
    public void e_ClickSkickaBttn(){

    }

    @Override
    public void e_OpenAnsokanPage() {

    }

    @Override
    public void v_AnsokanPageOpened() {

    }

    @Override
    public void e_ChooseValidUtbildning() {

    }

    @Override
    public void v_UtbildningSelected() {

    }

    @Override
    public void v_GenderSelected(){

    }

    @Override
    public void v_UserDetailsAdded() {

    }
    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new sendapplicationNew().setNextElement(new Edge().setName("e_OpenAnsokanPage").build()),
                        MODEL_PATH,
                        new RandomPath(new ReachedVertex("v_ConfirmationMessageShown")))
                .execute();
    }
}



 */
