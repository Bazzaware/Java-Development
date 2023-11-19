package com.headfirst.DesignsPatterns.ChapterOne;

import com.headfirst.DesignsPatterns.ChapterOne.classes.*;
import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;
import com.headfirst.DesignsPatterns.ChapterOne.ducks.*;

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
        model.display();
        model.performFly(); // I can't fly
        model.performQuack(); // Quack
        /*
         * The model duck wasn't flying, so the client calls setFlyBehavior() to change
         * its
         * flying behavior. This wouldn't have been possible if the implementation of
         * the
         * fly behavior wasn't encapsulated in its own class.
         */
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // I'm flying with a rocket!
        model.performQuack(); // Quack

        /*
         * The RedheadDuck is a real living duck. It inherits its quack() and fly()
         * methods.
         * It sets the flyBehavior at runtime to change its flying behavior.
         */
        IDuck redhead = new RedheadDuck();
        redhead.display(); // I am a Redhead Duck
        redhead.setFlyBehavior(new FlyWithWings());
        redhead.setQuackBehavior(new Quack());
        redhead.performFly();
        redhead.performQuack();

        /*
         * The RubberDuck is a rubber duckie. It inherits its quack() and fly() methods.
         * But it doesn't fly, so it overrides fly() to do nothing. It also overrides
         * display() to show its rubbery appearance.
         * It inherits the quack() method, which it changes to squeak().
         */

        IDuck rubber = new RubberDuck();
        rubber.display(); // I am a Rubber Duck
        rubber.performFly(); // I can't fly
        rubber.performQuack(); // Squeak
    }
}
