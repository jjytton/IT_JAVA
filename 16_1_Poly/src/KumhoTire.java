class KumhoTire extends Tire {
	public KumhoTire() {
		// TODO Auto-generated constructor stub
		super("부품", 1000);
	}
	@Override
	public boolean roll() {
		System.out.println("금호타이어가 굴러갑니다");
		return true;
	}
	

}