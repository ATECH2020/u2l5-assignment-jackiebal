import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //declare and initialize variables
        Scanner in = new Scanner(System.in);
        double lumberCost = 8;
        double windowCost = 11;
        double taxRate, total;
        int boards, windows;

        //get input from user
        System.out.println("Enter the sales tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need? ");
         boards = in.nextInt();
        System.out.println("How many windows do you need? ");
        windows = in.nextInt();

        //make construct object 
        Construction construct = new Construction(lumberCost, windowCost, taxRate);

        //calculate both costs using lumberCost, windowCost, and granTotal methods
        total = construct.lumberCost(boards) + construct.windowCost(windows);
        System.out.println("Total: " + total);
        System.out.print("Grand Total: " + construct.grandTotal(total));

    }
}
