package com.company;
import java.util.*;
public class L4Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mapa = in.nextInt(),movimentos = in.nextInt();
        int[][] matriz = new int[mapa][mapa];
        int[][] posicao = new int[mapa][mapa];
        for (int i=0,j=0;j<matriz.length;j++,i=0) {
            for (String aux;i<matriz.length;i++) {
                aux = in.next();
                if (aux.equals("*")) {
                matriz[j][i] = 0;
                }
                else if (aux.equals("#")) {
                    matriz[j][i] = 1;
                }
                else if (aux.equals("@")) {
                    matriz[j][i] = 2;
                }
            }
        }

        for (int i=0;i<movimentos;i++) {
            String mov = in.next();
            for (int k=0,j=0;j<matriz.length;j++) {
                for (;k<matriz.length;k++)
                    if (mov.equals("D")) {

                    }
                }
            }
        }








    }
}
