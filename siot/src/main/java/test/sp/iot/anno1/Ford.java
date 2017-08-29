package test.sp.iot.anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ford implements Maker{
	@Autowired
	private Car car;
	public Ford(){
		
	}
		public Car sellCar(Money money){
			System.out.println("포드에서" + money.getWon() + "에 차를 팔았다.");
//			Car car = new Car("A6");
			return car;
		}
}
