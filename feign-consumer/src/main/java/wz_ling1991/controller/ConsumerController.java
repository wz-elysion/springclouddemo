package wz_ling1991.controller;

import java.util.StringJoiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.domain.User;
import wz_ling1991.feign.HelloService;
import wz_ling1991.feign.RefactorHelloService;

@RestController
public class ConsumerController {

  @Autowired
  private HelloService helloService;

  @Autowired
  private RefactorHelloService refactorHelloService;

  @GetMapping("/feign-consumer")
  public String helloConsumer() {
    return helloService.hello();
  }

  @GetMapping("/feign-consumer2")
  public String helloConsumer2() {
    String delimiter = System.getProperty("line.separator");
    StringJoiner sj = new StringJoiner(delimiter);
    sj.add(helloService.hello());
    sj.add(helloService.hello("DIDI"));
    sj.add(helloService.hello("DIDI", 30).toString());
    sj.add(helloService.hello(new User("DIDI", 30)));
    return sj.toString();
  }

  @GetMapping("/feign-consumer3")
  public String helloConsumer3() {
    String delimiter = System.getProperty("line.separator");
    StringJoiner sj = new StringJoiner(delimiter);
    sj.add(refactorHelloService.hello("DIDI"));
    sj.add(refactorHelloService.hello("DIDI", 30).toString());
    sj.add(refactorHelloService.hello(new User("DIDI", 30)));
    return sj.toString();
  }
}
