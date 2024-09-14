

public class Employee extends Person {
    String company;
    String position;
    double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public Employee() {
    }

    @Override
    public void display(){
        
    }


}
