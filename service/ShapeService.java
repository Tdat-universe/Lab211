/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.*;

/**
 *
 * @author PC
 */
public class ShapeService {

    public double getCircleArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public double getCirclePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    //rectangle
    public double getRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getLength();
    }

    public double getRectanglePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getLength());
    }

    // Triangle
    public double getTrianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    public double getTriangleArea(Triangle triangle) {
        double p = getTrianglePerimeter(triangle) / 2;
        return Math.sqrt(p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()));
    }
}
