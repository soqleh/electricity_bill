package first;

public class ElectricityBill {
    public double calculateBill(int usage) {
        double totalBill = 0;
        // usage <= 100kWh : 60.7원
        //100kWh < usage <= 200 kWh  : 125.9원
        //200kWh < usage <= 300 kWh : 187.9원
        //300kWh < usage <= 400 kWh : 280.6원
        //400kWh < usage <= 500 kWh : 417.7원
        //500kWh < usage: 670.6원
        while (usage > 100) {
            if (usage > 500){
                totalBill += (usage - 500) * 670.6;
                usage = 500;
            } else if (usage > 400) {
                totalBill += (usage - 400) * 417.7;
                usage = 400;
            } else if (usage > 300) {
                totalBill += (usage - 300) * 280.6;
                usage = 300;
            } else if (usage > 200) {
                totalBill += (usage - 200) * 187.9;
                usage = 200;
            } else if (usage > 100) {
                totalBill += (usage - 100) * 125.9;
                usage = 100;
            }
        }
        totalBill += usage * 60.7;
        return totalBill;
    }
}
