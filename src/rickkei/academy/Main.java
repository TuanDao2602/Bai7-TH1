package rickkei.academy;

import rickkei.academy.animals.Animals;
import rickkei.academy.animals.Chicken;
import rickkei.academy.animals.Tiger;
import rickkei.academy.edible.IEdible;
import rickkei.academy.fruit.Apple;
import rickkei.academy.fruit.Fruit;
import rickkei.academy.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animals[] animals= new  Animals[2];
        animals[0] = new Tiger();
        animals[1] =new Chicken();
        for (Animals animals1 :animals){
            System.out.println(animals1.makeSound());
            if (animals1 instanceof Chicken){
                IEdible edible =(Chicken) animals1;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}