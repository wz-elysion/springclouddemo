package wz_ling1991.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Rabbitconfig {

  @Bean
  public Queue helloQueue() {
    return new Queue("hello");
  }

}
