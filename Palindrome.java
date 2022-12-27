package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343,rem,sum=0,temp;
		temp=num;
		while(num!=0){
			rem=num%10;
		    sum=(sum*10)+rem;
		    num=num/10;
		}
		if(sum==temp) {
		System.out.println("palindrome");
	}
		else {
			System.out.println("not palindrome");
		}
	
	}
}
