public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(5);
        myCar.start();
        System.out.println("Liczba miejsc w samochodzie: " + myCar.getNumberOfSeats());
        myCar.stop();
    }
}
