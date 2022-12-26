package week1.day1;

public class MobileAssign {
	public void makecall() {
System.out.println("call");
String mobileModel="Redmi";
float mobileWeight=20.598f;
System.out.println(mobileModel+" is my mobilemodel");
System.out.println(mobileWeight+" weight of my mobile");
	}
public void senMSg() {
	System.out.println("msg sent");
	boolean FullCharged=true;
	int mobileCost=22000;
	System.out.println(FullCharged+" charged fully");
	System.out.println(mobileCost+" COst of the mobile");
}
	public static void main(String[] args) {
MobileAssign ma=new MobileAssign();
ma.makecall();
ma.senMSg();
System.out.println("This is my mobile");
	}

}
