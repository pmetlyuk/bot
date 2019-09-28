package com.company;

public class BotPasha implements Bot {
    @Override
    public String Answer(String question) {
        return question + ". Как жаль, что я учил немецкий!";
    }

    @Override
    public String GetName() {
        return "Pasha";
    }
}
