package notificationPkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(value = "singleton")
//@Bean(initMethod = "")
public class EmailGateway {
}
