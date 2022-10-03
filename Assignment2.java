import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {
    int repeater = 1;
    int dimondsize;
    Scanner dimondsizeinput = new Scanner(System.in);
    System.out.print("Enter the size of dimond: ");
    dimondsize = dimondsizeinput.nextInt();
    dimondsize = dimondsize+2;


        for (int firstforloopcounter = 1; firstforloopcounter <= dimondsize; firstforloopcounter++) {
            System.out.println("");
            for (int spacecounter = count; spacecounter <= dimondsize; spacecounter++) {
            System.out.print("  ");
            }
            for (int starcounter = 1; starcounter <= 2*count-1; starcounter++) {
               System.out.print("* ");
            }
            if (i < dimondsize/2)
                repeater++;
            else
                repeater--;
        }
        System.out.println("");
    }
}
