import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
		int dimondsize;
        Scanner dimondsizeinput = new Scanner(System.in);
		System.out.print("Enter the size of dimond: ");
		dimondsize = dimondsizeinput.nextInt();
		

        for(int count = 1;count > - dimondsize ; count ++){
            for(int j = 0;j < count; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j >= count; j++){
                System.out.print(" ");
            }
            System.out.println("*");
		}
    }
}
