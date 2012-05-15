package dtr;

import java.util.ArrayList;
import java.util.Iterator;

public class Convertion {
	public Convertion(){
		
	}
	public static String convert(int number){
  		int n=number;
  		String result = new String("");
  		System.out.println("Number to convert: "+number);
  		
  		ArrayList<rNum> rList = new ArrayList<rNum>();
		rList.add(new rNum("MMMMMMMMMM",10000));
		rList.add(new rNum("M",1000));
		rList.add(new rNum("CM",900));
		rList.add(new rNum("D",500));
		rList.add(new rNum("CD",400));
		rList.add(new rNum("C",100));
		rList.add(new rNum("XC",90));
		rList.add(new rNum("L",50));
		rList.add(new rNum("XL",40));
		rList.add(new rNum("X",10));
		rList.add(new rNum("IX",9));
		rList.add(new rNum("V",5));
		rList.add(new rNum("IV",4));
		rList.add(new rNum("I",1));
		
		
		Iterator<rNum> itr = rList.iterator();
		rNum rN= itr.next();
		while(true){
			if(n>=rN.getValue()){
				n-=rN.getValue();
				result+=rN.getSymbol();
			}else if(itr.hasNext()){
				rN=itr.next();
			}else{
				return result;
			}
		}
  	}
}
