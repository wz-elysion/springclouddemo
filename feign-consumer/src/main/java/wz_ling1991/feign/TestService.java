package wz_ling1991.feign;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="openapi",url="localhost:9100/api/internal/v3/faceModel/FaceAnalysis?caller_id=000001&access_token=420e6a0a14114fd684394fa255706b72&version=v3&api_id=S001")
public interface TestService {

  @PostMapping
  Object test(@RequestBody JSONObject jsonObject);

}
