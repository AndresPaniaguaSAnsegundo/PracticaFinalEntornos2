/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array_multi_1;

import java.util.Scanner;

/**
 *
 * @author ArturoRedondoMayz
 */
public class ejer5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz");
        System.out.println("Valor 1");
        int num1 = entrada.nextInt();
        System.out.println("Valor 2");
        int num2 = entrada.nextInt();

        int[][] matriz = new int[num1][num2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("ingresa el valor para el numero en la posicion " + i + " " + j);
                int num3 = entrada.nextInt();
                matriz[i][j] = num3;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------- ");
      ;
        int mayor = 0, menor=matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > mayor) {
                    mayor=matriz[i][j];
                  
                }
                if (matriz[i][j] < menor) {
                    menor=matriz[i][j];
                }

            }

            System.out.println();
        }
        System.out.println("el numero mayor es " + mayor);
        System.out.println("el numero menor es " + menor);
    }
}
