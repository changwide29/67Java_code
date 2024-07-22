import java.util.Scanner;
public class W05_01_IfElse_OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("กรุณา โปรดป้อนค่าตัวเลขค่ะ : ");
        int number = input.nextInt();

        int result = number%2;

        if(result == 0) {
            System.out.println(number + " Is an Even number.");
        } else {
            System.out.println(number + " Is an Odd number.");
        }
        System.out.println("Number : "+ result);
    }
}
  
