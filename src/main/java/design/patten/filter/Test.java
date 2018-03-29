package design.patten.filter;

import com.google.common.collect.Lists;
import utils.print.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by 谭健 on 2018/3/29 0029. 星期四. 15:49.
 * © All Rights Reserved.
 */
public class Test {


    /**
     * Java 8 的Stream 已经可以很方便的应用过滤器
     */
    public static void main(String[] args) {

        test();
    }

    private static void test(){

        List<Person> people = Lists.newArrayListWithExpectedSize(7);

        // 创建人员组
        people.add(new Person("Robert","Male", "Single"));
        people.add(new Person("John","Male", "Married"));
        people.add(new Person("Laura","Female", "Married"));
        people.add(new Person("Diana","Female", "Single"));
        people.add(new Person("Mike","Male", "Single"));
        people.add(new Person("Bobby","Male", "Single"));
        people.add(new Person("Frank","Single", "Married"));

        // 实例化标准
        Criteria male = new CriteriaMaleImpl();
        Criteria female = new CriteriaFemaleImpl();
        Criteria single = new CriteriaSingleImpl();
        Criteria singleMale = new AndCriteriaImpl(single, male);
        Criteria singleOrFemale = new OrCriteriaImpl(single, female);

        // 执行标准过滤
        Print.echo("符合 Males: ");
        print(male.meetCriteria(people));

        Print.echo("\n符合 Females: ");
        print(female.meetCriteria(people));

        Print.echo("\n符合 Single And Males: ");
        print(singleMale.meetCriteria(people));

        Print.echo("\n符合 Single Or Females: ");
        print(singleOrFemale.meetCriteria(people));

    }


    private static void print(List<Person> people){

        people.forEach(
                person -> {Print.echo(person.toString());}
        );
    }
}
