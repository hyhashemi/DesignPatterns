interface Shape{
	public void draw();
}

class Square implements Shape{
	public void draw(){
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('.');
			}
			System.out.println();
		}
	}
}

class SquareDecorator implements Shape{
	Shape shape;
	public SquareDecorator(Shape square) {
		this.shape = square;
	}
	public void draw(){	
		for (int i = 0; i < 5; i++) {
			System.out.print("*");	
		}
		System.out.println();
		shape.draw();
	
		for (int i = 0; i < 5; i++) {
			System.out.print("*");	
		}
		System.out.println();
	}
	
	
}
public class DecoratorExample {
	public static void main(String[] args) {
		SquareDecorator sd =  new SquareDecorator(new Square());
		SquareDecorator sd2 = new SquareDecorator(sd);
		SquareDecorator sd3 = new SquareDecorator(sd2);
		sd3.draw();
	}
}
