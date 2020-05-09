package un.tll.thesis.cloudstreamconsumeractivemq.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import un.tll.thesis.cloudstreamconsumeractivemq.binding.HelloBinding;

@EnableBinding(HelloBinding.class)
public class HelloListener {

    @StreamListener(target = HelloBinding.GREETING)
    public void processHelloChannelGreeting(String msg) {
        System.out.println(msg);
    }
}