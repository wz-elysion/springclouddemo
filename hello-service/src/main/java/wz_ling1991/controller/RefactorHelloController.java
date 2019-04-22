package wz_ling1991.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.HelloServie;
import wz_ling1991.domain.User;

@RestController
public class RefactorHelloController implements HelloServie {


  @Override
  public String hello(@RequestParam("name") String name) {
    return "Hello " + name;
  }

  @Override
  public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
    return new User(name, age);
  }

  @Override
  public String hello(@RequestBody User user) {
    return "Hello " + user.getName() + "," + user.getAge();
  }

}
