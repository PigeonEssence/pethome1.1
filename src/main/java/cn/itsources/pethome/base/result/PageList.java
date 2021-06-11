package cn.itsources.pethome.base.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageList<T> {
    //总条数
    private Long total;
    //列表
    private List<T> list = new ArrayList<>();
}
