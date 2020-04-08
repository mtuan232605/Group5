package Geometry;

import java.util.Scanner;

public class Circle extends Shape {
	protected final double pi=3.14;
	protected double r;
	public void setR(double rr){
		if (r<0) r=0;
		else r=rr;
				
	}
	public double getR(){
		return r;
	}
	public double perimeter()
	{
		return pi*2*r;
	}
	public double area()
	{
		return pi*r*r;
	}
	@Override
	public void input(){
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter R:");
		setR(kb.nextDouble());
	}
	@Override
	public void output(){
		System.out.println("Perimeter:"+perimeter());
		System.out.println("Area:"+area());
	}
	public Circle(){}
	public Circle(double r){
		 setR(r);
	}
	public static void main(String[]args)
	{
		Circle t1=new Circle();
		t1.r=5;
		System.out.println("Chu vi hinh tron 1:"+t1.perimeter());
		System.out.println("Dien tich hinh tron 1:"+t1.area());
		Circle t2=new Circle();
		t2.r=8;
		System.out.println("Chu vi hinh tron 2:"+t2.perimeter());
		System.out.println("Dien tich hinh tron 2:"+t2.area());
	}
}
