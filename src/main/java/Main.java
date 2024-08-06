import org.springframework.context.support.ClassPathXmlApplicationContext;
import  org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld hello = (HelloWorld)  applicationContext.getBean("helloBean");

        System.out.println(hello.toString());
    }
}
