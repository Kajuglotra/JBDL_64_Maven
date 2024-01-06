package notificationPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("notificationPkg");
        NotificationService n = (NotificationService) applicationContext.getBean("notificationService");
        n.sendMsg("my code is 5678");

    }
}
