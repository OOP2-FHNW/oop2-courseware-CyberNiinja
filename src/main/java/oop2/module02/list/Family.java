package oop2.module02.list;

import oop2.module02.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dieter Holz
 */
public class Family {
    private List<Person> members;

    public Family(){
        members = new LinkedList<>();
    }

    public void add(Person p){
        if(isMember(p)){
            return;
        }
        members.add(p);
    }

    public boolean isMember(Person p){
        return members.contains(p);
    }

    public Person getOldest(){
        Person oldest = members.get(0);
        for(Person p : members){
            if(p.getAge() > oldest.getAge()){
                oldest=p;
            }
        }
        return oldest;
    }

    public int size(){
        return members.size();
    }
}
