package test.sp.iot.anno3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Execute {
	@Autowired
	@Qualifier("us1")
	UserService us;
	
	@Autowired
	@Qualifier("user2")
	User2 user;
	
	public static void main(String[]args){
		ApplicationContext factory;
		String path = "anno3/ioc.xml";
		factory = new ClassPathXmlApplicationContext(path);
		Execute e = (Execute) factory.getBean("execute");
		e.user.setName("adf");
		e.user.setPwd("test");
		String result = e.us.login(e.user);
		System.out.println(result);
		
	}
}
