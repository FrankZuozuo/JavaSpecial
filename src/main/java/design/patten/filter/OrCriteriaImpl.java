package design.patten.filter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:44.
 * © All Rights Reserved.
 */

@AllArgsConstructor
@NoArgsConstructor
public class OrCriteriaImpl implements Criteria{


    private Criteria criteria,handleCriteria;

    // 对标准的一个实现，符合A标准或者B标准
    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> list = criteria.meetCriteria(people);
        List<Person> handleList = handleCriteria.meetCriteria(people);

        handleList.forEach(
                person -> {
                    if (!list.contains(person)){
                        list.add(person);
                    }
                }
        );

        return list;
    }
}
