package wz_ling1991.controller;

import java.util.StringJoiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.domain.User;
import wz_ling1991.feign.HelloService;


@RestController
public class ConsumerController {

  @Autowired
  private HelloService helloService;

//  @GetMapping("/feign-consumer")
//  public String helloConsumer() {
//    return helloService.hello();
//  }

  @GetMapping("/feign-consumer2")
  public String helloConsumer2() {
    String delimiter = System.getProperty("line.separator");
    StringJoiner sj = new StringJoiner(delimiter);
    sj.add(helloService.hello("DIDI"));
    sj.add(helloService.hello("DIDI", 20).toString());
    sj.add(helloService.hello(new User("DIDI", 30)));
    return sj.toString();
  }

}
