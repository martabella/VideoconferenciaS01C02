import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int EDAD_MINIMA = 18;
        final int IMPORTE_ENTRADA = 20;

        System.out.println("Bievenido a mi programa");
        System.out.println("Introduce tu edad");
        int edad = input.nextInt();
        input.nextLine();

        //si la edad > = 18 -> Puedes entrar al local
        if (edad>=EDAD_MINIMA){

            System.out.println("Ahora puedes pagar la entrada. Son "+IMPORTE_ENTRADA+"€");
            float pagoEntrada = input.nextFloat();
            input.nextLine();
            if (pagoEntrada>=IMPORTE_ENTRADA){
                System.out.println("Puedes entrar al local. Tu cambio es: "+(pagoEntrada-IMPORTE_ENTRADA));
            }else{
                System.out.println("No puedes entrar al local");
            }

        }else{
            System.out.println("No puedes entrar");
        }
        System.out.println("Fin del programa -- ");

    }
}
