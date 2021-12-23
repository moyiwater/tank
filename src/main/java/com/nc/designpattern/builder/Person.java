package com.nc.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Person {

    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    public static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder basicInfo (int id, String name, int age) {
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        public PersonBuilder weight (double weight) {
            p.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            p.score = score;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo) {
            p.loc = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return p;
        }
    }

}

@ToString
@AllArgsConstructor
class Location {
    String street;
    String roomNo;
}
