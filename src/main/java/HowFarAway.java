import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double firstLat, secondLat, firstLong, secondLong;

        System.out.print("Enter the latitude of the starting location: ");
        firstLat = in.nextDouble();
       
        System.out.print("Enter the longitude of the starting location: ");
        firstLong = in.nextDouble();
 
        System.out.print("Enter the latitude of the ending location: ");
        secondLat= in.nextDouble();

        System.out.print("Enter the longitude of the ending location: ");
        secondLong = in.nextDouble();
        
        GeoLocation geo1 = new GeoLocation(firstLat, firstLong);
        GeoLocation geo2 = new GeoLocation(secondLat, secondLong);

        System.out.print("The distance is " + geo1.distanceFrom(geo2) + " miles.");
    }
}