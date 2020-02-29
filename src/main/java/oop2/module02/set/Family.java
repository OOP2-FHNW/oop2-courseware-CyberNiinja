package oop2.module02.set;

import oop2.module02.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Marcel Gygli
 */
public class Family {
    private Set<Person> members;

    public Family() {
        members = new TreeSet<>();
    }

    public void add(Person personA) {
        members.add(personA);
    }

    public boolean isMember(Person personA) {
        return members.contains(personA);
    }

    public int size() {
        return members.size();
    }

    public Person getOldest() {
        Person oldest = null;
        for (Person member : members) {
            if (oldest == null || member.getAge() > oldest.getAge()) {
                oldest = member;
            }
        }
        return oldest;
    }
}
