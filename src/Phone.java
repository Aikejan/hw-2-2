public abstract class Phone implements Printable{
    private String color;

    public Phone(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getInfo(){
        String cmc = "Bce telefony novye";
        return  cmc;
    }
    public  abstract  String textPhone();
}
