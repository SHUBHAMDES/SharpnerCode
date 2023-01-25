package Comparatore;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    int Salary;
    String name;
    public Employee(int marks, String name){
        super();
        this.Salary =marks;
        this.name=name;
    }
    public String toString(){
        return "Employee[Salary ="+ Salary +",name="+name+"]";
    }
    public int getSalary(){
        return Salary;
    }
    public void getSalary(int Salary ){
        this.Salary =Salary ;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public int compareTo(Employee obj) {
        if(this.Salary >obj.Salary)return -1;
        else if(this.Salary <obj.Salary)return 1;
        return 0;
    }
}
class MainClass{
    public static void main(String[] args) {
        ArrayList<Employee>employees =new ArrayList<>();
        employees .add(new Employee(10000,"Kiran"));
        employees .add(new Employee(22100,"ram"));
        employees .add(new Employee(12000,"Aniket"));
        employees .add(new Employee(31500,"Rahul"));
        employees .add(new Employee(54000,"Jon"));

        Collections.sort(employees );

        employees .forEach(System.out::println);
    }
}
