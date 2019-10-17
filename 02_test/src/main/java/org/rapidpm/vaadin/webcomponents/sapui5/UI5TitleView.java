package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TitleView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(NAV)
public class UI5TitleView extends Composite<Div> {
  public static final String NAV = "UI5TitleView";

  public UI5TitleView() {

    getContent().add(new UI5Title(UI5TitleLevel.H1, "Title level 1"),
        new UI5Title(UI5TitleLevel.H2, "Title level 2"),
        new UI5Title(UI5TitleLevel.H3, "Title level 3"),
        new UI5Title(UI5TitleLevel.H4, "Title level 4"),
        new UI5Title(UI5TitleLevel.H5, "Title level 5"),
        new UI5Title(UI5TitleLevel.H6, "Title level 6"));
  }
}
