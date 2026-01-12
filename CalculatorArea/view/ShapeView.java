/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.*;

/**
 *
 * @author PC
 */
public class ShapeView {

    private Scanner sc = new Scanner(System.in);

    public double input(String message) {
        System.out.println(message);
        return sc.nextDouble();
    }

    public void title() {
        System.out.println("=====Calculator Shape Progeram=====");
    }
}
