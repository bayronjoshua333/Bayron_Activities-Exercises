package Triangle;

public class Iscosceles extends Triangle{

	
	public Iscosceles (double base, double side) {
		super(base, side);
	}
	
	@Override
	public double calculateArea() {
		double compute = Math.sqrt(Math.pow(super.getHeight(), 2)-Math.pow(super.getBase()/2, 2));
		return (super.getBase()*compute)/2;
	}
	
	@Override
	public double calculatePerimeter() {
		return super.getBase()+(2*super.getHeight());
	}
}