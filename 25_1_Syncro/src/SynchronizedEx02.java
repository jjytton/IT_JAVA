public class SynchronizedEx02 {
	public static void main(String [] args) {
		Store store=new Store(100);
		Buyer buyer=new Buyer(store);
		Seller seller=new Seller(store);
		buyer.start();
		seller.start();
	}
}
class Store{
	public static int MAX_COUNT=10;
	private int product;
	public Store(int produect){
		this.product=produect;
	}
	public synchronized void Buy(){
		if (product >= MAX_COUNT){
			System.out.println("상품이 많아 판매를 기다림...");
			try{
				this.wait();
				return;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		product++;
		System.out.println("상점에서 상품의 개수를 "+product+"개로 증가시킴");
		//Seller 쓰레드 활성화
		this.notify();
	}
	public synchronized void Sell(){
		if(product <=0){
			System.out.println("상품이 적어 구매를 기다림...");
			try{
				this.wait();
				return;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		product--;
		System.out.println("상점에서 상품의 개수를 "+product+"개로 감소시킴");
		//Buyer 쓰레드 활성화
		this.notify();
	}
}
class Buyer extends Thread{
	private Store store;
	public Buyer(Store store){
		this.store=store;
	}
	public void run(){
		while(true){
			store.Buy();
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Seller extends Thread{
	private Store store;
	public Seller(Store store){
		this.store=store;
	}
	public void run(){
		while(true){
			store.Sell();
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}