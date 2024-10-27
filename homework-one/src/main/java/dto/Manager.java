package dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@EqualsAndHashCode
public class Manager extends Employee {
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public Manager() {
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() * grade;
    }



}
