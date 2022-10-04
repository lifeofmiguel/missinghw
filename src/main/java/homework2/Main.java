package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many animals do you have? ");
        int animals;
        animals = input.nextInt();

        input.skip(System.lineSeparator());

        System.out.println("what kind of animals do you have");

        Pets[]  petList = new Pets[animals];
        for(int i = 0; i < petList.length; i++){
            System.out.println("what type of animal is this?");
            String animalType = input.nextLine();
            if(animalType.equalsIgnoreCase("Dog")){
                petList[i] = new Dog();
            }else if(animalType.equalsIgnoreCase("Cat")){
                petList[i] = new Cat();
            }else if(animalType.equalsIgnoreCase("Hamster")){
                petList[i] = new Hamster();
            }else{
                petList[i] = new Pets();
            }
        }

    }

}
