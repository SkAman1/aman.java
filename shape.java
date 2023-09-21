interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

Circle circle = new Circle(5);
Rectangle rectangle = new Rectangle(10, 5);

double circleArea = circle.calculateArea();
double rectangleArea = rectangle.calculateArea();

System.out.println("Circle area: " + circleArea);
System.out.println("Rectangle area: " + rectangleArea);




  
