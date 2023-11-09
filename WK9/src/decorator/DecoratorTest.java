package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		RedShapeDecorator red = new RedShapeDecorator(circle);
		BlueShapeDecorator blue = new BlueShapeDecorator(rectangle);
		
		System.out.println("This is Circle class");
		circle.draw();
		
		System.out.println();
		
		System.out.println("This is Rectangle class");
		rectangle.draw();
		
		System.out.println();
		
		System.out.println("This is Blue Decorator");
		blue.setBlueBorder(blue);
		
		System.out.println();
		
		System.out.println("This is Red Decorator");
		red.setRedBorder(red);
		System.out.println("\nCalling redShapeDecorator draw()");
		red.draw();
		
		
	}

}
