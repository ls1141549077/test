package test.stream;

import test.domain.Person;

import java.util.Optional;

public class OptionalTest {
    private static Person p1 = null ;
    private static Person p2 = null ;
    static {
        p1 = new Person("张三" , 18);
        p2 = null;
    }

    public static void main(String[] args) {
        Optional<Person> opt1 = Optional.ofNullable(OptionalTest.p1);
        Optional<Integer> optInt1 = opt1.map(p -> p.getAge());
        System.out.println(optInt1.get());


        Optional<Person> opt2 = Optional.ofNullable(OptionalTest.p2);
        Optional<Integer> optInt2 = opt2.map(p -> p.getAge());


    }

}
