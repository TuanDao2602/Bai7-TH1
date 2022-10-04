package rickkei.academy.animals;

import rickkei.academy.edible.IEdible;

public class Chicken extends Animals implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    public  String howToEat(){
        return "could be fried";
    }
}
