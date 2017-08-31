package test.sp.iot.anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class Audi implements Maker{
	@Autowired
	private Car car;
	public Audi(){
		
	}
		public Car sellCar(Won money){
			System.out.println("아우디에서" + money.getWon() + "에 차를 팔았다.");
			return car;
		}
}
