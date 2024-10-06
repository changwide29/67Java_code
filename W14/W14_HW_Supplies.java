//  6) แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        // มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        // มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
        // มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
package W14;
public class W14_HW_Supplies {
    public static void main(String[] args){
        
        String [] codes = {"123TH","124EN","125EN","126TH","127EN"};
        int count = 0;
// *****************************************************************************//

        System.out.println("==================================");
        System.out.println("จำนวนพัสดุทั้งคลัง : "+ codes.length +" รายการ");
        System.out.println("==================================");

        for(String code : codes){
            if(code.endsWith("TH")) {
                count++;
            }
        }

        System.out.println("==================================");
        System.out.println("จำนวนพัสดุจากประเทศไทย : "+count+" รายการ");
        System.out.println("==================================");

// *****************************************************************************//
        count = 0;

        for(String code : codes){
            if(code.endsWith("EN")) {
                count++;
            }
        }

        System.out.println("==================================");
        System.out.println("จำนวนพัสดุจากต่างประเทศ : "+count+" รายการ");
        System.out.println("==================================");

// *****************************************************************************//

        int Total = 0;
        int TotalThai = 0;
        int TotalEN = 0;

        System.out.println("รายพัสดุทั้งหมด : ");

        for(int i = 0; i < codes.length; i++){
            if(codes[i].endsWith("TH")){
                System.out.println((i+1) + ". Tracking: " + codes[i]+" พัสดุประเทศไทย");
                TotalThai++;
            } else {
                System.out.println((i+1) + ". Tracking: " + codes[i]+" พัสดุต่างประเทศ");
                TotalEN++;
            }
            Total++;
        }
// *****************************************************************************//

        System.out.println("==================================");
        System.out.println("จำนวนพัสดุทั้งหมด : "+Total+" รายการ");
        System.out.println("จำนวนพัสดุจากประเทศไทย : "+TotalThai+" รายการ");
        System.out.println("จำนวนพัสดุจากต่างประเทศ : "+TotalEN+" รายการ");
        System.out.println("==================================");  

// *****************************************************************************//
    }
}
