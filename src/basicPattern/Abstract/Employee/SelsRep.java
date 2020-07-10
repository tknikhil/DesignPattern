package basicPattern.Abstract.Employee;

public class SelsRep extends Employee{

    public SelsRep(String name, String ID) {
        super(name, ID);
    }

    @Override
    public String computeCompensation(double salary, int allowence, int tax_deduction) {
        double sal=salary+allowence-tax_deduction;
        return ("Sales Reps:- Base Salary + commission + allowance - tax deduction :"+sal);
    }
}
