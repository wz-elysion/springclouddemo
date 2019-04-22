package wz_ling1991.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

  @Value("${testKey}")
  private String testKey;

  @GetMapping("/from")
  public String from(){
    return testKey;
  }
}
