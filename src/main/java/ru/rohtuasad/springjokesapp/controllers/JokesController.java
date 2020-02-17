package ru.rohtuasad.springjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rohtuasad.springjokesapp.services.JokeService;

@Controller
public class JokesController {
    public static final String JOKE_ATTRIBUTE = "joke";
    public static final String VIEW_NAME = "chucknorris";

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/", ""})
    public String getAuthors(Model model) {
        model.addAttribute(JOKE_ATTRIBUTE, jokeService.retrieveJoke());
        return VIEW_NAME;
    }
}
