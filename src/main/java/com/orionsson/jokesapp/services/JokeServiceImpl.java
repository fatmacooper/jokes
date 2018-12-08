package com.orionsson.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service
@ImportResource("classpath:chuck-config.xml")
public class JokeServiceImpl implements JokeService {
    private  ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
