import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {
    int Repeater = 1;
    int DimondSize;
    Scanner dimondsizeinput = new Scanner(System.in);
    System.out.print("Enter the size of dimond: ");
    DimondSize = dimondsizeinput.nextInt();
    DimondSize = DimondSize+2;

        if (DimondSize%2 == 1){
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

        }
    }
}
