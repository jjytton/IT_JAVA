public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car();

		/*
		mycar.run();

		mycar.tires[0] = new KumhoTire();
		mycar.tires[1] = new KumhoTire();
		mycar.tires[2] = new KumhoTire();
		mycar.tires[3] = new KumhoTire();

		mycar.run();
		*/
		for(int i=0; i<5;i++){
			int p=mycar.run();
			if(p!=0){
				System.out.println(mycar.tires[p].location+ "KumhoTire·Î ±³Ã¼");
				mycar.tires[p] = new KumhoTire();
				
			}
		}
	}

}