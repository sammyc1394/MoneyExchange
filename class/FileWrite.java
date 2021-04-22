package MoneyExchange;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWrite {
	private boolean isFileExist;
	private BufferedWriter bw;
	public FileWrite() {
		try {
			File file = new File("C:\\Users\\Sam\\Desktop\\MoneyEXresult.csv");	
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			bw = new BufferedWriter(new FileWriter(file, true));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void headWrite() throws IOException {
		if(isFileExist == false) {
			bw.write(collections.data);
		} else {
			
		}
	}
	
	public void dataWrite(String type, double w, double exchangeResult, int cwResult) throws IOException {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String date = sdf.format(cal.getTime());

		String data = date + "," + type + "," + w + "," + exchangeResult + "," + cwResult;
		bw.newLine(); bw.write(data);
	}
}
