package Geometry;

public abstract class Shape {
	//sd duoc declare fields: private, protected, public, default, stattic, final
	//co cac constructor
	public Shape(){
		//System.out.println("This is abstract class Shape");
	}
	public void A(){
		//System.out.println("A");
	}
	public abstract void input();
	public abstract void output();
	public abstract double area();
	public abstract double perimeter();
	public static void main(String[] args) {
		

	}

}
