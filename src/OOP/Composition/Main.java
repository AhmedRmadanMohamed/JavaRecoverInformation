package OOP.Composition;


public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars("BMW");
        cars.Engin(1, "BMWEngine", 12444444, "prime");
        cars.Wheels(120, "BMWWheels", 12444444);

    }
}
