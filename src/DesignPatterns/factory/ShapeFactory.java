package DesignPatterns.factory;

public class ShapeFactory {

    Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default: return null;
        }
    }
}
