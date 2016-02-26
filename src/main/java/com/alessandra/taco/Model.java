package com.alessandra.taco;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class Model {

    private static ModelMap model;

    public ModelMap getModel() {
        return model;
    }

}
