package alina.com;

import java.util.Scanner;

public class Task3 {

    public void runTask() {
        Printer.printMessage("Task 3");
        Printer.printMessage("Enter 'Exit' to close");

        try {
            while (true) {
                Printer.printMessage("Enter array elements with blanks like '1 2 3': ");
                Scanner in = new Scanner(System.in);

                while (in.hasNext()) {
                    String num = in.next();
                    if (num.equals("Exit")) {
                        break;
                    } else {
                        if (Integer.parseInt(num) % 3 == 0) {
                            Printer.printMessage(num);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            Printer.printMessage("Invalid input");
            runTask();
        }
    }
}
