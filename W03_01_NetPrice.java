public class W03_01_NetPrice{
    public static void main(String[] args) {
        // ตัวแปร เก็บค่า ข้อมูล
        short price = 350;
        byte quantity = 10;
        
        //int discounten = 0.5

        int totalPrice = price * quantity;
        int discount = totalPrice * 05 / 100;
        int netPrice = totalPrice - discount;

        System.out.println("ราคาสินค้าทั้งหมด " + totalPrice + " บาท");
        System.out.println("ส่วนลด " + discount + " บาท");
        System.out.println("ราคาสุทธิของสินค้าที่ต้องจ่าย " + netPrice + " บาท");
    }
    
}