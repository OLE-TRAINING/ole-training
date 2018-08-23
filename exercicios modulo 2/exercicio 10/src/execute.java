import java.util.Scanner;
public class execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(n<0)
		{
			n*=-1;
			ehPrimo(n);
		}
		else
		 ehPrimo(n);
		
		
	}
	
	
	public static void ehPrimo(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print("Divisivel por:"+i);
				flag=1;
				break;
			}
		}
		
		if(flag==1 ||  n==0)	
		System.out.println(" portanto NAO eh PRIMO");
		else
		{	
				System.out.println("eh PRIMO");
		}
	}

}
