/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterGetter;

/**
 *
 * @author WINDOWS 10
 */
public class MainUtama {
    public static void main(String[] args) {
        User user = new User();
        
        user.setUsername("LibriaPutri");
        user.setPassword("libri");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Paswordnya = " + user.GetPassword());
    }
}
