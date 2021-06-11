package alina.com;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        System.out.print("Fill task number: ");
        Scanner in = new Scanner(System.in);

        int taskNumber = in.nextInt();

        if (taskNumber == 1) {
            task1.runTask();
        } else if (taskNumber == 2) {
            task2.runTask();
        } else if (taskNumber == 3) {
            task3.runTask();
        } else {
            System.out.println("Invalid task number");
        }
    }
}

