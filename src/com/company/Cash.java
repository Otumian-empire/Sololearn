//As you can see above the class and the methods are all public abstract.
//This can be made an interface rather


/**
 * This is an abstract class with 3 abstract methods
 * */
public abstract class Cash {

    /**
     * If isSalaried, Employee gets salary increase plus allowance if children exist*/
    public abstract boolean isSalaried(boolean salaried);

    /**
     * abstract, increaseSalary(amount: int) : int
     * increases Employee salary by amount if isSalaried is true
     * And is married with kids
     * abstract int[] familyAllowance(boolean isMarried, int numberOfChildren) must be implemented
     * */
    public abstract int increaseSalary(int amount);

    /**
     * an increase in Employee salary based on marital status and number of children available
     * */
    public abstract int[] familyAllowance(boolean isMarried, int numberOfChildren);

}


