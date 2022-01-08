package myproject.beaninheritance.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.beaninheritance.beans.HelloBean;
import myproject.beaninheritance.beans.WelcomeBean;
import myproject.beaninheritance.beans.WishBean;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/beaninheritance/resources/applicationContext.xml");
	WishBean wishBean = (WishBean) context.getBean("wishBean");
	System.out.println(wishBean.wish());
	HelloBean helloBean = (HelloBean) context.getBean("helloBean");
	System.out.println(helloBean.sayHello());
	WelcomeBean welcomeBean = (WelcomeBean) context.getBean("welcomeBean");
	System.out.println(welcomeBean.sayWelcome());
	
}
}
