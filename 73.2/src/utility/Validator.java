/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author PC
 */
public class Validator {
    
    // private constructor
    private Validator() {

    }

    // ucheck input is limit in [min,max]
    public static boolean isLimitInRange(int input, int min, int max) {
        return input >= min && input <= max;
    }

    // check input is greater than 0
    public static boolean isValidDouble(double input) {
        return input > 0;
    }

    //check string is empty
    public static boolean isValidString(String input) {
        return !input.trim().isEmpty();
    }

    //check valid integer
    public static boolean isValidInteger(int input) {
       return input > 0;
    }

}
