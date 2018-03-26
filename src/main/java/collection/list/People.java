package collection.list;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/26 0026. 星期一. 13:45.
 * © All Rights Reserved.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {


    private String name,describe;
    private Integer age;
    private boolean sex;

    // peopleList 一开始会指向null,所以不会一直死循环下去
    private List<People> peopleList;


}
