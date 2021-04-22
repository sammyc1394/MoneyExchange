package MoneyExchange;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
		FileWrite fw = new FileWrite();
		calculate cal = new calculate();
		input i = new input();
		
		fw.headWrite();
		
		while(true) {
			collections.type = i.inputType();
			collections.w = i.inputWon();
			
			if(collections.type == collections.EX_TYPE_USD) {
				collections.cw = cal.exchangeUSD(collections.w);
				collections.ex_type = "USD";
				
			} else if (collections.type == collections.EX_TYPE_EUR) {
				collections.cw = cal.exchangeEUR(collections.w);
				collections.ex_type = "EUR";
			
			} else if (collections.type == collections.EX_TYPE_JPY) {
				collections.cw = cal.exchangeJPY(collections.w);
				collections.ex_type = "JPY";
				
			} else if(collections.type == collections.EX_TYPE_GBP) {
				collections.cw = cal.exchangeGBP(collections.w);
				collections.ex_type = "GBP";
				
			} else if(collections.type == collections.EX_TYPE_EXIT) {
				break;
			}
			
			fw.dataWrite(collections.ex_type, collections.w, collections.cw[0], (int)(collections.cw[1]));
			cal.returnWon(collections.cw[1]);
			
		}
		fw.fileClose();
	}
}
