package com.company;
import java.util.*;
public class l5q3 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int paciencia = Integer.parseInt(in.next());
	int candidatos = Integer.parseInt(in.next());
    String[] candidato = new String[candidatos];
    int[] pontuacao = new int[candidatos];
    for (int i=0;i<candidatos;i++) {
        paciencia-=paciencia/100;
        in.nextLine();
        candidato[i] = in.nextLine();

         pontuacao[i]=pont(candidato[i],pontuacao[i]);


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
        int i=a.length();
        if (a.charAt(i-1) == 0) {
            return 0;
        } else {
            return pont(a,0);
        }



    }

}
