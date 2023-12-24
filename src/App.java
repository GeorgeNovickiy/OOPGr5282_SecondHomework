import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();
        Actor client1= new OrdinaryClient("Boris");
        Actor client2= new OrdinaryClient("Maria");
        Actor client3= new SpecialClient("Gubernator", 1);
        Actor client4= new PromoClient("Alex","PromoClient", 2);


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);


        magnit.update();

        magnit.update();


    }
}
