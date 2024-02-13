import java.util.Scanner;

;

public class Main {
    public static void main(String[] args) {
        /*Apple apple = new Apple("White", "Otlichnogo kachestvo");
        Honor honor = new Honor("Black", "China");
        Samsung samsung = new Samsung("Grey", 50000);*/
        Phone[] phones1 = new Phone[3];
        phones1[0] = createObject("Apple");
        phones1[1] = createObject("Honor");
        phones1[2] = createObject("Samsung");


        //Phone[] phones = {apple, honor, samsung};
        for (int i = 0; i < phones1.length; i = i + 1) {
            phones1[i].print();
            /*if(phones[i] instanceof Apple )
                System.out.println(((Apple) phones[i]).textPhone()+
                        ((Apple)phones[i]).getQuality());
            if(phones[i] instanceof Honor )
                System.out.println(((Honor) phones[i]).textPhone() +
                        ((Honor)phones[i]).getProduction());
            if(phones[i] instanceof Samsung )
                System.out.println(((Samsung) phones[i]).textPhone() +
                        ((Samsung)phones[i]).getPrice());*/

        }
        createObject("Apple");
        Phone pult1 = createObjectFromConsole();
        System.out.println(pult1);

        /*
        apple.print();
        honor.print();
        samsung.print();*/


    }


    public static Phone createObject(String className) {
        Phone emptyObject = null;

        switch (className) {
            case "Apple":
                emptyObject = new Apple("white", "otlicho");
                break;
            case "Honor":
                emptyObject = new Honor("Black", " horoshiy");
                break;
            case "Samsung":
                emptyObject = new Samsung("Blue", 60000);
                break;
            default:
                System.out.println("Nety takogo obekta");
        }
        return emptyObject;
    }


    public static Phone createObjectFromConsole() {
        Phone emptyObject = null;
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        switch (userInput) {
            case "Apple":
                emptyObject = new Apple("white" +
                        "e", "otlicho");
                break;
            case "Honor":
                emptyObject = new Honor("Black", " horoshiy");
                break;
            case "Samsung":
                emptyObject = new Samsung("Blue", 60000);
                break;
            default:
                System.out.println("Nety takogo obekta");

        }
        return emptyObject;
    }
}