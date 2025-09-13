// Question 1: Shape Hierarchy
class Shape {
    public Shape() {
        System.out.println("Shape Constructor");
    }
    public void draw() {
        System.out.println("Shape draw");
    }
    public void erase() {
        System.out.println("Shape erase");
    }
    public static Shape randshape() {
        switch ((int) (Math.random() * 3)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            default:
                System.out.println("Default Case");
                return new Shape();
        }
    }
}

class Circle extends Shape {
    public Circle() {
        System.out.println("Circle Constructor");
    }
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
    @Override
    public void erase() {
        System.out.println("Circle erase");
    }
}

class Triangle extends Shape {
    public Triangle() {
        System.out.println("Triangle Constructor");
    }
    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }
    @Override
    public void erase() {
        System.out.println("Triangle erase");
    }
}

class Square extends Shape {
    public Square() {
        System.out.println("Square Constructor");
    }
    @Override
    public void draw() {
        System.out.println("Square draw");
    }
    @Override
    public void erase() {
        System.out.println("Square erase");
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Shape shape = Shape.randshape();
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}
