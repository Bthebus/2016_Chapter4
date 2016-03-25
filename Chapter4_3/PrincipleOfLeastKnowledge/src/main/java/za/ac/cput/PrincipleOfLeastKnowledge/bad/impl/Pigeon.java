package za.ac.cput.PrincipleOfLeastKnowledge.bad.impl;

import za.ac.cput.PrincipleOfLeastKnowledge.bad.Eat;
import za.ac.cput.PrincipleOfLeastKnowledge.bad.services.Bird;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Pigeon implements Bird {
    @Override
    public String eat() {
        Eat eat = new Eat();
        return eat.eat();
    }

    @Override
    public String fly() {
        return "Bird flies";
    }

    @Override
    public String makeNoise() {
        return "Bird makes noise";
    }
}
