package W12;

public class W12_00_exLoopWhile {
    public static void main(String[] args) {
        
// โครงสร้างคำสั่งลูป for // while แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า

// TODO 1
 // initial ; condition ; update 
 System.out.println("TODO 1 For Loop");
 for( int i=1 ; i <= 5 ; i++ ) {
    // คำสั่งที่ต้องการทำซ้ำ
    System.out.println("รอบที่ " + i);

}
System.out.println("*******************");



System.out.println("TODO 1 While Loop");
int n=1;
while (n<=5) {
    System.out.println("รอบที่ " + n);
    n++;
}
System.out.println("*******************");



// TODO
System.out.println("TODO 2 for Loop");
for( int i=1 ; i <= 5 ; i++ ) {
    // คำสั่งที่ต้องการทำซ้ำ
    System.out.println("รอบที่ " + i + " Hello world");

}
System.out.println("*******************");

System.out.println("TODO 2 While Loop");
int b=1;
while (b<=5) {
    System.out.println("รอบที่ " + b + " Hello world");
    b++;
}
System.out.println("*******************");
// ======================================================================

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10

// TODO3
System.out.println("TODO 3 for Loop");
    for(int j=1;j<=10;j++){
        System.out.print(j+" ");
        break;
    }

System.out.println("*******************");


System.out.println("TODO 3 While Loop");
    int nn=1;
    while (nn<=10) {
        System.out.print(nn+" ");
        nn++;
        break;
    }

System.out.println("*******************");
// ======================================================================


//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

System.out.println("TODO 4 for Loop");

int sum = 0;
    for(int j=1;j<=10;j++){
    System.out.print(j+" ");
    sum =  sum+j; // sum+= j;
    }
    System.out.println(" = "+sum);

    System.out.println("*******************");
// ======================================================================

//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
System.out.println();

// TODO5
System.out.println("----- TODO 5 for Loop -----");

sum = 0;
    for(int j=1;j<=10;j++){
    System.out.print(j);
    if (j<10){
    System.out.print("+");
    }
    sum =  sum+j; // sum+= j;
    }
    System.out.println(" = "+sum); 
    System.out.println("*******************");

System.out.println("----- TODO 5 While Loop ----");
    sum = 0;
    int p = 1; // Initialization
    while (p <= 10) { // Condition
    System.out.print(p);
    if (p < 10) {
        System.out.print("+");
    }
    sum = sum + p; // or sum += j;
    p++; // Increment
    }
    System.out.println(" = " + sum);
System.out.println("*******************");

//int nn=1;SS
    //while (nn<=10) {
        //System.out.print(nn+" ");
       // nn++;
       // break;
   // }
// ======================================================================
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1

// TODO6
System.out.println("TODO 6 for Loop");

for(int j=10;j>=1;j--){
    System.out.print(j+" ");
    sum = sum + j;
}
// ======================================================================

//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19

// TODO
System.out.println("TODO 7 for Loop");

System.out.println();
for(int j=1;j<=19;j+=2){
    System.out.print(j+" ");
    sum = sum + j;
}

// ======================================================================

//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20

// TODO
System.out.println("TODO 8 for Loop");

System.out.println();
for(int j=2;j<=20;j+=2){
    System.out.print(j+" ");
    sum = sum + j;
}
// ======================================================================

//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100

// TODO
System.out.println("TODO 9 for Loop");

System.out.println();
for(int j=1;j<=100;j+=4){
    System.out.print(j+" ");
    sum = sum + j;
}

int n9=2;
while (n9<=100) {
    System.out.print(n9*n9 + " ");
    n9++;
// ======================================================================

//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่

// TODO
System.out.println("TODO 10 for Loop");

    for(int j=1;j<=5;j++){
        if(j%2==0){
            System.out.println("รอบที่ "+j+" เลขคู่"+" ");
        }else{
            System.out.println("รอบที่ "+j+" เลขคี่"+" ");
        }
    }
}
}


// ======================================================================