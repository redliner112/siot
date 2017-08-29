package test.sp.iot.anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ho")
public class Honda implements Maker{
	@Autowired
	private Car car;
	public Honda(){
		
	}
		public Car sellCar(Money money){
			System.out.println("혼다에서" + money.getWon() + "에 차를 팔았다.");
//			Car car = new Car("A6");
			return car;
		}
}
