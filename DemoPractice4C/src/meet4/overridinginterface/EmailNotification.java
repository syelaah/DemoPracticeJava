/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet4.overridinginterface;

/**
 *
 * @author sye
 */
public class EmailNotification implements InterfaceNotification{
    @Override
    public void sendNotification(){
        System.out.println("This is Email Notification");
    }
}
