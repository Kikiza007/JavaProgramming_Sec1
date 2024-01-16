
public class Circle {
	
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	private double radius;
	private String color;
	
	Circle(){ //Default Constructor
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
	}
	
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
		
	}
	
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
		
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return "Circle[redius = "+radius+".color="+color+"]";
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getCircumference() {
		return 2.0*Math.PI*getRadius();
	}
	

}
