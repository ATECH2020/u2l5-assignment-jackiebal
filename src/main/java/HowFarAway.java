import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        //declare  variables
        Scanner in = new Scanner(System.in);
        double firstLat, secondLat, firstLong, secondLong;

        //get user input
        System.out.print("Enter the latitude of the starting location: ");
        firstLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        firstLong = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        secondLat= in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        secondLong = in.nextDouble();
        
        //make geo1 and geo2 objects
        GeoLocation geo1 = new GeoLocation(firstLat, firstLong);
        GeoLocation geo2 = new GeoLocation(secondLat, secondLong);

        //use distanceFrom method and print result
        System.out.print("The distance is " + geo1.distanceFrom(geo2) + " miles.");
    }
}