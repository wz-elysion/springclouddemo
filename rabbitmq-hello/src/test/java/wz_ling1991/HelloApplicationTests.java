package wz_ling1991;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wz_ling1991.rabbitmq.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqHelloApplication.class)
public class HelloApplicationTests {

  @Autowired
  private Sender sender;

  @Test
  public void hello() throws Exception {
    sender.send();
  }
}
