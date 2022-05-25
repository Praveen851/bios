import java.util.Scanner;
import java.lang.Math;
public class Geometry{
    public static void main(String[] args){        
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        double length = Math.sqrt(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1), 2) ); 
        System.out.print("The length of the line formed by given two points is:"+ length);
    }
}