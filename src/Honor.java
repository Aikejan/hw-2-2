public class Honor extends  Phone {
    private String production;

    public Honor(String color, String production) {
        super(color);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }


    @Override
    public String textPhone() {
        String data = " HONOR ->  Ecran, kamera, razmer sredniy";
        return data;
    }

    @Override
    public void print() {
        System.out.println(production  + " Polzuetsia horoshim sprosom");

    }
}
