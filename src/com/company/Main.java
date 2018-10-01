package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanhoalvo = Integer.parseInt(in.nextLine());
        int[] alvopontos = new int[tamanhoalvo];
            if (alvopontos.length>=1) {
                alvopontos[0] = 1;
            } else {
                System.out.println("Sasuke: 0\nItachi: 0\nOs Uchihas nem sao tao bons mesmo");
            }
            for (int i = 1; i < tamanhoalvo; i++) {
                if (tamanhoalvo % 2 == 0) {
                    if (i < tamanhoalvo / 2) {
                        alvopontos[i] = 1 + alvopontos[i - 1];
                    } else if (i == tamanhoalvo / 2) {
                        alvopontos[i] = alvopontos[i - 1];
                    } else {
                        alvopontos[i] = alvopontos[i - 1] - 1;
                    }
                } else {
                    if (i < (tamanhoalvo + 1) / 2) {
                        alvopontos[i] = 1 + alvopontos[i - 1];
                    } else {
                        alvopontos[i] = alvopontos[i - 1] - 1;
                    }
                }
            }
            if (alvopontos.length>=1) {
                int kunais = Integer.parseInt(in.nextLine());
                int[] sasukeacerto = new int[kunais];
                int[] itachiacerto = new int[kunais];
                int sasukepontos = 0;
                int itachipontos = 0;

                for (int i = 0; i < kunais; i++) {
                    sasukeacerto[i] = Integer.parseInt(in.next()) - 1;
                    if (sasukeacerto[i] == -1) {
                    } else if (sasukeacerto[i] <= alvopontos.length) {
                        sasukepontos += alvopontos[sasukeacerto[i]];
                    }
                }
                for (int i = 0; i < kunais; i++) {
                    itachiacerto[i] = Integer.parseInt(in.next()) - 1;
                    if (itachiacerto[i] == -1) {
                    } else if (itachiacerto[i] <= alvopontos.length) {
                        itachipontos += alvopontos[itachiacerto[i]];
                    }
                }

                System.out.println("Sasuke: " + sasukepontos);
                System.out.println("Itachi: " + itachipontos);

                if (sasukepontos > itachipontos) {
                    System.out.println("Sasuke Uchiha");
                } else if (itachipontos > sasukepontos) {
                    System.out.println("Itachi Uchiha");
                } else if (sasukepontos == itachipontos && sasukepontos != 0) {
                    System.out.println("O empate nunca existiu, voce esta preso num genjutsu");
                } else if (sasukepontos == 0 && itachipontos == 0) {
                    System.out.println("Os Uchihas nem sao tao bons mesmo");
                }
                if (itachipontos == 0 && sasukepontos != 0) {
                    System.out.println("Um genjutsu desse nivel nao funciona em mim");
                } else if (sasukepontos == 0 && itachipontos != 0) {
                    System.out.println("Voce e fraco, lhe falta odio");
                }
            }
    }
}