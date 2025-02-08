/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet4.overridinginterface;

/**
 *
 * @author sye
 */
public class MobileApp {
    public static void main(String[] args) {
        var email = new EmailNotification();
        email.sendNotification();
        
        var push = new PushNotification();
        push.sendNotification();
    }
}
