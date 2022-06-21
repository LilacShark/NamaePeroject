package marker.test;

import marker.test.domain.Individuals;
import marker.test.rest.CorpController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});

//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("springContext.xml");
//
//        CorpController controller = applicationContext.getBean("controller", CorpController.class);
//        controller.findIndiv();


    }
}
