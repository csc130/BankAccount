package nvcc.edu.model;

import java.util.Random;


public class Account {
	private String name;
	private String acNum;
	private static int numAccount=0;
	public Account(String name) {
		this.acNum = generateAcNum();
		this.name = name;
		numAccount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcNum() {
		return acNum;
	}

	public void setAcNum(String acNum) {
		this.acNum = acNum;
	}

	public static int getNumAccount() {
		return numAccount;
	}

	public static void setNumAccount(int numAccount) {
		Account.numAccount = numAccount;
	}
	
	private String generateAcNum() {
		String acNumber="";
		Random r = new Random();
		acNumber = Long.toString(r.nextLong());
		return acNumber;
	}

	@Override
	public String toString() {
		return name +" " + acNum ;
	}

}
