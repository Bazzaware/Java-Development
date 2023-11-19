package com.headfirst.DesignsPatterns.ChapterOne;

import com.headfirst.DesignsPatterns.ChapterOne.classes.FlyRocketPowered;
import com.headfirst.DesignsPatterns.ChapterOne.ducks.MallardDuck;
import com.headfirst.DesignsPatterns.ChapterOne.ducks.ModelDuck;
import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;

public class Main {
    public static void main(String[] args) {
        IDuck mallard = new MallardDuck();
        /*
         * The first call to performQuack() delegates to the object's QuackBehavior,
         * which is a
         * Quack object. That handles the request by printing out Quack. The second call
         * to
         * performFly() delegates to the object's FlyBehavior, which is a FlyWithWings
         * object.
         */
        mallard.performQuack(); // Quack
        mallard.performFly(); // I'm flying!!
        /*
         * This is the first time we see the ModelDuck in action. The model starts out
         * not
         * flying. Setters are provided to change its behavior. This is done at runtime,
         * on
         * the fly. Pun intended.
         */
        IDuck model = new ModelDuck();
        model.performFly(); // I can't fly
        /*
         * The model duck wasn't flying, so the client calls setFlyBehavior() to change
         * its
         * flying behavior. This wouldn't have been possible if the implementation of
         * the
         * fly behavior wasn't encapsulated in its own class.
         */
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // I'm flying with a rocket!
    }
}
