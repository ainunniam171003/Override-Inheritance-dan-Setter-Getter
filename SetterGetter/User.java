/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterGetter;

/**
 *
 * @author WINDOWS 10
 */
public class User {
    private String username ;
    private String password;
    
    public void setUsername (String username){
        this.username = username;
    }
    public void setPassword (String password){
        this.password = password;
    }
    
    public String GetUsername(){
        return this.username ;
    }
    
    public String GetPassword(){
        return this.password;
    }
}
