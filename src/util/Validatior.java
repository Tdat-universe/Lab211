/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import consant.Message;
/**
 *
 * @author PC
 */
public class Validatior {
    public static boolean checkUser(String inputUser){
        if(inputUser.length()<5 || inputUser.contains(" ") ){
            System.err.println(Message.ERROR_USER);
            return false;
        }
        return true;
    }
     public static boolean checkPassword(String inputPassword){
        if(inputPassword.length()<6 || inputPassword.contains(" ") ){
            System.err.println(Message.ERROR_PASSWORD);
            return false;
        }
        return true;
    }
    
}
