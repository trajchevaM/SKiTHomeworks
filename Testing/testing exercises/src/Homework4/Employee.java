package Homework4;

public class Employee {
    public boolean isSenior;
    public boolean isPartTime;
    public int monthsInCompany;

    public void setSenior(boolean senior) {
        isSenior = senior;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }

    public void setMonthsInCompany(int monthsInCompany) {
        this.monthsInCompany = monthsInCompany;
    }

    public boolean getBonus(Employee employee) {
        System.out.println("Test if employee gets bonus");

        return employee.isSenior || (!employee.isPartTime && employee.monthsInCompany >=6);
    }
}
