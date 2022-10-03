import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {

    int dimondsize;
    Scanner dimondsizeinput = new Scanner(System.in);
	System.out.print("Enter the size of dimond: ");
	dimondsize = dimondsizeinput.nextInt();

        for(int count = 0, starcount = 1; count <= dimondsize/2; count++){
            for(int count2 = 1; count2 <= dimondsize/2; count2++){
                System.out.print(" ");
            }
            for(int count3 = count+1;count3 <= starcount; count3++){
                System.out.print("* ");
            }
            System.out.println("");
            starcount = starcount + 2;
        }
    }
}