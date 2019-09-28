package com.company;

public class BotJava implements Bot {
    @Override
    public String Answer(String question) {
        if (update_answer){
            update_answer = true;
            return question + ". Это конечно хорошо, но лучше возьми жаву";
        } else {
            update_answer = false;
            return question + ". Это конечно хорошо, но всё-таки возьми жаву";
        }
    }

    @Override
    public String GetName() {
        return "Java";
    }

    boolean update_answer = false;
}
