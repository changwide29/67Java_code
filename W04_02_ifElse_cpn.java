import java.util.Scanner;
public class W04_02_ifElse_cpn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();

        int result = 0;

        if(num1 <= 0) {
                System.out.println("กรุณาพิมพ์จำนวนเต็มบวกค่ะ");
        } else if (num1>num2) {
                result = num1 - num2;
                System.out.println("The number 1 is greater than the num 2");

                System.out.println("The result is : " + result);
        } else {
                result = num1 + num2;
                System.out.println("The number 1 is less than or equal the num 2");

                System.out.println("The result is : " + result);
        }
        //System.out.println("The result is : " + result);
    }
}

//System.out.println("กรุณา ป้อนหมายเลข 1-9999 ครับ");//
