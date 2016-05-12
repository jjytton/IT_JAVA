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
			System.out.println("��ǰ�� ���� �ǸŸ� ��ٸ�...");
			try{
				this.wait();
				return;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		product++;
		System.out.println("�������� ��ǰ�� ������ "+product+"���� ������Ŵ");
		//Seller ������ Ȱ��ȭ
		this.notify();
	}
	public synchronized void Sell(){
		if(product <=0){
			System.out.println("��ǰ�� ���� ���Ÿ� ��ٸ�...");
			try{
				this.wait();
				return;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		product--;
		System.out.println("�������� ��ǰ�� ������ "+product+"���� ���ҽ�Ŵ");
		//Buyer ������ Ȱ��ȭ
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