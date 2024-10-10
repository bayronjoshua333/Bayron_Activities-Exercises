package Triangle;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle rightTriangle = new RightTriangle(4.0,5.0,3.0);
		System.out.println("Right Triangle Area: " + rightTriangle.calculateArea());
		System.out.println("Right Triangle Perimeter "+ rightTriangle.calculatePerimeter());
		Triangle iscosceles = new Iscosceles(30, 50);
		System.out.println("Iscosceles Triangle Area "+ iscosceles.calculateArea());
		System.out.println("Iscosceles Triangle Perimeter "+ iscosceles.calculatePerimeter());
	}
}
