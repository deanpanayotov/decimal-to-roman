package dtr;

public class RomanNumberMapping {
	private String symbol;
	private int value;
	public RomanNumberMapping(String symbol,int value){
		this.symbol=symbol;
		this.value=value;
	}
	public String getSymbol(){
		return symbol;
	}
	public int getValue(){
		return value;
	}
}
