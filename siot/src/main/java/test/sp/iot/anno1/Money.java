package test.sp.iot.anno1;

import org.springframework.stereotype.Component;

@Component
public class Money {

	private int name;
	public Money(){}
	
	public Money(int  name){
		this.name = name;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

}
