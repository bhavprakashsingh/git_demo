package com.school;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("conf.xml");
		XmlBeanFactory context = new XmlBeanFactory(r);
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
				"conf.xml");*/

		HelloWorld jc = (HelloWorld) context.getBean("helloBean");
		jc.printHello(); 
		  System.out.println(jc.getAddressList());
	    System.out.println(jc.getAddressSet());  
	    System.out.println(jc.getAddressMap());
	    System.out.println(jc.getAddressProp());
	}
}
