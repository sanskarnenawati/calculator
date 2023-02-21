import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);

    public int input(){
        return scan.nextInt(); //Scan user input for integer and returns it
    }

    public double numberInput(){
        System.out.println("Enter number: ");
        return scan.nextDouble(); //Scan user input for double and returns it
    }

    public double[] arrayInput(){
        System.out.println("Enter number of elements: ");
        int num = scan.nextInt(); //Scan user input for size of array
        double [] array = new double[num];
        for (int i=0;i<num;i++){
            System.out.println("Enter element: ");
            array[i]= scan.nextDouble(); //scan user input for element of array
        }
        return array; // returns the array
    }
}
