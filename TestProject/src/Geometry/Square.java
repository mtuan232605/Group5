package Geometry;

import java.util.Scanner;

public class Square extends Rectangle {
	public Square(){
		super();
	}
	public Square(double edge){
		super(edge,edge);
	}
	@Override
	public void input(){
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Edge:");
		width=legth=kb.nextDouble();	
	}
	@Override
	public void output(){
		System.out.println("Edge: "+width);
		super.output();
	}
	public static void main(String[] args) {
		
	}

}
