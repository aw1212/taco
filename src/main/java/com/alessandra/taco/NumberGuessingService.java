package com.alessandra.taco;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class NumberGuessingService {

    private static int hiddenNumber = new Random().nextInt(3 - 1 + 1) + 1;

    public String guessNumber(int guess, ModelMap model) {

        if (guess == hiddenNumber) {
            model.addAttribute("wonNumber", "true");
        } else {
            model.addAttribute("numberError", "Try Again!");
        }

        return "leftPiggeh";
    }

}
