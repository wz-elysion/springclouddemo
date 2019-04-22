package wz_ling1991.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import wz_ling1991.HelloServie;

@FeignClient("HELLo-SERVICE")
public interface RefactorHelloService extends HelloServie {

}
