//package wz_ling1991.feign;
//
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestParam;
//import wz_ling1991.configuration.FeignLogConfiguration;
//import wz_ling1991.domain.User;
//
//@FeignClient(value = "hello-service", configuration = FeignLogConfiguration.class)
//public interface HelloService {
//
//  @GetMapping("/hello")
//  String hello();
//
//  @GetMapping("/hello1")
//  String hello(@RequestParam("name") String name);
//
//  @GetMapping("/hello2")
//  User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
//
//  @PostMapping("/hello3")
//  String hello(@RequestBody User user);
//
//}
