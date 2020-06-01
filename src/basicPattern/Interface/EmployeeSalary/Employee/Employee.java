package basicPattern.Interface.EmployeeSalary.Employee;

import basicPattern.Interface.EmployeeSalary.EmpInterface.SalaryCalculator;
import basicPattern.Interface.EmployeeSalary.EmployeeCatagory.CatagoryAEmployee;

public class Employee {
   // CatagoryAEmployee salaryCalculator;
    SalaryCalculator salaryCalculator;
    String name;


    public Employee(String name,SalaryCalculator salaryCalculator){
        this.salaryCalculator=salaryCalculator;
        this.name=name;
    }

    public void display(){
        System.out.println("Name ="+name);
        System.out.println("Salary ="+salaryCalculator.getSalary());
    }
}
