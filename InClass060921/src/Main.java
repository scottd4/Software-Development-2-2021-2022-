public class Main {
    public static void main(String[] args) {

        Person p = new Person("Dave", "Scott", new Address("AIT", "Dublin Road", "Athlone","Co.Westmeath", "1234"));


        System.out.println(Person.counter);

        Person d = new Person("Steve", "Scott", new Address("DCU", "Dublin ", "Dublin","Co.Dublin", "1234"));

        System.out.println(Person.counter);
        System.out.println(Person.counter);

        System.out.println(p.getAddress());
        System.out.println(d.getAddress());

        Person q = new Person("Sandra", "Scott", new Address("DCU", "Dublin ", "Dublin","Co.Dublin", "1234"));

        System.out.println(Person.counter);
        System.out.println(Person.counter);
        System.out.println(Person.counter);


    }
}
