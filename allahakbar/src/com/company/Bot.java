package com.company;

public class Bot {
    public Bot(String name, String string){
        this.name_ = name;
        this.string_ = string;
    }

    void SetString(String string){
        string_ = string;
    }
    void Answer(String string){
        System.out.println(string  + string_);
    }
    String GetName(){
        return name_;
    }
    private String string_;
    private String name_;
}
