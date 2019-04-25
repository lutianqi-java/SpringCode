package SpringDemo.myfactorybean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class App {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        //实例化BeanFactory
        Resource res = new ClassPathResource("applicationContext.xml");
        Resource ress = new FileSystemResource("");



        System.out.println("测试dev");
        BeanFactory bf = new XmlBeanFactory(res);
        System.out.println("测试master");
//
//        //获得bean
        Person personFactory = bf.getBean("person", Person.class);
//        PersonFactoryBean personFactory = bf.getBean("&personFactory", PersonFactoryBean.class);
////        Person personFactory = bf.getBean("personFactory", Person.class);
//        System.out.println(personFactory);
//
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\SpringCode\\src\\main\\resources\\applicationContext.xml");
//        Person personFactory = applicationContext.getBean("person", Person.class);
//        System.out.println(personFactory);

    }

}

