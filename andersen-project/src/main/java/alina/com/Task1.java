package alina.com;

import java.util.Scanner;

public class Task1 {

    public void runTask() {
        try {
            Printer.printMessage("Task 1");
            Printer.printMessage("Enter number: ");

            Scanner in = new Scanner(System.in);
            int taskNumber = in.nextInt();

            if (taskNumber > 7) {
                Printer.printMessage("Привет");
            }
        } catch (Exception ex) {
            Printer.printMessage("Invalid input");
            runTask();
        }
    }
}