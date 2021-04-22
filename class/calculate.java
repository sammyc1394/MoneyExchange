package MoneyExchange;

public class calculate {
	output o = null;
	double exchangeResult;
	double ex_rate;
	double cw;
	
	calculate(){
		o = new output();
	}
	
	public void returnWon(double cw) {
		int cwResult;
		
		cwResult = (int)cw;
		int  returnWon, won10000, won5000, won1000, won500, won100, won50, won10;
		
		returnWon = (int)(cw/10)*10;//10의 자리 이하 버리기
		
		won10000 = cwResult / 10000;
		won5000 = cwResult % 10000 / 5000;
		won1000 = cwResult % 5000 / 1000;
		won500 = cwResult % 1000 / 500;
		won100 = cwResult % 500 / 100;
		won50 = cwResult % 100 / 50;
		won10 = cwResult % 100 / 10;

		o.printWon(cw, returnWon, won10000, 
				won5000, won1000, won500, won100, won50, won10);
	}
	
	public double[] exchangeUSD(double w) {
		int usd; //환율 결과를 정수로
		
		ex_rate = collections.EX_RATE_USD;
		exchangeResult = w / ex_rate ;

		usd = (int)exchangeResult; 
		int[] ret = new int[7];
		ret[0] = usd / 100;
		ret[1] = usd % 100 / 50; 
		ret[2] = usd % 100 % 50 / 20;
		ret[3] = usd % 100 % 50 % 20 / 10;
		ret[4] = usd % 100 % 50 % 20 % 10 / 5;
		ret[5] = usd % 100 % 50 % 20 % 10 % 5 / 2;
		ret[6] = usd % 100 % 50 % 20 % 10 % 5 % 2;
		
		o.printUSD(ret, exchangeResult);
		
		cw = w - usd * ex_rate;
		double[] exRet = {exchangeResult, cw};
		return exRet;
	}
	
	public double[] exchangeEUR(double w) {
		int eur;
		
		ex_rate = collections.EX_RATE_EUR; //유로 환율로 변경
		exchangeResult = w / ex_rate ; //유로 환율로 계산된 값

		eur = (int)exchangeResult; 
		int[] ret = new int[7]; 
		ret[0] = eur / 100;
		ret[1] = eur % 100 / 50; 
		ret[2] = eur % 100 % 50 / 20;
		ret[3] = eur % 100 % 50 % 20 / 10;
		ret[4] = eur % 100 % 50 % 20 % 10 / 5;
		ret[5] = eur % 100 % 50 % 20 % 10 % 5 / 2;
		ret[6] = eur % 100 % 50 % 20 % 10 % 5 % 2;
		
		o.printEUR(ret, exchangeResult);
		
		cw = w - eur * ex_rate;
		double[] exRet = {exchangeResult, cw};
		return exRet;
	}
	public double[] exchangeJPY(double w) {
		int jpy;
		
		ex_rate = collections.EX_RATE_JPY; //엔화 환율로 변경
		exchangeResult = w / ex_rate ; //유로 환율로 계산된 값

		jpy = (int)(exchangeResult/1000) * 1000;
		
		int[] ret = new int[4];
		
		ret[0] = jpy / 10000;
		ret[1] = jpy % 10000 / 5000;
		ret[2] = jpy % 10000 % 5000 / 2000;
		ret[3] = jpy % 10000 % 5000 % 2000 / 1000;
		
		o.printJPY(ret, exchangeResult, jpy);
		
		cw = w - jpy * ex_rate;
		double[] exRet = {exchangeResult, cw};
		return exRet;
	}
	
	public double[] exchangeGBP(double w) {
		int gbp;
		
		ex_rate = collections.EX_RATE_GBP;
		exchangeResult = w / ex_rate;
		gbp = (int)(exchangeResult/5);
		
		int[] ret = new int[5];
		
		ret[0] = gbp/100;
		ret[1] = gbp%100/50;
		ret[2] = gbp%100%50/20;
		ret[3] = gbp%100%50%20/10;
		ret[4] = gbp%100%50%20%10/5;
 		
		o.printGBP(ret, exchangeResult, gbp);
		cw = w - gbp * ex_rate;
		double[] exRet = {exchangeResult, cw};
		return exRet;
	}
}
