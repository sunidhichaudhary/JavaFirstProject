package Week8.SapientAssignment;

public class Number {

public int checkPrime(int x) {
	
	for(int i=2;i<Math.sqrt(x);i++)
	{
		if(x%i==0)
			return 0;
	}
	return 1;
}
 public boolean checkArmstrong(int x)
 {
	 int Num, rem, result = 0;
	    
	    Num = x;

	    while (Num != 0) {
	       
	       rem = Num % 10; 
	       result += rem * rem * rem;
	       Num /= 10;
	    }

	    if (result == x)
	       return true;
	          return false;
 }
 
 public boolean checkPalindrome(int x)
 {
	 int i=0;
	 int j=x;
		while(j>0)
		{
			i=i*10+j%10;
			j=j/10;
		}
		if(i==x)
			return true;
		return false;
 }

}
