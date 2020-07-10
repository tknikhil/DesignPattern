package basicPattern.Abstract.Employee;

import java.io.FileWriter;

public abstract class Employee {
    String name;
    String ID;

    public Employee(String name,String ID){
        this.name=name;
        this.ID=ID;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }

    public String toString(){
        String str="Emp Name::"+getName()+" Emp Id::"+getID();
        return str;
    }

    public void save(){
        try {
            FileWriter writer = new FileWriter("emp.txt");
            writer.write(this.toString());
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //variable part of the behaviour
    public abstract String computeCompensation(double salary, int allowence, int tax_deduction);

}
