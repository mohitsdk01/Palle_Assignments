package learning;

import java.util.*;
public class TenthFeb {
	
	public static int AverageThreeNumbers(int a, int b, int c) {
		float result = (a + b + c)/3;
		return (int) result;
	}
	
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	public static int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}
	
	public static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}
	
	public static int div(int a, int b) {
		int div = a / b;
		return div;
	}
	
	public static int SimpleInterest(int principal, int interestRate, int time) {
		int SI = principal * interestRate * time;
		return SI;
	}
	
	public static float AreaOfCircumference(int radius) {
		float areaOfCircum = (float) (2 * 3.14 * radius);
		return areaOfCircum;
	}
	
	public static float AreaOfTriangle(int base, int height) {
		float areaOfTrangle = (float) (0.5 * base * height);
		return areaOfTrangle;
	}
	
	public static float AreaOfSquare(float side) {
		float areaOfSquare = side * side;
		return areaOfSquare;
	}
	
	public static float PeriOfSquare(float side) {
		float periOfSq = 4 * side;
		return periOfSq;
	}
		
	public static float AreaOfRect(float width, float height) {
		float areaOfRect = width * height;
		return areaOfRect;
	}
	
	public static float PeriOfRect(float width, float height) {
		float aperiOfRect = 2*width + 2*height;
		return aperiOfRect;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		System.out.println("Enter Principal: ");
		int principal = sc.nextInt();
		System.out.println("Enter Interest: ");
		int interestRate = sc.nextInt();
		System.out.println("Enter Time: ");
		int time = sc.nextInt();
		System.out.println("Enter Radius of Circle: ");
		int radius = sc.nextInt();
		System.out.println("Enter Base of Triangle: ");
		int base = sc.nextInt();
		System.out.println("Enter Height of Triangle: ");
		int height = sc.nextInt();
		System.out.println("Enter length of Side of Square: ");
		float side = sc.nextInt();
		System.out.println("Enter length of width of Rectangle: ");
		float width = sc.nextInt();
		System.out.println("Enter length of height of Rectangle: ");
		float heightRec = sc.nextInt();
		
		
		System.out.println("The Average of Three Numbers is: " + AverageThreeNumbers(a, b, c));
		System.out.println("The sum of two Numbers is: " + sum(a, b));
		System.out.println("The subtraction of two Numbers is: " + sub(a, b));
		System.out.println("The multiplication of two Numbers is: " + mul(a, b));
		System.out.println("The division of two Numbers is: " + div(a, b));
		System.out.println("The Simple Interest is: " + SimpleInterest(principal, interestRate, time));
		System.out.println("The Area of Circumference is: " + AreaOfCircumference(radius));
		System.out.println("The Area of Triangle is: " + AreaOfTriangle(base, height));
		System.out.println("The Area of Square is: " + AreaOfSquare(side));
		System.out.println("The Perimeter of Square is: " + PeriOfSquare(side));
		System.out.println("The Area of Rectangle is: " + AreaOfRect(width, heightRec));
		System.out.println("The Perimeter of Rectangle is: " + PeriOfRect(width, heightRec));
	}

}
