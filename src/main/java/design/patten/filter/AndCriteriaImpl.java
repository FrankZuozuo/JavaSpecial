package design.patten.filter;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:40.
 * © All Rights Reserved.
 */

@NoArgsConstructor
@AllArgsConstructor
public class AndCriteriaImpl implements Criteria{


    private Criteria criteria,handleCriteria;

    // 对标准的一个实现，同时符合2个标准
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> list = criteria.meetCriteria(people);
        return handleCriteria.meetCriteria(list);
    }
}
