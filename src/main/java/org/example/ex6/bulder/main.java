package org.example.ex6.bulder;

import org.example.ex6.AbsFabric;
import org.example.ex6.Animal;
import org.example.ex6.DogWithNiggaFabric;
import org.example.ex6.Human;

public class main {
    public static void main(String[] args) {
        class Person{
            String name;
            String surname;

            public String toString(){
                return name + " " + surname;
            }
        }
        interface builder{
            builder setName(String name);
            builder setSurname(String surname);
            Person getPerson();
        }
        class PersonBuilder implements builder{
            Person p = new Person();
            @Override
            public builder setName(String name) {
                p.name = name;
                return this;
            }

            @Override
            public builder setSurname(String surname) {
                p.surname = surname;
                return this;
            }

            @Override
            public Person getPerson() {
                return p;
            }
        }
        System.out.println(new PersonBuilder().setName("na1me").setSurname("sur1name").getPerson().toString());
    }
}
