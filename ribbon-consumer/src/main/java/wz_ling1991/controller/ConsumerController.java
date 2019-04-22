package wz_ling1991.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.service.HelloService;

@RestController
public class ConsumerController {

  @Autowired
  private HelloService helloService;

  @GetMapping("/ribbon-consumer")
  public String helloConsumer() {
    return helloService.helloService();
  }
}
