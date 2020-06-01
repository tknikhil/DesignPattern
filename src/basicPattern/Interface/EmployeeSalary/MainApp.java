package basicPattern.Interface.EmployeeSalary;

import basicPattern.Interface.EmployeeSalary.EmpInterface.SalaryCalculator;
import basicPattern.Interface.EmployeeSalary.Employee.Employee;
import basicPattern.Interface.EmployeeSalary.EmployeeCatagory.CatagoryAEmployee;
import basicPattern.Interface.EmployeeSalary.EmployeeCatagory.CatagoryBEmployee;

public class MainApp {
    public static void main(String[] args) {
        //CatagoryAEmployee catagoryAEmployee= new CatagoryAEmployee(10000,200);
        SalaryCalculator salaryCalculator =new CatagoryAEmployee(10000,200);
        Employee employee =new Employee("Nikhil", salaryCalculator);
        employee.display();
        salaryCalculator=new CatagoryBEmployee(10000,200);
        employee=new Employee("Nithin",salaryCalculator);
        employee.display();

    }
}
