package test.sp.iot.xml2;

import org.springframework.core.annotation.Order;
public class Designer implements Worker{
	public void work() {
		System.out.println("디자이너가 일을 합니다");
		
	}
	public void goToWork() {
		System.out.println("디자이너 출근 합니다");
		
	}
	public void getOffWork() {
		System.out.println("디자이너가 퇴근합니다.");
		
	}

}
