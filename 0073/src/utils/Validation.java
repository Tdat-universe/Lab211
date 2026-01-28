/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author PC
 */
public class Validation {

    private Validation() {

    }

    public static boolean isLimitInRange(int input, int min, int max) {
        return input >= min && input <= max;
    }
    public static boolean isDouble(double input){
        return input > 0;
    }
    public static boolean validString(String input){
        return !input.trim().isEmpty();
    }
    public static boolean isInt(int input){
        return input > 0;
    }
}
