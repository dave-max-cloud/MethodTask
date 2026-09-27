import java.util.Scanner;
public class HalfNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
float number = input.nextFloat();
System.out.print(dividenumber(number));
}

public static float dividenumber(float number){
float num = number / 2;
 return num;
}
}
