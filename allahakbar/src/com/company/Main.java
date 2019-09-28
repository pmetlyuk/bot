package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args){
        Vector<Bot> botes = new Vector<Bot>();
        botes.addElement(new Bot("Pasha",", Справедливо."));
        botes.addElement(new Bot("Ваня",", Солнышко."));
        botes.addElement(new Bot("Жаба",", Это конечно хорошо, но лучше возьми жаву."));
        botes.addElement(new Bot("Влад",", но я не выложу домашку по матану."));
        int bot_number = 0;
        System.out.println("Привет. Введите \"q\", если хотите выйти.");
        System.out.println("Введите \"next\", если хотите сменить бота.");
        System.out.println("Введите \"add_bot\", если хотите добавить бота.");
        while (true) {
            System.out.print("Enter something : ");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();

            if (string.equals("q")){
                System.out.println("bye");
                System.exit(0);
            }
            if (string.equals("next")){
                bot_number = (bot_number + 1) % botes.size();
                System.out.println("Hi. I am " +botes.elementAt(bot_number).GetName());
            } else if (string.equals("add_bot")) {
                System.out.println("Введите имя бота");
                String name = scanner.nextLine();
                System.out.println("Введите фичу бота");
                String feature = scanner.nextLine();
                botes.addElement(new Bot(name, feature));
            }
            else {
                botes.elementAt(bot_number).Answer(string);
            }
        }
    }
}