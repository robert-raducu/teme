package Tema32_33;

//-Given a list of Person objects with age and city attributes, filter out people younger than 18
//or those who live in the city "Metropolis", then return a list of names of the remaining people,
//sorted in reverse order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Person> sortPeople(List<Person> people){
        List<Person> finalPeople = new ArrayList<>();

        for(Person person : people){
            if(person.getAge() >= 18 && !person.getCity().equals("Metropolis")){
                finalPeople.add(person);
            }
        }

        finalPeople.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
        return finalPeople;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person(17,"London");
        people.add(person1);

        Person person2 = new Person(55,"Paris");
        people.add(person2);

        Person person3 = new Person(91,"Stockholm");
        people.add(person3);

        Person person4 = new Person(9,"Bucharest");
        people.add(person4);

        Person person5 = new Person(30,"Metropolis");
        people.add(person5);

        Person person6 = new Person(24,"Beijing");
        people.add(person6);

        Person person7 = new Person(42,"Metropolis");
        people.add(person7);

        List <Person> newPeople = sortPeople(people);

        for(Person person : newPeople){
            System.out.println(person.getAge() + " " + person.getCity());
        }
    }
}
