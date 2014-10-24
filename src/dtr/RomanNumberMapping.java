package dtr;

public class RomanNumberMapping {
	private String symbol;
	private int value;
	public RomanNumberMapping(String s,int v){
		this.symbol=s;
		this.value=v;
	}
	public String getSymbol(){
		return this.symbol;
	}
	public int getValue(){
		return this.value;
	}
}
