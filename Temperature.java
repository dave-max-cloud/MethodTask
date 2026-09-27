import java.util.Scanner;
public class AbsoluteValue{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter temperature");
double fahrenheit = input.nextDouble();
System.out.print(temperature(fahrenheit));
}

public static double temperature(double fahrenheit){
          
     return fahrenheit * (9/5) + 32;
   
 }
 }
