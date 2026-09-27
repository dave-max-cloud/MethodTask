import java.util.Scanner;
public class SumOfNumbers{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer:");
  int num1 = input.nextInt();

  System.out.print("Enter second integer:");
  int num2 = input.nextInt();

  int result = sum(num1, num2);

  System.out.println("The sum is:" + result);
    }


 public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
