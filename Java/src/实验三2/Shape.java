package สตั้ศý2;

public class Shape {
	public double width;
	public double length;
	public double area;
	public double Perimeter;
	
public double getArea() {
	return area;
}
public double getPerimeter() {
	return Perimeter;
}
}

class Triangle extends Shape{
	public double sideA;
	public double sideB;
	public double sideC;
	public double getPerimeter() {
		Perimeter = sideA + sideB + sideC;
		return Perimeter;
	}
}
class rectangle extends Shape{
	public double getArea() {
		area =width*length;
		return area;
	}
	public double PerimeterGraphical() {
		Perimeter = (width + length) * 2;
		return Perimeter;
	}
}


