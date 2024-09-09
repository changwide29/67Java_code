package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int Score;

       // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน

       // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.out.print("ป้อนคะแนนของคุณ : ");
            Score = kb.nextInt();
         
        } while (Score < 1 || Score > 100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        
        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75

        // ตรวจสอบเกรด
        if(Score >= 80) {
            System.out.println("คุณได้เกรด A");
        }else if(Score >= 75) {
            System.out.println("คุณได้เกรด B+");
        }else if(Score >= 70) {
            System.out.println("คุณได้เกรด B");
        }else if(Score >= 65) {
            System.out.println("คุณได้เกรด C+");
        }else if(Score >= 60) {
            System.out.println("คุณได้เกรด C");
        }else if(Score >= 55) {
            System.out.println("คุณได้เกรด D+");
        }else if(Score >= 50) {
            System.out.println("คุณได้เกรด D");
        }else {
            System.out.println("คุณได้เกรด F");
        }

        kb.close(); // ปิด Scanner object
    }
}