package com.company;
import java.util.*;
public class l5q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidadep = in.nextInt();
        int qconexoes = in.nextInt();
        String[] nomes = new String[quantidadep];
        in.nextLine();
        for (int i=0;i<quantidadep;i++) {
            nomes[i] = in.nextLine();
        }


        boolean[][] conexoes = new boolean[quantidadep][qconexoes];
        boolean chega = false;

        for (int i=in.nextInt(),k=in.nextInt(),contador = 0;contador<qconexoes;contador++) {
            conexoes[i][k] = true;
        }
        for (int i=0,k=0;i<quantidadep;i++) {
            for (;k<qconexoes;k++) {
                if (conexoes[i][k] == true) {
                    continue;
                } else {
                    conexoes[i][k] = false;
                }
            }
        }
        in.nextLine();
        String nomei,nomef;
        int posatual,posfinal;
        nomei = in.nextLine();
        nomef = in.nextLine();

        for (int i=0;i<quantidadep;i++) {
          if (nomes[i].equals(nomei)) {
              posatual = i;
          } else if (nomes[i].equals(nomef)) {
              posfinal = i;
          }

            }


    }

    public static boolean checagem (boolean[][] conex, int posatual, int posfinal,int a,int b) {
        if (conex[posatual][a] == true && a!=posatual) {
            posatual=a;
            return checagem(conex,posatual,posfinal,a+1,b);

        }
    }



}
