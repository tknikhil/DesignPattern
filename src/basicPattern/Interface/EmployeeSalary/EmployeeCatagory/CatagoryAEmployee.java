package basicPattern.Interface.EmployeeSalary.EmployeeCatagory;

import basicPattern.Interface.EmployeeSalary.EmpInterface.SalaryCalculator;

public class CatagoryAEmployee implements SalaryCalculator {
    double baseSalary;
    double OT;

    public CatagoryAEmployee(double base,double overtime){
        baseSalary=base;
        OT=overtime;
    }

    public double getSalary(){
        return(baseSalary+OT);
    }
}
