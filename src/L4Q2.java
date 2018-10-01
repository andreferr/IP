package com.company;
import java.util.*;
public class L4Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    String[][] matriz = new String[3][3];
    String[][] transposta = new String[3][3];

        for (int i = 0, j = 0; j < matriz.length; j++, i = 0) {
        for (; i < matriz.length; i++) {
        matriz[j][i] = in.next();
        }
        }

        for (int i = 0, j = 0, x = 0, y = 0; j < matriz.length; j++, y++, i = 0, x = 0) {
        for (; i < matriz.length; i++, x++) {
        transposta[x][y] = matriz[j][i];
        }
        }

        for (int i = 0, j = 0; j < transposta.length;j++,i=0) {
        System.out.print("\n");
        for (;i<transposta.length;i++) {
        if (i<transposta.length-1) {
        System.out.print(transposta[j][i]+" ");
        } else if (i==transposta.length-1) {
        System.out.print(transposta[j][i]);
        }
        }
        }
        }
        }