public class WageEmployee extends Employee{
    double hours;
    double wage;

    public WageEmployee(
            String name,
            int age,
            boolean married,
            String company,
            String position,
            double baseSalary,
            double hours,
            double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public WageEmployee() {
    }

    public double calculateSalary() {
        return baseSalary + hours * wage;
    }


    @Override
    public void display() {
    }

}
