package W13;

import java.util.Scanner;

public class W13_02_introArray {
    public static void main(String[] args) {
        //ประกาศตัวแปรชนิด Array แบบที่ 2 - ไม่รู้จำนวนข้อมูลล่วงหน้า
        String[] brandsCars = new String[3];

        Scanner kb = new Scanner(System.in);

        //กำหนดค่าให้ตัวแปร Array
        brandsCars[0] = "Toyota";
        brandsCars[1] = "Honda";
        brandsCars[2] = "Nissan";
       

        //แสดงผลลัพธ์โดยใช้ Loop
        System.out.println("old Brands of cars in the array are: ");
        for (int i = 0 ; i < brandsCars.length ; i++) {
            System.out.println(brandsCars[i] + " / ");
        }
        
        System.out.println("\n\nPlease enter the brands od he 3rd car: ");
        for (int i = 0 ; i < brandsCars.length ; i++) {
            System.out.println("Enter beand " + ("1+1") + ": ");
            brandsCars[i] = kb.next();
        }

        brandsCars[2] = "BMW";
        System.out.println("\nnew Brands of cars in the array are: ");
        for (String car : brandsCars) {
            System.out.print(car + " / ");
       
    
    }
}
}