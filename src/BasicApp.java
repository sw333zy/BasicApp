import java.util.Scanner;

public class BasicApp {
public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number: ");

    int num1 = keyboard.nextInt();


    int sum1 = num1 + 5;
    int sum2 = sum1 * 2;
    int sum3 = sum2 - 7;
    System.out.println(sum3);
}

}
