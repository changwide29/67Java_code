package W16;
import java.util.Scanner; 
public class MinMaxNumbers {
 public static void main(String[] args) { 
Scanner kb = new Scanner(System.in);
 
int[] numbers = new int[5]; // ตัวแปรชนิด Array แบบที่ 1 กำหนดความยาว 5 ตัว

for (int i = 0; i < 5; i++) { // การใช้ for loop for ( ; ; ) {}

 System.out.print("กรุณาใส่จำนวนเต็มที่ " + (i + 1) + ": "); 
 
 numbers[i] = kb.nextInt(); } // การรับค่าข้อมูลลงใน Array numbers[i] จาก คียบอร์ด
  int max = numbers[0]; // กำหนดค่าที่สูงสุด
  int min = numbers[0]; // กำหนดค่าที่น้อยสุด

 for (int number : numbers) { // การใช้ for each

 if (number > max) { max = number; } // หาค่าที่สูงสุด
 if (number < min) { min = number; } // หาค่าที่น้อยสุด
 } 
System.out.println("ค่ามากสุด: " + max);
 System.out.println("ค่าน้อยสุด: " + min);
  kb.close(); 
} 
}
