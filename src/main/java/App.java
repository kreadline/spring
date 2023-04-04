import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println("Сравнение бинов helloworld: " + (bean == beanTwo));
        Cat catOne = applicationContext.getBean("cat", Cat.class);
        Cat catTwo = applicationContext.getBean("cat", Cat.class);
        System.out.println("Сравнение бинов cat: " + (catOne == catTwo));
    }
}