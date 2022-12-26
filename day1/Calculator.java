package week1.day1;

public class Calculator {
	public int add2(int a,int b) {
		return a+b;
			}
	public int add3(int a,int b,int c) {
		return a+b+c;
	}
	public int mul2(int x,int y) {
		return x*y;
	}
	public double mul3(int p,double q) {
		return p*q;
	}
	public int sub2(int a,int b) {
		return a-b;
	}
	public double sub3(int a,double b) {
		return a-b;
	}
	public int div2(int p,int q) {
		return p/q;
	}
	public double div3(double p,int q) {
		return p/q;
	}
	public static void main(String[] args) {
		Calculator cl=new Calculator();
		System.out.println(cl.add2(10,5));
		System.out.println(cl.add3(10,5,15));
		System.out.println(cl.mul2(10,5));
		System.out.println(cl.mul3(10,15.540d));
		System.out.println(cl.sub2(10,5));
		System.out.println(cl.sub3(10,50.53d));
		System.out.println(cl.div2(10,5));
		System.out.println(cl.div3(100.50d,5));
	}
}
