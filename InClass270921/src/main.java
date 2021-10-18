public class main {

    public static void main(String[] args) {
       Vehicle v = new Vehicle("Ford", "Feista");

       Car c = new Car("Honda", "Civic", "hatch");

       Truck t = new Truck("Volvo", "Truck", 6, 12000);

       System.out.println(v);
       System.out.println(c);
        System.out.println(t);

    }
}
