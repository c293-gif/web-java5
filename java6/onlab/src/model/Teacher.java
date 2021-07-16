package model;

import java.text.DecimalFormat;

public class Teacher extends Person {
    private long salary;


    public Teacher(String name, int age, Address address, long salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    public static String formatMoney(long salary){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(salary);
        
    }

   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + formatMoney(salary);
    }

   

     
    @Override
    public void study() {
        // TODO Auto-generated method stub
        super.study();
    }

    
}
