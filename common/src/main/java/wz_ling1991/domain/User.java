package wz_ling1991.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String name;
  private Integer age;

  @Override
  public String toString() {
    return "name=" + name + ",age=" + age;
  }
}
