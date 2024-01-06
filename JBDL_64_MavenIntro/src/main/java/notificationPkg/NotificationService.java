package notificationPkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    @Autowired
    private SmsGateway smsGateway;

    private EmailGateway emailGateway;

    public void sendMsg(String msg){
        smsGateway.sendMsg(msg);
    }
}
