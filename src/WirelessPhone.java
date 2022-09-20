

public class WirelessPhone extends Phone implements Textable{                           // беспроводные телефоны
    private int hour;                                               //срок работы аккумулятора


    public WirelessPhone(int year, String model, int hour) {
        super(year, model);
        this.hour = hour;
    }

    @Override
    public void сall() {

    }

    @Override
    public void sendSMS() {

    }
}
