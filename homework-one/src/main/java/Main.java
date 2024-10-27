import app.PersonApp;
import dto.*;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        SaleManager saleManager1 = new SaleManager("Danil", 28, true, "Home", "hmanager", 25000, 5_000_000, 1.1);
        SaleManager saleManager2 = new SaleManager("Filip", 26, true, "Home", "topmanager", 25000, 10_000_000, 1.2);
        SaleManager saleManager3 = new SaleManager("Mariya", 42, true, "Home", "manager", 25000, 23_000_000, 0.95);

        WageEmployee wageEmployee1 = new WageEmployee("Arkadiy", 39, true, "TopPrice", "General", 1, 200, 40);
        WageEmployee wageEmployee2 = new WageEmployee("Andrey", 45, true, "TopPrice", "SaleManager", 1, 200, 44);
        WageEmployee wageEmployee3 = new WageEmployee("Mihail", 39, true, "TopPrice", "Manager", 1, 200, 23);

        Manager manager1 = new Manager("Valentina", 51, false, "Hot Ice", "Manager", 10, 1);
        Manager manager2 = new Manager("Gennadiy", 33, true, "Hot Ice", "Manager", 10, 2);
        Manager manager3 = new Manager("Stepan", 49, true, "Hot Ice", "stManager", 12, 3);
        Manager manager4 = new Manager("Vadim", 30, true, "Hot Ice", "hiManager", 13, 4);

        employees[0] = saleManager1;
        employees[1] = saleManager2;
        employees[2] = saleManager3;
        employees[3] = wageEmployee1;
        employees[4] = wageEmployee2;
        employees[5] = wageEmployee3;
        employees[6] = manager1;
        employees[7] = manager2;
        employees[8] = manager3;
        employees[9] = manager4;

        PersonApp.printInfo(employees);
        System.out.println(PersonApp.getExpensis(employees));
//        PersonApp.netOperatingIncome(employees);

    }
}
