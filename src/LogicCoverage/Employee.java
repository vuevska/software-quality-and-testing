package LogicCoverage;

public class Employee {
    private final boolean isSenior;
    private final boolean isPartTime;
    private final int monthsInCompany;

    public Employee(boolean isSenior, boolean isPartTime, int monthsInCompany) {
        this.isSenior = isSenior;
        this.isPartTime = isPartTime;
        this.monthsInCompany = monthsInCompany;
    }

    public static boolean getsBonus(Employee employee) {
        System.out.println("This program tests if a company's employee will get a bonus.");

        return employee.isSenior || (!employee.isPartTime && employee.monthsInCompany > 6);
    }
}
