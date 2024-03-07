package week1.assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		int num=12321,temp,i,rem;
		temp=num;
		for (i=0;num>0;num/=10) {
			
		rem=num%10;
		i= (i*10)+rem;
		}
		if(temp==i){
			System.out.println(temp+"is a palindrome number");
			}
		else {
			System.out.println(temp+"is not palindrome number");
			
	
		}
		
		}
}
	


