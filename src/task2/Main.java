package task2;

public class Main {

    public static void main(String[] args) {
        Bus bus1 = new Bus("Mercedes", "A25", 2018, "Germany", "yellow", 150, 4.5, "automate", "O123OO77RUS", 60);
        Bus bus2 = new Bus("Toyota", "T12", 2020, "Japan", "black", 140, 3.5, "automate", "O456OO77RUS", 40);
        Bus bus3 = new Bus("Icarus", "I05", 1999, "Hungary", "red", 100, 5.5, "automate", "O789OO77RUS", 55);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}
