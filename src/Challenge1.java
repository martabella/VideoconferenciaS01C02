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

        //TODO Pedir minimo al usuario
        System.out.println("Introduce el valor entero mínimo del Magic Number");
        if (input.hasNextInt()){
            minNumber = input.nextInt();
            input.nextLine();

            //TODO Pedir máximo al usuario
            System.out.println("Introduce el valor entero máximo del Magic Number");
            if (input.hasNextInt()) {
                maxNumber = input.nextInt();
                input.nextLine();

                if (maxNumber>minNumber) {

                    //TODO Calcular número mágico entre mínimo y máximo
                    magicNumber = random.nextInt(minNumber, maxNumber+1);
                    System.out.println("Pista: " + magicNumber);

                    //TODO Pedir número al usuario
                    System.out.println("Introduce tu número mágico. Escoge un número entre "+minNumber+" - "+maxNumber);
                    if (input.hasNextInt()) {
                        userNumber = input.nextInt();
                        input.nextLine();
                        //TODO Decidir victoria o derrota
                        if (userNumber == magicNumber) {
                            System.out.println("😉Has acertado");
                        } else {
                            System.out.println("No has acertado. Magic number es " + magicNumber);
                        }
                    } else {
                        System.out.println("Error. Debes introducir un número");
                    }
                }else{
                    System.out.println("Error. El valor máximo debe ser mayor que el mínimo");
                }
            }else{
                System.out.println("Error. Debes introducir un número entero");
            }
        }else{
            System.out.println("Error. Debes introducir un número entero");

        }
    }
}
