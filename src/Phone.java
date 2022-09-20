public abstract class Phone implements Callable {
    private int year;                        // год изготовления
    private String model;                       // модель телефона

    public Phone(int year, String model) {
        this.year = year;
        this.model = model;
    }


}
