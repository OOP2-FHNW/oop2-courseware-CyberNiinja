package oop2.module01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person p = new Person(21, 100, 1.85);
    Person p2 = new Person(22, 80, 1.60);
    Person p3 = new Person(30, 120, 2.10);

    @Test
    void testPersonInitialized(){
        //given
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

    @Test
    void testAddFriend(){
        //when
        boolean result = p.addFriend(p2);
        ArrayList<Person> friends = p.getFriends();
        //then
        assertTrue(result);
        assertFalse(friends.isEmpty());
        assertTrue(friends.contains(p2));
    }
    @Test
    void testAddFriend_ButNotSelf(){
        //when
        boolean result = p.addFriend(p);
        //then
        assertFalse(p.getFriends().contains(p));
        assertFalse(result);
    }

    @Test
    void testRemoveFriend(){
        //when
        p.addFriend(p2);
        boolean result = p.removeFriend(p2);
        boolean result2 = p.removeFriend(p3);
        ArrayList<Person> friends = p.getFriends();
        //then
        assertTrue(result);
        assertFalse(result2);
        assertTrue(friends.isEmpty());
    }

    @Test
    void testIsFriendsWith(){
        //given
        p.addFriend(p2);
        p.addFriend(p3);
        p2.addFriend(p);
        p3.addFriend(p);
        //then
        assertTrue(p.isFriendsWith(p2));
        assertTrue(p.isFriendsWith(p3));
        assertTrue(p2.isFriendsWith(p));
        assertTrue(p3.isFriendsWith(p));
        assertFalse(p2.isFriendsWith(p3));
        assertFalse(p3.isFriendsWith(p2));
        //when
        p.removeFriend(p2);
        p2.removeFriend(p);
        p2.addFriend(p3);
        p3.addFriend(p2);
        //then
        assertFalse(p.isFriendsWith(p2));
        assertFalse(p2.isFriendsWith(p));
        assertTrue(p2.isFriendsWith(p3));
        assertTrue(p3.isFriendsWith(p2));
    }
}
