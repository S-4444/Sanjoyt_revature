package day5;

public class Question1 {
	private int trainno;
	private String traincode;
	private String station;
	private String Arrival;
	private String Departure;
	
	
	
	public Question1(int trainno, String traincode, String station, String arrival, String departure) {
		
		this.trainno = trainno;
		this.traincode = traincode;
		this.station = station;
		Arrival = arrival;
		Departure = departure;
	}
	public void printstatement() {
		System.out.printf("%d %8s %12s %10s %10s\n",trainno , traincode, station , Arrival, Departure);
	}
	
	public static void main(String[] args) {
	System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
	
	
	System.out.println();
	System.out.println("--------------------------------------------");
	System.out.println("#    code     station    Arr.    Dep");
	System.out.println("--------------------------------------------");
	Question1[] transactions = {
			new Question1(1 , "YPR","Yasvantpur jn", "11.00" , "23:40"),
			new Question1(1 , "YPR","Yasvantpur jn", "11.00" , "23:40"),
			new Question1(1 , "YPR","Yasvantpur jn", "11.00" , "23:40"),
			new Question1(1 , "YPR","Yasvantpur jn", "11.00" , "23:40"),
			new Question1(1 , "YPR","Yasvantpur jn", "11.00" , "23:40"),
			new Question1(1 , "YPR","Yasvantpur jn", "11.00" , "23:40"),
	};
	for (Question1 transaction :transactions) {
		transaction.printstatement();
	}
		// TODO Auto-generated method stub

	}

}
