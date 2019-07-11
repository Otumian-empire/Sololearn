/**
 * This is an Employee class which takes two arguments in it's constructor,
 * as name and salary.
 * This class demonstrate encapsulation(data hiding).
 * Hence we shall set all the variables (properties) to private.
 * */
public class Employee {

    private String emplName;
    private double emplSalary;


    /**
     * returns the employee name.
     * getEmplName()->emplName: String.
     * */
    public String getEmplName() {
        return emplName;
    }

    /**
     * returns the employee salary.
     * getEmplSalary()->emplSalary: double.
     * */
    public double getEmplSalary() {
        return emplSalary;
    }

    /**
     * sets the employee name.
     * setEmplName(name: String).
     * */
    public void setEmplName(String name) {
        this.emplName = name;
    }

    /**
     * sets the employee salary.
     * setEmplName(salary: double).
     * */
    public void setEmplSalary(double salary) {
        this.emplSalary = salary;
    }


    /**
     * This is a constructor of the Employee class which takes two arguments,
     * name and salary of employee.
     * Employee(name: String, salary: double)
     * */
    public Employee(String emplName, double emplSalary) {
        this.emplName = emplName;
        this.emplSalary = emplSalary;
        System.out.println("I am an Employee.");
    }


    /**
     * This is an empty constructor of the Employee class.
     * Employee()
     * */
    public Employee() {System.out.println("I am an Employee");}


    public void printEmplInfo() {
        System.out.println(String.format("Employee name: %s\nEmployee salary: %.2f", this.getEmplName(),
                this.getEmplSalary()));
    }

}
