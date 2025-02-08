/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet4;

/**
 *
 * @author sye
 */
public class EmployeeApp {
     public static void main(String[] args) {
         
        String name = "Fadil";
        String department = "Research";
        
        var fadil = new Employee(name, department);
        
        System.out.println(fadil.sayHello());
        System.out.println(fadil.sayHello(28));
        System.out.println(fadil.sayHello(28, 178.4));
        System.out.println("Fadil salary = " + fadil.getSalary());
        
        int salary = 12_000_000;
        name = "Jaya";
        department = "DevOps";
        
        var jaya = new Employee(name, department, salary);
          
        System.out.println(jaya.getName());
        System.out.println(jaya.getDepartment());
        System.out.println(jaya.getSalary());
        
        name = "Luna";
        department = "IT Support";
        String gender = "Female";
        
        var luna = new Employee(name, department, salary, gender);
          
        System.out.println(luna.getName());
        System.out.println(luna.getDepartment());
        System.out.println(luna.getSalary());
         System.out.println(luna.getGender());
     }
}
