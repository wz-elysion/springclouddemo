package wz_ling1991;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@EnableEurekaClient
@SpringBootApplication
public class TurbineAmqpApplication {

  public static void main(String[] args) {
    SpringApplication.run(TurbineAmqpApplication.class, args);
  }
}
