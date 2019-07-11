/**
 * The Manager class is a child class of the Employee Class.
 * This class demonstrates inheritance.
 * As the Manager class will inherit all the non-private variables(properties)
 * and functions (methods) from the super class (Employee class).
 * The extends keyword means the Manager class is an extension of the Employee class.
 * */
public class Manager extends Employee implements Requirement{

    /**
     * printEmplInfo() which prints employee's info, in here is overridden/overloaded
     * Which actually demonstrate polymorphism (a class to a methods executes a
     * different
     * implementation).
     * This implementation is override rather.
     * */
    public void printEmplInfo() {
        System.out.println(String.format("Employee name: %s\nEmployee " +
                        "salary: %.2f\n%s", this.getEmplName(),
                this.getEmplSalary(), "I am a Manager"));
    }

    /**
     * If isSalaried, Employee gets salary increase plus allowance if children exist
     *
     * @param salaried is employee qualified for an increment in salary, true or false
     */
    @Override
    public boolean isSalaried(boolean salaried) {
        return false;
    }

    /**
     * abstract, increaseSalary(amount: int) : int
     * increases Employee salary by amount if isSalaried is true
     * And is married with kids
     * abstract int[] familyAllowance(boolean isMarried, int numberOfChildren)
     * must be implemented
     *
     * @param amount int value, to be added to current salary
     */
    @Override
    public int increaseSalary(int amount) {
        return (int) this.getEmplSalary() + amount;
    }

    /**
     * an increase in Employee salary based on marital status and number of
     * children available
     *
     * @param isMarried marital status, true or false
     * @param numberOfChildren number of children, int value
     */
    @Override
    public int[] familyAllowance(boolean isMarried, int numberOfChildren) {
        int isMarriedIntVal = 0;
        int[] returnVals = new int[2];

        if (isMarried && numberOfChildren > 0) {
            isMarriedIntVal = 1;
        }

        returnVals[0] = isMarriedIntVal;
        returnVals[1] = numberOfChildren;

        return returnVals;
    }
}