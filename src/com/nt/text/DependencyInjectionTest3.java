package com.nt.text;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class DependencyInjectionTest3 {
public static void main(String[] args) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	Person p1=factory.getBean("per",Person.class);
	System.out.println(p1);
	System.out.println("======================================");
	Person1 p2=factory.getBean("per1",Person1.class);
	System.out.println(p2);
}
}
