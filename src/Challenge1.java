import java.util.Random;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        final int MAX_NUMBER = 3;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int magicNumber;
        int userNumber;

        //TODO Calcular número mágico
        magicNumber = random.nextInt(MAX_NUMBER); //[0...2]
        System.out.println("Mostrando número mágico ... "+magicNumber);

        //TODO Pedir número al usuario
        System.out.println("Introduce tu número mágico 0 ... "+(MAX_NUMBER-1));
        if (input.hasNextInt()) {
            userNumber = input.nextInt();
            input.nextLine();
            //TODO Decidir victoria o derrota
            if (userNumber == magicNumber){
                System.out.println("😉Has acertado");
            }else{
                System.out.println("No has acertado. Magic number es "+magicNumber);
            }
        }else{
            System.out.println("Error. Debes introducir un número");
        }
    }
}
