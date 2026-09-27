import java.util.Scanner;
public class AddNumbers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();
System.out.print(addnumbers(number));
}

public static int addnumbers(int number){
int num = number + 10;
 return num;

 }

  }
 
 
