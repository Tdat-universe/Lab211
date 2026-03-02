/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author PC
 */
public class Validator {

    public static int isValidUser(String input) {
        if (input.length() < 5) {
            return -1;
        }
        if (input.contains(" ")) {
            return 0;
        }
        return 1;
    }

    public static int isValidPassword(String input) {
        if (input.length() < 6) {
            return -1;
        }
        if (input.contains(" ")) {
            return 0;
        } return 1;
    }
}
