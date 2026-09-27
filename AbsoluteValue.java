import java.util.Scanner;
public class AbsoluteValue{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();
System.out.print(absolutenum(number));
}

public static int absolutenum(int number){
if (number < 0){
  return -number;
  }
else{
 return number;
}

}
}
