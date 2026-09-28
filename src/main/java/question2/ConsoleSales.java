
package question2;

public class ConsoleSales extends Consoles 
{

    public ConsoleSales(
                        String consoleType,
                        String store,
                        int totalSales)
    {

        super(consoleType, store, totalSales);
    }

    // Method that produces the sales reposrt
    public void printReport() 
    {

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("-------------------------------------");

        System.out.println(
            "CONSOLE TYPE: " + getConsoleType()
        );

        System.out.println(
            "STORE : " + getStore()
        );

        System.out.println(
            "TOTAL SALES: " + getTotalSales()
        );

        System.out.println("------------------------------------------");
    }
}