/**
 * Execises to practice the basic syntax
 */
public class Basics {

    public static void main(String[] args) {
        // TODO: Write a Java program to print the sum of two numbers.
        Basics obj = new Basics();

        obj.sum(5, 13);



        // TODO: Write a Java program to divide two numbers and print on the screen. Use both integers and doubles.


        obj.divide(10, 5);


        // TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        obj.operator(20, 5);



        // TODO: Write a Java program to swap two variables. Print the before and after switching.


        obj.swap(1,2);
    }
    public void sum(int a, int b) {
        int result;
        result = a + b;
        System.out.println("The sum is " + result);
    }
    public void divide(double a, double b){
        double result;
        result= a/b;
        System.out.println("The result for the division is "+ result);
    }
    public void swap(int a, int b){
        System.out.println("The value of a is " + a + " and the value for b is "+ b);
        int lol;
        lol=a;
        a=b;
        b=lol;
        System.out.println("The value of a is " + a + " and the value for b is "+ b);
        }
     public void operator(int a, int b) {
         int sum;
         sum = a + b;
         System.out.println("The sum is " + sum);
         int mutiply;
         mutiply = a * b;
         System.out.println("The mutiply is " + mutiply);
         int subtract;
         subtract = a - b;
         System.out.println("The subtract is " + subtract);
         int divide;
         divide = a / b;
         System.out.println("The division is " + divide);
         int remainder;
         remainder = a % b;
         System.out.println("The remainder is " + remainder);




    }
}
