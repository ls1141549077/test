package test.stream;

import com.alibaba.fastjson.JSON;
import test.domain.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Discription
 */
public class StreamMain {

    public static void main(String[] args) {
        testSort();
    }


    public  static  void testSort(){
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("葛秀玉");
        p1.setAge(22);

        Person p2 = new Person();
        p2.setAge(25);
        p2.setName("康远景");

        Person p3 = new Person();
        p3.setAge(28);
        p3.setName("吴国志");


        personList.add(p2);
        personList.add(p1);
        personList.add(p3);

        List<Person> newList = personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());


        System.out.println(JSON.toJSONString(newList));


    }


}
