/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet4.overriding;

/**
 *
 * @author sye
 */
public class SafariApp {
    public static void main(String[] args) {
        var animal = new Animal();
        
        animal.name = "Animal";
        System.out.println(animal.name);
        animal.makeSound();
        
        var bird = new Bird();
        
        bird.name = "Bird";
        System.out.println(bird.name);
        bird.makeSound();
        
        var duck = new Duck();
        
        duck.name = "Duck";
        System.out.println(duck.name);
        duck.makeSound();
        
        var chicken = new Chicken();
        
        chicken.name = "Chicken";
        System.out.println(chicken.name);
        chicken.makeSound();
    }
    
}
