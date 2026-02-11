import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa para saber tu nivel de programación en Java");
        System.out.println("Introduce un valor del 1 al 3");
        int nivel = input.nextInt();
        input.nextLine();

       /* if (nivel==1){
            System.out.println("😩 Acabas de entender que es Main.java");
        }else if (nivel==2){
            System.out.println("😉 Ya estas entendiendo los condicionales");
        } else if (nivel == 3){
            System.out.println("🚀 Estas utilizando bucles");
        } else{
            System.out.println("No has introducido un valor correcto");
        }*/

        switch (nivel){
            case 1:
                System.out.println("😩 Acabas de entender que es Main.java");
                break;
            case 2:
                System.out.println("😉 Ya estas entendiendo los condicionales");
                break;
            case 3:
                System.out.println("🚀 Estas utilizando bucles");
                break;
            default:
                System.out.println("No has introducido un valor correcto");
        }


    }
}
