package W15;

import java.lang.reflect.Method;

public class W15_01_method_intro {

    // 1) Method ที่ไม่มีการรับค่าและคืนค่า
  static void printHello(){
    System.out.println("Hello Wolord");
  }

    // 2) Method ที่รับค่า แต่ไม่คืนค่า
  static void sayHello(String name){
      System.out.println("Hello " + name);
  }

    // 3) Method ที่ไม่รับค่าและคืนค่า
  static String getITName(){
    return "IT";
  }

    // 4) Method ที่รับค่าและคืนค่า
  static int add (int a, int b){
    System.out.print(a + "+" + b + " = " );
      return a+b;
  }
  // 5)Method เส้นแบ่ง ที่ไม่มีการรับค่าและคืนค่า
  static void Line(){
    System.out.println("=======================================");
  }

    public static void main(String[] args) {

        Line();
         // 1) Method ที่ไม่มีการรับค่าและคืนค่า
        printHello() ;
        Line();
        // 2) Method ที่รับค่าและไม่คืนค่า
        sayHello("Thanapol");
        sayHello("Nuttapon");

        Line();

        // 3) Method ที่ไม่รับค่าและคืนค่า
        System.out.println("Ma major is " + getITName());
        Line();

        // 4) Method ที่รับค่าและคืนค่า
        System.out.println(add(20 , 30));
        Line();
       
    }
}