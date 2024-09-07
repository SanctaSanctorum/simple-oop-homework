public class Main {
    public static void main(String[] args) {
       SaleManager saleManager = new SaleManager(5, 100);

       double result = saleManager.calculateSalary(100);
       System.out.println(result);
    }
}
