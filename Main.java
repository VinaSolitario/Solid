public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Baxter", "Yna");

        // Demonstrate making sound
        String sound = PetSound.makeSound(myPet);
        System.out.println(sound);

        // Demonstrate eating
        String eating = Eat.eat(myPet);
        System.out.println(eating);

        // Print owner's name
        System.out.println(myPet.getPetName() + "'s owner is " + myPet.getOwner());
    }
}
