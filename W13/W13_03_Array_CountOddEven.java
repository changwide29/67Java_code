package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        //ให้นับเลขคี่และเลขคู่ใน Array
        int [] numbers = {1,5,6,34,12,99,77,11,9,7,8,9,10,14,15,10,18,20};
        
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + "-" + "Even");
                countEven++;
            }else{
                System.out.println(numbers[i] + "-" + "Odd");
                countOdd++;
            }
        }

        System.out.println("\nAmount of all Numbers : " + numbers.length);
        System.out.println("Amount of Odd Numbers : " + countOdd);
        System.out.println("Amount of Even Numbers : " + countEven);
    }
}
