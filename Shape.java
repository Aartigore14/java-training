abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    void calculateArea(){
        double area = 3.14* radius*radius;
        System.out.println("Area of Circle is "+area);
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    void calculateArea(){
        double area = length*width;
        System.out.println("Area of Rectangle is:"+area);
    }
}

void main() {
    Shape c = new Circle(4);
    Shape r = new Rectangle(5,8);
    c.calculateArea();
    r.calculateArea();
}
