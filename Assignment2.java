import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {
    int Repeater = 1;
    int DimondSize;
    Scanner dimondsizeinput = new Scanner(System.in);
    System.out.print("Enter the size of dimond: ");
    DimondSize = dimondsizeinput.nextInt();


        if (DimondSize%2 == 1){
            DimondSize = DimondSize+2;

            for (int FirstForLoopCounter = 1; FirstForLoopCounter <= DimondSize; FirstForLoopCounter++) {
                System.out.println("");
                for (int SpaceCounter = Repeater; SpaceCounter <= DimondSize; SpaceCounter++) {
                System.out.print("  ");
                }
                for (int StarCounter = 1; StarCounter <= 2*Repeater-1; StarCounter++) {
                System.out.print("* ");
                }
                if (FirstForLoopCounter < DimondSize/2)
                    Repeater++;
                else
                    Repeater--;
            }
            System.out.println("");
        }
        else{
            for(int EvenForLoopCounter = 0; EvenForLoopCounter <= DimondSize; EvenForLoopCounter++){
                for(int SpaceCounter = 1; SpaceCounter <= DimondSize-EvenForLoopCounter; SpaceCounter++){
                    System.out.print(" ");
                }
                for(int StarCounter = 1; StarCounter <= 2*EvenForLoopCounter-1; StarCounter++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int EvenForLoopCounter = DimondSize-1; EvenForLoopCounter >= 1; EvenForLoopCounter--){
                for(int SpaceCounter = 1; SpaceCounter <= DimondSize-EvenForLoopCounter; SpaceCounter++){
                    System.out.print(" ");
                }
                for(int StarCounter = 1; StarCounter <= 2*EvenForLoopCounter-1; StarCounter++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
