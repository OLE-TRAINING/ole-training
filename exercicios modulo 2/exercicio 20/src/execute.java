import java.util.Scanner;
public class execute {

	public static void main(String[] args) {
		  Scanner s= new Scanner(System.in);
		  System.out.println("digite a altura da forma:");
		  int n = s.nextInt();
		  
		  
		  
		  for(int i=0;i<n;i++){
			  for(int j=0;j<=i;j++){
				 if(j<=i)
					 System.out.print("*");
			  }
			  System.out.println();
		  }
		  
		  
		  
		  for(int i=n;i!=0;i--){
			  for(int j=0;j<i;j++){
				 if(j<=i)
					 System.out.print("*");
			  }
			  System.out.println();
		  } 
		  
		  
		 
		  for(int i=0;i<n;i++){
			  for(int j=0;j<n;j++){
					 if(j>i)
						 System.out.print(" ");
				  }
			  for(int j=0;j<n;j++){
				 if(j<=i)
					 System.out.print("*");
			  }
			  System.out.println();
		  } 
	
		  
		  
		  for(int i=0;i<n;i++){
			  for(int j=n;j!=0;j--){
					 if(j<=i)
						 System.out.print(" ");
				  }
			  for(int j=n;j!=0;j--){
				 if(j>i)
					 System.out.print("*");
			  }
			  System.out.println();
		  } 
		  
		  
	}

}
