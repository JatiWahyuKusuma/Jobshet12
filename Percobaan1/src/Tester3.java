public class Tester3 {
    public static void main(String[]args){
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill EBill = new ElectricityBill(5, "A-1");
        Employee E[] = {pEmp, iEmp};
        Payable P[] = {pEmp, EBill};
        // Employee e2[] = {pEmp, iEmp, EBill};
    }
}
