package MoneyExchange;

public class collections {
	// main menu function
	final static int EX_TYPE_USD = 1;
	final static int EX_TYPE_EUR = 2;
	final static int EX_TYPE_JPY = 3;
	final static int EX_TYPE_GBP = 4;
	final static int EX_TYPE_EXIT = 5;
	
	//exchange rate
	final static double EX_RATE_USD = 1119.00;
	final static double EX_RATE_EUR = 1344.59;
	final static double EX_RATE_JPY = 1036.35 / 100; //1원의 환율
	final static double EX_RATE_GBP = 1549.03;
	
	// to write csv file
	static String ex_type = ""; // exchanged currency type
	static double[] cw = new double[2]; // cw[0] = exchange result; cw[1] = changes(won)
	static String data = "Date, Country, Amount, Exchange Result, Changes";
	static double w; //받은 원화	
	static int type = 0;
}

