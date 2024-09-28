package app;

import dto.Employee;
import dto.Manager;
import dto.SaleManager;
import dto.WageEmployee;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PersonApp {

    public static void printInfo(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getExpensis(Employee[] employees) {
        //В PersonApp создайте:
        //Статический метод, который вернет затраты компании(зарплата всех сотрудников).
        //для Manager зарплата будет состоять из baseSalary умноженной на grade.

        //Переписать с учетом полиморфизма, утащить внутрь емплоее переопределяя в классах наследниках.
        // утащить и написать в каком формате и переписать гетинтенсив
        double managerExpense = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee instanceof Manager manager) {
                managerExpense += manager.calculateSalary();
            } else if (employee instanceof SaleManager saleManager) {
                managerExpense += saleManager.calculateSalary();
            } else if (employee instanceof WageEmployee wageEmployee) {
                managerExpense += wageEmployee.calculateSalary();
            }
        }
        return managerExpense;
    }

    public static double getNetOperatingIncome(Employee[] employees) {
        //вернет доход компании(все продажи). Это приносят только SalesManagers.
        double netOperatingIncome = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee instanceof SaleManager saleManager) {
                netOperatingIncome += saleManager.getTotalSales();
            }
        }
        return netOperatingIncome;
    }
}
