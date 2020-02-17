package ru.rohtuasad.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {
    private final static ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String retrieveJoke() {
        return quotes.getRandomQuote();
    }
}
