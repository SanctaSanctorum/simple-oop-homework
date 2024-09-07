public class Manager extends Employee {
    int grade;
    public void display(){
        System.out.println(grade);

    }
    public double calculateSalary(double baseSalary) {

        return baseSalary * grade;
    }

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married, company, position, baseSalary);
    }
}
