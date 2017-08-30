package test.sp.iot.xml2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Execute {
	
	Worker w;
	public Execute(){}
	public Execute(Worker w){
		this.w = w;
	}
	
	
	public void setWorker(Worker w){
		this.w = w;
	}
	
	public static void main(String[]args){
			ApplicationContext factory;
			String path = "classpath:/xml2/ioc.xml";//xml을 new 메모리를 생성해서 준비한다.
			factory = new ClassPathXmlApplicationContext(path);
			Execute e = (Execute) factory.getBean("ex");
			e.w.work();
	}
}
