package oop2;

import oop2.module01.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void testPersonInitialized(){
        //given
        Person p = new Person(21, 100, 1.85);
        //when
        int age = p.getAge();
        double weight = p.getWeight();
        double height = p.getHeight();
        //then
        assertEquals(21, age);
        assertEquals(100, weight);
        assertEquals(1.85, height);
    }

    @Test
    void testBMI(){
        //given
        Person p = new Person(42, 90, 1.85);
        //when
        double bmi = p.getBMI();
        //then
        assertEquals(26.3, bmi, 0.01);
    }
}
