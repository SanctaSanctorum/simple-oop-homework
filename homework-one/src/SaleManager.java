public class SaleManager {
    final double totalSales;
    final double bonus;

    public SaleManager(double totalSales, double bonus) {
        this.totalSales = totalSales;
        this.bonus = bonus;
    }


    public void display(){
        System.out.println(totalSales + ", " + bonus);
    }
    public double calculateSalary(){
        return 0;
    }

    public double calculateSalary(double baseSalary) {

        return baseSalary + bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }


    public double getBonus() {
        return bonus;
    }
}
