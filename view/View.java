/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import util.Validation;
import cotroller.ShapeController;
import model.*;

/**
 *
 * @author PC
 */
public class View {

    private Validation checkInput = new Validation();
    private ShapeController controller = new ShapeController();

    public void program() {
        System.out.println("=====Calculator Shape Progeram=====");
        double width = checkInput.checkInput("Please input side width of Rectangle: ");
        double length = checkInput.checkInput("Please input side width of Rectangle: ");
        double radius = checkInput.checkInput("Please input side width of Circle: ");
        double sideA = checkInput.checkInput("Please input side A of Triangle: ");
        double sideB = checkInput.checkInput("Please input side B of Triangle: ");
        double sideC = checkInput.checkInput("Please input side C of Triangle: ");

        Rectangle rectangle = new Rectangle(length, width);
        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        String output = formatOutput(rectangle, circle, triangle);
        System.out.println(output);
    }

    private String formatOutput(Rectangle r, Circle c, Triangle t) {

        double rectArea = controller.getRectangleArea(r);
        double rectPerimeter = controller.getRectanglePerimeter(r);

        double circleArea = controller.getCircleArea(c);
        double circlePerimeter = controller.getCirclePerimeter(c);

        double triArea = controller.getTriangleArea(t);
        double triPerimeter = controller.getTrianglePerimeter(t);

        return String.format(
                "-----Rectangle-----\n"
                + "Width: %.1f\n"
                + "Length: %.1f\n"
                + "Area: %.1f\n"
                + "Perimeter: %.1f\n"
                + "-----Circle-----\n"
                + "Radius: %.1f\n"
                + "Area: %.2f\n"
                + "Perimeter: %.2f\n"
                + "-----Triangle-----\n"
                + "Side A: %.1f\n"
                + "Side B: %.1f\n"
                + "Side C: %.1f\n"
                + "Area: %.2f\n"
                + "Perimeter: %.1f\n",
                r.getWidth(), r.getLength(), rectArea, rectPerimeter,
                c.getRadius(), circleArea, circlePerimeter,
                t.getSideA(), t.getSideB(), t.getSideC(), triArea, triPerimeter
        );
    }
}
