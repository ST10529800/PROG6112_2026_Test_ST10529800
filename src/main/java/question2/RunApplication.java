package question2;

import java.util.Scanner;

/**
 * Captures the values, creates the ConsoleSales object and prints the report.
 */
public class RunApplication {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a console  type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();
        String consoleType;

        switch (choice)
        {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "NINTENDO SWITCH";
                break;
            default:
                consoleType = "UNKNOWN CONSOLE";
                break;
        }

        System.out.print("Enter the store : ");
        String store = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(
                                                consoleType,
                                                store,
                                                totalSales
                                               );

        ConsoleSales salesReport =
        new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

// Produce the console sales report
salesReport.printReport();
    }
}
