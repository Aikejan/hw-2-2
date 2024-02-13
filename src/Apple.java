public class Apple extends Phone{
    private String quality;

    public Apple(String color, String quality) {
        super(color);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public String textPhone() {
        String cmc = " APPLE PROIZVODSTVA USA";
        return cmc;
    }

    @Override
    public void print() {
        System.out.println( quality + " xoroshego kachestvo");
    }
}
