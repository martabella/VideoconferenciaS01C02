import java.util.Random;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int user;
        int machine;
        System.out.println("====================================");
        System.out.println("✨ ¡Bienvenido al Juego! ✨");
        System.out.println("====================================");
        System.out.print("Elige (0: Piedra, 1: Papel, 2: Tijera): ");

        //TODO Seleccion de máquina
        machine = random.nextInt(3);
        //System.out.println("Pista "+machine);

        //TODO Seleccion usuario
        if (input.hasNextInt()){
            user = input.nextInt();
            input.nextLine();

            System.out.println("--- RESULTADO ---");
            System.out.println("👤 Tú elegiste: " + user);
            System.out.println("🤖 La máquina eligió: " + machine);
            System.out.println("-----------------");

            //TODO Decidir victoria o derrota
            switch (user){
                case 0: //user: Piedra
                    if (machine == 0){
                        System.out.println("🤝Empate");
                    }else if (machine==1){
                        System.out.println("😿Derrota");
                    }else if (machine==2){
                        System.out.println("🎉Victoria");
                    }
                    break;
                case 1: //user: Papel
                    if (machine == 0){
                        System.out.println("🎉Victoria");
                    }else if (machine==1){
                        System.out.println("🤝Empate");
                    }else if (machine==2){
                        System.out.println("😿Derrota");
                    }
                    break;
                case 2: //user: Tijera
                    if (machine == 0){
                        System.out.println("😿Derrota");
                    }else if (machine==1){
                        System.out.println("🎉Victoria");
                    }else if (machine==2){
                        System.out.println("🤝Empate");
                    }
                    break;
                default:
                    System.out.println("Error. Debes introducir un número válido: 0, 1, o 2");
            }
        }else{
            System.out.println("Error. Debes introducir un número");
        }
    }
}
