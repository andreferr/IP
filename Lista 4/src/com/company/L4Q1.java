package com.company;
import java.util.*;
public class L4Q1 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int tamanhodamatriz = Integer.parseInt(in.nextLine());
    int[] vida = new int[2];
    vida[0] = Integer.parseInt(in.next());
    vida[1] = Integer.parseInt(in.next());
    int[][][] matriz = new int[2][tamanhodamatriz][tamanhodamatriz];

    for (int qual = 0; qual < 2;qual++) {
        for (int i = 0, j = 0; j < tamanhodamatriz; j++) {
            for (; i < tamanhodamatriz; i++) {
                matriz[qual][j][i] = Integer.parseInt(in.next());
            }
            i = 0;
        }
    }
    int[] ataque = new int[2];
    int[] defesa = new int[2];

    for (int qual = 0;qual<2;qual++) {
        for (int i = 0, j = 0; j < tamanhodamatriz; j++,i=0) {
            for (; i < tamanhodamatriz; i++) {
                if (i==j) {
                    ataque[qual]+=matriz[qual][j][i];
                }

            }
        }
        for (int i=tamanhodamatriz-1,j=0,posmatriz=tamanhodamatriz-1;j<tamanhodamatriz;j++,i=tamanhodamatriz-1,posmatriz-=1) {
            for (;i>=0;i--) {
                if (i==posmatriz) {
                    defesa[qual]+=matriz[qual][i][j];
                    break;
                }
            }
        }
    }





    int acoes = Integer.parseInt(in.next());
    String[][]  movimento = new String[2][acoes];
    for (int i=0,danosofrido=0;i<acoes;i++,danosofrido=0) {
        movimento[0][i] = in.next();
        movimento[1][i] = in.next();

        if (movimento[0][i].equals("A")) {
            if (movimento[1][i].equals("A")) {
                danosofrido = ataque[0] - ataque[1];
                if (danosofrido<0) {
                    vida[0] += danosofrido;
                } else {
                    vida[1] -= danosofrido;
                }
            } else if (movimento[1][i].equals("D")) {
                danosofrido=ataque[0] - defesa[1];
                if (danosofrido>0){
                    vida[1] -= (ataque[0] - defesa[1])/2;
                }
            }
        } else {
            if (movimento[1][i].equals("A")) {
                danosofrido = defesa[0] - ataque[1];
                if (danosofrido<0) {
                    vida[0]+= (defesa[0]-ataque[1])/2;
                }
            }
        }
    }

    if (vida[0] > vida[1]) {
        System.out.print("Ryu ganhou a batalha.");
    } else if (vida[0] < vida[1]) {
        System.out.print("Ken ganhou a batalha.");
    } else {
        System.out.print("Houve empate.");
    }


    }
}