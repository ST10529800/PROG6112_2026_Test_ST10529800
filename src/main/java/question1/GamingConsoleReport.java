package question1;

/**
 * Question 1: Produces the Number 1 Electronics gaming-console report.
 */
public class GamingConsoleReport {

    public static void main(String[] args) {

        // One-dimensional array containing the city names.
        String[] cities = 
        {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Two-dimensional array forPS5, Xbox and Switch sales.
        int[][] sales = 
        {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Stores one total for each city.
        int[] total = new int[cities.length];

        System.out.println("***********************************************");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("***********************************************");
        System.out.println("CITY\t\tPS5\tXBOX\tSWITCH");

        //  report and calculate the totals.
        for (int row = 0; row < sales.length; row++)
        {
            System.out.print(cities[row] + "\t");

            for (int column = 0; column < sales[row].length; column++) 
            {
                System.out.print (sales[row][column] + "\t");
                total[row] = total[row] + sales[row][column];
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < cities.length; i++)
        {
            System.out.println(cities[i] + ": " + total[i]);
        }

        // Determine the city with the greatest total sales.
        int highest = total[0];
        int highestIndex = 0;

        for (int i = 1; i < total.length; i++) 
        {
            if (total[i] > highest) 
            {
                highest = total[i];
                highestIndex = i;
            }
        }

        System.out.println("-----------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
    }
}
