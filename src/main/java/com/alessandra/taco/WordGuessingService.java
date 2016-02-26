package com.alessandra.taco;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class WordGuessingService {

    private static final String HIDDEN_WORD = "POTATO";

    public String flashWord(ModelMap model) {
        model.addAttribute("flashedWord", HIDDEN_WORD);
        model.addAttribute("wonNumber", "true");
        return "leftPiggeh";
    }

    public String guessWord(String word, ModelMap model) {

        if (word.equals(HIDDEN_WORD)) {
            model.addAttribute("wonWord", "true");
            model.addAttribute("wonNumber", "true");
        } else {
            model.addAttribute("errorMessage", "Wrong word");
            model.addAttribute("wonNumber", "true");
        }

        return "leftPiggeh";
    }

}
