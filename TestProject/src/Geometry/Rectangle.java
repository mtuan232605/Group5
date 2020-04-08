package Geometry;

import java.util.Scanner;

public class Rectangle extends Shape {
	//khai bao thuoc tinh
	
	protected double width,legth;
	public void setLegth(double l){
		if (l<0) legth=0;
		else legth=l;
	}
	public void setWidth(double w){
		if (w<0) width=0;
		else width=w;
				
	}
	public double getLegth(){
		return legth;
	}
	public double getWidth(){
		return width;
	}
	public Rectangle(){	}
	public Rectangle(double l,double w){
		setLegth(l);
		setWidth(w);
	}
	@Override
	public void input(){
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter Leght: ");
		setLegth(kb.nextDouble());
		System.out.println("Enter Width: ");
		setWidth(kb.nextDouble());
	}
	public double area(){
		return legth*width;
	}
	public double perimeter(){
		if(legth>0 && width >0){
		return(legth + width)*2;}
		return 0;
	}
	@Override
	public void output(){
		System.out.println(getLegth());
		System.out.println(getWidth());
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
	
	public static void main(String[] args) {
		/*Rectangle r1= new Rectangle();
		r1.legth=5;
		r1.width=3;
		System.out.println(r1.area());
		System.out.println(r1.perimeten());
		
		Rectangle r2= new Rectangle();
		r2.legth=8;
		r2.width=2;
		System.out.println(r2.area());
		System.out.println(r2.perimeten());*/
		Rectangle r1= new Rectangle();
		System.out.println(r1.getLegth());
		System.out.println(r1.getWidth());
		
		Rectangle r2= new Rectangle(155555,5);
		System.out.println(r2.getLegth());
		System.out.println(r2.getWidth());
		
	}

}
