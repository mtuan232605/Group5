package geometry;

import java.util.Scanner;

public class cylinder  {
	private double h,r;
	private double pi=3.14;

	public double getHeight(){
		return h;
	}

	public void setHeight(double height){
		if(this.h<=0) this.h=1;
		this.h = height;
	}
	public double areaAround(){
		return 2*pi*r*h;
	}
	public double fullArea(){
		return 2*pi*r*(r+h);
	}
	public double volume(){
		return pi*r*r*h;
	}
	
	public void input(){
		Scanner kb=new Scanner(System.in);
		input();
		System.out.println("Enter Height:");
		setHeight(kb.nextDouble());
	}
	public void output(){
		System.out.println("Height: "+h+"\tR: "+r);
		System.out.println("Area Around: "+areaAround());
		System.out.println("Full Area: "+fullArea());
		System.out.println("Volume: "+volume());
	}
}

