import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
		int dimondsize;
        Scanner dimondsizeinput = new Scanner(System.in);
		System.out.print("Enter the size of dimond: ");
		dimondsize = dimondsizeinput.nextInt();



        for(int count = 1; count <= dimondsize; count++){
            for(int halfdimond = dimondsize/2, count2 = 1;count2 <= halfdimond; count2++){
                System.out.print(" ");
            }
            for(int count3 = count * 2 - 1, count4 = 1; count4 <= count3; count4++){
                System.out.print("*");
            }
            System.out.println();
        }

        // int count = 1;
        // for (int i = 1; i <= 2 * dimondsize - 1; i++) {
        //     for (int j = count; j <= dimondsize; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= count * 2 -1; k++) {
        //         System.out.print("* ");
        //     }
        //     if (i < dimondsize)
        //         count++;
        //     else
        //         count--;
        //     System.out.println("");
        // }
    }
}
