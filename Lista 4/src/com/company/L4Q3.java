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
            for (int l=0,b=0,d=0;j<matriz.length;j++,l=0,b=0,d=0) {
                for (;coordenadas[0]+l<matriz.length;l++) {
                    soma[0]+=coordenadas[0+i];
                }
                for (;coordenadas[1]+b<matriz.length;b++) {
                    soma[1]+=coordenadas[1+p];
                }
                for (int x=0,y=0;coordenadas[1]+y<matriz.length;y++,x=0) {
                    for (;coordenadas[0]+x<matriz.length;x++) {
                        if (coordenadas[0+x] == coordenadas[1+y]) {
                            soma[2] += coordenadas[0+x];
                        }
                    }
                }

            }
        }






    }
}
