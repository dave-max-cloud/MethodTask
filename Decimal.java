import java.util.Scanner;
public class Decimal{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer:");
  int num1 = input.nextInt();

  System.out.print("Enter second integer:");
  int num2 = input.nextInt();
  
  double result = divide(num1, num2);
  System.out.print(result);
  }
  
  public static double divide(int num1, int num2){
  return (double) num1/num2;
  }
  }
  
