/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Main {

    static calculos calculo = new calculos();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccion;
        System.out.println("bienvenido");
        System.out.println("ingrese que le gustaria realizar");
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-division");
        System.out.println("4-multiplicacion");
        System.out.println("5-todas las operaciones");
        eleccion = entrada.nextInt();
        calculo.ingreso();

        switch (eleccion) {
            case 1:
                calculo.suma();
                break;
            case 2:
                calculo.resta();
                break;
            case 3:
                calculo.division();
                break;
            case 4:
                calculo.multiplicacion();
                break;
            case 5:
                calculo.suma();
                calculo.resta();
                calculo.division();
                calculo.multiplicacion();
                break;
            default:
                System.out.println("esa opcion no esta disponible");

        }

    }

}
