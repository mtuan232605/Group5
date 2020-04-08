package Geometry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ArrayOfShape {
	private Shape a[]=new Shape[100];
	private int n;
	public int getN(){
		return this.n;
	}
	public void setN(int n){
		this.n=n;
	}
	
	public void input(){
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter N:");
		setN(kb.nextInt());
		for(int i=0;i<this.n;i++){
			System.out.println("Geometry "+(i+1)+":");
			System.out.println("1-Rectangle/2-Triangle/3-Circle/4-Square/5-Cylinder");
			int choose=kb.nextInt();
			if(choose==1){
				Shape r=new Rectangle();
				r.input();
				a[i]=r;
			}
			else if(choose==2){
				Shape t=new Triangle();
				t.input();
				a[i]=t;
			}
			else if(choose==3){
				Shape c=new Circle();
				c.input();
				a[i]=c;
			}
			else if(choose==4){
				Shape c= new Square();
				c.input();
				a[i]=c;
			}
			else if(choose==5){
				Shape c= new Cylinder();
				c.input();
				a[i]=c;
			}
			
		}
	}
	public void readFile() throws FileNotFoundException{
		Scanner kb=new Scanner(new File("src/geometry/input.txt"));
		while (kb.hasNext()==true){
			if(kb.next().equals("Rectangle")==true){
				Shape s=new Rectangle(kb.nextDouble(),kb.nextDouble());
				a[n]=s;
				n++;
			}
			else{ kb.nextLine(); if(kb.next().equals("Triangle")==true){
				Shape s=new Triangle(kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
				a[n]=s;
				n++;
			}
			else{ kb.nextLine(); if(kb.next().equals("Circle")==true){
				Shape s=new Circle(kb.nextDouble());
				a[n]=s;
				n++;
			}else kb.nextLine();}
			}
		}
	}
	public void output(){
		for(int i=0;i<this.n;i++){
			System.out.println("==================");
			if(a[i] instanceof Rectangle){ 
				if(a[i] instanceof Square) System.out.println("Shape "+(i+1)+" Square: "); 
				else System.out.println("Shape "+(i+1)+" Rectangle: ");
			}
			if(a[i] instanceof Triangle) System.out.println("Shape "+(i+1)+" Triangle: ");
			if(a[i] instanceof Circle){
				if(a[i] instanceof Circle) System.out.println("Shape "+(i+1)+" Cylinder: ");
				else System.out.println("Shape "+(i+1)+" Circle: ");}
			a[i].output();
		}
		System.out.println("==================");
	}
	public static void main(String[] args) throws FileNotFoundException {
		ArrayOfShape arr=new ArrayOfShape();
		arr.input();
		arr.output();
		//arr.readFile();
		//arr.output();
	}

}
