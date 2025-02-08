/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.inherit;

/**
 *
 * @author LENOVO
 */
public class EmployeeApp {
    public static void main(String[] args) {
        var fadil = new Employee();
        
        fadil.name = "Fadil";
        fadil.department = "software dev.";
        fadil.sayHello();
        
        var joko = new Manager();
        
        joko.name = "joko";
        joko.department = "software dev.";
        joko.sayHello();
        System.out.println("I am a " + joko.getPosition());
        
        joko.setSalary(10_000_000);
        System.out.println("salary = " + joko.getSalary());
        
        var lani = new Researcher();
        
        lani.name = "lani";
        lani.department = "Research and Dev";
        lani.sayHello();
        System.out.println(lani.getPosition());
        
        var uwu = new ResearcherOfAI();
        
        uwu.name = "uwu";
        uwu.department = "Research and Dev";
        uwu.sayHello();
        System.out.println(uwu.getPosition());
    }
    
}
