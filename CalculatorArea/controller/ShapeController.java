/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.ShapeView;
import model.*;
import util.Validation;

/**
 *
 * @author PC
 */
public class ShapeController {

    private ShapeView view = new ShapeView();
    private Validation checkInput = new Validation();

    public void run() {
        view.title();
        double width = checkInput.checkInput("Please input side width of Rectangle: ");
        double length = checkInput.checkInput("Please input side width of Rectangle: ");
        double radius = checkInput.checkInput("Please input side width of Circle: ");
        double sideA = checkInput.checkInput("Please input side A of Triangle: ");
        double sideB = checkInput.checkInput("Please input side B of Triangle: ");
        double sideC = checkInput.checkInput("Please input side C of Triangle: ");

        Shape rectangle = new Rectangle(width, length);
        Shape circle = new Circle(radius);
        checkInput.checkTriangle(sideA, sideB, sideC);
        Shape triangle = new Triangle(sideA, sideB, sideC);
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
