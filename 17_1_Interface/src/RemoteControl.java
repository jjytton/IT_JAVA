public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void turnOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	default void disp(){	//디폴트 멤버가 생긴 이유
		//1. 컴파일 오류없이 공통된 메소드를 추가하기 위해
		
		System.out.println("default disp");
	}
}