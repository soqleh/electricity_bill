import first.ElectricityBill;
import refactoring.ElectricityBillRefactoring;

public class Main {
    static int usages[] = {99, 150, 250, 301, 450, 510};
    public static void main(String[] args) {
        ElectricityBill bill1 = new ElectricityBill();
        for(int i = 0; i < usages.length; i++) {
            System.out.println(usages[i] + "> kwh의 전기 요금은 " + bill1.calculateBill(usages[i]) + "원 입니다.");
        }
        ElectricityBillRefactoring bill2 = new ElectricityBillRefactoring();
        for(int i = 0; i < usages.length; i++) {
            System.out.println(usages[i] + "* kwh의 전기 요금은 " + bill2.calculateBill(usages[i]) + "원 입니다.");
        }
    }
}