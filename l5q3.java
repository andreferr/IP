package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int paciencia = in.nextInt(), candidatos = in.nextInt();
    String[] candidato = new String[candidatos];
    int[] pontuacao = new int[candidatos];
    for (int i=0;i<candidatos;i++) {
        paciencia-=paciencia/100;
        candidato[i] = in.nextLine();

        pont(candidato[i],pontuacao[i]);


        if (candidato[i].equals("Troy Bolton") || candidato[i].equals("Gabriella Montez") || candidato[i].equals("Sharpay Evans") || candidato[i].equals("Ryan Evans")) {
            pontuacao[i]+=350;
        }

        }

        for (int i=0,k=0;i<candidatos;i++,k=0) {
            for (;k<candidatos;k++) {
                int aux=0;
                String auxn;
                if (pontuacao[i]<pontuacao[k]) {
                    aux = pontuacao[i];
                    pontuacao[i] = pontuacao[k];
                    pontuacao[k] = aux;
                    auxn = candidato[i];
                    candidato[i] = candidato[k];
                    candidato[k] = auxn;
                }
            }
        }
        System.out.print("O grande vencedor(a) do papel principal desse ano foi "+candidato[0]+"!");

    }

    public static int pont (String a, int x) {
        int i=0;
        if (a.charAt(i) == a.length()) {
            return ;
        } else {
            return ;
        }



    }

}
