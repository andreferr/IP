package com.company;

import java.util.*;

public class l5q5ref {
    public static int mais;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amigos = in.nextInt();
        in.nextLine();
        String[] nome = new String[amigos];
        int[] quant = new int[amigos];
        String[] what = new String[amigos];
        String[] lel = new String[amigos];
        for (int a = 0; a < amigos; a++) {
            what[a] = in.nextLine();
            lel = what[a].split(" ");
            nome[a] = lel[0];
            quant[a] = Integer.parseInt(lel[1]);
        }
        nome = invA(nome, 0, nome.length - 1);
        quant = invi(quant, 0, quant.length - 1);
        for (int i = 0; i < amigos; i++) {
            if (fome(quant, i) == 1) {
                System.out.println(nome[i] + " foi servido(a).");
            }
            while (mais > 0) {
                System.out.println("Fica tranquilo(a), " + nome[i] + " pode se servir novamente!");
                System.out.println(nome[i] + " foi servido(a).");
                mais--;
            }

        }

    }

    public static int fome(int[] a, int b) {
        if (a[b] <= 400) {
            return 1;
        } else {
            a[b] -= 400;
            mais += 1;
            return fome(a, b);
        }
    }

    public static String[] invA(String[] a, int b, int c) {
        String temp;
        temp = a[b];
        if (b < c) {
            a[b] = a[c];
            a[c] = temp;
            return invA(a, b + 1, c - 1);
        } else {
            return a;
        }
    }

    public static int[] invi(int[] a, int b, int c) {
        int temp;
        temp = a[b];
        if (b < c) {
            a[b] = a[c];
            a[c] = temp;
            return invi(a, b + 1, c - 1);
        } else {
            return a;
        }
    }
}