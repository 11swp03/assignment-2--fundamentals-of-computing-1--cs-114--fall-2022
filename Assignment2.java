import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
		int dimondsize;
        Scanner dimondsizeinput = new Scanner(System.in);
		System.out.print("Enter the size of dimond: ");
		dimondsize = dimondsizeinput.nextInt() - 2;
		

        int count = 1;
        for (int i = 1; i <= 2 * dimondsize - 1; i++) {
            for (int j = count; j <= dimondsize; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("* ");
            }
            if (i < dimondsize)
                count++;
            else
                count--;
            System.out.println("");
        }
    }
}
