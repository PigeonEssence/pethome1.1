package cn.itsources.pethome.org.domain;

import cn.itsources.pethome.base.domain.BaseDomain;
import lombok.Data;

@Data
public class Employee extends BaseDomain {
    private Long id;
    private String  username;
    private String  email;
    private String  phone;
    private String  password;
    private Integer age;
    private Integer state;
}
