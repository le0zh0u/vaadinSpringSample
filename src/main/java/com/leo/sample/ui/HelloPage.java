package com.leo.sample.ui;

import com.leo.sample.service.HelloWorldService;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebServlet;

/**
 * Created by zhouchunjie on 16/1/7.
 */
@Configurable(preConstruction = true)
public class HelloPage extends UI {

    @Autowired
    private HelloWorldService helloWorldService;

    @WebServlet(value = "/helloWorld", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = HelloPage.class)
    public static class Servlet extends VaadinServlet {

    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout layout = new VerticalLayout();
        layout.addComponent(new Label(helloWorldService.getHelloWorld()));
        setContent(layout);
    }
}
