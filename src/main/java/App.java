import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2 == bean);
        System.out.println(bean);
        System.out.println(bean2);
        Cat bean1 = (Cat) applicationContext.getBean("Cat");
        Cat bean3 = (Cat) applicationContext.getBean("Cat");
        System.out.println(bean1);
        System.out.println(bean3);
        System.out.println(bean3 == bean1);
    }
}