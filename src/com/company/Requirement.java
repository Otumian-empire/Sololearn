/**
 * This interface is just another version of the Cash.java Class
 * */
public interface Requirement {
    /**
     * If isSalaried, Employee gets salary increase plus allowance if children exist*/
    boolean isSalaried(boolean salaried);

    /**
     * abstract, increaseSalary(amount: int) : int
     * increases Employee salary by amount if isSalaried is true
     * And is married with kids
     * abstract int[] familyAllowance(boolean isMarried, int numberOfChildren) must be implemented
     * */
    int increaseSalary(int amount);

    /**
     * an increase in Employee salary based on marital status and number of children available
     * */
    int[] familyAllowance(boolean isMarried, int numberOfChildren);
}
