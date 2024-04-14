package service;

import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SetterInjectedMyService implements MyService{


    @Override
    public void serve() {
        System.out.println("SetterInjectedMyService");
    }
}
