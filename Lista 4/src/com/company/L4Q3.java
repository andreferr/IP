package com.company;
import java.util.*;
public class L4Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho = Integer.parseInt(in.next()),jogadas = Integer.parseInt(in.next());
        int[][] matriz = new int[tamanho][tamanho];

        for (int i=0,j=0;j<matriz.length;j++,i=0) {
            for (;i<matriz.length;i++) {
                matriz[j][i] = Integer.parseInt(in.next());
            }
        }

        int[][] coordenadas = new int[2];

        for (int k=0;k<jogadas;k++) {
            int[] soma = new int[3];
            coordenadas[0] = Integer.parseInt(in.next());
            coordenadas[1] = Integer.parseInt(in.next());
            for (int i=0,j=0;j<matriz.length;j++,i=0) {
                for (;i<matriz.length;i++) {
                    coordenadas[i]
                }

            }
        }






    }
}
