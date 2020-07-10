package basicPattern.Abstract.Employee;

import sun.security.x509.IssuerAlternativeNameExtension;

public class Consultant extends Employee {


    public Consultant(String name, String ID) {
        super(name, ID);
    }

    @Override
    public String computeCompensation(double salary, int allowence, int tax_deduction) {
        double sal=salary+allowence-tax_deduction;
        return ("Consultant:- Salary Base + alloence +overTime -tax deduction :"+sal);
    }
}
