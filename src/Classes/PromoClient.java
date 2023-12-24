package Classes;

public class PromoClient extends Actor {
    public String promoName;
    public int idClient;
    public static int numOfParticipants=100;

/**
 * Конструктор для инициализации пользователя по акции
 * @param name - имя клиента
 * @param promoname - наименование акции
 * @param idclient - идентификатор клиента
 */

    public PromoClient(String name, String promoname, int idclient) {
        super(name);
        this.promoName = promoname;
        this.idClient = idclient;
    }

/**
 * Метод проверки создания заказа
 */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

/**
 * Метод проверки совершения заказа
 */

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

/**
 * Метод получения данных об акционном клиенте
 */

    @Override
    public Actor geActor() {
        return this;
    }

/**
 * Метод получения имени акционного клиента
 */

    @Override
    String getName() {
        return super.name;  
    }

/**
 * Метод внесения изменений в имя акционного клиента
 */

    @Override
    void setName(String str) {
        super.name=str;
    }
}
