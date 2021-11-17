package Tests.JavaSE16;

import java.awt.*;

public class test {
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new Cycle();
        Shape shape3 = new Rect();
        drawShape(shape1);
        drawShape(shape2);
        drawShape(shape3);
    }
    public static void drawShape(Shape shape){
        shape.draw();
    }
}
