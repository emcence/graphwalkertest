// Generated by GraphWalker (http://www.graphwalker.org)
package com.it;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com.it/hplinks.graphml")
public interface hplinks {

    @Vertex()
    void v_NyheterPageOpened();

    @Edge()
    void e_ClickLinkOmOss();

    @Vertex()
    void v_OmOssPageOpened();

    @Vertex()
    void v_UtbildningarPageOpened();

    @Edge()
    void e_ClickLinkUtbildningar();

    @Edge()
    void e_GoToHomePage();

    @Edge()
    void e_ClickLinkNyheter();

    @Vertex()
    void v_HomePageOpened();

    @Edge()
    void e_OpenBrowser();
}
