package wz_ling1991.rabbitmq;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
@Slf4j
public class Receiver {

  @RabbitHandler
  public void process(String hello) {
    log.warn("Receiver:{}", hello);
  }

}
