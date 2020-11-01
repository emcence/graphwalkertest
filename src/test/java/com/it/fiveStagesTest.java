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
Covered 7+ scenarios:

Feature: Stage messages
  In order to test 5 stages on Application page
  As not registered user
  I want to see appropriate text when i click on the stage number


  Scenario: Stage 1
    Given user is on application page
    When user clicks on stage 1
    Then text for stage 1 is shown

  Scenario: Stage 2
    Given user is on application page
    When user clicks on stage 2
    Then text for stage 2 is shown

  Scenario: Stage 3
    Given user is on application page
    When user clicks on stage 3
    Then text for stage 3 is shown

  Scenario: Stage 4
    Given user is on application page
    When user clicks on stage 4
    Then text for stage 4 is shown

  Scenario: Stage 5
    Given user is on application page
    When user clicks on stage 5
    Then text for stage 5 is shown

In the model all combinations from this scenario are shown
  Scenario: Stage 5 and return to stage 4
    Given user is on application page
    And user clicks on stage 5
    And user clicks on stage 4
    Then text for stage 4 is shown

  Scenario: Correct link is opened from stage 5
    Given user is on application page
    When user clicks on stage 5
    And user clicks on apply here button
    Then kurskatalog page is opened

  Scenario: All stages and shown link
    Given user is on application page
    When user clicks on stage 1
    And user clicks on stage 2
    And user clicks on stage 3
    And user clicks on stage 4
    And user clicks on stage 5
    And user clicks on apply here button
    Then kurskatalog page is opened

 */

@GraphWalker(start = "e_OpenBrowser")
public class fiveStagesTest extends ExecutionContext implements fiveStagesAndKatalog{
    public final static Path MODEL_PATH = Paths.get("com/it/fiveStagesAndKatalog.graphml");

    @Override
    public void v_KursstartInfoShown() {

    }

    @Override
    public void v_BehorighetInfoShown() {

    }

    @Override
    public void e_ClickCircle1(){

    }

    @Override
    public void e_ClickCircle3() {

    }

    @Override
    public void e_OpenAnsokanPage(){

    }

    @Override
    public void e_ClickCircle2() {

    }

    @Override
    public void e_ClickCircle5(){

    }

    @Override
    public void e_ClickCircle4() {

    }

    @Override
    public void e_OpenBrowser() {

    }

    @Override
    public void v_AnsokaInfoShown(){

    }

    @Override
    public void v_AntagningInfoShown(){

    }

    @Override
    public void v_KursKatalogPageOpened() {

    }

    @Override
    public void v_AnsokanPageOpened() {

    }

    @Override
    public void v_AntagningsprovInfoShown(){

    }

    @Override
    public void e_ClickAnsokHarButtn(){

    }
    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new socialMediaTest().setNextElement(new Edge().setName("e_OpenBrowser").build()),
                        MODEL_PATH,
                        new RandomPath(new ReachedVertex("v_KursKatalogPageOpened")))
                .execute();
        //stop condition here need to be random(edge_coverage(100) || reached_vertex(v_KursKatalogPageOpened))
        //but i have problem with the || operator
    }
}
