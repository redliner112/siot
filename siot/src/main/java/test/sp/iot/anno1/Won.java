package test.sp.iot.anno1;

import org.springframework.stereotype.Component;

@Component
public class Won {
		
	private int won;
	public Won(){
		
	}
	public Won(int won){
		this.won = won;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	
}
