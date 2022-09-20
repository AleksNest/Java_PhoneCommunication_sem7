public class Landlinephone extends Phone implements Fax {        // стационарные телефоны
    private String DialType;                // тип циферблата телефона

    public Landlinephone(int year, String model, String dialType) {
        super(year, model);
        DialType = dialType;
    }

    @Override
    public void сall() {

    }

    @Override
    public void sendFax() {

    }
}
