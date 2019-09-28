package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Chat {
    void start() {
        Vector<Bot> botes = new Vector<Bot>();
        botes.addElement(new BotJava());
        botes.addElement(new BotPasha());
        botes.addElement(new BotC());
        botes.addElement(new BotTwice());
        int bot_number = 0;
        System.out.println("Hallo! enter \"q\", to exit.");
        System.out.println("Enter \"next\", to swap Bot.");
        System.out.println("Enter \"Rules\", to show rules.");
        while (true) {
            System.out.print("Enter something : ");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();

            if (string.equals("q")) {
                System.out.println("Good bye!");
                break;
            }

            if (string.equals("next")) {
                bot_number = (bot_number + 1) % botes.size();
                System.out.println("Hi. I am " + botes.elementAt(bot_number).GetName());
                continue;
            }
            if (string.equals("Rules")){
                this.Rules();
                continue;
            }
            System.out.println(botes.elementAt(bot_number).GetName() + " : " + botes.elementAt(bot_number).Answer(string));
        }
    }

    void Rules() {
        System.out.println("Hallo! enter \"q\", to exit.");
        System.out.println("Enter \"next\", to swap Bot.");
        System.out.println("Enter \"Rules\", to show rules.");
    }
}
