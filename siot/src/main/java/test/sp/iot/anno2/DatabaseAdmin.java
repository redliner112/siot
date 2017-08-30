package test.sp.iot.anno2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
@Service
@Order(value=3)
public class DatabaseAdmin implements Worker{
	public void work() {
		System.out.println("dba 일을 합니다");
		
	}
	public void goToWork() {
		System.out.println("dba 출근 합니다");
		
	}
	public void getOffWork() {
		System.out.println("dba 퇴근합니다.");
		
	}

}
