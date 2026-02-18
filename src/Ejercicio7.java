/*
Escribe el código Java que permita calcular el PVP (precio de venta al público)
 de un producto cuando el usuario introduzca su precio base.
 El PVP se calcula teniendo en cuenta el IVA (supondremos 21%) según la fórmula:
PVP= 1.21*precio base
Se aplicará un descuento del 10% al PVP del producto si su valor es igual
o superior a 50 euros.

 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float IVA=1.21f;
        final float DESCUENTO=0.1f;
        float precioBase;
        float pvp;
        float descuentoAplicable;

        System.out.println("Introduce el precio base del producto");
        precioBase = input.nextFloat();
        input.nextLine();

        if (precioBase>0) {
            pvp = precioBase;
            if (precioBase>=50){
                descuentoAplicable = precioBase*DESCUENTO;
                System.out.println("Aplicando descuento "+(DESCUENTO*100)+"% de "+descuentoAplicable);
                pvp = pvp - descuentoAplicable;
            }
            pvp = pvp*IVA;
            System.out.println("El pvp es " + pvp+ " €");

        }else{
            System.out.println("El valor introducido debe ser mayor que 0");
        }

    }
}
