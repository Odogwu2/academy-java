package com.bptn.course._15_big_coding_wk2;

public class Stock {
	
	
	// Create instance variables 
    private String tickerSymbol; 
    private String companyName; 
    private int price; 
    private double percentChange; 
    private int totalShares; 
    private long marketCap; 

    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
      this.tickerSymbol = tickerSymbol; //the this keyword referring to this instance. 
      this.companyName = companyName; 
      this.price = price; 
      this.totalShares = totalShares; 
      this.percentChange = 0; 
      this.marketCap = totalShares * price; 
    }
    
    // Create the methods 
    public void adjustPrice(int change){
      price = price + change; 
      percentChange = ((double) change/price) * 100; //updating the data type for change to a "double" to allow for decimal points to show the decimals in the % change. 
      marketCap = totalShares * price; 
      
    }

    public String toString(){
      return "Ticker Symbol: " + tickerSymbol.toUpperCase() + "\nCompany: " + companyName + "\nCurrent Price: " +  "$" + price + " (" + percentChange + "%)" + "\nMarket Cap: " +  "$" + marketCap;
    }

	public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);

	}

}



