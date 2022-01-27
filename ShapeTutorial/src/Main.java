public class Main {

    public static void main(String[] args) {

        Shape [] shapes = new Shape[10];

        shapes[0] = new Circle();

        shapes[2] = new Square();


        shapes[0].Area();
        shapes[2].Area();
    }
}
