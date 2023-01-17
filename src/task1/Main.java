package task1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 2020, "Россия", "жёлтый", 150, 1.7, "механика", "седан", "Р123ОЕ77", 5, true);
        Car.Key key1 = car1.new Key(true, false);
        System.out.println(car1);
        System.out.println(key1);

    }
}