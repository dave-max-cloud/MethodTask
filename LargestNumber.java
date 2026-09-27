import java.util.Scanner;
public class LargestNumber{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
  int num1 = input.nextInt();

System.out.print("Enter second number:");
  int num2 = input.nextInt();
  System.out.print("The largest is " + Larger(num1, num2));
  
  }
  
  
  public static int Larger(int num1, int num2){
  int largest = num1;
  if (num2 > num1){
  return num2;
  }
  else{
  return num1;
  
  }
  }
  }
  
  
