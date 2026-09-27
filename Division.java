import java.util.Scanner;
public class Division{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();
System.out.print(dividenum(number));
}

public static boolean dividenum(int number){
 if (number % 3 == 0){
  return true;
 }
 else{
  return false;
  }
 }
 
 }

