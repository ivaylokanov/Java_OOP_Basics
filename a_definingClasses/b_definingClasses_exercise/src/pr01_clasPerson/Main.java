package pr01_clasPerson;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;


public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        Class personClass = Person.class;

        Constructor emptyCtor = personClass.getDeclaredConstructor();
        Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
        Constructor nameAgeCtor = personClass
                .getDeclaredConstructor(String.class, int.class);

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        Person basePerson = (Person) emptyCtor.newInstance();
        Person personWithAge = (Person) ageCtor.newInstance(age);
        Person personFull = (Person) nameAgeCtor.newInstance(name, age);

       // System.out.printf("%s %s%n", basePerson.name, basePerson.age);
        //System.out.printf("%s %s%n", personWithAge.name, personWithAge.age);
        //System.out.printf("%s %s%n", personFull.name, personFull.age);
    }

    //first task
        /*Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);*/
}


