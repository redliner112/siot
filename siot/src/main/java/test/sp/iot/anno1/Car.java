package test.sp.iot.anno1;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	
	public Car(){}
	
	public Car(String name){
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
