package oops.Polymorphism.Overriding;

public class Hexagon extends Shape
{
	
	@Override
	public void draw()
	{
		super.draw();   //super keyword execute parent class method
		System.out.println("Hexagon child class method");
	}
	
	

	public static void main(String[] args) {
		
		Shape shp=new Hexagon();
		shp.draw();
	}

}
