import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        beanCat.setName("Tom");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        beanCat1.setName("Sam");
        System.out.println(beanCat.getName());
        System.out.println(beanCat1.getName());
        System.out.println(bean == bean1);
        System.out.println(beanCat == beanCat1);
    }
}
