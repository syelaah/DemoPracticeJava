/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet2;

/**
 *
 * @author SYELA
 */
public class MethodParameter {
    public MethodParameter(String name, String version, int year){
        //costructor
        System.out.println("[!!] Object CREATED");
        //version = paramVersion;
        this.version = version;
        this.year = year;
        this.read(name);
    }
    
    String version;
    int year;
    
    void read(String name){
        System.out.println(name + " is read method.");
    }
    
    void sayHi(String name, String campusName, int age){
        System.out.println("Hi! My name is " + name + " I am " + age + " y.o");
        System.out.println("I am from " + campusName);
    }
}
