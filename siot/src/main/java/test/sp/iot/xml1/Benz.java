package test.sp.iot.xml1;

public class Benz {
	
	public Benz(){
		
	}
	public Car sellCar(Money money){
		System.out.println(money.getWon() + "을 받고 5S 차를 팔았습니다");
		Car car = new Car("5S");
		return car;
	}
	
}
