package dto;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Manager extends Employee {
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public Manager() {
    }

    public double calculateSalary(double baseSalary) {
        return baseSalary * grade;
    }

    public double calculateSalary() {
        return super.getBaseSalary() * grade;
    }
}
