package notificationPkg;

import org.springframework.stereotype.Component;

@Component
public class SmsGateway {

    public SmsGateway() {
        System.out.println("I am inside constructor of sms gateway");
    }

    public void sendMsg(String sms){
        System.out.println(sms);
    }
}
