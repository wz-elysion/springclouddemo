package wz_ling1991;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wz_ling1991.domain.User;

@RequestMapping("/refactor")
public interface HelloServie {

  @GetMapping("/hello4")
  String hello(@RequestParam("name") String name);

  @GetMapping("/hello5")
  User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

  @PostMapping("/hello6")
  String hello(@RequestBody User user);

}
