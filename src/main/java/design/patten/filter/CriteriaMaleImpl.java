package design.patten.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:33.
 * © All Rights Reserved.
 *
 *
 * 实现这个标准
 */
public class CriteriaMaleImpl implements  Criteria{

    // 对标准的一个实现，符合Male标准
    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> list = Lists.newArrayList();
        people.forEach(
                person -> {
                    if (person.getGender().equalsIgnoreCase("MALE")){
                        list.add(person);
                    }
                }
        );

        return list;
    }
}
