import java.awt.Rectangle;
import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        int iwidth;
        int iheight;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: "); 
        iwidth = input.nextInt();
        System.out.print("Enter height: "); 
        iheight = input.nextInt();
        Rectangle box1 = new Rectangle(10, 10, iwidth, iheight);
        System.out.println("box1: " + box1);
    }

}