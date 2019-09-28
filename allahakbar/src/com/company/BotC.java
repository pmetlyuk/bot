package com.company;

public class BotC implements Bot {
    @Override
    public String Answer(String question) {
        return question + "IMXO but c++ is better";
    }

    @Override
    public String GetName() {
        return "C++";
    }
}
