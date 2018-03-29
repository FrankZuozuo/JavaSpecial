package design.patten.filter;

import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:31.
 * © All Rights Reserved.
 *
 * 一种标准
 */
public interface Criteria {


    List<Person> meetCriteria(List<Person> people);
}
