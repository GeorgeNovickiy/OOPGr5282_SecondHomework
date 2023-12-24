package Classes;

public class SpecialClient extends Actor {
    public int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;    
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder=val;   
     }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder=val;   
    }

    @Override
    public Actor geActor() {
        return this;
    }

    @Override
    String getName() {
        return super.name;  
    }

    @Override
    void setName(String str) {
        super.name=str;
    }
}
