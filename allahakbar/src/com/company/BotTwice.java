package com.company;

public class BotTwice implements Bot {

    @Override
    public String Answer(String question) {
        return question + " " + question;
    }

    @Override
    public String GetName() {
        return "Repeatbot";
    }
}
