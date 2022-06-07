package marker.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springContext.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getTest());

    }
}
