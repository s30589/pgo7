public class AnimalsMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Lion(),
                new Dog(),
                new Wolf()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            System.out.println();
        }
    }
}
