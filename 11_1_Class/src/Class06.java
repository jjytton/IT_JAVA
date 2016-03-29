
class Account {
	private int balance;
	
	public void Deposit(int m){
		if(m<0){
			System.out.println("입금하려는 금액이 잘못 되었습니다.");
			return;
			
		}
		balance+=m;
	}
	public void Withdraw(int m){
		if(m>balance){
			System.out.println("잔고가 부족합니다.");
			return;
		}
		balance-=m;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void display(){
		System.out.println("현재 계좌의 잔액은 "+balance+"입니다");
	}
}
public class Class06{
	public static void main(String args[]){
		Account a;
		a=new Account();
		
		a.setBalance(100000);
		a.display();
		
		a.Withdraw(9999999);
		a.Withdraw(9000);
		a.display();
		
		a.Deposit(-1000);
		a.Deposit(10000);
		
		a.display();
	}
}