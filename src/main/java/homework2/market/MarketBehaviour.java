package src.main.java.homework2.market;

import src.main.java.homework2.actor.Actor;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

}
