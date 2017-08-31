package test.sp.iot.anno4;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameStage {	
	InputBallNum ibn = new InputBallNumImpl();
	BallGame bg = new BallGameImpl();
	
	public static void main(String[] args){
		//ApplicationContext factory = new ClassPathXmlApplicationContext("anno4/ioc.xml");
		GameStage gs = new GameStage();
		gs.ibn.setScanner(new Scanner(System.in));
		gs.bg.makeBallNum();
		while(!gs.bg.getCheck()){
			List<Integer> numList = gs.ibn.inputNumList();
			String result = gs.bg.checkNum(numList);
			System.out.println(result);
		}
		gs.bg.printBallNum();
	}
}
