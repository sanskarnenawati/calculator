public class Calculator {
    public double addition(double a , double b){
        return a+b;  //Return addition of numbers
    }

    public double subtraction(double a, double b){
        return a-b; //Return subtraction of numbers
    }

    public double multiplication(double a, double b){
        return a*b; //Return multiplication of numbers
    }

    public double division(double a, double b){
        return a/b; //Return division of numbers
    }

    public double sumOfArray(double[] array){
        double sum = 0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i]; //iterates over array to add each element
        }
        return sum; //Returns the sum
    }

    public double varianceOfArray(double [] array){
        double mean = sumOfArray(array)/  //Calculates mean of array
                array.length;
        double sqDiff = 0;
        for (int i = 0; i < array.length; i++)
            sqDiff += (array[i] - mean) *
                    (array[i] - mean);  //Finds square difference of the array

        return sqDiff / array.length; // returns variance of array
    }

    public double standardDeviationOfArray(double [] array){
        return Math.sqrt(varianceOfArray(array)); // returns square root of variance ie, Standard Deviation
    }
}
