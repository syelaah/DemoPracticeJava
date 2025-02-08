/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet4;

/**
 *
 * @author sye
 */
public class Employee {
    Employee(String name, String department){
        setName(name);
        setDepartment(department);
    }
    
    Employee(String name, String department, int salary){
        this(name, department);
        setSalary(salary);
    }
    
    Employee(String name, String department, int salary, String gender){
        this(name, department, salary);
        setGender(gender);
    }
    
    String name;
    String department;
    String gender;
    int salary = 0;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0){
            this.salary = 0;    
        }  
        
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    String sayHello() {
        return "Hello! I'm " + this.name + ". I work on " + this.department;
    }
    
    String sayHello(int age){
//        return "Hello! I'm " + this.name 
//                + ". I work on " + this.department 
//                + " I am " + age + " years old ";
    
    return this.sayHello()
            + " I am " + age + " years old";
    }
    
    String sayHello(int age, double height){
//        return "Hello! I'm " + this.name 
//                + ". I work on " + this.department 
//                + " I am " + age + " years old "
//                + "and my height is " + height + " cm ";
    
    return this.sayHello(age)
            +  " and my height is " + height + " cm";
    }
}
