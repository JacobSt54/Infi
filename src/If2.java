import java.util.Random;

public class If2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);//
        Random rando = new Random();
        int randomNumber2 = rando.nextInt(100);

        if(randomNumber<randomNumber2 && randomNumber<50){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 Mini");
        }

        if(randomNumber<30 | randomNumber2<30){
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        if(randomNumber<50 && randomNumber2!=50){
            System.out.println("Erste Zahl klein,zweite kein 50iger");
        }

    }

}
