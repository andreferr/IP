package com.company;
import java.util.*;
public class L4Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho = Integer.parseInt(in.next()),jogadas = Integer.parseInt(in.next());
        int[][] matriz = new int[tamanho][tamanho];
        boolean bomba = false;
        for (int i=0,j=0;j<matriz.length;j++,i=0) {
            for (;i<matriz.length;i++) {
                matriz[j][i] = Integer.parseInt(in.next());
            }
        }

        int[][] coordenadas = new int[jogadas][2];

        for (int k=0;k<jogadas;k++) {
            int[] soma = new int[3];
            coordenadas[k][0] = Integer.parseInt(in.next());
            coordenadas[k][1] = Integer.parseInt(in.next());
            if (matriz[coordenadas[k][0]][coordenadas[k][1]] == -1) {
                System.out.println("Essa casa ja foi selecionada.");
            } else {

                for (int x = coordenadas[k][1], y = coordenadas[k][0]; x < matriz.length; x++) {
                    if (matriz[y][x] == -1) {
                    } else {
                        soma[0] += matriz[y][x];
                    }
                }
                for (int x = coordenadas[k][1], y = coordenadas[k][0]; y < matriz.length; y++) {
                    if (matriz[y][x] == -1) {
                    } else {
                        soma[1] += matriz[y][x];
                    }
                }
                for (int x = coordenadas[k][1], y = coordenadas[k][0], q = 0, z = 0,p=0;(y+q) < matriz.length;q++,z=p) {
                    for (;z<matriz.length-x;z++)
                    if (matriz[y][x] == -1) {
                    } else {
                        soma[2] += matriz[y + q][x + z];
                        break;
                    }
                    p++;
                }
                if (soma[0] == soma[1] && soma[1] == soma[2]) {
                    System.out.println("Bomba encontrada.\nVoce perdeu.");
                    bomba = true;
                    break;
                } else if (soma[0] != soma[1] || soma[0] != soma[2] || soma[1] != soma[2]) {
                    System.out.println("Boa jogada, a casa ("+coordenadas[k][0]+","+coordenadas[k][1]+") nao tinha bomba.");
                    matriz[coordenadas[k][1]][coordenadas[k][0]] = -1;
                }


            }
        }

        if (bomba==false) {
            System.out.println("Voce e uma pessoa de sorte.");
        }


    }
}