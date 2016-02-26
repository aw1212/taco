package com.alessandra.taco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TacoController {

    @Autowired
    private NumberGuessingService numberGuessingService;

    @Autowired
    private WordGuessingService wordGuessingService;

    @RequestMapping(value={"/", "/piggeh"})
    public String piggeh() {
        return "homePage";
    }

    @RequestMapping("/leftPiggeh")
    public String leftPiggeh() {
        return "leftPiggeh";
    }

    @RequestMapping(value = "/guessNumber", method = RequestMethod.POST)
    public String checkNumber(@RequestParam int number, ModelMap model) {
        return numberGuessingService.guessNumber(number, model);
    }

    @RequestMapping(value = "/flashWord", method = RequestMethod.GET)
    public String flashWord(ModelMap model) {
        return wordGuessingService.flashWord(model);
    }

    @RequestMapping(value = "/guessWord", method = RequestMethod.POST)
    public String guessWord(@RequestParam String word, ModelMap model) {
        return wordGuessingService.guessWord(word, model);
    }

    @RequestMapping("/taco")
    public String taco() {
        return "tacoPage";
    }

}
