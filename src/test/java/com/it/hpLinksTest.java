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


Covers 3 scenario:
In order to test Home page
As not registered user
I want to be able to move throw the links on the page


Scenario: Open link Utbildningar
  Given user is on Home page
  When user clicks on link Utbildningar
  Then page Utbildningar is opened

Scenario: Open link Om Oss
  Given user is on Home page
  When user clicks on link OmOss
  Then page OmOss is opened

Scenario: Open link Nyheter
  Given user is on Home page
  When user clicks on link Nyheter
  Then page Nyheter is opened


@GraphWalker(start = "e_OpenBrowser")
public class hpLinksTest extends ExecutionContext implements hplinks{
    public final static Path MODEL_PATH = Paths.get("com/it/hplinks.graphml");

    @Override
    public void v_NyheterPageOpened(){

    }

    @Override
    public void e_ClickLinkOmOss(){

    }

    @Override
    public void v_OmOssPageOpened(){

    }

    @Override
    public void v_UtbildningarPageOpened(){

    }

    @Override
    public void e_ClickLinkUtbildningar(){

    }

    @Override
    public void e_GoToHomePage(){

    }

    @Override
    public void e_ClickLinkNyheter() {

    }

    @Override
    public void v_HomePageOpened(){

    }

    @Override
    public void e_OpenBrowser() {

    }
    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new hpLinksTest().setNextElement(new Edge().setName("e_OpenBrowser").build()),
                        MODEL_PATH,
                        new RandomPath(new EdgeCoverage(100)))
                .execute();
    }
}


 */