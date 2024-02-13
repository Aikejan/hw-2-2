public class Samsung  extends Phone{
    private int price;

    public Samsung(String color, int price) {
        super(color);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String textPhone() {
        String size = " 156 MGB";
        return size;
    }

    @Override
    public void print() {
        System.out.println( price + " SAMSUNG ->  Popularniy companiya");

    }
}
