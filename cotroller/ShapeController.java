/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotroller;

import service.ShapeService;
import model.*;

/**
 *
 * @author PC
 */
public class ShapeController {

    private ShapeService shapeService = new ShapeService();

    public double getCircleArea(Circle circle) {
        return shapeService.getCircleArea(circle);
    }

    public double getCirclePerimeter(Circle circle) {
        return shapeService.getCirclePerimeter(circle);
    }

    // ===== RECTANGLE =====
    public double getRectangleArea(Rectangle rectangle) {
        return shapeService.getRectangleArea(rectangle);
    }

    public double getRectanglePerimeter(Rectangle rectangle) {
        return shapeService.getRectanglePerimeter(rectangle);
    }

    // ===== TRIANGLE =====
    public double getTriangleArea(Triangle triangle) {
        return shapeService.getTriangleArea(triangle);
    }

    public double getTrianglePerimeter(Triangle triangle) {
        return shapeService.getTrianglePerimeter(triangle);
    }
}
