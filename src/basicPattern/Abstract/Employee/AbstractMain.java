package basicPattern.Abstract.Employee;

import basicPattern.Interface.EmployeeSalary.EmpInterface.SalaryCalculator;
import basicPattern.Interface.EmployeeSalary.EmployeeCatagory.CatagoryAEmployee;
import basicPattern.Interface.EmployeeSalary.EmployeeCatagory.CatagoryBEmployee;

public class AbstractMain {
    public static void main(String[] args) {
         int allowence=200;
         int tax_deduction=600;
        SalaryCalculator salaryCalculator=new CatagoryAEmployee(10000,200);
        Employee emp=new Consultant("Nikhil","1");
        emp.save();
        System.out.println(emp.computeCompensation(salaryCalculator.getSalary(),allowence,tax_deduction));
        salaryCalculator=new CatagoryBEmployee(300,10000);
        emp=new SelsRep("Nithin","2");
        System.out.println(emp.computeCompensation(salaryCalculator.getSalary(), allowence,tax_deduction));
        emp.save();
    }

}
