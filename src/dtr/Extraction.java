package dtr;

import java.util.Scanner;

public class Extraction {
	
	public Extraction(){}
	
	public static double input()  {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Insert a decimal number, which you want to convert to roman: ");
	    return scan.nextDouble();
  	}
	
	public static int pow(int base, int a){
		int r=1;
		for(int x=0;x<a;x++) r*=base;
		return r;
	}
	
	public static int Extract(double decimal){
		double dec=decimal;
		double dec2=dec;
		int i=0;
		
		for(;;)
		{
			dec*=10;
			i++;
			if(dec%1==0) return (int)(dec%(Math.max((int)(dec2),1)*pow(10,i)));
		}
   }
	
	public static void ExtractAndConvert(double decimal){
		Convertion c=new Convertion();
		System.out.print("\nOriginal number:"+decimal+"\nNumber in roman:"+c.convert((int)decimal)+","+(c.convert(Extract(decimal))).toLowerCase()+"\n");
	}
}