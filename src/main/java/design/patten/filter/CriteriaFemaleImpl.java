package design.patten.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:38.
 * © All Rights Reserved.
 */
public class CriteriaFemaleImpl implements Criteria{



    // 对标准的一个实现，符合Female标准
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> list = Lists.newArrayList();
        people.forEach(
                person -> {
                    if (person.getGender().equalsIgnoreCase("FEMALE")){
                        list.add(person);
                    }
                }
        );
        return list;
    }
}
