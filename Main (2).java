/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
    //entradas
    System.out.print("Digite 1° nota: ");
    Double n1 = input.nextDouble();
    
    System.out.print("Digite 2° nota: ");
    Double n2 = input.nextDouble();
   
   System.out.print("Digite 3° nota: ");
   Double n3 = input.nextDouble();
   
   System.out.print("Digite 4° nota: ");
   Double n4 = input.nextDouble();
   
   System.out.print("Digite 5° nota: ");
   Double n5 = input.nextDouble();
   
   System.out.print("Digite 6° nota: ");
   Double n6 = input.nextDouble();
   
   System.out.print("Digite 7° nota: ");
   Double n7 = input.nextDouble();
   
   System.out.print("Digite 8° nota: ");
   Double n8 = input.nextDouble();
   
   //processamento
   Double media1 = n1 + n2;
   Double media2 = n3 + n4;
   Double result1 = (media1 + media2) / 2;
   Double div = result1 / 2; 
   
  //p2
   Double media3 = n5 + n6;
   Double media4 = n7 + n8;
   Double result2 = (media3 + media4) / 2;
   Double div1 = result2 / 2;
   
   // mode final 
   
  double mfinal = (div + div1) / 2;
  
  //s1
  System.out.println("------------------------");
  System.out.printf(" A Media do 1° é: %.1f \n",media1 / 2);
  System.out.printf(" A Media do 2° é: %.1f \n",media2 / 2);
  System.out.printf(" A Media do 1° é: %.1f \n",div1);
  
  //s2
  System.out.println("------------------------");
  System.out.printf("A Media do 3° Bimestre é: %.1f \n", media3 / 2);
  System.out.printf("A Media do 4° Bimestre é: %.1f \n" , media4 / 2);
  System.out.printf("A Media do 2° Simestre é  : %.1f \n", div1);
  
 //mf
  System.out.println("------------------------");
  System.out.printf("Media final é: %.1f", mfinal);
  

	    
	
	    
		
	}
}