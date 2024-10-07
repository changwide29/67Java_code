package W15;

import java.util.Scanner;

public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
    static int Add (int a, int b){
        return a+b;
    }

    // 2) Method สำหรับลบเลข
    static int Subtract(int a, int b){
        return a-b;
    }

    // 3) Method สำหรับคูณเลข
    static int Multiply(int a, int b){
       return a*b;
    }

    // 4) Method สำหรับหารเลข
    static int Devide(int a, int b){
        return a/b;
    }
    
       public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
    
            System.out.print("ป้อนตัวเลขที่ 1 : ");
            int a = sc.nextInt();
    
            System.out.print("ป้อนตัวเลขที่ 2 : ");
            int b = sc.nextInt();
    
            sc.close();
    
        
        // 1) Method สำหรับบวกเลข
        
        System.out.println("ผลบวกของตัวเลข = " + Add(a , b));

        // 2) Method สำหรับลบเลข000
      
        System.out.println("ลบของตัวเลข = " + Subtract(a , b));

        // 3) Method สำหรับคูณเลข
     
        System.out.println("คูณของตัวเลข = " + Multiply(a , b));
        // 4) Method สำหรับหารเลข
       
        System.out.println("หารของตัวเลข = " + Devide(a , b));
    }


}