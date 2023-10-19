import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5,10);
switch(randomNumber){
    case 10:
        System.out.println("ten");
        break;
    case 9:
        System.out.println("nine");
        break;
    case 8:
        System.out.println("eight");
        break;
    case 7:
        System.out.println("seven");
        break;
    case 6:
        System.out.println("six");
        break;
    case 5:
        System.out.println("five");
        break;
}
        }
}