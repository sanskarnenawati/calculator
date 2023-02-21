public class Main {
    public static void main(String[] args) {

        /*
        * Name: Sanskar Nenawati
        * PRN: 21070126077
        * Batch: AIML B1
        * */

        UserInput userInput= new UserInput();
        Calculator calculator = new Calculator();

        boolean loop=true;
        while (loop){
            System.out.println("Select an option: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sum of array");
            System.out.println("6. Variance of array");
            System.out.println("7. Standard deviation of array");
            System.out.println("0. Exit");
            int choice = userInput.input();
            switch (choice){
                case 1:
                    double a = userInput.numberInput();
                    double b = userInput.numberInput();
                    System.out.println("Sum of the numbers: " + calculator.addition(a,b));
                    break;
                case 2:
                    a= userInput.numberInput();
                    b= userInput.numberInput();
                    System.out.println("Difference of numbers: " + calculator.subtraction(a,b));
                    break;
                case 3:
                    a= userInput.numberInput();
                    b= userInput.numberInput();
                    System.out.println("Difference of numbers: " + calculator.multiplication(a,b));
                    break;
                case 4:
                    a= userInput.numberInput();
                    b= userInput.numberInput();
                    System.out.println("Difference of numbers: " + calculator.division(a,b));
                    break;
                case 5:
                    double[] arr = userInput.arrayInput();
                    System.out.println("Sum of array: " + calculator.sumOfArray(arr));
                    break;
                case 6:
                    arr = userInput.arrayInput();
                    System.out.println("Variance of array: " + calculator.varianceOfArray(arr));
                    break;
                case 7:
                    arr = userInput.arrayInput();
                    System.out.println("Standard deviation of array: " + calculator.standardDeviationOfArray(arr));
                    break;
                case 0:
                    loop=false;
                    break;
                default:
                    System.out.println("Select a correct option!");
                    break;
            }
        }
    }
}
