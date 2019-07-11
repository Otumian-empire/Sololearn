public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello main");
        Employee employee = new Employee("Daniel", 2345.99);
        employee.printEmplInfo();

        Manager manager = new Manager();
        manager.setEmplName("Hashim");
        manager.setEmplSalary(12.00);
        manager.printEmplInfo();
    }
}
