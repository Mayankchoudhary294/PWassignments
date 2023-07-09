interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class DrawShapes {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();

        Drawable rectangle = new Rectangle();
        rectangle.draw();
    }
}

