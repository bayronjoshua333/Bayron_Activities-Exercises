package Triangle;

public class RightTriangle extends Triangle{
	private double side;
	
	public RightTriangle (double base, double height, double side) {
		super(base, height);
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return (super.getBase()*super.getHeight())/2;
	}
	
	@Override
	public double calculatePerimeter() {
		return super.getBase()+super.getHeight()+side;
	}
}
