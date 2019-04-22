package wz_ling1991.rabbitmq;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息生成者
 */
@Component
@Slf4j
public class Sender {

  @Autowired
  private AmqpTemplate rabbitTemplate;

  public void send() {
    String context = "hello:" + LocalDateTime.now();
    log.warn("Sender:{}", context);
    rabbitTemplate.convertAndSend("hello", context);
  }
}
