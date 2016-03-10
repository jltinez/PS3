package Main;
import java.util.Date;
/**Joaquin Martinez PS3 CISC181**/
public class Account {
	
	private int ID=0;
	private double Balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	
	public Account(){
	}
	public Account(int ID, double Balance){
		this.ID = ID;
		this.Balance = Balance;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public int getid(){
		return ID;
	}
	public double getbalance(){
		return Balance;
	}
	public double getannualinterest(){
		return annualInterestRate;
	}
	public Date getDate(){
		return dateCreated;
	}
	public void setid(int ID){
		this.ID=ID;
	}
	public void setbalance(double Balance){
		this.Balance=Balance;
	}
	public void setannualinterest(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double deposit(double amount) {
	    return Balance+= amount;   
	}
	public double getMonthlyInterestRate() {
	    return annualInterestRate/12;
	}
	double withdraw(double amount) throws InsufficientFundsException {
	    return this.Balance-= amount;
	} 
}