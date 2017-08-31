package test.sp.iot.anno1;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named("om")
public class OrderManager {
	private String name;
	@Autowired
	private Maker maker;
	@Autowired
	private Won money;
	 
	public OrderManager(){}
	public void order(){
		money.setWon(1000);
		Car car = this.maker.sellCar(money);
		System.out.println(car.getName());

	}
}
