package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;
import Interfaces.iReturnOrder;


public class Market implements iMarketBehavior,iQueueBehavior, iReturnOrder {

    private List<Actor> queue;


    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " клиент добавлен в очередь ");
    }



    @Override
    public void update() {
        takeOrder();
        giveOrder();
        returnOrder();
        getMoney();
        releaseFromQueue();
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " клиент сделал заказ ");

            }
        }

    }

    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void returnOrder() {
        for (Actor actor : queue) {
            System.out.println(actor.getName() + " клиент вернул заказ ");
        }
    }
    
    @Override
    public void getMoney() {
        for (Actor actor : queue) {
            System.out.println(actor.getName() + " клиент получил денежные средства за возврат заказа");
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }



    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

}




