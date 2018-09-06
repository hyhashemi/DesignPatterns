interface Shapes{
	public void draw();
}

class Rectangle implements Shapes{
	int x, y;

	public Rectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void draw() {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Line implements Shapes{
	int x;

	public Line(int x){
		this.x = x;
	}
	
	public void draw() {
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

class Triangle implements Shapes{
	int x;
	
	public Triangle(int x){
		this.x = x;
	}
	
	public void draw() {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}

class ShapeDrawer{
	private Rectangle rectangle;
	private Line line;
	private Triangle triangle;
	
	public void drawRectangle(int x, int y){
		rectangle = new Rectangle(x,y);
		rectangle.draw();
	}
	
	public void drawLine(int x){
		line = new Line(x);
		line.draw();
	}
	
	public void drawTriangle(int x){
		triangle = new Triangle(x);
		triangle.draw();
	}
}
public class FacadeExample {
	public static void main(String[] args) {
		ShapeDrawer shapeDrawer = new ShapeDrawer();
		shapeDrawer.drawLine(10);
		shapeDrawer.drawRectangle(4, 5);
		shapeDrawer.drawTriangle(4);
	}
}
