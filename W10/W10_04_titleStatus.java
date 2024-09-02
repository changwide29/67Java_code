//ตวจสอบคำนำหน้าชื่อ
//ด.ญ. ด.ช. นาย นาง นางสาว 
//เพศ  อายุ
//อายุน้อยกว่า 15 เป็นเด็ก
////เพศ  อายุ  สถานะสมรส
package W10;

import java.util.Scanner;

public class W10_04_titleStatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ระบุเพศ (male/female): ");
        String gender = kb.next();

        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();

        System.out.print("ระบุสถานะสมรส: ");
        String isMarriet = kb.next();

        if (gender.equalsIgnoreCase("male")) {
            // ผู้ชาย ด.ช. นาย
            if (age < 15) {
                System.out.print("ด.ช.");
            } else {
                System.out.print("นาย");
            }
        } else {
            // ผู้หญิง ด.ญ. นาง นางสาว
            if (age < 15) {
                System.out.print("ด.ญ.");
            } else if (isMarriet.equalsIgnoreCase("married")) {
                System.out.print("นาง");
            } else {
                System.out.print("นางสาว");
            }
        }
        kb.close();

    }

}
