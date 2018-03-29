package design.patten.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:39.
 * © All Rights Reserved.
 */
public class CriteriaSingleImpl implements Criteria{


    // 对标准的一个实现，符合Single标准
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> list = Lists.newArrayList();
        people.forEach(
                person -> {
                    if (person.getGender().equalsIgnoreCase("SINGLE")){
                        list.add(person);
                    }
                }
        );
        return list;
    }
}
