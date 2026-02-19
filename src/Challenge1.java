import java.util.Random;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int magicNumber;
        int userNumber;
        int minNumber;
        int maxNumber;

        System.out.println("✨ ¡Bienvenido al juego del Número Mágico! ✨");
        //TODO Pedir minimo al usuario
        System.out.println("Primero, dime el valor mínimo: ");
        if (input.hasNextInt()){
            minNumber = input.nextInt();
            input.nextLine();

            //TODO Pedir máximo al usuario
            System.out.println("Ahora, dime el valor máximo:");
            if (input.hasNextInt()) {
                maxNumber = input.nextInt();
                input.nextLine();

                if (maxNumber>minNumber) {

                    //TODO Calcular número mágico entre mínimo y máximo
                    magicNumber = random.nextInt(minNumber, maxNumber+1);
                    //System.out.println("Pista: " + magicNumber);
                    System.out.println("Todo listo. He pensado un número entre " + minNumber + " y " + maxNumber);

                    //TODO Pedir número al usuario
                    System.out.println("¿Cuál crees que es? Introduce tu número mágico");
                    if (input.hasNextInt()) {
                        userNumber = input.nextInt();
                        input.nextLine();
                        //TODO Decidir victoria o derrota
                        if (userNumber == magicNumber) {
                            System.out.println("😉Lo has adivionado!");
                        } else {
                            System.out.println("😔¡Casi! No has tenido suerte. El número secreto era " + magicNumber);
                        }
                    } else {
                        System.out.println("Error. Debes introducir un número entero");
                    }
                }else{
                    System.out.println("Error. El máximo debe ser mayor que " + minNumber + ".");
                }
            }else{
                System.out.println("Error. Debes introducir un número entero");
            }
        }else{
            System.out.println("Error. Debes introducir un número entero");

        }
    }
}
