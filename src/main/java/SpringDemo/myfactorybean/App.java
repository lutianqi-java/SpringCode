package SpringDemo.myfactorybean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    public static void main(String[] args) {
        //实例化BeanFactory
        Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(res);

        //获得bean
//        PersonFactoryBean personFactory = bf.getBean("personFactory", PersonFactoryBean.class);
//        PersonFactoryBean personFactory = bf.getBean("&personFactory", PersonFactoryBean.class);
        Person personFactory = bf.getBean("personFactory", Person.class);
        System.out.println(personFactory);

    }

}

