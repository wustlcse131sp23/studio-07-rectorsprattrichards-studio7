package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	public Rectangle(double initLength, double initWidth) {
		length=initLength;
		width=initWidth;
	}
	public double area(double length, double width) {
		return length * width;
	}
	public double perimeter(double length, double width) {
		return (length*2)+(width *2);
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public boolean square( double length, double width) {
		if(length==width) {
			return true;
		}
		else {
			return false;
		}
	}
		public boolean smallerArea(Rectangle A, Rectangle B) {
			if(area(A.getLength(), A.getWidth()) < (area(B.getLength(), B.getWidth()))){
				return true;
		}
			else {
				return false;
			}
		
	
}
}