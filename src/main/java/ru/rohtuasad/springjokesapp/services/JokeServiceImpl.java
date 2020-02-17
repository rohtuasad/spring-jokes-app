package ru.rohtuasad.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final static ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String retrieveJoke() {
        return quotes.getRandomQuote();
    }
}
