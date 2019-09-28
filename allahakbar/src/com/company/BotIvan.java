package com.company;

public class BotIvan implements Bot {
    @Override
    public String Answer(String question) {
        return question + ". Sun.";
    }

    @Override
    public String GetName() {
        return "Vanya";
    }
}
