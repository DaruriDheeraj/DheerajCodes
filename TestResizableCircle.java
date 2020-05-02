//Define Geometric interface and define two abstract methods getPerimeter and getArea
interface GeometricObject {
    void getPerimeter();
    void getArea();
}
//Create Resizable interface and define one abstract method resizeable
interface Resizable {
    void Resize(int a);
}
//Define Circe class which inmplements abstract method and call two methods perimeter and area
class Circle implements GeometricObject {
    //declare the radius value 1.0 as protected 
    protected double radius=1.0,Perimeter,Area;
//define the getPerimeter method by using public keyboard
    public void getPerimeter() {
        Perimeter=2*3.14*radius; //Calculating perimeter of a circle 2*π*r(π=3.14)
        System.out.println("The Perimeter of a circle is "+Perimeter); //display the perimeter
    }
//define the getArea method by using public keyboard
    public void getArea() {
        Area=3.14*radius*radius; //calcualting the area of a circle π*r*r(π=3.14)
        System.out.println("The Area of a circle is "+Area); //display the area
    }
}
//Defind a ResizableCircle which will take the value of radius from parent class Circle and change the dimenstion by calling Resize method
class ResizableCircle extends Circle implements Resizable {
    public void Resize(int a) {
     double dim;
     dim=radius*((double)a/100);
     System.out.println("The radius is modified "+dim); //display the resize value 
    }
}
public class TestResizableCircle
{
	public static void main(String[] args) {
	    Circle c=new Circle(); //create an object for circle class
	    c.getPerimeter();//call the getperimeter method
	    c.getArea();//call the getarea method
	    ResizableCircle r=new ResizableCircle();//create an object for ResizeableCircle class
	    r.Resize(20);//call resize method by using ResizableCircle
		
}
}