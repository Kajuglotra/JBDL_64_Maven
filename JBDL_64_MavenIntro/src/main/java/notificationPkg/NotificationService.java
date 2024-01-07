package notificationPkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springDemo.Student;

@Component
public class NotificationService {
//    @Autowired
    private SmsGateway smsGateway; // do u think that notification service is dependent upon smsgateway ?
        // depency injection will happen or not ?
    // field injection ?
//    @Autowired

    // constructor injection
//    @Autowired --> not required
    public NotificationService(SmsGateway smsGateway) {
        this.smsGateway = smsGateway;
//        this.smsGateway1 =new SmsGateway();
    }

    // SETTER injection
   @Autowired
    public void setSmsGateway(SmsGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    @Autowired
    private EmailGateway emailGateway;

//    private WatsapGateway watsapGateway;

    public void sendMsg(String msg){
        smsGateway.sendMsg(msg);
    }
}
