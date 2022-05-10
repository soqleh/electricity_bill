package refactoring;

public class ElectricityBillRefactoring {
    private double[] priceByUsage = {60.7, 125.9, 187.9, 280.6, 417.7, 670.6};
    private int usageBaseline[]  = {0, 100, 200, 300, 400, 500};
    public double calculateBill(int usage) {
        double totalBill = 0;
        // usage <= 100kWh : 60.7원
        //100kWh < usage <= 200 kWh  : 125.9원
        //200kWh < usage <= 300 kWh : 187.9원
        //300kWh < usage <= 400 kWh : 280.6원
        //400kWh < usage <= 500 kWh : 417.7원
        //500kWh < usage: 670.6원
        for(int i = usageBaseline.length - 1; i >=0; i--){
            if (usage > usageBaseline[i]) {
                totalBill += (usage - usageBaseline[i]) * priceByUsage[i];
                usage = usageBaseline[i];
//                System.out.println("====> totalBill: " + totalBill + ", now usage: " + usage);
            }
        }
        return totalBill;
    }
}
