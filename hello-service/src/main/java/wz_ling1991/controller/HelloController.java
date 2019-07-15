package wz_ling1991.controller;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.domain.User;

@RestController
@Slf4j
public class HelloController {

  @Autowired
  private Registration registration;

  @GetMapping(value = "/hello")
  public String hello() throws Exception {
    //测试超时
    int sleepTime = new Random().nextInt(3000);
    log.info("sleepTime:{}", sleepTime);
    Thread.sleep(sleepTime);

    log.info("hello host:{},service_id:{}", registration.getHost(), registration.getServiceId());
    return "Hello World";
  }

  @GetMapping(value = "/hello1")
  public String hello(@RequestParam String name) {
    return "Hello " + name;
  }

  @GetMapping(value = "/hello2")
  public User hello(@RequestHeader String name, @RequestHeader Integer age) {
    return new User(name, age);
  }

  @PostMapping(value = "/hello3")
  public String hello(@RequestBody User user) {
    return "Hello " + user.getName() + "," + user.getAge();
  }

}
