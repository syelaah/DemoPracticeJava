/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet3.inherit;

/**
 *
 * @author LENOVO
 */
public class ResearcherOfAI extends Researcher{
    void sayHello() {
        System.out.println("Hi everyone! I'm " 
                + this.name + ". I work on " + this.department);
    }
    String getPosition(){
        return "I am a Researcher of AI";
    }
    
}
