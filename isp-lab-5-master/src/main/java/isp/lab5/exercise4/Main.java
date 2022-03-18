package isp.lab5.exercise4;

public class Main {

    public static void main(String[] args) {
        AbstractShapeFactory roundedShapeFactory = ShapeFactoryProvider.getShapeFactory("rounded");
        AbstractShapeFactory normalShapeFactory = ShapeFactoryProvider.getShapeFactory("normal");

        // create instances
        Shape rectangle = roundedShapeFactory.getShape("roundedRectangle");
        Shape rSquare = roundedShapeFactory.getShape("roundedSquare");
        Shape square = normalShapeFactory.getShape("square");
        Shape shape = normalShapeFactory.getShape("rectangle");

        rSquare.draw();
        square.draw();
        rectangle.draw();
        shape.draw();
    }
}