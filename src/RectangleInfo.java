import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        String trash = "";

        double length = 0;
        double width = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your rectangle in cm: ");
        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for the length of your rectangle " +trash);
        }
        System.out.print("Enter the width of your rectangle in cm: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for the width of your rectangle " +trash);
        }

        var diagonal = (Math.sqrt (length*length + width*width));

        System.out.println("The area of your rectangle is " +(length *width + " cm"));
        System.out.println("The perimeter of your rectangle is " + (2 * (length * width)) + " cm");
        System.out.println("The length of the diagonal of the rectangle is " +diagonal);
    }
}