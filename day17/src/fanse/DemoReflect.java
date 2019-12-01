package fanse;

public class DemoReflect {
    public static void main(String[] args) throws ClassNotFoundException {

        Class aClass = Class.forName("fanse.Person");
        System.out.println(aClass);
        Class personClass = Person.class;
        System.out.println(personClass);

        Person person = new Person();
        Class aClass1 = person.getClass();
        System.out.println(aClass1);
        System.out.println(aClass==aClass1);
    }
}
