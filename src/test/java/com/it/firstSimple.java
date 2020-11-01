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

@GraphWalker(start = "e_OpenHomePage")
public class firstSimple  extends ExecutionContext implements firsttest {
    public final static Path MODEL_PATH = Paths.get("com/it/sendApplication.graphml");

    @Override
    public void e_ClickLinkOmOss() {

    }

    @Override
    public void v_OmOssPageOpened() {

    }
    @Override
    public void e_OpenHomePage() {

    }

    @Override
    public void v_HomePageOpened() {

    }

    @Override
    public void e_NewEdge() {

    }
    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new firstSimple().setNextElement(new Edge().setName("e_OpenHomePage").build()),
                        MODEL_PATH,
                        new RandomPath(new ReachedVertex("v_OmOssPageOpened")))
                .execute();
    }
}
