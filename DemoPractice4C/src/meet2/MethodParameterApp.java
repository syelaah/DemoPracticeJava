/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet2;

/**
 *
 * @author SYELA
 */
public class MethodParameterApp {
    public static void main(String[] args) {
        //MethodParameter demo = new MethodParameter();
        var demo = new MethodParameter("syela", "4.4", 2022);
        
        System.out.println(demo.version);
        System.out.println(demo.year);
        
        demo.read("syela");
        demo.read("mark");
        demo.sayHi("syela","Unsika", 19);
        demo.sayHi("Siti","UIN Jakarta", 18);
        
        var myName = "Ani";
        var myAge = 21;
        var myCampus = "UI";
        
        demo.sayHi(myName, myCampus, myAge);
    }
}
