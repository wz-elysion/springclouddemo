package wz_ling1991.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.feign.TestService;

@RestController("/test")
public class TestController {

  @Autowired
  private TestService testService;

  @PostMapping
  public void test(@RequestBody JSONObject jsonObject) {
    while (true){
      try {
        Object rs = testService.test(jsonObject);
      }catch (Exception e){
      }
    }
  }

}
