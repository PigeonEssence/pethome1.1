package cn.itsources.pethome.org.dto;

import lombok.Data;

import java.util.List;

@Data
/*接受多个ID对象*/
public class IdsDto {
    private List<Long> ids;
}

