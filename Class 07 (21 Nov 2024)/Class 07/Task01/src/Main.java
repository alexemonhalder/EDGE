public class Main extends Cat {

    public static void main(String[]args){

        Cat cat1 = new Cat();
        cat1.CatSound();
        cat1.CatEat();
        cat1.sound();
        cat1.eat();
        cat1.LionInCat();
        cat1.LionSound();

        System.out.println("     ");

        PetAnimal petLion = new PetAnimal();
        petLion.LionEat();
        petLion.LionSound();
        petLion.eat();
        petLion.sound();


    }
}
