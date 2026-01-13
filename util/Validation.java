/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validation {
    private Scanner sc = new Scanner(System.in);
    public double checkInput(String message){
        
        while(true){
            try{
                System.out.println(message);
                String s = sc.nextLine();
                double value = Double.parseDouble(s);
                if(value>0){
                    return value;
                } System.err.println("Value must be greater than 0");
            }catch(NumberFormatException e){
                System.err.println("Input is not format");
            }
        }
    }
}
