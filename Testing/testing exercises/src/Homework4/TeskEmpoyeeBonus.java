package Homework4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertTrue;

public class TeskEmpoyeeBonus {
    Employee employee;

    @BeforeEach
    public void setUp(){
        Employee e = new Employee();
    }

    @Test
    public void test1() throws Exception{
        employee.setSenior(true);
        employee.setPartTime(true);
        employee.setMonthsInCompany(7);
        assertTrue(employee.getBonus(employee));
    }

    @Test
    public void test5() throws Exception{
        employee.setSenior(false);
        employee.setPartTime(true);
        employee.setMonthsInCompany(7);
        assertTrue(employee.getBonus(employee));
    }

    @Test
    public void test7() throws Exception{
        employee.setSenior(false);
        employee.setPartTime(false);
        employee.setMonthsInCompany(7);
        assertTrue(employee.getBonus(employee));
    }

    @Test
    public void test8() throws Exception{
        employee.setSenior(false);
        employee.setPartTime(false);
        employee.setMonthsInCompany(2);
        assertTrue(employee.getBonus(employee));
    }

}
