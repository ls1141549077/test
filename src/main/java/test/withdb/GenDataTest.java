package test.withdb;

import test.domain.Person;

import java.util.Random;

public class GenDataTest {
    public static void main(String[] args) {

        for ( int i = 0 ; i < 100 ; i ++ ){
            System.out.println();
            System.out.println(Person.genName());
        }

    }

}
