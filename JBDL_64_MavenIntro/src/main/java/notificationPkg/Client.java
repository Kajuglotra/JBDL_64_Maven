package notificationPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDemo.Student;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("projectBean.xml");
        Student s = (Student) classPathXmlApplicationContext.getBean("student");
        classPathXmlApplicationContext.close();

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("notificationPkg");
        NotificationService n = (NotificationService) applicationContext.getBean("notificationService");
        n.sendMsg("your otp is 6578");

    }
}
