public class Landlinephone extends Phone implements Fax {        // ������������ ��������
    private String DialType;                // ��� ���������� ��������

    public Landlinephone(int year, String model, String dialType) {
        super(year, model);
        DialType = dialType;
    }

    @Override
    public void �all() {

    }

    @Override
    public void sendFax() {

    }
}
