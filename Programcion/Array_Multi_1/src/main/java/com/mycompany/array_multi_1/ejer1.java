/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.array_multi_1;

/**
 *
 * @author ArturoRedondoMayz
 */
public class ejer1 {

    public static void main(String[] args) {
        int variable = 0;
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                variable++;
                matriz[i][j] = variable;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
