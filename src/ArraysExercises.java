import java.util.Arrays;

public class ArraysExercises {

    static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeopleArray = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeopleArray[i] = people[i];
        }
        newPeopleArray[people.length] = newPerson;
        return newPeopleArray;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Dalton");
        people[1] = new Person("Ashley");
        people[2] = new Person("Willow");

        Person[] morePeople = addPerson(people, new Person("Quinn"));

        for (Person person : morePeople) {
            System.out.println(person.getName());
        }

    }
}
