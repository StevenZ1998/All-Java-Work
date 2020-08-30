package com.skillstorm.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/*
 * Bean Lifecycle
 * Instantiation -> Populate Properties -> BeanNameAware -> BeanFactoryAware
 * -> Pre-Initialization (BranPostProcessors)
 * -> InitializeBean -> InitMethod -> Post Initialization(BeanPostProcessors)
*/

@Component(value = "lion")
public class Lion implements
BeanNameAware, // Implemented for beans that need to access their names.
BeanFactoryAware,  // Obtain a reference to the bean factory.
ApplicationContextAware, // Allow beans to use application context.
InitializingBean, 
DisposableBean
{
	
	@Autowired
	private Hat hat;
	private String beanName;
	private ApplicationContext applicationContext;
	
	public Hat getHat() {
		return hat;
	}

	public void setHat(Hat hat) {
		this.hat = hat;
		System.out.println("DI");
		
	}
	
	public Lion() {
		super();
		System.out.println("Instantiating Lion");
	}
	
	public void makeFriend() {
		System.out.println("My new friend: " + applicationContext.getBean(Lion.class));
	}
	
	public void wearHat() {
		System.out.println("Wearing hat: " + this.hat);
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean: Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean: afterPropertiesSet()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("ApplicationContextAware: " + this.applicationContext);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("BeanNameAware: " + this.beanName);
	}
	
}
