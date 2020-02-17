package oop2.module01;

import java.util.ArrayList;

/**
 * @author Dieter Holz
 */
public class Person {
    private int    age;
    private double weight;
    private double height;
    private ArrayList<Person> friends;
    public Person(int age, double weight, double height) {
        this.age    = age;
        this.weight = weight;
        this.height = height;
        this.friends = new ArrayList<>();
    }

    public double getBMI() {
        return weight / (height * height);
    }

    //alle Getter und Setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<Person> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Person> friends) {
        this.friends = friends;
    }

    public boolean addFriend(Person person) {
        if(!person.equals(this)){
            return friends.add(person) && person.friends.add(this);
        }else{
            return false;
        }
    }

    public boolean removeFriend(Person person) {
        return friends.remove(person) && person.friends.remove(this);
    }

    public boolean isFriendsWith(Person person) {
        return friends.contains(person);
    }
}
