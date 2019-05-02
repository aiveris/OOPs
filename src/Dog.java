public class Dog {

    int numlegs;
    String breed;

    public void doBarking() {
        System.out.println("Bark... Bark... Bark... " +numlegs);
    }
}
class ProgramToRun{
    public static void main(String[] args) {

     Dog bigDog = new Dog();//Object created
        bigDog.breed = "German Shepeard";
        bigDog.numlegs = 6;
        System.out.println("bigDog breed: " + bigDog.breed);
        System.out.println("bigDog num legs: " + bigDog.numlegs);
        bigDog.doBarking();

        System.out.println("========");

        Dog smallDog = new Dog();
        smallDog.breed = "pug";
        smallDog.numlegs = 4;
        System.out.println("smallDog breed: " + smallDog.breed);
        System.out.println("smallDog num legs: " + smallDog.numlegs);
        smallDog.doBarking();
    }
}//class
