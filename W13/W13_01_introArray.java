package W13;

public class W13_01_introArray {
    public static void main(String[] args) {
        //ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        String[] colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};

        int[] Bank = {20,50,100,500,1000};

        char[] alphabets = {'A','B','C','D','E'};

        // แสดงผลข้อมูลในตัวแปร Array
        System.out.println("The first color is " + colors[0]);
        System.out.println("Bank balance is " + Bank[0]);
        System.out.println("The last alphabet is " + alphabets[2]);

        //แสดงผลลัพธ์โดยใช้ Loop
        System.out.println();
        System.out.println("==================================");
        System.out.println();
        System.out.println("Colors is the array are : ");
        for (int i = 0 ; i < 7 ; i++) {
            System.out.print(colors[i] + " ");
           
        }
        System.out.println();
        System.out.println("\n==================================");
        System.out.println();
        System.out.println("Colors is the array are : ");
        for (int i = 6 ; i >= 0 ; i--) {
            System.out.print(colors[i] + " ");
           
        } 
        System.out.println();
        System.out.println("\n==================================");
        System.out.println();
        System.out.println("Bank in the array are: ");
        for (int i = 0 ; i < Bank.length ; i++) {
            System.out.print(Bank[i] + " ");
           
        }

    }
}
