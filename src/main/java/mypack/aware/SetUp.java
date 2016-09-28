package mypack.aware;

import mypack.beans.A;
import mypack.beans.B;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SetUp implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		A a = (A)context.getBean("a");
        B b = (B)context.getBean("b"); 
        System.out.println(a.getName());
        System.out.println(b.getName() + " " + b.getLocation());

	}

}
