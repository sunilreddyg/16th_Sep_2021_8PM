package oops.Polymorphism.Overriding;

public class Square extends Shape
{
	@Override
	public void draw()
	{
		
		System.out.println("Square class method ");
	}
	
	

	public static void main(String[] args) {
		
		Shape shp=new Square();
		shp.draw();
		
	

	}

}
