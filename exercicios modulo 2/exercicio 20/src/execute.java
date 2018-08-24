import java.util.Scanner;
public class execute {

	public static void main(String[] args) {
		  Scanner s= new Scanner(System.in);
		  System.out.println("digite a altura da forma:");
		  int n = s.nextInt();
		  
		  
		  
		  for(int i=0;i<n;i++){
			  for(int j=0;j<=i;j++){
					 System.out.print("*");
			  }
			  System.out.println();
		  }
		  
		  
		  
		  for(int i=n;i!=0;i--){
			  for(int j=0;j<i;j++){
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
			   
			 
			  
			  /*
--------------------------------------------------------------------------------------------
			   * precisa printar todos espaços para começar a printar os *
		        se os dois for do aninhamento interno for substituido por:
		        
		        for(int j=0;j<n;j++){
					 if(j>i){
						 System.out.print(" ");
					 }else{
						 System.out.print("*");
					 }
				  }
				  
			para uma entrada com o valor 10 a forma seguinte é printada
*         
**        
***       
****      
*****     
******    
*******   
********  
********* 
**********
            ao invez da forma correta:
		       
		 *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
   
   	      nao encherguei por hora uma forma de substituir esses 2 for do aninhamento interno
--------------------------------------------------------------------------------------------	            
		      */
			  
			   
			   
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