package notificationPkg;

import org.springframework.stereotype.Component;

@Component
public class SmsGateway {


    public void sendMsg(String sms){
        System.out.println(sms);
    }
}
