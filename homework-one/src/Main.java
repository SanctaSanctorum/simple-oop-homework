public class Main {
    public static void main(String[] args) {

    Employee[] employees = new Employee[30];

       SaleManager saleManager = new SaleManager(5, 100);

       WageEmployee wageEmployee = new WageEmployee();

       Manager manager = new Manager();

       employees[0] = saleManager;
       double result = saleManager.calculateSalary(100);
       System.out.println(result);

        System.out.println("-".repeat(35));

        Person person = new Person();
        person.setAge(1000);
        System.out.println("person: " + person);
        System.out.println("age: " + person.getAge());
        Person kirill = Person.builder()
                .age(35)
                .name("Kirill")
                .married(true)
                .build();

    }
}
