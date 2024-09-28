package dto;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class SaleManager extends Employee {
    private double totalSales;
    private double bonus;

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return super.getBaseSalary() + bonus;
    }
}
