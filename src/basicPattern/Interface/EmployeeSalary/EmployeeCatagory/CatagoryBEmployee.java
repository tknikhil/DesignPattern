package basicPattern.Interface.EmployeeSalary.EmployeeCatagory;

import basicPattern.Interface.EmployeeSalary.EmpInterface.SalaryCalculator;

public class CatagoryBEmployee implements SalaryCalculator {
    double salaryAmount;
    double baseSalary;
    final static double commision=0.2;

    public CatagoryBEmployee(double salaryAmount,double baseSalary){
        this.salaryAmount=salaryAmount;
        this.baseSalary=baseSalary;
    }

    public double getSalary(){
        return (baseSalary+(commision*salaryAmount));
    }
}
