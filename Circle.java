package com.ThursdayLab;

public class CIRCLE {
	private static int count;  
	float center,radius;
	public Circle(float c,float r) {
		this.center=c;
		this.radius=r;
		count++;
	}
	Circle(){
		System.out.println("this a default constructor");  
		count++;
	}
void display() {
	System.out.println("Center:"+center+" "+"radius:"+radius);
}
	public static void main(String[] args) {
		Circle c1=new Circle(43.6f,24.7f);
		Circle c2=new Circle(23.4f,29.9f);
		c1.display();
		c2.display();
		Circle c3=new Circle();
		System.out.print("Total Number of Instance: " + Circle.count); 
		
	}

}