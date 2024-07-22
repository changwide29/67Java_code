import java.util.Scanner;
public class W05_Test1_674230002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("My Name : Thanapol STD : 674230002");
        
        System.out.print("กรุณา ป้อนค่าความสูง : ");
        int High = input.nextInt();

        System.out.print("กรุณา ป้อนค่าฐาน : ");
        int Base = input.nextInt();

        double Area = 0.5 * High * Base;
  
        //ผมลัพธ์
        System.out.println(Area + " Is the area of the triangle");

    }
}
