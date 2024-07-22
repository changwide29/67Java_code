import java.util.Scanner;
public class W05_02_IfElseIf_PosNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if(number == 0) {
            System.out.println(number + " is zero.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
