package za.ac.cput.PrincipleOfLeastKnowledge.good.impl;

import za.ac.cput.PrincipleOfLeastKnowledge.good.services.Bird;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Eagle implements Bird{
    public Eagle() {
    }

    @Override
    public String eat() {
        return "Eagle eats";
    }

    @Override
    public String makeNoise() {
        return "Eagle makes noise";
    }
}
