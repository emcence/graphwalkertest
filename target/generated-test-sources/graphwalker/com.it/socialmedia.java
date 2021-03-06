// Generated by GraphWalker (http://www.graphwalker.org)
package com.it;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com.it/socialmedia.graphml")
public interface socialmedia {

    @Edge()
    void e_ClickInstagramIcon();

    @Edge()
    void e_ClickLinkedInIcon();

    @Vertex()
    void v_LinkedInPageOpened();

    @Edge()
    void e_GoToHomePage();

    @Vertex()
    void v_InstagramPageOpened();

    @Edge()
    void e_OpenHomePage();

    @Edge()
    void e_ClickFBIcon();

    @Vertex()
    void v_HomePageOpened();

    @Vertex()
    void v_FbPageOpened();

    @Edge()
    void e_NewEdge();
}
