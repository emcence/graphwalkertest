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
Covers 3 scenarios

Feature: Social media
  In order to test connection with Social media
  As not registered user
  I want to be able to click on social media icons

Scenario: Open ITHS Facebook page
  Given user is on Home page
  When user clicks on Facebook icon
  Then ITHS Facebook page is opened

Scenario: Open ITHS Instagram page
  Given user is on Home page
  When user clicks on Instagram icon
  Then ITHS Instagram page is opened

Scenario: Open ITHS LinkedIn page
  Given user is on Home page
  When user clicks on LinkedIn icon
  Then ITHS LinkedIn page is opened


 */

@GraphWalker(start = "e_OpenHomePage")
public class socialMediaTest extends ExecutionContext implements socialmedia {
    public final static Path MODEL_PATH = Paths.get("com/it/socialmedia.graphml");

    @Override
    public void e_ClickInstagramIcon() {

    }

    @Override
    public void e_ClickLinkedInIcon() {

    }

    @Override
    public void v_LinkedInPageOpened() {

    }

    @Override
    public void e_GoToHomePage(){

    }

    @Override
    public void v_InstagramPageOpened() {

    }

    @Override
    public void e_OpenHomePage(){

    }

    @Override
    public void e_ClickFBIcon() {

    }

    @Override
    public void v_HomePageOpened() {

    }

    @Override
    public void v_FbPageOpened() {

    }

    @Override
    public void e_NewEdge() {

    }
    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new socialMediaTest().setNextElement(new Edge().setName("e_OpenHomePage").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute();
    }
}
