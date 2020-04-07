
import java.util.Scanner;
public class Triangle  {
    private double a,b,c;
    public void setA(double aa){
		if (a<0) a=0;
		else a=aa;
	}
    public void setB(double bb){
		if (b<0) b=0;
		else b=bb;
	}
    public void setC(double cc){
		if (c<0) c=0;
		else c=cc;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public Triangle(){
	}
	public Triangle(double aa,double bb,double cc){
		setA(aa);
		setB(bb);
		setC(cc);
	}
    public double perimeter()
    {
    	return a+b+c;
    }
    public double area()
    {
    	if(a+b>c&&a+c>b&&b+c>a){
    	double p=(a+b+c)/2;
    	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    	return 0;
    }
    
    public void  input(){
    	Scanner kb=new Scanner(System.in);
    	System.out.println("Enter A: ");
    	setA(kb.nextDouble());
    	System.out.println("Enter B: ");
    	setB(kb.nextDouble());
    	System.out.println("Enter C: ");
    	setC(kb.nextDouble());
    }
   
    public void output(){
    	System.out.println("Perimeter: "+perimeter());
		System.out.println("Area: "+area());
    }
    public static void main(String[]args)
    {
    	/*Triangle r1=new Triangle();
    	r1.a=3;
    	r1.b=4;
    	r1.c=5;
    	System.out.println("Chu vi tam giac 1: "+r1.perimeter());
		System.out.println("Dien tich tam giac 1: "+r1.area());
		Triangle r2=new Triangle();
    	r2.a=5;
    	r2.b=6;
    	r2.c=4;
    	System.out.println("Chu vi tam giac 1: "+r2.perimeter());
		System.out.println("Dien tich tam giac 1: "+r2.area());
		*/
		Triangle r3=new Triangle(1,2,3);
		System.out.println(r3.getA()+","+r3.getB()+","+r3.getC());
    }
}
