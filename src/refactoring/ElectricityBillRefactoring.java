package refactoring;

public class ElectricityBillRefactoring {
    private double[] priceByUsage = {60.7, 125.9, 187.9, 280.6, 417.7, 670.6};
    private int usageBaseline[]  = {0, 100, 200, 300, 400, 500};
    //기존 while문 형식에서 구조상 더 적합한 for문으로 변경
    public double calculateBill(int usage) {
        double totalBill = 0;
        for(int i = usageBaseline.length - 1; i >=0; i--){
            if (usage > usageBaseline[i]) {
                totalBill += (usage - usageBaseline[i]) * priceByUsage[i];
                usage = usageBaseline[i];            }
        }
        return totalBill;
    }
}
