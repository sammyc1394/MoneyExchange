package MoneyExchange;

public class output {
	
	public void printWon(double cw, int returnWon, int won10000, int won5000, int won1000, int won500, int won100, int won50, int won10) {
//		System.out.printf("*원화 거스름돈 : %.2f원\n", cw);
		
		System.out.printf("원화 거스름돈 지급 : %d원\n", returnWon);
		System.out.printf("-10000원 : %d장\n", won10000); 
		System.out.printf("-5000원 : %d장\n", won5000); 
		System.out.printf("-1000원 : %d장\n", won1000); 
		System.out.printf("-500원 : %d개\n", won500); 
		System.out.printf("-100원 : %d개\n", won100); 
		System.out.printf("-50원 : %d개\n", won50); 
		System.out.printf("-10원 : %d개\n", won10); 
		System.out.printf("********************************\n");
		System.out.println("");
	}
	
	public void printUSD(int[] ret, double exchangeResult) {
		System.out.printf("********************************\n");
		System.out.printf("*달러로 환전 결과 : [%.2f 달러]\n", exchangeResult);
		System.out.println("*달러 지급 : " + (int)exchangeResult + "달러");
		System.out.println("-100달러 : "+ ret[0]/100 + "장");
		System.out.println("-50달러 : " + ret[1]%100/50 + "장");
		System.out.println("-20달러 : " + ret[2]%100%50/20 + "장");
		System.out.println("-10달러 : " + ret[3]%100%50%20/10 + "장");
		System.out.println("-5달러 : " + ret[4]%100%50%20%10/5 + "장");
		System.out.println("-2달러 : " + ret[5]%100%50%20%10%5/2 + "장");
		System.out.println("-1달러 : " + ret[6]%100%50%20%10%5%2 + "장");
		System.out.printf("--------------------------------\n");
	}
	
	public void printEUR(int[] ret, double exchangeResult) {
		System.out.printf("********************************\n");
		System.out.printf("*유로로 환전 결과 : [%.2f 유로]\n", exchangeResult);
		System.out.println("*유로 지급 : " + (int)exchangeResult + "유로");
		System.out.println("-100유로 : "+ ret[0] + "장");
		System.out.println("-50유로 : " + ret[1] + "장");
		System.out.println("-20유로 : " + ret[2] + "장");
		System.out.println("-10유로 : " + ret[3] + "장");
		System.out.println("-5유로 : " + ret[4] + "장");
		System.out.println("-2유로 : " + ret[5] + "장");
		System.out.println("-1유로 : " + ret[6] + "장");
		System.out.printf("--------------------------------\n");
	}
	
	public void printJPY(int[] ret, double exchangeResult, int jpy) {
		System.out.printf("********************************\n");
		System.out.printf("*엔화로 환전 결과 : [%.2f 엔]\n", exchangeResult);
		System.out.println("*엔화 지급 : " + jpy + "엔");
		System.out.println("-10000엔 : "+ ret[0] + "장");
		System.out.println("-5000엔 : " + ret[1] + "장");
		System.out.println("-2000엔 : " + ret[2] + "장");
		System.out.println("-1000엔 : " + ret[3] + "장");
		System.out.printf("--------------------------------\n");
	}
	
	public void printGBP(int[] ret, double exchangeResult, int gbp) {
		System.out.printf("********************************\n");
		System.out.printf("*파운드로 환전 결과 : [%.2f 파운드]\n", exchangeResult);
		System.out.println("*파운드 지급 : " + gbp + "파운드");
		System.out.println("-100파운드 : "+ ret[0] + "장");
		System.out.println("-50파운드 : " + ret[1] + "장");
		System.out.println("-20파운드 : " + ret[2] + "장");
		System.out.println("-10파운드 : " + ret[3] + "장");
		System.out.println("-5파운드 : " + ret[4] + "장");
		System.out.printf("--------------------------------\n");
	}
	
	
}