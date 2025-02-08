/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.inherit;

/**
 *
 * @author LENOVO
 */
public class Manager extends Employee{
    private int salary;
    private final String POSITION = "manajer";
    private int gender;

   
    void setSalary(int salary){
        this.salary = salary;
    }
    
    int getSalary(){
        return this.salary;
    }
    
    String getPosition(){
        return this.POSITION;
    }
    @Override
    void sayHello() {
        System.out.println("Hi friends! I'm " 
                + this.name + ". I work on " + this.department);
    }
}