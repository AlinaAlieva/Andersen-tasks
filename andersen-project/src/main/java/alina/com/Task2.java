package alina.com;

import java.util.Scanner;

public class Task2 {

    public void runTask() {
        Printer.printMessage("Task 2");
        Printer.printMessage("Enter 'Exit' to close");

        try {
            while (true) {
                Printer.printMessage("Enter name: ");

                Scanner in = new Scanner(System.in);
                String word = in.next();

                if (word.equals("Вячеслав")) {
                    Printer.printMessage("Привет, Вячеслав");
                } else if (word.equals("Exit")) {
                    break;
                } else {
                    Printer.printMessage("Нет такого имени");
                }
            }
        } catch (Exception ex) {
            Printer.printMessage("Invalid input");
            runTask();
        }
    }
}
