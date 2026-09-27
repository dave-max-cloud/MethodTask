import java.util.Scanner;
public class Equality{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
  int num1 = input.nextInt();

System.out.print("Enter second number:");
  int num2 = input.nextInt();
  System.out.print(equal(num1, num2));
  }
  
  public static boolean equal(int num1, int num2){
  if (num1 == num2){
  return true;
  }
  else{
  return false;
  }
  }
  }
  
  
  
