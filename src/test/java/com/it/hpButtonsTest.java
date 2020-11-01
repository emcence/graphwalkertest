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
Covers 3 scenario

Feature: Buttons on Home page
  In order to test Home page
  As not registered user
  I want to be able to click on the button on the page

Scenario: Verify that button YH-Utbildningar opens correct page
  Given user is on Home page
  When user clicks on button YH-Utbildningar
  Then page YH-Utbildningar is opened

Scenario: Verify that button Distansutbildningar opens correct page
  Given user is on Home page
  When user clicks on button DistansUtbildningar
  Then page DistansUtbildningar is opened

Scenario: Verify that button Alla Utbildningar opens correct page
  Given user is on Home page
  When user clicks on button Alla Utbildninga
  Then page Alla Utbildninga is opened

 */

@GraphWalker(start = "e_OpenBrowser")
public class hpButtonsTest extends ExecutionContext implements hpButtons{
    public final static Path MODEL_PATH = Paths.get("com/it/hpButtons.graphml");

    @Override
    public void e_ClickBttnAllaUtbildningar(){

    }

    @Override
    public void e_ClickBttnYhUtbildningar(){

    }

    @Override
    public void e_GoToHomePage() {

    }

    @Override
    public void v_AllaUtbildningarOpened(){

    }

    @Override
    public void e_ClickBttnDistansUtbildningar(){

    }

    @Override
    public void v_YhUtbildningarOpened(){

    }

    @Override
    public void v_DistansUtbildningarOpened(){

    }

    @Override
    public void v_HomePageOpened() {

    }

    @Override
    public void e_NewEdge(){

    }

    @Override
    public void e_OpenBrowser(){

    }
    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new hpButtonsTest().setNextElement(new Edge().setName("e_OpenBrowser").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute();
    }
}
